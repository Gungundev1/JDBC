package Swing.Todo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    LoginPage() {
        JFrame LoginPage = new JFrame("Login page");
        JLabel heading = new JLabel("login");
        heading.setBounds(70, 20, 180, 30);

        JLabel Name = new JLabel("E-mail");
        Name.setBounds(20, 50, 80, 20);

        JTextField nameTF = new JTextField();
        nameTF.setBounds(120, 50, 100, 20);

        JLabel Pass = new JLabel("Password");
        Pass.setBounds(20, 75, 80, 30);

        JTextField passTF = new JTextField();
        passTF.setBounds(120, 80, 100, 20);

        JButton sbmt = new JButton("Login");
        sbmt.setBounds(20, 120, 100, 30);

        sbmt.addActionListener(e -> {
            String pass = passTF.getText();
            if (pass.equals("Gungun"))
                System.out.println("You are logined");
            else System.out.println("Incorrect password");
            new ProfilePage();
            LoginPage.dispose();
        });


        JButton reset = new JButton("Reset");
        reset.setBounds(140, 120, 100, 30);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameTF.setText("");
                passTF.setText("");
            }
        });


        LoginPage.add(heading);
        LoginPage.add(Name);
        LoginPage.add(nameTF);
        LoginPage.add(Pass);
        LoginPage.add(passTF);
        LoginPage.add(sbmt);
        LoginPage.add(reset);

        LoginPage.setSize(500, 500);
        LoginPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        LoginPage.setLayout(null);
        LoginPage.setVisible(true);
    }
    public static void main(String[] args) {
        new LoginPage();
    }
}
