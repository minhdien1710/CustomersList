package Managerment.service;
import Managerment.model.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer>findAll();
    void save(Customer customer);
    Customer findById(int id);
    void update(int id, Customer customer);
    void remove(int id);
}