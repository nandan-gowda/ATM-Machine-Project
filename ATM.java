package atmpackage;
public class ATM{
    private double balance;
    private double depositAmount;
    private double withdrawAmount;


//def constructor
public ATM(){

}

//get and setter
public double getBalance(){
    return balance;
}

public void setBalance(double balance) {
    this.balance=balance;
}


public double getDepositAmount(){
    return depositAmount;
}

public void setDepositAmount(double depositAmount) {
    this.depositAmount=depositAmount;
}


public double getWithdrawAmount(){
    return withdrawAmount;
}

public void setwithdrawAmount(double withdrawAmount) {
    this.withdrawAmount=withdrawAmount;
}
}
