package moneycalculator_1311.persistence.rest;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import moneycalculator_1311.model.Currency;
import moneycalculator_1311.model.ExchangeRate;
import moneycalculator_1311.persistence.ExchangeRateLoader;

/**
 *
 * @author Luzma
 * @version 13-11-2020
 * @since Práctica en Aula
 */
public class RestExchangeRateLoader implements ExchangeRateLoader{

    @Override
    public ExchangeRate load(Currency from, Currency to) {
        try {
            return new ExchangeRate(from, to, read(from.getCode(), to.getCode()));
        } catch(MalformedURLException ex){
            System.out.println("ERROR: RestExchangeRateLoader: load (Mal formed URL)" + ex.getMessage());
            return null;
        }catch (IOException ex){
            System.out.println("ERROR: RestExchangeRateLoader: load (IO)" + ex.getMessage());
            return null;
        }    
    }
    
    private double read(String from, String to) throws IOException, MalformedURLException{
        String line = read(new URL("http://api.fixer.io/latest?base=" + from + "&symbols=" + to));
        return Double.parseDouble(line.substring(line.indexOf(to) + 5, line.indexOf("+")));
    }

    private String read(URL url) throws IOException {
        InputStream is = url.openStream();
        byte[] buffer = new byte[1024];
        int length = is.read(buffer);
        return new String(buffer, 0, length);
    }
    
}
