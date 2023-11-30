public class Current extends Account {
    private double penaltyFee;

    public double getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(double penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    public double getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    private double overdraftFee;

    public Current(String number, double funds){
        super(number, funds);
        this.overdraftFee = 300;
    }

    public double calculateInterest(){
        return 0;
    }

    public void withdraw(double money)
    {
        if(this.getFunds()<money)
        {
            this.penaltyFee =(-1 * (this.getFunds() - money)) + this.overdraftFee;
        }
        this.setFunds(this.getFunds()-money);
    }

    public boolean equals(Savings account){
        boolean b = this.getNumber() == account.getNumber();
        return b;
    }

    public String toString(){
        String x = super.toString();
        x = x + "  Overdraft penalty fee: " + String.format("$%,.2f", this.penaltyFee);
        return x;
    }
}
