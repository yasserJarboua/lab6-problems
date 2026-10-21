package problem2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customers;
    public Bank(String name){
        this.name=name;
        this.customers=new ArrayList<>();
    }
    public void addCustomer(Customer c){
        if(!this.customers.contains(c)){
            this.customers.add(c);
        }else{
            System.out.println("Costumer already in the bank.");
        }
    }

    public List<Customer> getCustomer() {
        return customers;
    }
    public void transaction(String name,double amount){
        Iterator<Customer> it= this.customers.iterator();
        while(it.hasNext()){
            Customer c=it.next();
            if(c.getName().equals(name)){
                c.getTransactions().add(amount);
                System.out.println("The customer "+this.name+" has received "+amount);
                break;
            }
        }
        if(!it.hasNext()){
            System.out.println("Customer not found.");
        }

    }

}
