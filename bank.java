import java.io.*;
import java.util.*;
public class Main
{
    String name;
    int account_no;
    int amount;
    Scanner sc=new Scanner(System.in);
  
    void getdata(){
        
        System.out.println("enter your name:");
        name=sc.next();
        System.out.println("enter your account no:");
        account_no=sc.nextInt();
        System.out.println("enter your current amount:");
        amount=sc.nextInt();
    }
    
    void deposit(){
        System.out.println("enter the amount to be deposited:");
        int deposits;
        deposits=sc.nextInt();
        System.out.println("the total amount after the deposition is:");
        System.out.println(amount+deposits);
        
    }
    void withdraw(){
         System.out.println("enter the amount to be withdrawed:");
         int withdraw;
         withdraw=sc.nextInt();
         if(withdraw>amount){
              System.out.println("insufficient balance:");
         }
         else{
              System.out.println("current balance after withdrawal:");
               System.out.println(amount-withdraw);
         }
    }
    void display_balance(){
        System.out.println("bank balance of "+name+" is");
        System.out.println("the current balance after all is  :"+amount);
    }
	public static void main(String[] args) {
		Main obj=new Main();
		obj.getdata();
		 System.out.println("enter 1: deposit ,enter 2:withdrawal,enter 3:display_balance");
		 Scanner sc=new Scanner(System.in);
		 int operation;
		operation=sc.nextInt();
		switch(operation){
		    case 1:
		        obj.deposit();
		        break;
		        case 2:
		            obj.withdraw();
		            break;
		            case 3:
		                obj.display_balance();
		                break;}
		}
	}

