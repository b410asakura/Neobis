package com.neobis.week6.orderStatuses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/orderStatuses")
public class OrderStatusController {

    private final OrderStatusService orderStatusService;

    @Autowired
    public OrderStatusController(OrderStatusService orderStatusService) {
        this.orderStatusService = orderStatusService;
    }

    @GetMapping(path = "/getOrderStatuses")
    public List<OrderStatus> getOrderStatuses(){
        return orderStatusService.getOrderStatus();
    }

    @GetMapping(path = "/getOrderStatuses/{orderStatusId}")
    public Optional<OrderStatus> getOrderStatusById (@PathVariable ("orderStatusId") Long orderStatusId){
        return orderStatusService.getOrderStatusById(orderStatusId);
    }

    @PostMapping(path = "/addOrderStatus")
    public OrderStatus addOrderStatus(@RequestBody OrderStatus orderStatus){
        return orderStatusService.addOrderStatus(orderStatus);
    }

    @PutMapping(path = "/updateOrderStatus/{orderStatusId}")
    public OrderStatus updateOrderStatus(
            @PathVariable ("orderStatusId") Long orderStatusId,
            @RequestBody OrderStatus newOrderStatus){
        return orderStatusService.updateOrderStatus(newOrderStatus);
    }

    @DeleteMapping(path = "/deleteOrderStatus/{orderStatusId}")
    public void deleteOrderStatus(@PathVariable ("orderStatusId") Long orderStatusId){
        orderStatusService.deleteOrderStatus(orderStatusId);
    }
}
