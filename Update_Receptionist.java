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

public class Update_Receptionist extends JFrame{
	JPanel p1,p2;
	JLabel l1,l2;
	JButton b1,b2;
	JTextField t1,t2;

	Update_Receptionist(){												//default constructor

		setSize(200,200);										//layout setting
		setVisible(true);
		setLayout(new GridLayout(20,20));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		p1 = new JPanel();
		l1 = new JLabel("ReceptionistId");
		l2 = new JLabel("Update Name");							//set  j variables
		t1 = new JTextField(1);
		t2 = new JTextField(1);
		p1.setLayout(new GridLayout(1,1));

		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);

		add(p1,BorderLayout.WEST);


		p2 = new JPanel();
		b1 = new JButton("Submit");
		b2 = new JButton("Home");
		p2.setLayout(new FlowLayout());
		p2.add(b1);
		p2.add(b2);

		UpdateReceptionistListner u = new UpdateReceptionistListner();
		b1.addActionListener(u);
        	b2.addActionListener(u);

       		 add(p2,BorderLayout.SOUTH);
        
        }
                public class UpdateReceptionistListner implements ActionListener{			// Action listener 
		public void actionPerformed(ActionEvent e){
                String name = t1.getText();

		if (e.getActionCommand().equals("Submit")){

                JOptionPane.showMessageDialog(null ,"Receptionist Update ho gya  ");
		}
                else if (e.getActionCommand().equals("Home")){
                new Admin_Panel();
                    
		}

	    }
	}
    }


