package cn.per.mybatis.service.impl;

import cn.per.mybatis.dao.User.UserDao;
import cn.per.mybatis.model.User;
import cn.per.mybatis.service.Service_interface.UserService;
import cn.per.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public User findUserByUserNameAndPassword(User user) {
        //获取工厂
        SqlSession session= MybatisUtil.getFactory().openSession();
        UserDao dao=session.getMapper(UserDao.class);
        return dao.findUserByUserNameAndPasswordDao(user);
    }

    @Override
    public List<User> findUserAndOrders() {
        SqlSession session = MybatisUtil.getFactory().openSession();
        UserDao mapper = session.getMapper(UserDao.class);
        return mapper.findUserAndOrders();
    }
}
