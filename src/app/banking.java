
package app;

public class banking {
    
     int accountNo = 20013, pin = 456789;
    String name;
    float initializeBalance = 0;
    
    public boolean validateAccount(int accn, int pi){
        
         return accn == accountNo && pi == pin;
    }
    
    public int listAccount(){
        return accountNo;
    }
    
    
    
    
    
    public void viewBalance(){
    
    
    }
}
