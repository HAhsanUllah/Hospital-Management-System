/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagementsystem;

/**
 *
 * @author TAHIR COMPUTER
 */
public class Time {
    
    private int minutes;
	private int hours;


	public Time(){

	}

	public Time(int min, int h){

		if(min>=1 && min <=60){
            minutes = min;
       }
        else{
        minutes = 1 ;
       }

       if(h>=1 && min <=24){
           hours = h;
       }
        else{
       		hours = 1 ;
       }
	}

	public void setMinutes(int min){
		if(min>=1 && min <=60){
            minutes = min;
       }
        else{
        minutes = 1 ;
       }
	}

	public void setHours(int h){
		if(h>=1 && h <=24){
           hours = h;
       }
        else{
       		hours = 1 ;
       }
	}

	public int getMinutes(){
		return minutes;
	}

	public int getHours(){
		return hours;
	}

	public String toString(){
		return (
					"Hours ::\t " + hours +"\n" +
           			"Minutes ::\t " + minutes +"\n"
			);
	}
}
