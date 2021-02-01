package moneycalculator_1311.UI.Swing;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator_1311.UI.MoneyDisplay;
import moneycalculator_1311.UI.MoneyDisplay;
import moneycalculator_1311.model.Money;

/**
 *
 * @author Luzma
 * @version 13-11-2020
 * @since Práctica en Aula
 */
public class SwingMoneyDisplay extends JPanel implements MoneyDisplay{
    private Money money;
    
    
    @Override
    public void display(Money money) {
        this.money = money;
        this.removeAll();
        this.add(amount());
        this.add(currency());
        this.updateUI();
    }

    private Component amount() {
        return new JLabel(String.valueOf(money.getAmount()));
    }

    private Component currency() {
        return new JLabel(String .valueOf(money.getCurrency()));
    }
    
}
