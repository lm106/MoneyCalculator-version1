package moneycalculator_1311.persistence;

import moneycalculator_1311.model.Currency;
import moneycalculator_1311.model.ExchangeRate;

/**
 *
 * @author Luzma
 * @version 13-11-2020
 * @since Práctica en Aula
 */
public interface ExchangeRateLoader {
    public ExchangeRate load(Currency from, Currency to);
}
