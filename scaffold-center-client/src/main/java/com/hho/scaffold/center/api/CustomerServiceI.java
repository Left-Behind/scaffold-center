package com.hho.scaffold.center.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.hho.scaffold.center.dto.CustomerAddCmd;
import com.hho.scaffold.center.dto.CustomerListByNameQry;
import com.hho.scaffold.center.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
