/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagementsystem;

/**
 *
 * @author TAHIR COMPUTER
 */
public class Person {
 
     private String firstName;
    private String lastName;
    private String gender;
    private String maritalStatus;
    private String cnic;
    private String phn;
    private String bloodGrp;
    private int age;
    private Date date;
    private Adress adress;

// Default constructor  
   public Person() {

            date = new Date();
            adress = new Adress();
    }

// Argument constructor
   
  public Person (String f, String l, String g ,String m ,String cni,String phn , String bg , int age, Date d1,Adress a)
    {
        
       if(f.length()>0){
        firstName = f;
       }
       else{
        firstName = "Ahsan" ;
       }

       if(l.length()>0){
        lastName = l;
       }
       else{
        lastName = "Farooqi" ;
       }

       if(g.length()>0){
        gender = g;
       }
       else{
        gender = "Male" ;
       }

       if(m.length()>0){
        maritalStatus = m;
       }
       else{
        maritalStatus = "Married" ;
       }

       if(cni.length()>0 && cni.length()==13){
        cnic = cni;
       }
       else{
        cnic = "123422334444" ;
       }

       if(phn.length()==11){
        phn = phn;
       }
       else{
        phn = "12345678911" ;
       }

       if((bg.length()>0) && (bg.contains("+") || bg.contains("-"))) {
        bloodGrp = bg;
       }
       else{
        bloodGrp = "A+" ;
       }

       if(age>0){
        this.age=age ;
       }
       else{
        this.age = 10 ;
       }

       date = d1;
       adress = a;


    }

//Setter
   
    public void setAdress(Adress d2)
    {
        adress = d2;
    }

    public void setDate(Date d2)
    {
        date = d2;
    }

    public void setFirstName(String f)
    {
        if(f.length()>0){
        firstName = f;
       }
       else{
        firstName = "Ahsan" ;
       }
    }

    public void setLastName(String l)
    {
        if(l.length()>0){
        lastName = l;
       }
       else{
        lastName = "Farooqi" ;
       }
    }

    public void setBloodGroup(String bg)
    {
        if((bg.length()>0) && (bg.contains("+") || bg.contains("-"))){
        bloodGrp = bg;
       }
       else{
        bloodGrp = "A+" ;
       }
    }

    public void setMaritalStatus(String m)
    {
        if(m.length()>0){
        maritalStatus = m;
       }
       else{
        maritalStatus = "Married" ;
       }    
   }

   public void setGender(String g)
    {
        if(g.length()>0){
        gender = g;
       }
       else{
        gender = "Male" ;
       }   
   }

   public void setPhn(String phn)
    {
        if(phn.length()==11){
        phn = phn;
       }
       else{
        phn = "12345678911" ;
       }
   }

   public void setCnic(String cni)
    {
        if(cni.length()>0 && cni.length()==13){
        cnic = cni;
       }
       else{
        cnic = "123422334444" ;
       }    
   }

   public void setAge(int age)
    {
        if(age>0){
        this.age=age ;
       }
       else{
        this.age = 10 ;
       }
   }



    //Getter
    public  Adress  getAdress()
    {
        return adress;
    }

    public  Date  getDate()
    {
        return date;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getBloodgroup(){
        return bloodGrp;
    }

    public String getphn(){
        return phn;
    }

    public String getCnic(){
        return cnic;
    }

    public String getGender(){
        return gender;
    }

    public String getMaritalStatus(){
        return maritalStatus;
    }

    public int getAge(){
        return age;
    }


    public String toString(){
      return  (     "First Name is "  +"\t" + firstName + "\n" +
                    "Last  Name is "  +"\t" + lastName  + "\n" + 
                    "Gender is "      +"\t" + gender    + "\n" +
                    "Marital Status " +"\t" + maritalStatus + "\n" + 
                    "CNIC           " +"\t" + cnic + "\n" + 
                    "Phone Number   " +"\t" + phn + "\n" + 
                    "Blood Group    " +"\t" + bloodGrp + "\n" + 
                    "Age            " +"\t" + age + "\n" + 
                    date.toString()+
                    adress.toString()
                    );
             }
}
