package com.neobis.week6.paymentItems;


import com.neobis.week6.paymentStatus.PaymentStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/PaymentItems")
public class PaymentItemsController {

    private final PaymentItemsService paymentItemsService;

    @Autowired
    public PaymentItemsController(PaymentItemsService paymentItemsService) {
        this.paymentItemsService = paymentItemsService;
    }

    @GetMapping(path = "getPaymentItems")
    public List<PaymentItems> getPaymentItems() {
        return paymentItemsService.getPaymentItems();
    }

    @GetMapping(path = "getPaymentItems/{paymentItemId}")
    public Optional<PaymentItems> getPaymentItemsById(
            @PathVariable("paymentItemId") Long paymentItemId
    ) {
        return paymentItemsService.getPaymentItemsByid(paymentItemId);
    }

    @PostMapping(path = "addPaymentItems")
    public PaymentItems addPaymentItems(
            @RequestBody PaymentItems paymentItems
    ) {
        return paymentItemsService.addPaymentItems(paymentItems);
    }

    @PutMapping(path = "/updatePaymentItems/{paymentItemId}")
    public PaymentItems updatePaymentItems(
            @PathVariable("paymentItemId") Long paymentItemId,
            @RequestBody PaymentItems newPaymentItems
    ){
        return paymentItemsService.updatePaymentItems(paymentItemId, newPaymentItems);
    }

    @DeleteMapping(path = "/deletePaymentItems/{paymentItemId}")
    public void deletePaymentItems(
            @PathVariable("paymentItemId") Long paymentItemId
    ){
        paymentItemsService.deletePaymentItems(paymentItemId);
    }
}
