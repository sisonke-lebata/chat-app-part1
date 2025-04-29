/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author RC_Student_lab
 */
public class Details{// login
    private String Username;
    private String password;
    private String cellnumber;
     public Details(String username, String password,String cellnumber){
        this.Username=username;
        this.password=password;
        this.cellnumber=cellnumber;
        }
    public String getUsername(){
        return Username;
        }
      public String getcellnumber(){
        return cellnumber;
    }
    // instance method(non- static)
    public static boolean checkUsernameFormat(String Username){
        return Username.contains(" _")&&Username.length()<=5;
    }
    public static boolean isPasswordalright(String password){
        return password.length() >=8 &&
                password.matches(". *[A-Z].*")&&
                 password.matches(". *[a-z].*")&&
                 password.matches(". *[0-9].*")&&
                 password.matches(". *[!@#$%^&*()].*");
    }
    public static boolean isPhoneNumberVallid(String cellnumber){
        return cellnumber.matches("^\\ +27\\d{10}$");
                
                
    }
    public String RegisterUser(String username,String password,String cellnumber){
        if(!checkUsernameFormat(username)){
           return "username is incorrect";
        }
        if(isPasswordalright(password)){
            return "password is weak password must contain a number, underscore,uppercase letter,and a special character must be 8 or more characters long";
            
        }
        if (isPhoneNumberVallid(cellnumber)){
            return "format of the phone number is incorrect";
        }
        password=password;
        Username=username;
        cellnumber=cellnumber;
        return "registration successfull";
                
        
} 
    public boolean confirm(String usernameinserted,String insertedPassword    ){
        return usernameinserted.equals(Username)&&
                insertedPassword.equals(password);
    }
    public String loginText(String insertUsername, String InsertPassword){
        if(confirm(Username, InsertPassword)){
            return "welcome its great to see you again";
        }else{
            return "incorrect user name or password please retry";
        }
    }
}
