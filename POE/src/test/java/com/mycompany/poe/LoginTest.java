/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe;

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
    public void testUserName() {
        assertTrue(user.checkUserName("kyl_1"), "True");
        assertFalse(user.checkUserName("kyle!!!!!!!"), "False");
    }

    @Test
    public void testPassword() {
        assertTrue(user.checkPasswordComplexity("Ch&&sec@ke99"), "True");
        assertFalse(user.checkPasswordComplexity("password"), "False");
    }

    @Test
    public void testPhone() {
        assertTrue(user.checkCellPhoneNumber("+27838968976"), "True");  //boolean testing
        assertFalse(user.checkCellPhoneNumber("08966553"), "False");

        Login user1 = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        assertEquals(user1.phoneMessaging(), "Cell phone number successfully added.", "Cell phone number successfully captured.");

        user1 = new Login("kyl_1", "Ch&&sec@ke99", "08966553", "<user first name>", "<user last name>");
        assertEquals("Cell phone number incorrectly formatted or does not contain international code.", user1.phoneMessaging(), "Cell number is incrorrectly formatted or does not contain an international code, please correct the number and try again.");
    }

    @Test
    public void testLogin() {
        assertFalse(user.loginUser("different", "different"), "False");  //boolean testing
        Login user1 = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");

        assertTrue(user1.loginUser("Ch&&sec@ke99", "kyl_1"), "True");

        user1 = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        user1.registerUser();
        assertEquals("Welcome <user first name> ,<user last name> it is great to see you again.", user1.returnLoginStatus("Ch&&sec@ke99", "kyl_1"), "Welcome <user first name> ,<user last name> it is great to see you.");
        assertEquals("Username or password incorrect, please try again.", user1.returnLoginStatus("p", "u"));

    }

    @Test
    public void testRegister() {
        Login user1 = new Login("kyle!!!!!!!", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", user1.registerUser(), "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");

        user1 = new Login("kyl_1", "password", "+27838968976", "<user first name>", "<user last name>");
        assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.", user1.registerUser(), "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");

        user1 = new Login("kyle!!!!!!!", "password", "+27838968976", "<user first name>", "<user last name>");
        assertTrue(user1.registerUser().contains("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character."), "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        assertTrue(user1.registerUser().contains("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length."), "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");

        user1 = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976", "<user first name>", "<user last name>");
        assertTrue(user1.registerUser().contains("Password successfully captured."), "Password successfully captured.");
        assertTrue(user1.registerUser().contains("Username successfully captured."), "Welcome <user first name> ,<user last name> it is great to see you.");

    }

}
