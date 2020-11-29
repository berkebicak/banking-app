
package oonlinebanking;

import java.util.ArrayList;
import java.util.List;


public class Account {
            private User user;   
            private double balance; 
            private double minBalance;    
            private String AccountNo;    
            private String IbanNo;  
            private List<String> IBANs = new ArrayList<String>();
           
            
            public Account(){}
            
            
            public Account (double balance, double minBalance){
               this.balance = balance;
               
               this.minBalance = minBalance;
               
               int accountNum = (int)(Math.random()*1000000000);
               
               this.AccountNo =Integer.toString(accountNum);
               
               this.IbanNo = "TR"+"04"+"112358"+"0"+"1325"+this.AccountNo;
            }
            
            public void eft( String eftiban,double money){
                boolean eftcheck = true;
                if(IbanNo.contains(eftiban)){
                    eftcheck = true;
                    IBANs.add(eftiban);
                }else{
                    eftcheck = false;
                }
                if(eftcheck = true){
                    this.balance += money;
                    System.out.println("Your balance is now "+this.balance);
                }
            }
   public void setUser(User u){
                user = u;  
                
 }      public void setBalance(int b){  
          balance = b;   
        
 }      public void setMinBalance(int l){  
          minBalance = l;  
        
 }      public void setAccountNo(String a){   
          AccountNo = a; 
          
 }      public void setIbanNo(String i){    
          IbanNo = i;    
 }     
        public User getUser(){   
                return user;    
 }      
        public double getBalance(){   
                return balance;      
   }       
        public double getMinBalance(){ 
               return minBalance;      
   }       
        public String getAccountNo(){   
               return AccountNo;      
 }       
         String getIBANno(){  
                return IbanNo;
 }   
}
        


    

