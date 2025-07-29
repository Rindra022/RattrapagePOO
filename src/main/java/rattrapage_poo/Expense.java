package rattrapage_poo;

import java.time.LocalDate;

public class Expense {
    private final String label;
    private final double amount;
    private final LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getLabel() {
        return label;
    }

    public Expense(String label, double amount, LocalDate date) {
        this.label = label;
        this.amount = amount;
        this.date = date;
    }

    public boolean isLargeExpense(){
        return amount > 100d;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "label='" + label + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
