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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author senju
 */
public class Log extends JFrame implements ActionListener {

    FileManager fm = new FileManager("C:\\Users\\senju\\Documents\\Java\\sheesh");

    JLabel label00, label01, label02;
    JTextField textField01; // ID field
    JPasswordField passField; // Password field
    JButton loginBtn, clearBtn; // Login and clear buttons
    JPanel panel01; // Panel

    // Constructor
    Log() {

        // Panels
        panel01 = new JPanel();
        panel01.setSize(510, 780);
        panel01.setLayout(null);
        panel01.setBackground(Color.blue);
        //add(panel01);

        // Labels
        label00 = new JLabel("Login to Cinetix");
        label00.setFont(new Font("Sans Serif", Font.BOLD, 24));
        label01 = new JLabel("Enter Email:");
        label01.setFont(new Font("Sans Serif", Font.PLAIN, 14));
        label02 = new JLabel("Enter Password:");
        label02.setFont(new Font("Sans Serif", Font.PLAIN, 14));
        add(label00);
        add(label01);
        add(label02);
        label00.setBounds(160, 50, 200, 30);
        label01.setBounds(50, 150, 100, 20);
        label02.setBounds(50, 230, 100, 20);

        // Text Fields
        textField01 = new JTextField();
        passField = new JPasswordField();
        add(textField01);
        add(passField);
        textField01.setBounds(160, 150, 250, 35);
        passField.setBounds(160, 230, 250, 35);

        // Buttons
        loginBtn = new JButton("Login");
        clearBtn = new JButton("Clear");
        loginBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        add(loginBtn);
        add(clearBtn);
        loginBtn.setBounds(275, 310, 130, 35);
        clearBtn.setBounds(130, 310, 130, 35);
        add(panel01);

        //Frame Properties
        this.setTitle("Login");
        this.setSize(520, 520);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = textField01.getText();
        char[] s3 = passField.getPassword();
        String pass = new String(s3);
        if (e.getSource().equals(loginBtn)) {
            if (fm.checkCredentials(username, pass)) {
                System.out.println("damn");
            }
        }
    }
}
