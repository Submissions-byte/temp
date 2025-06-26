/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class LoginTest {

    Login user = new Login("", "", "", "", "");

    public LoginTest() {

    }

    
    @Test
    public void testUsernameSuccessfullyFormattedMessaging() {
 Login user1 = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        user1.registerUser();
        assertEquals("Welcome <user first name> ,<user last name> it is great to see you again.", user1.returnLoginStatus("Ch&&sec@ke99", "kyl_1"), "Welcome <user first name> ,<user last name> it is great to see you.");
    }//compares login messaging to expected messaging
    
    @Test
    public void testUsernameUnsuccessfullyFormattedMessaging() {
         user = new Login("kyle!!!!!!!", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        //assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.",user.registerUser());
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", user.registerUser(),"Username is not correctly formatted, please ensure that your username is correctly contains an underscore and is no more than five characters in length.");
    }//corrections due to differences in strings between test cases and suggestions above
    //original, with test case suggested string in comments

    @Test
    public void testPasswordComplexityMetMessaging() {
         user = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        

        assertEquals("Password successfully captured.", user.registerUser().substring(user.registerUser().indexOf("Password"), user.registerUser().indexOf(".", user.registerUser().indexOf("Password"), user.registerUser().length()) + 1));
    }//retrieves substring containing relevant line of string to compare

    @Test
    public void testPasswordComplexityNotMetMessaging() {
         user = new Login("kyl_1", "password", "+27838968976", "<user first name>", "<user last name>");
        
        //assertEquals("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.",user.registerUser());
        assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.", user.registerUser());
    }

    @Test
    public void testPhoneCorrectlyFormatted() {
         user = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        assertEquals(user.phoneMessaging(), "Cell phone number successfully added.", "Cell phone number successfully captured.");

    }

    @Test
    public void testPhoneIncorrectlyFormatted() {
         user = new Login("kyl_1", "Ch&&sec@ke99", "08966553", "<user first name>", "<user last name>");
        assertEquals("Cell phone number incorrectly formatted or does not contain international code.", user.phoneMessaging(), "Cell number is incrorrectly formatted or does not contain an international code, please correct the number and try again.");

    }

    @Test
    public void testLoginSuccessful() {
        user = new Login("2", "1", "08966553", "<user first name>", "<user last name>");
        assertTrue(user.loginUser("1", "2"));
    }

    @Test
    public void testLoginFailed() {
        user = new Login("1", "2", "08966553", "<user first name>", "<user last name>");
        
        assertFalse(user.loginUser("3", "4"));
    }

    @Test
    public void testUserNameCorrectlyFormatted() {
       user = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        assertTrue(user.checkUserName("kyl_1"));
    }

    @Test
    public void testUserNameIncorrectlyFormatted() {
        user = new Login("kyle!!!!!!!", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        assertFalse(user.checkUserName("kyle!!!!!!!"));
    }

    @Test
    public void testPasswordMeetsComplexityRequirements() {
        user = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        assertTrue(user.checkPasswordComplexity("Ch&&ck@e99"));
    }

    @Test
    public void testPasswordDoesNotMeetComplexityRequirements() {
        user = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        assertFalse(user.checkPasswordComplexity("password"));
    }

    @Test
    public void testPhoneCorrectlyFormattedBoolean() {
        assertTrue(user.checkCellPhoneNumber("+27838968976"), "True");
    }

    @Test
    public void testPhoneIncorrectlyFormattedBoolean() {
        assertFalse(user.checkCellPhoneNumber("08966553"), "False");
    }

}
