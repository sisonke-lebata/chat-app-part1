/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

/**
 *
 * @author RC_Student_lab
 */
 import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("username");
        String username = scanner.nextLine();
        System.out.print("password");
        String password =scanner.nextLine();
        System.out.print("cell phone number");
        String PhoneNumber = scanner.nextLine();
        Details user = new Details(username, password, PhoneNumber);
        String registrationResult = user.RegisterUser(username, password, PhoneNumber);
        System.out.println(registrationResult);
        if (!registrationResult.equals("user has been registered ")){
            System.out.println("there seems to be a error above  renter your details");
            return;
            
        }
        System.out.println("login");
        System.out.print("username");
        String insertUsername = scanner.nextLine();
        String loginOutput = user.loginText(insertUsername, password);
        System.out.println(loginOutput);
        scanner.close();
                
       
         
    }
}
