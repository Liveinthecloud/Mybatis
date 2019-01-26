package cn.per.mybatis.test;

import cn.per.mybatis.model.User;
import cn.per.mybatis.service.impl.UserServiceImpl;

import java.util.List;

public class UserOrdersTest {
    public static void main(String [] arge){
        List<User> userAndOrders = new UserServiceImpl().findUserAndOrders();
        for(User user:userAndOrders){
            System.out.println(user);
        }
    }
}
