package problem2;

import java.util.ArrayList;
import java.util.List;
public class Customer {
    private String name;
    private List<Double> transactions;
    public Customer(String name){
        this.name=name;
        this.transactions=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactions(List<Double> transactions) {
        this.transactions = transactions;
    }
}
