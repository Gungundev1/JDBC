package Swing.Todo;

import javax.swing.*;
import java.awt.*;

public class ProfilePage {
    ProfilePage(){

        JFrame ProfilePage=new JFrame("profile page");
        ImageIcon i=new ImageIcon("../Downloads\\profile.png");
//        i.setImage();


         JLabel name=new JLabel("Name:");
        name.setBounds(120,50,80,30);

        JLabel email=new JLabel("E-mail:");
        email.setBounds(120,70,80,30);

//            "C:\\Users\\Gungun agrawal\\Downloads\\profile.png"

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
                ProfilePage.dispose();
            });

        ProfilePage.add(name);
        ProfilePage.add(email);
//        f.add(new JLabel(i));
        ProfilePage.add(add);
        ProfilePage.add(title);
        ProfilePage.add(title1);
//         ProfilePage.add(icon);


        ProfilePage.setSize(500, 500);
        ProfilePage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ProfilePage.setLayout(null);
        ProfilePage.setVisible(true);

    }

    public static void main(String[] args) {
        new ProfilePage();
    }
}
