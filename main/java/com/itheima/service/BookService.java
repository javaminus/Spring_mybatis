package com.itheima.service;

import com.itheima.po.BookStore;
import com.itheima.po.Customer;

/**
 * @author Minus
 */
public interface BookService {
    /**
     *
     * @param name
     * @param amount
     * @return
     */
    public int addBookByName(String name,Integer amount);

    /**
     *
     * @param customer_id
     * @param bookstore_id
     * @param number
     * @return
     */
    public int updateBookByCustomerId(Integer customer_id,Integer bookstore_id,Integer number);
}
