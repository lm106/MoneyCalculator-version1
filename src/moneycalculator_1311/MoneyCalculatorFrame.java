package moneycalculator_1311;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import moneycalculator_1311.UI.MoneyDialog;
import moneycalculator_1311.UI.MoneyDisplay;
import moneycalculator_1311.UI.Swing.SwingMoneyDialog;
import moneycalculator_1311.UI.Swing.SwingMoneyDisplay;
import moneycalculator_1311.model.Currency;

/**
 *
 * @author Luzma
 * @version 13-11-2020
 * @since Práctica en Aula
 */
public class MoneyCalculatorFrame extends JFrame{
    private final List<Currency> currencies;
    private MoneyDialog moneyDialog;
    private MoneyDisplay moneyDisplay;

    public MoneyCalculatorFrame(List<Currency> currencies) {
        this.currencies = currencies;
        this.setTitle("Money Calculator");
        this.setSize(400,200);
       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(moneyDialog(), BorderLayout.NORTH);
        this.add(moneyDisplay(), BorderLayout.SOUTH);
        this.add(toolbar(), BorderLayout.CENTER);
        this.setVisible(true);
    }

    private Component moneyDialog() {
        SwingMoneyDialog swingDialog = new SwingMoneyDialog(currencies);
        this.moneyDialog = swingDialog;
        return swingDialog;
    }

    private Component moneyDisplay() {
        SwingMoneyDisplay swingDisplay = new SwingMoneyDisplay();
        this.moneyDisplay = swingDisplay;
        return swingDisplay;
    }

    private Component toolbar() {
        JPanel tooBarPanel = new JPanel();
        tooBarPanel.add(calculateButton());
        return tooBarPanel;
    }
    private JButton calculateButton(){
        JButton button = new JButton("Calculate");
        button.addActionListener(calculate());
        return button;
    }

    private ActionListener calculate() {
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
            }
        };
    }

    
    
    
    
}
