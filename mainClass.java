package atmpackage;

import java.util.*;

public class mainClass {
    public static void main(String[] args) {
        atmInterface op = new atmimplement();



        int atmnumber = 12345;
        int atmpin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.println("Enter Atm Number : ");
        int atmNumber=sc.nextInt();
        System.out.println("Enter Atm Pin : ");
        int atmPin = sc.nextInt();
        
        if(atmNumber==atmnumber && atmpin==atmPin){
            System.out.println("Aunthetication Successful");
           
            while(true){
                System.out.println("1.View Balance\n2.Withdraw Amount\n3.Deposit Cash\n4.View ministatement\n5.Exit ");
                System.out.println("Enter your choice");
                int ch = sc.nextInt();
               
               
                if(ch==1){
                    op.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("Enter amount to deposit");
                    Double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);
                
                }
                else if(ch==4){
                    op.viewMiniStatement();

                }
                else if(ch==5){
                    System.out.println("Collect Yout ATM Card\n Thank You!!");
                    System.exit(0);

                }
                else{
                   System.out.println("Please enter vlid choice"); 
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number or Pin");
            System.exit(0);
        }


        sc.close();
    }
}
