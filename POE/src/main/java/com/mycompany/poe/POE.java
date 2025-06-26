/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.poe;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class POE {

    public static void main(String[] args) {
        String name, pass, phone, first, last;

        //       Login user = new Login();
        Scanner scan = new Scanner(System.in);
        Login user = new Login(null, null, null, null, null);
        
        boolean registered = false;
        while(!registered){
            System.out.println("Register:");
        System.out.println("enter username");
        name = scan.nextLine();
        System.out.println("enter password");
        pass = scan.nextLine();
        System.out.println("enter telephone number");
        phone = scan.nextLine();
        System.out.println("enter first name");
        first = scan.nextLine();
        System.out.println("enter last name");
        last = scan.nextLine();

        user = new Login(name, pass, phone, first, last);

        System.out.println(user.phoneMessaging());

        System.out.println(user.registerUser());
        registered = user.isRegisterred();
    }
        String pass1 = "";
        String name1 = "";
        while(!(user.loginUser(pass1, name1))){
        System.out.println("Login:");

        System.out.println("enter username");
        name1 = scan.nextLine();
        System.out.println("enter password");
        pass1 = scan.nextLine();

        System.out.println(user.returnLoginStatus(pass1, name1));
        }
        if (user.loginUser(pass1, name1)) {
            int option = 0;
            String[] disregarded = new String[1];
            String[] hash = new String[1];   //chilled as arrays are objects and only a reference to them is passed
            String[] id = new String[1];
            String[] sent = new String[1];
            String[] stored = new String[1];
            String[] recipient1 = new String[1];
            while (option != 3) {   //closes application when user chooses to "Quit"
                option = Integer.parseInt(JOptionPane.showInputDialog(null, "Option 1)Send messages\nOption 2)Show recent messages\nOption 3)Quit", "Welcome to QuickChat", JOptionPane.DEFAULT_OPTION));
                //retrieves input
                if (option == 2) //Displays output for "Show recent messages"             
                {
                    //altered to change from "Coming Soon", as the feature has been implemented
                    Message temp = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);

                    temp.initiateArrs(stored, sent, hash, id, disregarded, recipient1);
                    int poeOpt = Integer.parseInt(JOptionPane.showInputDialog(null, "Option 1)Display sender and recipient of all sent messages.\nOption 2)Display the longest sent message.\nOption 3)Search for a message ID and display the corresponding recipient and message.\nOption 4)Search for all the messages sent to a particular recipient.\nOption 5)Delete a message using the message hash.\nOption 6)Display a report that list the full details of all sent messages. ", "Show recent messages", JOptionPane.DEFAULT_OPTION));
                    switch (poeOpt) {
                        case 1:
                            JOptionPane.showMessageDialog(null, temp.sentForSender(user.getPhone()), "Option 1", JOptionPane.DEFAULT_OPTION);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, temp.longestSent(), "Option 2", JOptionPane.DEFAULT_OPTION);
                            break;
                        case 3:
                            String ID = JOptionPane.showInputDialog(null, "Enter message ID", "Option 3", JOptionPane.DEFAULT_OPTION);
                            JOptionPane.showMessageDialog(null, temp.idSearch(ID), "Option 3", JOptionPane.DEFAULT_OPTION);
                            break;
                        case 4:
                            String recipient = JOptionPane.showInputDialog(null, "Enter message recipient", "Option 4", JOptionPane.DEFAULT_OPTION);

                            JOptionPane.showMessageDialog(null, temp.recipientSearch(recipient), "Option 4", JOptionPane.DEFAULT_OPTION);
                            break;
                        case 5:
                            String hashS = JOptionPane.showInputDialog(null, "Enter message hash", "Option 5", JOptionPane.DEFAULT_OPTION);
                            temp.hashDelete(hashS);
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, temp.sentReport(), "Option 6", JOptionPane.DEFAULT_OPTION);
                            break;
                    }
                }

                if (option == 1) {  //"Displays output for "Send messages"
                    int totalMessages = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of message that you wish to enter:", "Send messages", JOptionPane.DEFAULT_OPTION));
                    //above retrieves input for the number of messages that the user shall be entering
                    disregarded = new String[totalMessages];
                    hash = new String[totalMessages];   //chilled as arrays are objects and only a reference to them is passed
                    id = new String[totalMessages];
                    sent = new String[totalMessages];
                    stored = new String[totalMessages];
                    recipient1 = new String[totalMessages];

                    int count = 0;
                    for (int i = 0; i < totalMessages; i++) {   //keeps creating message entries until the user has enterred all of the messages they declared they would previously                 
                        String recipient = JOptionPane.showInputDialog(null, "Enter Recipient Cell", "Send messages", JOptionPane.DEFAULT_OPTION);
                        String message = JOptionPane.showInputDialog(null, "Enter message", "Send messages", JOptionPane.DEFAULT_OPTION);

                        Message current = new Message(recipient, message, i); //message number increments as loop runs

                        current.initiateArrs(stored, sent, hash, id, disregarded, recipient1);

                        current.setNumMessageSent(count); //for keeping track of the number of messages sent, when the object gets overwritten                    
                        current.sentMessage();   //provides menu for the user to select to send,store or discard the message
                        count = current.getNumMessageSent();
                    }
                    JOptionPane.showMessageDialog(null, count, "total number of messages", JOptionPane.DEFAULT_OPTION);//I'm under the impression that the total number of messages accumulated that was aluded to refers to the number of messages sent, as indicated by the test cases
                }
            }
            
        }
        //}
        scan.close();
    }
}
