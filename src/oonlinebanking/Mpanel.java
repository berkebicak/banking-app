
package oonlinebanking;

import java.util.Scanner;

public class Mpanel {
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
   
    
    
    User x = new User("BERKE","BIÇAK","berke.bicak@hotmail.com",112358,"6554","05532027221");
    User user1 = new User("ALEX","THE KING","alextheking@cbu.tr",252826,"1907","05596846545");
    User user2 = new User("BENEDİCT","CUCUMBER","bendictc@mkj.uk",012345,"2020","05987451523");
    User user3 = new User("STEVE","WORKS","steve_wrks@app.us",556677,"4848","0578423813");
      
    User[] users = {x,user1,user2,user3};
    int userNum = -1;
    boolean userS = true;
        System.out.println("---------WELCOME--------");
        System.out.println("Costumer no : ");
        int cosnum = scan.nextInt();
        scan.nextLine();
        System.out.println("Password : ");
        String password = scan.nextLine();
        
        try{
            for (int i =0;i<=users.length;i++){
            if((users[i].getcustomerNumber() == cosnum) && (users[i].getPassword().contains(password))){
            userS = true;
            userNum = i;
            System.out.println("--------------------------");
                System.out.println("Welcome "+users[userNum].getName()+" "+users[userNum].getSurname());
                System.out.println("-----------------------------");
            break;
                
        }
                    
            }
        }catch(ArrayIndexOutOfBoundsException exp){
            
            System.out.println("Wrong login ");
            System.exit(0);
        
         }
        
    Account[] a = new Account[5];
    
    CreditCard c  = new CreditCard();
    
    
    boolean b = true;
    int n;
    while(b && userS){
        System.out.println("1  Open New Account");
        System.out.println("2  My Account");
        System.out.println("3  New Credit Card");
        System.out.println("4  EFT");
        System.out.println("5  Quit");
        n = scan.nextInt();
        scan.nextLine();
        switch(n){
            case 1:
                System.out.println("Balance : ");
                double balance = scan.nextDouble();
                System.out.println("Min Balance : ");
                double minBalance = scan.nextDouble();
                x.openAc(balance,minBalance); 
                break;
                
            case 2:
                System.out.println("Which account you want to see (1 to 5) :  ");
                 int accountNo = scan.nextInt();
                 x.seeAcc(accountNo-1);
                 break;
                 
          
             case 3:
                 
                System.out.println("Enter Limit : ");
                double limit = scan.nextDouble();
                double debt = 0;
                 System.out.println("Min Debt : ");
                 double minDebt = scan.nextDouble();
                 c.addCrediCard(limit,minDebt,debt);
              break; 
                                
             case 4:
                 System.out.println("Enter IBAN no :");
                String IBAN = scan.nextLine();
                 System.out.println("Amount of Money :");
                double money = scan.nextDouble();
                scan.nextLine();
                
                boolean IBANsupport = true;
                int queue = -1;
                if(x.getIBANs().contains(IBAN)){
                    IBANsupport = true;
                   queue = x.getIBANs().indexOf(IBAN);
                }else{
                    IBANsupport = false;
                    System.out.println("This IBAN not supported.");
                    break;
                }
                
                if( IBANsupport = true){
                    x.getAccounts()[queue].eft(IBAN, money);
                    System.out.println("EFT DONE");
                    System.out.println("---------------------------------");
                }
                break;
            
             case 5 :
                 System.out.println("Logging Out...");
                 System.exit(0);
                 
        
    }
    

        
    }
    }
}