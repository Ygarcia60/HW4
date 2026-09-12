package Interface;

import java.util.ArrayList;

public class PayableDriver {
    public static void main(String[] args){
        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Freelancer("Alice", "Johnson", 30.00, 45));
        payables.add(new Freelancer("Robert", "Garcia", 25.00, 36));
        payables.add(new VendorInvoice("Office Supply Co.", "INV-1001", 1250.00));
        payables.add(new VendorInvoice("Technology Services", "INV-1002", 675.50));

        double totalPayout = 0;

        for (Payable payable : payables) {
            payable.print();

            totalPayout += payable.calculatePayment();

            System.out.println();
        }

        System.out.printf(
                "Total payout for the period: $%,.2f%n",
                totalPayout);
    }
}

