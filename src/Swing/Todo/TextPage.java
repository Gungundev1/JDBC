package Swing.LoginPage;

import javax.swing.*;

public class TextPage {
    TextPage(){

        JFrame f=new JFrame("Text Page");

       JLabel title=new JLabel("Title");
       title.setBounds(20,20,100,30);

        JLabel text=new JLabel("Text");
        title.setBounds(20,40,100,30);


f.add(title);
        f.add(text);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TextPage();
    }
}
