
package mainc;

import app.banking;
import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
           
       banking bc[]  = new banking[10];
       int index = 0;
            System.out.println("Enter Choice: ");
            int choice = sr.nextInt();
            
            switch(choice){
                case 1:
                    int resp;
                     do {
                System.out.println("1. Register Account");
                System.out.println("2. Login Account");
                System.out.println("3. View All Accounts");
                System.out.println("Enter Selection: ");
                int action = sr.nextInt();
           
                switch(action){
                    case 1:
                        if(index >= bc.length){
                            System.out.println("Registration accounts reached");
                            break;
                        }
                        
                        bc[index] = new banking();
                        System.out.println("Enter Account No: ");
                        bc[index].setAccountNo(sr.nextInt());
                        
                        System.out.println("Enter Pin: ");
                        bc[index].setPin(sr.nextInt());
                        
                        System.out.println("Registration Successful");
                        index++;
                        break;
                        
                    case 2:
                        int attempts = 3;
                        boolean found = false;
                        
                        while(attempts > 0){
                            System.out.println("Enter Account No: ");
                            int accn = sr.nextInt();
                            
                            System.out.println("Enter Pin: ");
                            int pi = sr.nextInt();
                            
                            for(int acc = 0; acc < index; acc++){
                            if(bc[acc].validateAccount(accn, pi)){
                                System.out.println("LOGIN SUCCESSFUL");
                                found = true;
                                break;
                                  } 
                            }
                            if(found){
                                break;
                            }else{
                                attempts--;
                                System.out.println("LOGIN FAILED!");
                                System.out.println(attempts+" Attempts Remaining");
                                
                               if (attempts == 0){
                                    System.out.println("Max Attempts Reached");
                                    System.out.println("Access denied");
                               }
                            }
                        }
                        break;
                    case 3:
                        break;
                }
                        System.out.println("Do you want to continue? (Y = 1/N = 0)");
                        resp = sr.nextInt();
                }while(resp == 1);
                  break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid Selection!");
                    System.out.println("Try again.");
            }
        }
      }        