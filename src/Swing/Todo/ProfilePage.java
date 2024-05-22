package Swing.LoginPage;

import javax.swing.*;
import java.awt.*;
import java.io.PipedWriter;
import java.awt.Graphics;
public class ProfilePage {
    ProfilePage(){

        JFrame f=new JFrame("profile page");

         JLabel name=new JLabel("Name:");
        name.setBounds(120,50,80,30);

        JLabel email=new JLabel("E-mail:");
        email.setBounds(120,70,80,30);
            Toolkit t = Toolkit.getDefaultToolkit();
            Image i = t.getImage("C:\\Users\\Gungun agrawal\\Downloads\\profile.png");

            JButton title=new JButton("Title"+
                    "Text");
            title.setBounds(100,120,300,50);

        JButton title1=new JButton("Title"+
                "Text");
        title1.setBounds(100,190,300,50);

            JButton add =new JButton("+");
            add.setBounds(400,400,50,30);
            add.addActionListener(e -> {
                new TextPage();
                f.dispose();
            });

        f.add(name);
        f.add(email);
//        f.add(new JLabel(i));
f.add(add);
f.add(title);
f.add(title1);



        f.setSize(500, 500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new ProfilePage();
    }
}
