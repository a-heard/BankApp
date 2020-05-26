import java.util.List;
import java.util.LinkedList;

import javax.swing.text.Utilities;

public class Bankaccountapp {

    public static void main(String[] args) {
        String file = "C:\\Users\\admin\\Documents\\WIN\\UDemyLearn\\Bankaccount.csv";

        /*
         * Checking chkacct1 = new Checking("TOM WILSON", "123456789", 2500); Savings
         * savacct1 = new Savings("Rich Lowe", "987654321", 1500); savacct1.showInfo();
         * System.out.println("***********"); chkacct1.showInfo();
         */

        // Read a CSV file and create new accounts based on that data
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder) {

            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
        }
    }

}