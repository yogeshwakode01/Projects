package Converter;
import javax.swing.*;
import java.awt.event.*;

public class CurrencyConverter extends JFrame {
    private JTextField amountField;
    private JComboBox<String> fromCurrencyBox, toCurrencyBox;
    private JLabel resultLabel;
    private JButton convertButton;

    private String[] currencies = {"USD", "EUR", "GBP", "JPY"}; // You can add more currencies

    private double[][] exchangeRates = {
        {1.0, 0.85, 0.75, 114.5}, // Exchange rates relative to USD (USD, EUR, GBP, JPY)
        {1.18, 1.0, 0.89, 135.5}, // Exchange rates relative to EUR (USD, EUR, GBP, JPY)
        {1.33, 1.12, 1.0, 152.5}, // Exchange rates relative to GBP (USD, EUR, GBP, JPY)
        {0.0087, 0.0074, 0.0066, 1.0} // Exchange rates relative to JPY (USD, EUR, GBP, JPY)
    };

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JPanel panel = new JPanel();
        amountField = new JTextField(10);
        fromCurrencyBox = new JComboBox<>(currencies);
        toCurrencyBox = new JComboBox<>(currencies);
        resultLabel = new JLabel("Converted amount will appear here");
        convertButton = new JButton("Convert");

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });

        panel.add(new JLabel("Amount: "));
        panel.add(amountField);
        panel.add(new JLabel("From: "));
        panel.add(fromCurrencyBox);
        panel.add(new JLabel("To: "));
        panel.add(toCurrencyBox);
        panel.add(convertButton);
        panel.add(resultLabel);

        add(panel);
        setVisible(true);
    }

    private void convertCurrency() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            int fromCurrencyIndex = fromCurrencyBox.getSelectedIndex();
            int toCurrencyIndex = toCurrencyBox.getSelectedIndex();

            double convertedAmount = amount * exchangeRates[fromCurrencyIndex][toCurrencyIndex];
            resultLabel.setText(String.format("%.2f %s = %.2f %s", amount, currencies[fromCurrencyIndex],
                    convertedAmount, currencies[toCurrencyIndex]));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid number!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter();
            }
        });
    }
}

