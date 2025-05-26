/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;
 import java.util.Scanner;
import java.util.ArrayList;


public class Messages {
    private String Messageid;
    private String recipient;
    private String content;
    private String messagehash;
    private static int messageCount=0;
    private int messageNumber;
    public Messages(String recipient, String content ){
        
        this.recipient= recipient;
        this.content=content;
        this .Messageid= generateMessageid();
        this .messageNumber = ++ messageCount;
        this.messagehash = generateMessagehash();
        
        
    }
    private String generateMessageid(){
        Random rand = new Random();
        long number= 100000000L+(long)
                (rand.nextDouble()+899999999999999L);
        return  Long.toString(number);
    }
    private String generateMessagehash(){
        String Firsttwo= Messageid.substring(0,2);
        String[] words= content.trim().split("\\S+");
        String firstWord = words.length>0?
                words[0]:"";
        String lastword = words.length> 1?
                words[words.length-1]: firstWord;
        return (Firsttwo + ":" + messageNumber + ":" + firstWord+lastword).toUpperCase();
    }
    public boolean isValidRecipient(){
        return recipient !=null && recipient.matches("^\\+?\\d{1,10}$");
    }
    public boolean istoLong(){
        return content.length()>250;
        
    }
    public String GetDetails(){
        return "messageId : " + Messageid+ "Meassagechash" + messagehash + "Recpient:"+ recipient+ "Message"+ content;
    }
    public boolean exceedsWarning(){
        return content.length()>50;
    }
    public static int getmessaCount(){
        return messageCount;
    }
    public String getContent(){
        return content;
    }
        public void setcontent(String content){
            this.content=content;
        
        
        }
    
    
    
    private ArrayList<String> sentMessages = new ArrayList<>();
    private JSONArray storedMessages = new JSONArray();
            public boolean checkMessageId(String MessageId){
                return MessageId.length()<= 10;
            }
            public int checkRecipientcell(String cellnumber){
                if(cellnumber.length()<=10 && cellnumber.matches("^\\d+$")){
                    return 1;
                }else{
                    return 0;
                }
            }
            public String CreateMessageHash(String message){
                return Integer.toHexString(message.hashCode());
            } 
            public String SentMessage(){
               Scanner scanner= new Scanner(System.in);
              System.out.println("enter your message: ");
              String Message = scanner.nextLine();
              System.out.println("choose an option (1) send (2) store (3) disregard");
              int option = scanner.nextInt();
              scanner.nextLine();
                switch (option) {
                   
                
                  case 1 :
                      sentMessages.add(Message);
                      return "message sent: " + Message;
                  case 2 :
                      storeMessage(Message);
                      return "message stored: "+ Message;
                  case 3:
                      return "message desregarded";
                  default:
                      return "invalidn option";
                      
              }
                
            }
            public  String printMessage(){
                if(sentMessages.isEmpty()){
                    return "no message is sent. ";
                }
          StringBuilder result = new StringBuilder("sent messages :/n");
            for( String msg : sentMessages){
                 result.append("_-").append(msg).append("/n");
            }
            return result.toString();
           }
            public int ReturnTotalMessages(){
                return sentMessages.size();
            }
            public void storeMessage(String message ){
                JSONObject jsonMessage = new JSONObject();
                jsonMessage.put("message", sentMessages);
                jsonMessage.put("hash", CreateMessageHash(message));
                storedMessages.put(jsonMessage);
                }
            public String getStroredmessageJSON(){
                return storedMessages.toString(2);
                   
                  }
            public static void main(String[] args){
                // Messages manager = new Messages();
         //  System.out.println(manager.SentMessage());
             //System.out.println(manager.printMessage());
             // System.out.println(" total messages" + manager.ReturnTotalMessages());
             //   System.out.println(" stored json :\n" + manager.getStroredmessageJSON());
                
            }
           
                                                                                              
            }
    

