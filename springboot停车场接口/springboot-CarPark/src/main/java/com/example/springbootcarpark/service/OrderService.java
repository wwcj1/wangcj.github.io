package com.example.springbootcarpark.service;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

public interface OrderService {
    public boolean saveOrder(int carParkId,int userId);
    public boolean payOrder(int orderId);
    public boolean deleteOrder(int orderId);

}
