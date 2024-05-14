package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        JLabel heading = new JLabel("EVALUATE YOUR JAVA CONCEPT");
        heading.setBounds(420, 100, 1000, 550);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 47));
        heading.setForeground(new Color(30, 144, 254));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(700, 450, 300, 30);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(620, 500, 350, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(670, 550, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.RED);
        rules.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(790, 550, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.RED);
        back.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
