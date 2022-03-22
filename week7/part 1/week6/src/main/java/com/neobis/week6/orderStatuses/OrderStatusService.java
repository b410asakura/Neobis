package com.neobis.week6.orderStatuses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderStatusService {

    private final OrderStatusRepository orderStatusRepository;

    @Autowired
    public OrderStatusService(OrderStatusRepository orderStatusRepository) {
        this.orderStatusRepository = orderStatusRepository;
    }

    public List<OrderStatus> getOrderStatus() {
        return orderStatusRepository.findAll();
    }

    public Optional<OrderStatus> getOrderStatusById(Long orderStatusId) {
        return orderStatusRepository.findById(orderStatusId);
    }

    public OrderStatus addOrderStatus(OrderStatus orderStatus) {
        return orderStatusRepository.save(orderStatus);
    }

    public OrderStatus updateOrderStatus(OrderStatus newOrderStatus) {
        OrderStatus orderStatus =
                orderStatusRepository.findById(newOrderStatus.getOrderStatusId())
                        .orElseThrow(() -> new IllegalStateException(
                                        "There is no order status with id = " +
                                                newOrderStatus.getOrderStatusId()
                                )
                        );
        orderStatus.setName(newOrderStatus.getName());
        return orderStatusRepository.save(orderStatus);
    }

    public void deleteOrderStatus(Long orderStatusId) {
        orderStatusRepository.deleteById(orderStatusId);
    }
}
