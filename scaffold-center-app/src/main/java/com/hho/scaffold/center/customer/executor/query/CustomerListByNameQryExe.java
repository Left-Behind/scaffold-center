package com.hho.scaffold.center.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.hho.scaffold.center.dto.customer.CustomerListByNameQry;
import com.hho.scaffold.center.dto.customer.data.CustomerDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
public class CustomerListByNameQryExe{
    public MultiResponse<CustomerDTO> execute(CustomerListByNameQry cmd) {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomerName("Frank");
        customerDTOList.add(customerDTO);
        return MultiResponse.of(customerDTOList);
    }
}
