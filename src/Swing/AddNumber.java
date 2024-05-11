package Swing;

import javax.swing.*;

public class AddNumber {
    AddNumber(){

      JFrame  f=new JFrame("calculator");

        JLabel heading=new JLabel("calculating two numbers");
        heading.setBounds(70,20,180,40);

        JLabel firstNumber=new JLabel("First Number");
        firstNumber.setBounds(20,50,80,20);

        JTextField FirstTF=new JTextField();
        FirstTF.setBounds(120,50,100,20);

        JLabel secondNumber =new JLabel("Second number");
        secondNumber.setBounds();
f.add(heading);
f.add(firstNumber);
f.add(FirstTF);



        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new AddNumber();
    }
}
