/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagementsystem;

/**
 *
 * @author TAHIR COMPUTER
 */
public class Medicine {
    
    private String nameOfMedicine;
    private int id ;
    private int dailyDose;
    private int doseMg ;
    private String sideEffect;
    private String companyName;
    
// Default constructor  
   public Medicine() {

    }

// Argument constructor
   
  public Medicine (String n, int id1, int dd ,int dMg ,String sEffect ,String cName)
    {
        
       if(n.length()>0){
        nameOfMedicine = n;
       }
       else{
        nameOfMedicine = "Panadol" ;
       }

       if(id1>0){
        id = id1;
       }
       else{
        id = 1;
       }

       if(dd>0){
        dailyDose = dd;
       }
       else{
        dailyDose = 1 ;
       }

       if(dMg>0){
        doseMg = dMg;
       }
       else{
        doseMg = 1 ;
       }

       if(sEffect.length()>0 ){
        sideEffect = sEffect;
       }
       else{
        sideEffect = "No side Effect" ;
       }

       if(cName.length()>0){
        companyName = cName;
       }
       else{
        companyName = cName ;
       }

       


    }

//Setter
   
    public void setMedicineName(String n)
    {
        if(n.length()>0){
        nameOfMedicine = n;
       }
       else{
        nameOfMedicine = "Panadol" ;
       }
    }

    public void setId(int id1)
    {
        if(id1>0){
        id = id1;
       }
       else{
        id = 1;
       }   
    }

    public void setDailyDose(int dd)
    {
        if(dd>0){
        dailyDose = dd;
       }
       else{
        dailyDose = 1 ;
       }
    }

    public void setDoseMg(int dMg)
    {
        if(dMg>0){
        doseMg = dMg;
       }
       else{
        doseMg = 1 ;
       }
    }

    public void setSideEffect(String sEffect)
    {
        if(sEffect.length()>0 ){
        sideEffect = sEffect;
       }
       else{
        sideEffect = "No side Effect" ;
       }
    }

    public void setCompanyName(String cName)
    {
        if(cName.length()>0){
        companyName = cName;
       }
       else{
        companyName = cName ;
       }       
   }

  



    //Getter


    public String getMedicineName(){
        return nameOfMedicine;
    }

    public String getCompnayName(){
        return companyName;
    }

    public String getSideEffect(){
        return sideEffect;
    }


    public int getID(){
        return id;
    }

    public int getDailyDose(){
        return dailyDose;
    }

    public int getDoseMg(){
        return doseMg;
    }


    public String toString(){
      return  (     "Medicine Name "  +"\t" + nameOfMedicine + "\n" +
                    "Id "  +"\t" + id  + "\n" + 
                    "Daily Dose "      +"\t" + dailyDose    + "\n" +
                    "Dose in (mg) " +"\t" + doseMg + "\n" + 
                    "Side Effects           " +"\t" + sideEffect + "\n" + 
                    "Company Effect   " +"\t" + sideEffect + "\n" 
                    
                    );
             }
}
