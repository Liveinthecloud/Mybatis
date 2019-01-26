package cn.per.mybatis.service.Service_interface;

import cn.per.mybatis.model.Orders;

import java.util.List;

public interface OrdersService {
    public List<Orders> findOrdersQndUser();
}
