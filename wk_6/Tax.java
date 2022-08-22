public class Tax {
    private int filingStatus;
    private int[][] brackets;
    private double rates[];
    private double taxableIncome;

    public Tax() {
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public void setStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public int getStatus() {
        return this.filingStatus;
    }

    public int[][] getBrackets() {
        return this.brackets;
    }

    public double[] getRates() {
        return this.rates;
    }

    public double getTaxalbleIncome() {
        return this.taxableIncome;
    }

    public double getTax() {

        double tax = 0;

        if (taxableIncome <= brackets[filingStatus][0])
            tax = taxableIncome * rates[0];
        else if (taxableIncome <= brackets[filingStatus][1])
            tax = 8350 * rates[0] + (taxableIncome - 8350) * rates[1];
        else if (taxableIncome <= brackets[filingStatus][2])
            tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (taxableIncome - 33950) * rates[2];
        else if (taxableIncome <= brackets[filingStatus][3])
            tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (82250 - 33950) * rates[2]
                    + (taxableIncome - 82250) * rates[3];
        else if (taxableIncome <= brackets[filingStatus][4])
            tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (82250 - 33950) * rates[2] + (171550 - 82250) * rates[3]
                    + (taxableIncome - 171550) * rates[4];
        else
            tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (82250 - 33950) * rates[2] + (171550 - 82250) * rates[3]
                    + (372950 - 171550) * rates[4] + (taxableIncome - 372950) * rates[5];

        return tax;
    }

}
