class Account {
    private String regNo;
    private double totalFee;

    public Account(String regNo, double totalFee) {
        this.regNo = regNo;
        this.totalFee = totalFee;
    }

    // final: cannot be overridden by subclasses
    public final double calculateLateFee(int daysLate) {
        return totalFee * daysLate * 0.01;
    }

    // final: cannot be overridden by subclasses
    public final void printSummary(int daysLate) {
        if (daysLate <= 0) {
            System.out.println(regNo + " - On time, no late fee");
        } else {
            double lateFee = calculateLateFee(daysLate);
            System.out.println(
                    regNo + " | Total Fee: Rs " + totalFee +
                            " | Late Fee: Rs " + lateFee
            );
        }
    }
}

public class week4m3 {
    public static void main(String[] args) {
        String[] regNos = {"RA001", "RA002", "RA003", "RA004"};
        double[] totalFees = {200000, 150000, 180000, 220000};
        int[] daysLate = {10, 0, -2, 5};

        // Single pass through the entire batch
        for (int i = 0; i < regNos.length; i++) {
            Account account = new Account(regNos[i], totalFees[i]);

            if (daysLate[i] <= 0) {
                System.out.println(regNos[i] + " - On time, no late fee");
            } else {
                account.printSummary(daysLate[i]);
            }
        }
    }
}