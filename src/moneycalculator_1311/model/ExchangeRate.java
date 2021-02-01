package moneycalculator_1311.model;

/**
 *
 * @author Luzma
 * @version 13-11-2020
 * @since Práctica en Aula
 */
public class ExchangeRate {
    private final Currency from, to;    
    private final double amount;

    public ExchangeRate(Currency from, Currency to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getAmount() {
        return amount;
    }
    
}
