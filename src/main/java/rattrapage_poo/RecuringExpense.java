package rattrapage_poo;

import java.time.LocalDate;

public class RecuringExpense extends Expense{
    public Recurrence recurrence;

    public Recurrence getRecurrence() {
        return recurrence;
    }

    public RecuringExpense(String label, double amount, LocalDate date, Recurrence recurrence) {
        super(label, amount, date);
        this.recurrence = recurrence;
    }

    @Override
    public String toString() {
        return "RecuringExpense{" +
                "recurrence=" + recurrence +
                '}';
    }
}
