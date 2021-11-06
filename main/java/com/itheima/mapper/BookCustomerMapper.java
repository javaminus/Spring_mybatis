package com.itheima.mapper;

import com.itheima.po.BookStore;
import com.itheima.po.Customer;
import com.itheima.po.CustomerWithBook;


/**
 * @author Minus
 */
public interface BookCustomerMapper {
    /**
     *
     * @param customer_id
     * @param bookstore_id
     * @param number
     * @return
     */
    public int updateBookByCustomerId(Integer customer_id,Integer bookstore_id,Integer number);
}
