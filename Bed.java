/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagementsystem;

/**
 *
 * @author TAHIR COMPUTER
 */
public class Bed {
    private int bedNo;
	private String bedCategory;
	private int roomNo; 


	public Bed(){

	}

	public Bed(int bNo, int rNo, String bCategory){								

		if(bNo>=1 && bNo<=100){
           bedNo = bNo;
       }
        else{
        bedNo = 1 ;
       }

       if(rNo>=1 && rNo <=50){
           roomNo = rNo;
       }
        else{
       		roomNo = 1 ;
       }

       if(bCategory.length()>0){
        bedCategory = bCategory;
       }
       else{
        bedCategory = "opd" ;
       }
	}

	public void setBedNo(int bNo){
		if(bNo>=1 && bNo <=100){
           bedNo = bNo;
       }
        else{
        bedNo = 1 ;
       }

	}

	public void setRoomNo(int rNo){
		if(rNo>=1 && rNo <=50){
           roomNo = rNo;
       }
        else{
       		roomNo = 1 ;
       }

	}

	public void setBedCategory(String bCategory){
		if(bCategory.length()>0){
        bedCategory = bCategory;
       }
       else{
        bedCategory = "opd" ;
       }
	}

	public int getBedNo(){
		return bedNo;
	}

	public int getRoomNo(){
		return roomNo;
	}

	public String bedCategory(){
		return bedCategory;
	}

	public String toString(){
		return (
					"Bed No ::\t " + bedNo +"\n" +
           			"Room NO ::\t " + roomNo +"\n"+
           			"Bed Category ::\t " + bedCategory +"\n"
			);
	}
}
