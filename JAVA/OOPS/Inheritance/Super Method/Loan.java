public class Loan {
    
    String LoanNo;
    int amount;
    double roi;

    
    Loan(){
        
    }

    Loan(String LoanNo,int amount,double roi)
    {
        this.LoanNo=LoanNo;
        this.amount=amount;
        this.roi=roi;
    }

    public String toString(){
        return "Loan NO: "+LoanNo+"\tAmount Is: "+amount+"\tRateOfInterest"+roi;
    }
}
