package cn.per.mybatis.service.impl;

import cn.per.mybatis.dao.Orders.OrdersDao;
import cn.per.mybatis.model.Orders;
import cn.per.mybatis.service.Service_interface.OrdersService;
import cn.per.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OrdersServiceImpl implements OrdersService {
    @Override
    public List<Orders> findOrdersQndUser() {
        SqlSession session = MybatisUtil.getFactory().openSession();
        OrdersDao mapper = session.getMapper(OrdersDao.class);
        return mapper.findOrdersAndName();
    }
}
