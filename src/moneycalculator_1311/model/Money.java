package moneycalculator_1311.model;

/**
 *
 * @author Luzma
 * @version 13-11-2020
 * @since Práctica en Aula
 */
public class Money {
    private final Currency currency;
    private final double amount;

    public Money(double amount, Currency currency) {
        this.currency = currency;
        this.amount = amount;
    }
    
    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}
