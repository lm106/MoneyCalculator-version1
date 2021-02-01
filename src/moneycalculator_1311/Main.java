package moneycalculator_1311;

import moneycalculator_1311.persistence.CurrencyListLoader;
import moneycalculator_1311.persistence.ExchangeRateLoader;
import moneycalculator_1311.persistence.file.FileCurrencyListLoader;
import moneycalculator_1311.persistence.rest.RestExchangeRateLoader;

/**
 *
 * @author Luzma
 * @version 13-11-2020
 * @since Práctica en Aula
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        CurrencyListLoader currencyListLoader = new FileCurrencyListLoader("currencies.txt");
        ExchangeRateLoader exchangeRateLoader = new RestExchangeRateLoader();
        MoneyCalculatorFrame moneyCalculatorFrame = new MoneyCalculatorFrame(currencyListLoader.currencies());
    }
    
}
