import java.util.*;

public class Pro4_64010683 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Filing Status");
    System.out.println("\t[0]-Single filer");
    System.out.println("\t[1]-Married jointly or qualifying widow(er)");
    System.out.println("\t[2]-Married separately");
    System.out.println("\t[3]-Head of household");
    System.out.print("Enter the filing status: ");
    int status = input.nextInt();

    System.out.print("Enter the taxable income: ");
    double income = input.nextDouble();

    double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
    int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 },
        { 16700, 67900, 137050, 20885, 372950 },
        { 8350, 33950, 68525, 104425, 186475 },
        { 11950, 45500, 117450, 190200, 372950 }
    };

    double tax = 0;

    if (income <= brackets[status][0])
      tax = income * rates[0];
    else if (income <= brackets[status][1])
      tax = 8350 * rates[0] + (income - 8350) * rates[1];
    else if (income <= brackets[status][2])
      tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (income - 33950) * rates[2];
    else if (income <= brackets[status][3])
      tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (82250 - 33950) * rates[2] + (income - 82250) * rates[3];
    else if (income <= brackets[status][4])
      tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (82250 - 33950) * rates[2] + (171550 - 82250) * rates[3]
          + (income - 171550) * rates[4];
    else
      tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (82250 - 33950) * rates[2] + (171550 - 82250) * rates[3]
          + (372950 - 171550) * rates[4] + (income - 372950) * rates[5];

    System.out.println("Tax is " + (int) (tax * 100) / 100.0);

    input.close();
  }
}
