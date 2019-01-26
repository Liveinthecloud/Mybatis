package cn.per.mybatis.test;

import cn.per.mybatis.model.Orders;
import cn.per.mybatis.service.impl.OrdersServiceImpl;

import java.util.List;
//使用<association>

public class OrdersTest {
    public static void main(String[] arge){
        List<Orders> ordersQndUser = new OrdersServiceImpl().findOrdersQndUser();
        for (Orders s :ordersQndUser
                ) {
            System.out.println(s);
        }
    }
}



