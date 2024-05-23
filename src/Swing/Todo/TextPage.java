package Swing.Todo;

import javax.swing.*;

public class TextPage {
    TextPage(){

        JFrame TextPage=new JFrame("Text Page");

       JLabel title=new JLabel("Title");
       title.setBounds(20,20,50,30);

        JLabel text=new JLabel("Text");
        title.setBounds(20,40,50,30);


        TextPage.add(title);
        TextPage.add(text);
        TextPage.setSize(500, 500);
        TextPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TextPage.setLayout(null);
        TextPage.setVisible(true);
    }

    public static void main(String[] args) {
        new TextPage();
    }
}
