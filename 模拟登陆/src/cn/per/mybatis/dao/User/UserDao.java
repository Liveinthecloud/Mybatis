package cn.per.mybatis.dao.User;

import cn.per.mybatis.model.User;

import java.util.List;

public interface UserDao {
    public User findUserByUserNameAndPasswordDao(User user);
    public List<User> findUserAndOrders();
}
