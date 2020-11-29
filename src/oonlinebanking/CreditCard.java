
package oonlinebanking;
import java.util.Scanner;

public class CreditCard {
    Scanner scan = new Scanner(System.in);
     
    private double limit;
    private double CardNumber;
    private double totalDebt;
    private double minDebt;
    private CreditCard[] cards = new CreditCard[2];
    private static int Cardsayısı = 0;
    
    
    public CreditCard(){
        
    }
    public CreditCard(double limit,double CardNumber ,double totalDebt, double minDebt){
        this.limit =limit;
        this.CardNumber = CardNumber;
        this.minDebt = minDebt;
        this.totalDebt = totalDebt;
    
}

    
      public void addCrediCard(double limit,double minDebt,double totalDebt){
          CreditCard newcred = new CreditCard();
          cards[Cardsayısı]= newcred;
          
            int credinumber = (int)(Math.random()*1000000000);
            
            System.out.println("Limit : "+limit+" Total Debt "+totalDebt+ " Min Debt "+minDebt);
            System.out.println("New Credit Card created");
            System.out.println("Your Credit Card number is "+credinumber);
            Cardsayısı++;
            
            
     
    }
    


 
    
    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(double CardNumber) {
        this.CardNumber = CardNumber;
    }

    public double getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(double totalDebt) {
        this.totalDebt = totalDebt;
    }

    public double getMinDebt() {
        return minDebt;
    }

    public void setMinDebt(double minDebt) {
        this.minDebt = minDebt;
    }

    public CreditCard[] getCards() {
        return cards;
    }

            public void setCards(CreditCard[] cards) {
        this.cards = cards;
  } 
}


