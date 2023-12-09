import java.util.Scanner;

/**
 * Bank13
 */
public class Bank13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        int init_sav_amount, sav_period;
        double final_sav_amount_, interest, interest_percent= 0.02;
        System.out.print("Input your initial savings amount: ");
        init_sav_amount = input13.nextInt();
        System.out.print("Input your savings period: ");
        sav_period = input13.nextInt();
        interest = sav_period *interest_percent *init_sav_amount;
        final_sav_amount_= interest + init_sav_amount;
        System.out.println("Interest: " + interest);
        System.out.println("Final savings amount: "+ final_sav_amount_);
    }
}