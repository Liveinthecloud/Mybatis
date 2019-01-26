package cn.per.mybatis.service.Service_interface;

import cn.per.mybatis.model.User;

import java.util.List;

public interface UserService {
    public User findUserByUserNameAndPassword(User user);
    public List<User> findUserAndOrders();
}
