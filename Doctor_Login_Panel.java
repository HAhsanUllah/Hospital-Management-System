/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagementsystem;

/**
 *
 * @author TAHIR COMPUTER
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Doctor_Login_Panel extends JFrame {
    
    JButton b1, b2;
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JPanel p1, p2;
    
    Doctor_Login_Panel()
    {
        
        
        setTitle("Login As ADMIN");
        
        setSize(400, 400);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        
        l1 = new JLabel("UserName");
        l2 = new JLabel("Password");
        
        t1 = new JTextField(10);
        t1.setBounds(50,100, 200,30);  
        
        t2 = new JPasswordField(10);
        t2.setBounds(50,100, 200,30);  
        
        p1.setLayout(new GridLayout(2, 2));
        
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        
        add(p1, BorderLayout.CENTER);
        
        p2 = new JPanel();
        
        b1 = new JButton("Login");
        b2 = new JButton("Home");
        
        p2.add(b1);
        p2.add(b2);
        
        add(p2, BorderLayout.SOUTH);
        
        MyListner m = new MyListner();
        
        b1.addActionListener(m);
        b2.addActionListener(m);
        
    }
    
    
    class MyListner implements ActionListener
    {
        
        public void actionPerformed(ActionEvent ae)
        {
            
            if(ae.getActionCommand().equals("Login"))
            {
                if(t1.getText().equals("dc") && t2.getText().equals("dc"))
                {
                    JOptionPane.showMessageDialog(null ,"Doctor Login Sucessfully");
                   
                }
                else
                {
                JOptionPane.showMessageDialog(null ,"Doctor doesn't Login Sucessfully");
                }
            }
            else if(ae.getActionCommand().equals("Home"))
            {
                new Main_Panel();
            }
        }
    }
}
