package rattrapage_poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpenseDAO {
    private final List<Expense> listExpenseRefund = new ArrayList<>();



    public void addExpense(RefundableExpense refundableExpense){
        if(!refundableExpense.refunded())
            listExpenseRefund.add(refundableExpense);
    }

    public List<Expense> expenseRefundNoRefund(){
        return listExpenseRefund.stream()
                .filter(e -> !e.isLargeExpense())
                .collect(Collectors.toList());
    }
}
