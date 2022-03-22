package com.neobis.week6.orderItems;

import com.sun.source.tree.OpensTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/orderItems")
public class OrderItemsController {

    private final OrderItemsService orderItemsService;

    @Autowired
    public OrderItemsController(OrderItemsService orderItemsService) {
        this.orderItemsService = orderItemsService;
    }

    @GetMapping(path = "/getOrderItems")
    public List<OrderItems> getOrderItems (){
        return orderItemsService.getOrderItems();
    }

    @GetMapping(path = "/getOrderItems/{orderItemId}")
    public Optional<OrderItems> getOrderItemsById(@PathVariable ("orderItemId") Long orderItemId){
        return orderItemsService.getOrderItemsById(orderItemId);
    }

    @PostMapping(path = "/addOrderItems")
    public OrderItems addOrderItems(@RequestBody OrderItems orderItems){
        return orderItemsService.addOrderItems(orderItems);
    }

    @PutMapping(path = "/updateOrderItems/{orderItemId}")
    public OrderItems updateOrderItems(
                                        @PathVariable("orderItemId") Long orderItemId,
                                        @RequestBody OrderItems newOrderItems){
        return orderItemsService.updateOrderItems(newOrderItems);
    }

    @DeleteMapping(path = "/deleteOrderItems/{orderItemId}")
    public void deleteOrderItems(@PathVariable("orderItemId") Long orderItemId){
        orderItemsService.deleteOrderItems(orderItemId);
    }
}
