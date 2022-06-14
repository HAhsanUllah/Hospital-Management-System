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

public class Search_Staff extends JFrame{
	JPanel p1,p2;
	JLabel l1;
	JButton b1,b2;
	JTextField t1;

	Search_Staff(){												//default constructor

		setSize(200,200);										//layout setting
		setVisible(true);
		setLayout(new GridLayout(20,20));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		p1 = new JPanel();
		l1 = new JLabel("Name");							//set  j variables
		t1 = new JTextField(1);
		p1.setLayout(new GridLayout(1,1));

		p1.add(l1);
		p1.add(t1);

		add(p1,BorderLayout.WEST);


		p2 = new JPanel();
		b1 = new JButton("Search");
		b2 = new JButton("Home");
		p2.setLayout(new FlowLayout());
		p2.add(b1);
		p2.add(b2);

		SearchListner s = new SearchListner();
		b1.addActionListener(s);
        b2.addActionListener(s);

        add(p2,BorderLayout.SOUTH);
        
        }
                public class SearchListner implements ActionListener{			// Action listener class 
		public void actionPerformed(ActionEvent e){
                String name = t1.getText();

		if (e.getActionCommand().equals("Search")){

                JOptionPane.showMessageDialog(null ,"Staff bhr nikl aya h ");
		}
                else if (e.getActionCommand().equals("Home")){
                new Admin_Panel();
                    
		}

	    }
	}
    }
