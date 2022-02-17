import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return totalDeposits-creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public static int totalCashInBank(ArrayList<Integer> cash){
    	int sum=0,i;
    	for (i=0;i<cash.size();i++) {
    		sum += cash.get(i);
    	}
    	return sum;
    }
    public int getCash(){
    	return 0;
    }
    public static void main(String[] args) {
    	CurrentAccount currentAccountTotal = new CurrentAccount();
    	SavingsAccount savingsAccountTotal = new SavingsAccount();
    	ArrayList<Integer> cash = new ArrayList<>();
    	cash.add(currentAccountTotal.getCash());
    	cash.add(savingsAccountTotal.getCash());
    	System.out.println(totalCashInBank(cash));
    }
}