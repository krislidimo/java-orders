package com.lambdaschool.javaorders.controller;

import com.lambdaschool.javaorders.repos.AgentRepository;
import com.lambdaschool.javaorders.repos.CustomerRepository;
import com.lambdaschool.javaorders.repos.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = {}, produces = {"application/json"})
public class CustomerController {
    @Autowired
    CustomerRepository custrepos;

    @Autowired
    AgentRepository agentrepos;

    @Autowired
    OrderRepository orderrepos;

    @GetMapping("/customer/order")
    public List<Object[]> findAllOrders() {
        return custrepos.findAllOrders();
    }

    @GetMapping("/customer/name/{custname}")
    public  List<Object[]> findOrderForCustomer(@PathVariable String custname) {
        return custrepos.findAllOrdersForCustomer(custname.toLowerCase());
    }

    @PostMapping("/data/customer/new")
    public void newCustomer() {
        //
    }

    @PutMapping("/data/customer/update/{custcode}")
    public void updateCustomer(@PathVariable long custcode) {
        //
    }

        @DeleteMapping("/data/customer/delete/{custcode}")
    public void deleteCustomer(@PathVariable long custcode) {
        custrepos.deleteById(custcode);
    }
}
