package Swing.LoginPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPage {


        RegistrationPage() {
            JFrame f = new JFrame("Registration form");

            JLabel heading = new JLabel("Print data on console....");
            heading.setBounds(70, 20, 180, 40);

            JLabel firstName = new JLabel("First Name");
            firstName.setBounds(20, 50, 80, 20);

            JLabel lastName = new JLabel("Last name");
            lastName.setBounds(20, 75, 80, 30);

            JLabel dob = new JLabel("E-mail");
            dob.setBounds(20, 105, 80, 30);

            JTextField firstNameTf = new JTextField();
            firstNameTf.setBounds(120, 50, 100, 20);

            JTextField lastNameTf = new JTextField();
            lastNameTf.setBounds(120, 80, 100, 20);

            JTextField dobtf = new JTextField();
            dobtf.setBounds(120, 110, 100, 20);

            JLabel password = new JLabel("Password");
            password.setBounds(20, 140, 100, 20);

            JTextField passwordTF = new JTextField();
            passwordTF.setBounds(120, 140, 100, 20);

            JButton sbmt = new JButton("Register");
            sbmt.setBounds(20, 180, 100, 30);

            sbmt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = firstNameTf.getText();
                    String lName = lastNameTf.getText();
                    String dob = dobtf.getText();
                    String email = passwordTF.getText();
                    System.out.println(name);
                    System.out.println(lName);
                    System.out.println(dob);
                    System.out.println(email);
                    new LoginPage();
                    f.dispose();
                    String key=passwordTF.getText();
                }
            });

            JButton reset = new JButton("Reset");
            reset.setBounds(140, 180, 100, 30);
            reset.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNameTf.setText("");
                    lastNameTf.setText("");
                    dobtf.setText("");
                    passwordTF.setText("");
                }
            });

            f.add(heading);
            f.add(firstName);
            f.add(lastName);
            f.add(dob);
            f.add(firstNameTf);
            f.add(lastNameTf);
            f.add(dobtf);
            f.add(sbmt);
            f.add(reset);
            f.add(password);
            f.add(passwordTF);

            f.setSize(500, 500);
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            f.setLayout(null);
            f.setVisible(true);
        }
    public static void main(String[] args) {
            new RegistrationPage();
    }
}


