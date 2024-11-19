/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author senju
 */
public class reg extends JFrame implements ActionListener {
    
    FileManager fm = new FileManager("C:\\Users\\senju\\Documents\\Java\\sheesh");
      //Declaration of variables
    JLabel label00, label01, label02, label03, label04, label05, label06;
    JTextField textField01, textField02, textField03, textField04; 
    JButton btn1, btn2;
    JPanel panel01;
    JPasswordField passwordField, confirmField;
    String[] userType ={"Manager","Employee"};
    JComboBox cb = new JComboBox(userType);
    
    //Constructor
    reg(){
        
        //Frame properties
        this.setVisible(true);
        this.setSize(1020, 780);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Sign-up Cinetix");
        this.setLayout(null);
        add(cb);
        //Panels
        panel01 = new JPanel();
        panel01.setSize(510, 780);
        panel01.setLayout(null);
        panel01.setBackground(Color.blue);
        add(panel01);
        
        cb.setBounds(220, 120, 70, 20);
        
        
        //Labels
        label00 = new JLabel("Add Employee");
        label00.setFont(new Font("Sans Serif", Font.BOLD, 24));
        label01 = new JLabel("First Name");
        label01.setFont(new Font("Sans Serif", Font.PLAIN, 14));
        label02 = new JLabel("Last Name");
        label02.setFont(new Font("Sans Serif", Font.PLAIN, 14));
        label03 = new JLabel("Employee ID");
        label03.setFont(new Font("Sans Serif", Font.PLAIN, 14));
        label04 = new JLabel("Email");
        label04.setFont(new Font("Sans Serif", Font.PLAIN, 14));
//        label05 = new JLabel("Employee ID");
//        label05.setFont(new Font("Sans Serif", Font.PLAIN, 14));
        label05 = new JLabel("Password");
        label05.setFont(new Font("Sans Serif", Font.PLAIN, 14));
        label06 = new JLabel("Confirm password");
        label06.setFont(new Font("Sans Serif", Font.PLAIN, 14));
        add(label00);
        add(label01);
        add(label02);
        add(label03);
        add(label04);
        //add(label05);
        add(label05);
        add(label06);
        label00.setBounds(680, 90, 200, 30);
        label01.setBounds(580, 150, 100, 20);
        label02.setBounds(790, 150, 100, 20);
        label03.setBounds(580, 230, 100, 20);
        label04.setBounds(580, 310, 100, 20);
        label05.setBounds(580, 390, 150, 20);
        label06.setBounds(580, 470, 150, 20);
        
        
        //Text Fields
        textField01 = new JTextField();
        textField02 = new JTextField();
        textField03 = new JTextField();
        textField04 = new JTextField();
        //textField05 = new JTextField();
        passwordField = new JPasswordField();
        confirmField = new JPasswordField();
        
        add(textField01);
        add(textField02);
        add(textField03);
        add(textField04);
        //add(textField05);
        add(passwordField);
        add(confirmField);
        textField01.setBounds(580, 170, 150, 35);
        textField02.setBounds(790, 170, 150, 35);
        textField03.setBounds(580, 250, 250, 35);
        textField04.setBounds(580, 330, 250, 35);
        //textField05.setBounds(580, 410, 250, 35);
        passwordField.setBounds(580, 410, 250, 35);
        confirmField.setBounds(580, 490, 250, 35);
        
        
        
        //Buttons
        btn1 = new JButton("Submit");
        btn2 = new JButton("Clear");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        add(btn1);
        add(btn2);
        btn1.setBounds(785, 570, 130, 35);
        btn2.setBounds(610, 570, 130, 35);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String s1 = textField01.getText();
            String s2 = textField02.getText();
            char[] s3 = passwordField.getPassword();
            char[] s4 = confirmField.getPassword();
            String s5 = textField03.getText();
            String s6 = textField04.getText();
            String s7 = new String(s3);
            String s8 = new String(s4);
            String s9 = cb.getSelectedItem().toString();
            
       if(e.getSource().equals(btn1)){
            User user = new User(s5,s1,s2,s6,s8,s9);
            fm.writeToFile(user);
       }
    }
}
