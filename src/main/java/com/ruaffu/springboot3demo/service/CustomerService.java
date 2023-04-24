package com.ruaffu.springboot3demo.service;

import com.ruaffu.springboot3demo.controller.CustomerController;
import com.ruaffu.springboot3demo.model.Customer;
import com.ruaffu.springboot3demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService
{
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer createCustomer(Customer customer){
        customerRepository.save(customer);
        return customer;
    }

    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }

    public void updateCustomer(Customer customer){
        customerRepository.save(customer);
    }
}
