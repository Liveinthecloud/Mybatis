package cn.per.mybatis.dao.Orders;

import cn.per.mybatis.model.Orders;

import java.util.List;

public interface OrdersDao {
    public List<Orders> findOrdersAndName();
}
