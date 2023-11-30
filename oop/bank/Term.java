public class Term extends Savings {
    private int termMonths;

    public int getTermMonths() {
        return termMonths;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    private double interestRate;
    public Term(String number, double funds, String clientID){
        super(number, funds, clientID);
        this.termMonths = 6;
        this.interestRate= 2.7;
    }
    public Term(String number, double funds, String clientID, int termMonths, double interestRate){
        super(number, funds, clientID);
        this.termMonths = termMonths;
        this.interestRate= interestRate;
    }

    public double calculateInterest(){
        return (this.getFunds() * this.interestRate * this.termMonths)/1200;
    }

    public boolean equals(Savings account){
        return (this.getClientID() == account.getClientID())&&(this.getNumber()==account.getNumber());
    }

    public String toString(){
        String x = "ClientID: " + getClientID();
        x = x + "  Acct: Term  Number: "  + this.getNumber();
        x = x + "  Funds: " + String.format("$%,.2f", getFunds());
        x = x + "  Term: " + this.termMonths + " months";
        x = x + "  Interest: " + String.format("%,.2f", this.interestRate) + "%";
        return x;
    }
}
