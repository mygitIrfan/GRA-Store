package my.edu.unikl.Menu;

import my.edu.unikl.codex.armor.codex_Armor;
import my.edu.unikl.FileHandling.FileIOHandler;
import my.edu.unikl.codex.weapon.weapon_sword;
/**
 * Inventory application is an application that allow user to input 
 * product data using Graphical User Interface (GUI) and store the 
 * product information in a text file. It will allows user to add, 
 * search, update/edit and delete data in the text file. The program 
 * has multiple classes starting with a super class. Then, include 
 * subclasses  that inherit the superclass. Include at least 1 
 * composition relationship.  The inventory application is meant 
 * for a designated store. In other words, each group will have it’s
 * own store name (the store name must be different). 
 * 
 * Note: minimum 2 subclass and 1 composition
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class GRA_store extends JFrame 
{
    private JTextField nameField;
    private JTextField modField;
    private JTextField damageField;
    private JTextField lengthField;
    private JButton saveButton;

    public GRA_store() {
        initializeComponents();
        setupLayout();
        setupSaveButtonListener();
    }

    private void initializeComponents() {
        nameField = new JTextField(20);
        modField = new JTextField(20);
        damageField = new JTextField(20);
        lengthField = new JTextField(20);
        saveButton = new JButton("Save");
    }


    private void setupLayout() {
        JPanel mainPanel = new JPanel(new GridLayout(5, 2));
        mainPanel.add(new JLabel("Name:"));
        mainPanel.add(nameField);
        mainPanel.add(new JLabel("Mod:"));
        mainPanel.add(modField);
        mainPanel.add(new JLabel("Damage:"));
        mainPanel.add(damageField);
        mainPanel.add(new JLabel("Length:"));
        mainPanel.add(lengthField);
        mainPanel.add(saveButton);

        add(mainPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sword Input");
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void setupSaveButtonListener() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String mod = modField.getText();
                int damage = Integer.parseInt(damageField.getText());
                double length = Double.parseDouble(lengthField.getText());

                weapon_sword sword = new weapon_sword(name);
                sword.setMod(mod);
                sword.setDamage(damage);
                sword.setLength(length);


                FileIOHandler fileIOHandler = new FileIOHandler();
                String swordData = sword.toString();
                fileIOHandler.writeFile("SwordData.txt", swordData, true);

                JOptionPane.showMessageDialog(GRA_store.this, "Sword data saved successfully!");

                // Clear the input fields
                nameField.setText("");
                modField.setText("");
                damageField.setText("");
                lengthField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GRA_store().setVisible(true);
            }
        });
    }
}

