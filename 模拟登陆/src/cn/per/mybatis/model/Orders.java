package cn.per.mybatis.model;

public class Orders {
    private int count;
    private int status;
    private int ordersId;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "count=" + count +
                ", status=" + status +
                ", ordersId=" + ordersId +
                ", user=" + user +
                '}';
    }
}
