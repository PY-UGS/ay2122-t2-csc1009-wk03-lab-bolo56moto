import java.text.DecimalFormat;
import java.util.Scanner;

public class LoanRequest {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double aIR = input.nextDouble();
        System.out.println("Enter number of years as an integer: ");
        int nOY = input.nextInt();
       
        System.out.println("Enter loan amount, for example, 120000.95: ");
        double lA = input.nextDouble();
        input.close();
        
        
        DecimalFormat df = new DecimalFormat("#.##");
        Loan l = new Loan(aIR,nOY,lA);
        System.out.println("The loan was created on: "+l.getLoanDate() );
        System.out.println("The Monthly Payment is: " +df.format(l.getMonthlyPayment()));
        System.out.println("The Total Payment : "+df.format(l.getTotalPayment()));
    
    }
}
