import java.util.Scanner;

public class CalculationClient {
    public static void main(String[] args) throws Exception {
        System.out.println("<===========WELCOME TO CALCULATOR===========>");
        System.out.println("Please Enter INPUT1:");
        Scanner  userInput1=new Scanner(System.in);
        double input1=userInput1.nextDouble();
        System.out.println("Please Enter INPUT2:");
        Scanner  userInput2=new Scanner(System.in);
        double input2=userInput2.nextDouble();
        System.out.println("Please Enter type of operation ADD(+),SUBSTRACTION(-),MULTIPLICATION(*),DIVISION(%)");
        Scanner  userTypeOfOpearion=new Scanner(System.in); 
        String typeOfOpearion=userTypeOfOpearion.next();
        CalculationService calculationService=new CalculationService();
        calculationProcessor(calculationService,input1,input2,typeOfOpearion);
    }

    public static void calculationProcessor(CalculationService calculationService,double input1,double input2, String typeOfOpearion) {
        switch (typeOfOpearion) {
            case "+":
                    double sum=calculationService.additionOfTwoNumbers(input1, input2);
                    System.out.println("SUM="+sum);
                break;
            case "-":
                    double substraction=calculationService.substractOfTwoNumbers(input1, input2);
                    System.out.println("SUBSTARTION="+substraction);
                break;
            case "*":
                    double multiplication=calculationService.multiplicationOfTwoNumbers(input1, input2);
                    System.out.println("MULTIPLICATION="+multiplication);
                break;
            case "%":
                    double division=calculationService.divisionOfTwoNumbers(input1, input2);
                    System.out.println("DIVISON:"+division);
                break;
            default:
                System.out.println("Slected Operation is not available");
                break;
        }
    }
}
