package moneycalculator_1311.persistence.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import moneycalculator_1311.model.Currency;
import moneycalculator_1311.persistence.CurrencyListLoader;

/**
 *
 * @author Luzma
 * @version 13-11-2020
 * @since Práctica en Aula
 */
public class FileCurrencyListLoader implements CurrencyListLoader{
    private final String fileName;

    public FileCurrencyListLoader(String fileName) {
        this.fileName = fileName;
    }
        
    @Override
    public List<Currency> currencies() {
        List<Currency> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while(true){
                String line= reader.readLine();
                if(line == null) break;
                list.add(currencyOf(line));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: FileCurrencyListLoader: currencies (File not found)" + ex.getMessage());
        } catch(IOException ex){
            System.out.println("ERROR: FileCurrencyListLoader: currencies (IO)" + ex.getMessage());
        }
        return list;
    }
    
    private Currency currencyOf(String line) {
        String [] split = line.split(",");
        return new Currency (split[0], split[1], split[2]);
    }
}
