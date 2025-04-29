/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.login;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class DetailsTest {
    
    public DetailsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testGetUsername() {
      
                 
        
       
    }

    @Test
    public void testGetcellnumber() {
        assertTrue(Details.isPhoneNumberVallid("+271234567890"));
        assertFalse(Details.isPhoneNumberVallid("1234567890"));
        assertFalse(Details.isPhoneNumberVallid("+2712345"));
        
                
    }
 
    @Test
    public void testCheckUsernameFormat() {
        System.out.println("checkUsernameFormat");
        String Username = "";
        boolean expResult = false;
        boolean result = Details.checkUsernameFormat(Username);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsPasswordalright() {
         assertTrue(Details.isPasswordalright("Password4%"));
        assertFalse(Details.isPasswordalright("Password"));
        assertFalse(Details.isPasswordalright("Password"));
         assertFalse(Details.isPasswordalright("Pass5"));
        
       
    }

    @Test
    public void testIsPhoneNumberVallid() {
         assertTrue(Details.isPhoneNumberVallid("+271234567890"));
        assertFalse(Details.isPhoneNumberVallid("1234567890"));
        assertFalse(Details.isPhoneNumberVallid("+2712345"));
        
    }

    @Test
    public void testRegisterUser() {
       
    }

    @Test
    public void testConfirm() 
    
    {
       Details details= new Details("dj_2", "password3@", "+271234567890");
       String result = details.RegisterUser("dj_2", "password3@", "+271234567890");
        assertTrue(details.confirm("dj_2", "password3@"));
    }

    @Test
    public void testLoginText() {
      Details login = new Details("dj_2", "password3%", "+271234567890");
      login.RegisterUser("dj_2", "password2@", "=271234567890");
        
    }
    
}
