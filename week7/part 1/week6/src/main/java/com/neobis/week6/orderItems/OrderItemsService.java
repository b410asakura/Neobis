package com.neobis.week6.orderItems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemsService {

    private final OrderItemsRepository orderItemsRepository;

    @Autowired
    public OrderItemsService(OrderItemsRepository orderItemsRepository) {
        this.orderItemsRepository = orderItemsRepository;
    }

    public List<OrderItems> getOrderItems() {
        return orderItemsRepository.findAll();
    }

    public Optional<OrderItems> getOrderItemsById(Long orderItemId) {
        return orderItemsRepository.findById(orderItemId);
    }

    public OrderItems addOrderItems(OrderItems orderItems) {
        return orderItemsRepository.save(orderItems);
    }

    public OrderItems updateOrderItems(OrderItems newOrderItems) {
        OrderItems orderItems = orderItemsRepository.findById(newOrderItems.getOrderItemId())
                .orElseThrow(()-> new IllegalStateException(
                        "There is to order items with id = " + newOrderItems.getOrderItemId()));
        orderItems.setProductId(newOrderItems.getProductId());
        orderItems.setQuantity(newOrderItems.getQuantity());
        orderItems.setOrderDate(newOrderItems.getOrderDate());
        orderItems.setOrderStatusId(newOrderItems.getOrderStatusId());
        orderItems.setShipItemId(newOrderItems.getShipItemId());
        orderItems.setPaymentItemId(newOrderItems.getPaymentItemId());
        return orderItemsRepository.save(orderItems);
    }


    public void deleteOrderItems(Long orderItemId) {
        orderItemsRepository.deleteById(orderItemId);
    }
}
