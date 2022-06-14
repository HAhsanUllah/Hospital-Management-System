/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagementsystem;

/**
 *
 * @author TAHIR COMPUTER
 */
public class Adress {
    
    private int streetNo;
    private String  home;
    private String city; 



 // argument constructor

    public Adress (int sat, String hom, String city1) {

       if(sat>0){
        streetNo = sat;
       }
       else{
        streetNo = 1 ;
       }

       if(hom.length()>0){
        home  = hom;
       }
       else{
        home= "Ahsan Villa" ;
       }

        if(city1.length() >0){
        city = city1;
       }
       else{
        city = "Islamabad" ;
       }

    }

// default constructor 

    public Adress() {
    }

// setters 
     public void setStreet(int sat) {

        if(sat>0){
        streetNo = sat;
       }
       else{
        streetNo = 1 ;
       }
        
    }   


    public void setHome(String hom) {

        if(hom.length()>0){
        home  = hom;
       }
       else{
        home= "Ahsan Villa" ;
       }
    }

    public void setCity(String city1) {
        
        if(city1.length() >0){
        city = city1;
       }
       else{
        city = "Islamabad" ;
       }
    }

// getters

     public int getStreet() {
        return streetNo;
    }

     public String getHome() {
        return home;
    }
    
    public String getCity() {
        return city;
    }

 // Dispalay


    public String toString()
    {
        return ("City - Street Number -  Home "  + " \n" + city + " - " + streetNo +" - " +home);
    }


 
}
