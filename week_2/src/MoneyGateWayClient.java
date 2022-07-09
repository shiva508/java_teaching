import java.util.Scanner;

public class MoneyGateWayClient {
    public static void main(String[] args) {
        System.out.println("===================Money Gateway======================");
        System.out.println("Select Transaction type from bellow options");
        System.out.println("A.Direct transfer");
        System.out.println("B.Debit card transfer");
        System.out.println("C.Credit card transfer\n");
        Scanner type = new Scanner(System.in);
        String transactionType = type.next();
        System.out.println("Please enter amount to be transfered:");
        Scanner amount = new Scanner(System.in);
        Double transactionAmount = amount.nextDouble();
        transferAmountToDestination(transactionType, transactionAmount);
    }

    public static void transferAmountToDestination(String transactionType, Double transactionAmount) {
        MoneyGateWay moneyGateWay = null;
        switch (transactionType) {
            case "A":
                moneyGateWay = new DirectMoneyGateWay();
                Double amountTranfered = moneyGateWay.makePayment(transactionAmount);
                System.out.println(amountTranfered + " Tranfered through Direct gateway ");
                break;
            case "B":
                moneyGateWay = new DebitMoneyGateWay();
                Double amountDebitTranfered = moneyGateWay.makePayment(transactionAmount);
                System.out.println(amountDebitTranfered + " Tranfered through Debit gateway ");
                break;
            case "C":
                moneyGateWay = new CreditMoneyGateWay();
                Double amountCreditTranfered = moneyGateWay.makePayment(transactionAmount);
                System.out.println(amountCreditTranfered + " Tranfered through Credit gateway ");
                break;
            default:
                System.out.println("No gateway is found to trnasfer money");
                break;
        }
    }
}
