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
import javax.swing.JTextField;



public class Main_Panel extends JFrame
{
    
    
    JButton b1, b2, b3, b4;
    JPanel p1;
    
    Main_Panel()
    {
        
        setTitle("Login As");
        
        setSize(400, 400);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(4, 4));
        
        p1 = new JPanel();
        
        add(p1, BorderLayout.CENTER);
        
        JButton b1 = new JButton("ADMIN");
        JButton b2 = new JButton("RECEPTIONIST");
        JButton b3 = new JButton("DOCTOR");
        JButton b4 = new JButton("PATIENT");
        
        p1.setLayout(new FlowLayout());
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        
        MyListner m = new MyListner();
        b1.addActionListener(m);
        b2.addActionListener(m);
        b3.addActionListener(m);
        b4.addActionListener(m);
        
    }
    
    class MyListner implements ActionListener
    {

        public void actionPerformed(ActionEvent ae)
        {
            
            if(ae.getActionCommand().equals("ADMIN"))
            {
                new Admin_Login_Panel();
            }
            else if(ae.getActionCommand().equals("RECEPTIONIST"))
            {
                JOptionPane.showMessageDialog(null ,"RECEPTIONIST");
                new Receptionist_Login_Panel();
            }
            else if(ae.getActionCommand().equals("DOCTOR"))
            {
                JOptionPane.showMessageDialog(null ,"DOCTOR");
                new Doctor_Login_Panel();
            }
            else if(ae.getActionCommand().equals("PATIENT"))
            {
                
            }
        }
    }
    
}
