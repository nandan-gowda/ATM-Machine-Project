package atmpackage;

import java.util.HashMap;
import java.util.Map;

public class atmimplement implements atmInterface {
    
    //all information is available in atm class so need an object
    ATM atm = new ATM();
    Map<Double,String> ministat=new HashMap<>();

@Override
public void viewBalance(){
    System.out.println("Availbale balance is :"+atm.getBalance());
}

@Override
public void withdrawAmount(double withdrawAmount){
    if(withdrawAmount%500==0){
    if(withdrawAmount<=atm.getBalance()){
        ministat.put(withdrawAmount, "Withdrawn amount");
        System.out.println("collect amount"+withdrawAmount);
        atm.setBalance(atm.getBalance()-withdrawAmount);
        viewBalance();
    }
    else{
        System.out.println("You have Insufficient Balance");
    }
}
else{
    System.out.println("Enter amount in multiple of 500");
}

}

@Override
public void depositAmount(double depositAmount){
    ministat.put(depositAmount, "Amount Deposited");
    System.out.println(depositAmount+" Deposited Successfully");
    atm.setBalance(depositAmount+ atm.getBalance());
    viewBalance();
}


@Override
public void viewMiniStatement(){
    for(Map.Entry<Double,String> m:ministat.entrySet() ){
        System.out.println(m.getKey()+""+m.getValue());
    }

}


}
