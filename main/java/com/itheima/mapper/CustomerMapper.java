package com.itheima.mapper;

import com.itheima.po.BookStore;
import com.itheima.po.Customer;


/**
 * @author Minus
 */
public interface CustomerMapper {
    /**
     * 通过顾客id查看顾客购书信息
     * @param username
     * @return
     */
    public Customer findBookStoreByCustomerName(String username);
}
