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


public class Admin_Panel extends JFrame
{
    
    JButton b1, b2, b3, b4, b5, b6;
    JPanel p1, p2, p3;
    
    Admin_Panel()
    {
        
        
        setTitle("Admin Panel");
        
        setSize(400, 400);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        p1 = new JPanel();
        
        add(p1, BorderLayout.NORTH);
        
        
        JButton b1 = new JButton("DOCTOR DETAILS");
        JButton b2 = new JButton("STAFF DETAILS");
        
        p1.setLayout(new FlowLayout());
        
        p1.add(b1);
        p1.add(b2);
        
        p2 = new JPanel();
        
        add(p2, BorderLayout.CENTER);
        
        JButton b3 = new JButton("RECEPTIONIST DETAILS");
        JButton b4 = new JButton("PATIENT DETAILS");
        
        p2.setLayout(new FlowLayout());
        
        p2.add(b3);
        p2.add(b4); 
        
        p3 = new JPanel();
        
        add(p3, BorderLayout.SOUTH);
        
        JButton b5 = new JButton("BED AVAILABILITY");
        JButton b6 = new JButton("DEPARTMENT DETAILS");
        
        p3.setLayout(new FlowLayout());
        
        p3.add(b5);
        p3.add(b6); 
        
        MyListner m = new MyListner();
        b1.addActionListener(m);
        b2.addActionListener(m);
        b3.addActionListener(m);
        b4.addActionListener(m);
        b5.addActionListener(m);
        b6.addActionListener(m);
        
        
    }
    
    class MyListner implements ActionListener
    {
        
        public void actionPerformed(ActionEvent ae)
        {
            
            if(ae.getActionCommand().equals("DOCTOR DETAILS"))
            {
                new ADD_Doctor();
            }
            if(ae.getActionCommand().equals("STAFF DETAILS"))
            {
                JOptionPane.showMessageDialog(null ,"STAFF DETAILS");
                new Add_Staff();
            }
            if(ae.getActionCommand().equals("RECEPTIONIST DETAILS"))
            {
                JOptionPane.showMessageDialog(null ,"RECEPTIONIST DETAILS");
                new Add_Receptionist();
            }
            if(ae.getActionCommand().equals("PATIENT DETAILS"))
            {
               new ADD_Patient();
            }
            if(ae.getActionCommand().equals("BED AVAILABILITY"))
            {
                JOptionPane.showMessageDialog(null ,"BED AVAILABILITY");
            }
            if(ae.getActionCommand().equals("DEPARTMENT DETAILS"))
            {
                JOptionPane.showMessageDialog(null ,"DEPARTMENT DETAILS");
            }
        }
    }
}
