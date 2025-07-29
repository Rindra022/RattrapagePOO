package rattrapage_poo;

import java.time.LocalDate;

public class RefundableExpense extends Expense{
    private boolean refunded = false;

    public RefundableExpense(String label, double amount, LocalDate date) {
        super(label, amount, date);
    }

    public boolean refunded() {
        return refunded = true;
    }
}
