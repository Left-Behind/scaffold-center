package com.hho.scaffold.center.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.hho.scaffold.center.dto.customer.CustomerAddCmd;
import com.hho.scaffold.center.dto.customer.CustomerListByNameQry;
import com.hho.scaffold.center.dto.customer.data.CustomerDTO;


public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
