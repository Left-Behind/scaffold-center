package com.hho.scaffold.center.domain.customer.gateway;

import com.hho.scaffold.center.domain.customer.Customer;
import com.hho.scaffold.center.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
