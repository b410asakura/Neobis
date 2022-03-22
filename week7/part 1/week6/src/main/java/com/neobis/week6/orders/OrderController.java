package com.neobis.week6.orders;


import com.neobis.week6.orderStatuses.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/getOrders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @GetMapping(path = "/getOrders/{orderId}")
    public Optional<Order> getOrderById(@PathVariable("orderId") Long orderId){
        return orderService.getOrderById(orderId);
    }

    @PostMapping(path = "/addOrder")
    public Order addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @PutMapping(path = "updateOrder/{orderId}")
    public Order updateOrder(
            @PathVariable("orderId") Long orderId,
            @RequestBody Order newOrder){
        return orderService.updateOrder(orderId, newOrder);
    }

    @DeleteMapping(path = "/deleteOrder/{orderId}")
    public void deleteOrder(@PathVariable("orderId") Long orderId){
        orderService.deleteOrder(orderId);
    }
}
