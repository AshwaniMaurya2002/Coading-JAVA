public class PersonalLoan extends Loan{

    String name;
    String address;

    //always make a no argument construction constructor

    PersonalLoan(){

    }

    public PersonalLoan(String LoanNo,int amount,double roi,String name,String address) {
        super(LoanNo, amount, roi);
        this.name=name;
        this.address=address;
    }


    public String toString(){
        return super.toString() +"\tName is: "+name+"\t Address is: "+address;
    }

    
}
