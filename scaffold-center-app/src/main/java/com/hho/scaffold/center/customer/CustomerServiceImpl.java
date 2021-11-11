package com.hho.scaffold.center.customer;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.hho.scaffold.center.api.CustomerServiceI;
import com.hho.scaffold.center.dto.customer.CustomerAddCmd;
import com.hho.scaffold.center.dto.customer.CustomerListByNameQry;
import com.hho.scaffold.center.dto.customer.data.CustomerDTO;
import org.springframework.stereotype.Service;

import com.hho.scaffold.center.customer.executor.CustomerAddCmdExe;
import com.hho.scaffold.center.customer.executor.query.CustomerListByNameQryExe;

import javax.annotation.Resource;


@Service
@CatchAndLog
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

}