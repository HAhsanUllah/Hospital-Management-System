/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagementsystem;

/**
 *
 * @author TAHIR COMPUTER
 */
public class Date {
     private int day;
    private int month;
    private int year; 

 

    public Date(int day1, int month, int year) {                         //argument constructor

         if(day1>0 && day1 <=31){
            day = day1;
       }
        else{
        day = 1 ;
       }

       if(month>=1 && month<=12){
        this.month = month;
       }

       else{
            this.month= 1; 
       }

        if(year >=1950 && year <=2018 ){
        this.year = year;
       }

       else{
            this.year = 2018 ;
       }
    }

 

    public Date() {                                                  //default constructor
    }

 
                                                                        // getters
    public int getDay() {
        return day;
    }

     public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

 

    public void setDay(int day1) {                                          // setters
        
        if(day1>0 && day1 <=31){
            day = day1;
       }
        else{
        day = 1 ;
       }   
    }

     public void setMonth(int month) {
        
        if(month>=1 && month<=12){
        this.month = month;
       }

       else{
            this.month= 1; 
       }

    }

    public void setYear(int year) {
        
        if(year >=1950 && year <=2018 ){
        this.year = year;
       }

       else{
            this.year = 2018 ;
       }

    }
  
                                                                        // dsplay 
    public String toString()
    {
        return ("DD - MM - YYYY"  + " \n" + day+ "-" + month+"-" +year);
    }

 
}
