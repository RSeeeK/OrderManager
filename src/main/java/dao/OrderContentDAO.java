package dao;

import model.Order;
import model.OrderContent;

import java.util.List;

public interface OrderContentDAO {
    void addOrderСontent(OrderContent orderContent);
    void updateOrderContent(OrderContent orderContent);
    void removeOrderContent(Integer id);
    OrderContent getOrderContentById(Integer id);
    List<OrderContent> listOrdersContents();
    List<OrderContent> listOrdersContentByOrder(Order order);
}