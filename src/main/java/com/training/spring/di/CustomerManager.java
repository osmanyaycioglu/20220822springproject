package com.training.spring.di;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerManager {
    private List<String> customerNameList = new ArrayList<>();

    public List<String> getCustomerNameList() {
        return customerNameList;
    }

    public void init(String s) {
        for (int i = 0; i < 20; i++) {
            customerNameList.add("ali" + i);
        }
    }

    public void setCustomerNameList(List<String> customerNameList) {
        this.customerNameList = customerNameList;
    }

    public List<String> getTenCustomer() {
        return customerNameList.stream()
                               .limit(10)
                               .collect(Collectors.toList());
    }
}
