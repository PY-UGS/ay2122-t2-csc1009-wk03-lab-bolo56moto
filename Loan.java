import java.util.Date;
import java.lang.Math;

 public class Loan {
   private double annualInterestRate;
   private int numberOfYears;
   private double loanAmount;
   private Date loanDate = new Date();
    

   public Loan(double aIR, int noOfYears, double lA) {
      setAnnualInterestRate(aIR);
      setNumberOfYears(noOfYears);
      setLoanAmount(lA);
      
      

   }

   public double getAnnualInterestRate() {
       return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
       this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
       return this.numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
       this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
       return this.loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
       this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
       return(this.loanDate);
    }



    public double getMonthlyPayment(){
       double mIR = (getAnnualInterestRate()/1200);
       double nom = getLoanAmount() * mIR;
       double denom = 1-(1/(Math.pow(1+mIR,getNumberOfYears()*12)));
       return nom/denom;
       
       
       
      
       
    }

    public double getTotalPayment(){
      double mp =  getMonthlyPayment();
      return mp * 12 * numberOfYears;
      
       
    }
    
   }

   
