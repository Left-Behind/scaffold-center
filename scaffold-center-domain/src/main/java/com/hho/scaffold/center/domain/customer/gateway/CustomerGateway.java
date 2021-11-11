package com.hho.scaffold.center.domain.customer.gateway;

import com.hho.scaffold.center.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
