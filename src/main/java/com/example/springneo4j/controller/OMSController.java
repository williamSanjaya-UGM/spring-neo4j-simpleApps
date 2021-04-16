package com.example.springneo4j.controller;

import com.example.springneo4j.node.Customer;
import com.example.springneo4j.node.Product;
import com.example.springneo4j.repository.CustomerRepository;
import com.example.springneo4j.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OMSController {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void purchaseOrder() {
        List<Product> products=new ArrayList<>();
        products.add(new Product(999,"bike",1,10000));
        products.add(new Product(888,"AC",1,30000));
        Customer customer = new Customer();
        customer.setCid(444);
        customer.setName("Sanjaya");
        customer.setAddress(new String[]{"Jakarta","DKI Jakarta"});
        customer.setProducts(products);
        repository.save(customer);
    }

    @GetMapping("/getOrders")
    public List<Customer> getPurchaseOrder() {
        return (List<Customer>) repository.findAll();
    }

    @GetMapping("/getSold")
    public List<Product> getSoldTo() {
        return (List<Product>) productRepository.findAll();
    }

    @GetMapping("/getInfo/{name}")
    public Customer getInfo(@PathVariable String name) {
        return repository.findByName(name);
    }
}
