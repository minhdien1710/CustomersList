package Managerment.service;

import Managerment.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService{
    private static Map<Integer,Customer>customers;
    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"A","aaa@gmail.com","Ha noi"));
        customers.put(2,new Customer(2,"B","bbb@gmail.com","Tp.HCM"));
        customers.put(3,new Customer(3,"C","ccc@yahoo.com","Ha noi"));
        customers.put(4,new Customer(4,"D","ddd@gmail.com.vn","Nghe an"));
        customers.put(5,new Customer(5,"E", "eee@gmail.com","Da nang"));

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);

    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);

    }

    @Override
    public void remove(int id) {
        customers.remove(id);

    }
}
