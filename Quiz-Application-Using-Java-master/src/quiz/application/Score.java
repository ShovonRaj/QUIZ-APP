package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thank You " + name + " for attending JAVA Quiz");
        heading.setBounds(45, 30, 700, 40);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 30));
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        lblscore.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        lblscore.setForeground(Color.WHITE);
        add(lblscore);
        
        JButton submit = new JButton("Evaluate Again");
        submit.setBounds(380, 270, 170, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.BLUE);
        submit.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
