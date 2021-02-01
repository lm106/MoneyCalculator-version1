package moneycalculator_1311.persistence;

import java.util.List;
import moneycalculator_1311.model.Currency;

/**
 *
 * @author Luzma
 * @version 13-11-2020
 * @since Práctica en Aula
 */
public interface CurrencyListLoader {
    public List<Currency> currencies();
}
