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

public class Add_Bed extends JFrame
{
    
    
    JButton b1, b2, b3,b4,b5,b6,b7;
    
    JLabel l1, l2, l3, l4;
    
    JTextField t1, t2, t3, t4;
    
    JPanel p1, p2,p3;
    
    
    Add_Bed()
    {
        
        
        setTitle("Bed Availability Panel");
        
        setSize(800, 400);
        
        setLayout(new BorderLayout());
        
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ///////////////////////////////////////
        
        p1 = new JPanel();
        
        add(p1, BorderLayout.NORTH);
        
        b1 = new JButton("Add Bed");
        b2 = new JButton("Remove Bed");
        b4 = new JButton("Update Bed");


        
        p1.setLayout(new FlowLayout());
        
        MyListner m = new MyListner();
        b1.addActionListener(m);
        b2.addActionListener(m);
        b4.addActionListener(m);
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b4);
        
        
        p2 = new JPanel();
        
        l1 = new JLabel("Bed No #");
        l2 = new JLabel("Bed Category");
        l3 = new JLabel("Room no");
        
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        p2.setLayout(new GridLayout(10,2));
        
        p2.add(l1);
        p2.add(t1);
        
        p2.add(l2);
        p2.add(t2);
        
        p2.add(l3);
        p2.add(t3);
        
        add(p2, BorderLayout.WEST);
        
       
        p3 = new JPanel();
        
        add(p3, BorderLayout.SOUTH);
        
        b6 = new JButton("Submit");
        b7 = new JButton("Home");
        
        p3.setLayout(new FlowLayout());
        
        p3.add(b6);
        p3.add(b7);
        
        b6.addActionListener(m);
        b7.addActionListener(m);
        
    }
    
    class MyListner implements ActionListener
    {

        public void actionPerformed(ActionEvent ae)
        {
            
            if(ae.getActionCommand().equals("Add Bed"))
            {
                JOptionPane.showMessageDialog(null ,"Bed Record is added Successfully");
            }

            else if(ae.getActionCommand().equals("Update Bed"))
            {
                new Admin_Login_Panel();
            }
            else if(ae.getActionCommand().equals("Remove Bed"))
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
                 JOptionPane.showMessageDialog(null ,"Bed Record not added Successfully");
            }
          
        }
        
    }
}
    

