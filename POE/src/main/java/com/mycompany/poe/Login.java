/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author lab_services_student
 */
public class Login {

    private String name, pass, phone, first, last;
    private boolean registerred = false;

    public Login(String name, String pass, String phone, String first, String last) {
        this.name = name;
        this.pass = pass;
        this.phone = phone;
        this.first = first;
        this.last = last;
    }

    public boolean checkUserName(String name) {
        return ((name.contains("_")) && (name.length() < 6));
    }

    public String getPhone() {
        return phone;
    }
    

    public boolean checkPasswordComplexity(String pass) {
        boolean num, cap, unique;
        num = cap = unique = false;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                cap = true;
            }
            if (Character.isDigit(pass.charAt(i))) {
                num = true;
            }

            if (!(Character.isDigit(pass.charAt(i)) || Character.isLetter(pass.charAt(i)))) {
                unique = true;
            }
        }

        return ((pass.length() >= 8) && num && cap && unique);
    }

    //code attribution
    //ChatGPT. (2024). ChatGPT (Dec 11
    //version) [Large language
    //model]. https://chatgpt.com/share/6804bfef-0a94-8005-b060-aba98aeaa2e7
    /**
     * Validates a phone number to check if it has an international country code
     * and that the length (excluding the '+') is less than 11 digits.
     *
     * @param phoneNumber The phone number to validate.
     * @return true if it contains a country code and is less than 11 digits;
     * false otherwise.
     */
    public boolean checkCellPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }

        // Check if it starts with '+', indicating an international code
        if (!phoneNumber.startsWith("+")) {
            return false;
        }

        // Remove the '+' for length check
        String digitsOnly = phoneNumber.substring(1);

        // Check that it contains only digits after '+'
        if (!digitsOnly.matches("\\d+")) {
            return false;
        }

        // Check that total length excluding '+' is less than 11
        return (digitsOnly.length() == 11); //double check length
    }

    public String registerUser() {
        if (!checkUserName(name) && !checkPasswordComplexity(pass)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.\nPassword is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkUserName(name)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity(pass)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        registerred = true;
        return "Username successfully captured.\nPassword successfully captured.\nSuccessfully registered.";
    }

    public boolean loginUser(String p, String u) {
        return ((p.contentEquals(pass)) && (u.contentEquals(name)));
    }

    public String returnLoginStatus(String p, String u) {
        if (loginUser(p, u) && registerred) {
            return "Welcome " + first + " ," + last + " it is great to see you again.";
        }

        return "Username or password incorrect, please try again.";
    }

    //This is mine 'cause unsure of telephone messaging.
    public String phoneMessaging() {
        if (checkCellPhoneNumber(phone)) {
            return "Cell phone number successfully added.";
        }
        return "Cell phone number incorrectly formatted or does not contain international code.";
    }
}
