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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Container;

public class ADD_Doctor extends JFrame
{
    
    
    JButton b1, b2, b3, b4, b5, b6, b7;
    
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20;
    
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20;
    
    JPanel p1, p2, p3, p4, p5;
    
    
    ADD_Doctor()
    {
        
        
        setTitle("Admin Login Panel");
        
        setSize(800, 400);
        
        setLayout(new BorderLayout());
        
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ///////////////////////////////////////
        
        p1 = new JPanel();
        
        add(p1, BorderLayout.NORTH);
        
        b1 = new JButton("Add Doctors");
        b2 = new JButton("Delete Doctors");
        b3 = new JButton("Search Doctors");
        b4 = new JButton("Update Doctors");
        b5 = new JButton("Display Doctors");

        
        p1.setLayout(new FlowLayout());
        
        MyListner m = new MyListner();
        b1.addActionListener(m);
        b2.addActionListener(m);
        b3.addActionListener(m);
        b4.addActionListener(m);
        b5.addActionListener(m);
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        
        p2 = new JPanel();
        
        l1 = new JLabel("Doctor ID");
        l2 = new JLabel("First Name");
        l3 = new JLabel("Age");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Address");
        l6 = new JLabel("CNIC");
        l7 = new JLabel("Marital Status");
        l8 = new JLabel("Joining Date");
        l9 = new JLabel("Visit Timing");
        
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        t5 = new JTextField(10);
        t6 = new JTextField(10);
        t7 = new JTextField(10);
        t8 = new JTextField(10);
        t9 = new JTextField(10);
        
        p2.setLayout(new GridLayout(10,2));
        
        p2.add(l1);
        p2.add(t1);
        
        p2.add(l2);
        p2.add(t2);
        
        p2.add(l3);
        p2.add(t3);
        
        p2.add(l4);
        p2.add(t4);
        
        p2.add(l5);
        p2.add(t5);
        
        p2.add(l6);
        p2.add(t6);
        
        p2.add(l7);
        p2.add(t7);
        
        p2.add(l8);
        p2.add(t8);
        
        p2.add(l9);
        p2.add(t9);
        
        add(p2, BorderLayout.WEST);
        
        p3 = new JPanel();
        
        l10 = new JLabel("Last Name");
        l11 = new JLabel("Blood Group");
        l12 = new JLabel("Department");
        l13 = new JLabel("Phone #");
        l14 = new JLabel("City");
        l15 = new JLabel("Leaving Date");
        l16 = new JLabel("Days");
        
        t10 = new JTextField(10);
        t11 = new JTextField(10);
        t12 = new JTextField(10);
        t13 = new JTextField(10);
        t14 = new JTextField(10);
        t15 = new JTextField(10);
        t16 = new JTextField(10);
        
        p3.setLayout(new GridLayout(10, 2));
        
        p3.add(l10);
        p3.add(t11);
        
        p3.add(l12);
        p3.add(t12);
        
        p3.add(l13);
        p3.add(t13);
        
        p3.add(l14);
        p3.add(t14);
        
        p3.add(l15);
        p3.add(t15);
        
        p3.add(l16);
        p3.add(t16);
        
        add(p3, BorderLayout.CENTER);
        
        p4 = new JPanel();
        
        l18 = new JLabel("Day");
        l19 = new JLabel("Month");
        l20 = new JLabel("Year");
        
        t18 = new JTextField(10);
        t19 = new JTextField(10);
        t20 = new JTextField(10);
        
        p4.setLayout(new GridLayout(3, 2));
        
        p4.add(l18);
        p4.add(t18);
        
        p4.add(l19);
        p4.add(t19);
        
        p4.add(l20);
        p4.add(t20);
        
        add(p4, BorderLayout.EAST);
        
        
        p5 = new JPanel();
        
        add(p5, BorderLayout.SOUTH);
        
        b6 = new JButton("Submit");
        b7 = new JButton("Home");
        
        p5.setLayout(new FlowLayout());
        
        p5.add(b6);
        p5.add(b7);
        
        b6.addActionListener(m);
        b7.addActionListener(m);
        
    }
    
    class MyListner implements ActionListener
    {

        public void actionPerformed(ActionEvent ae)
        {
            
            if(ae.getActionCommand().equals("Add Doctors"))
            {
                JOptionPane.showMessageDialog(null ,"Doctor Record is added Successfully");
            }
            else if(ae.getActionCommand().equals("Search Doctors"))
            {
                new Search_Doctor();
            }
            else if(ae.getActionCommand().equals("Update Doctors"))
            {
                new Admin_Login_Panel();
            }
            else if(ae.getActionCommand().equals("Delete Doctors"))
            {
                new Admin_Login_Panel();
            }
            else if(ae.getActionCommand().equals("Display Doctors"))
            {
                new Admin_Login_Panel();
            }
            else if(ae.getActionCommand().equals("Home"))
            {
                new Admin_Login_Panel();
            }
            else if(ae.getActionCommand().equals("Submit"))
            {
                new Admin_Login_Panel();
            }
            
            else
            {
                 JOptionPane.showMessageDialog(null ,"Doctor Record not added Successfully");
            }
          
        }
        
    }
    
    
}
    
