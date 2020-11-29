package oonlinebanking;

import java.util.ArrayList;


public class User {
            private String name;
            private String surname;
            private int customerNumber;
            private String email;   
            private String password;
            private String telephone; 
            
           
            private Account[] accountss = new Account[5];   
            
            private ArrayList<String> IBANs  = new  ArrayList<String>();        
            private static int numAccounts = 0;    
    String getEmail;
             
            
            public User(String name,String surname,String email,int customerNumber,String password,String telephone){
                this.name=name;
                this.surname=surname;
                this.email= email;
                this.customerNumber=customerNumber;
                this.password = password;
                this.telephone=telephone;
                
                
            }
          
           

            public void openAc(double balance, double minBalance){
            Account newUserac = new Account(balance,minBalance);
           
            accountss[numAccounts] = newUserac;
            IBANs.add( newUserac.getIBANno());
                System.out.println("Your account was created");
                System.out.println("Balance : "+accountss[numAccounts].getBalance());
                System.out.println("Min Balance : "+accountss[numAccounts].getMinBalance());
                System.out.println("Your Account Number is : "+ accountss[numAccounts].getAccountNo());
                System.out.println("IBAN : "+accountss[numAccounts].getIBANno());
                
            numAccounts++;
                System.out.println("This is your "+numAccounts+". account");
            {
            
            }
                
                System.out.println("-------------------------------------");
            }
            
            public void seeAcc (int i){
                System.out.println(i+1+".Account");
                 
                System.out.println("Balance is  "+accountss[i].getBalance());
                System.out.println("Min Balance is  "+accountss[i].getMinBalance());
                System.out.println("Your Account Number is : "+accountss[i].getAccountNo());
                System.out.println("IBAN : "+ accountss[i].getIBANno());
                
            }
           
           
                            
            public void setName(String n){          
             name = n;      
 }       
            public void setSurname(String s){ 
             surname = s;   
 }     
            public void setcustomerNumber(int c){   
             customerNumber = c;    
 }    
            public void setEmail(String e){      
             email = e;     
 }     
            public void setPassword(String p){      
             password = p;   
 }      
            public void setTelephone(String t){  
             telephone = t;  
 }    
            
    
     
           
            public String getName(){ 
            return name;  
 }  
            public String getSurname(){          
            return surname;        
 }    
            public int getcustomerNumber(){              
            return customerNumber;  
 }      
            public String getEmail(){             
            return email; 
 }    
            public String getPassword(){            
            return password;  
 }      
            public String getTelephone(){     
            return telephone;     
            
 }          public Account[] getAccounts(){     
            return accountss;    
            
 
 }
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Account[] getAccountss() {
        return accountss;
    }

    public void setAccountss(Account[] accountss) {
        this.accountss = accountss;
    }

    public ArrayList<String> getIBANs() {
        return IBANs;
    }

    public void setIBANs(ArrayList<String> IBANs) {
        this.IBANs = IBANs;
    }

    
    public static int getNumAccounts() {
        return numAccounts;
    }

    public static void setNumAccounts(int numAccounts) {
        User.numAccounts = numAccounts;
    }


   
   

}

           


    
 

    

