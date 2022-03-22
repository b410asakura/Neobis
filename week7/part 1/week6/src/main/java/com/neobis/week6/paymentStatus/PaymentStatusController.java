package com.neobis.week6.paymentStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/paymentStatus")
public class PaymentStatusController {

    private final PaymentStatusService paymentStatusService;

    @Autowired
    public PaymentStatusController(PaymentStatusService paymentStatusService) {
        this.paymentStatusService = paymentStatusService;
    }

    @GetMapping(path = "/getPaymentStatus")
    public List<PaymentStatus> getPaymentStatus(){
        return paymentStatusService.getPaymentStatus();
    }

    @GetMapping(path = "/getPaymentStatus/{paymentStatusId}")
    public Optional<PaymentStatus> getPaymentStatusById(@PathVariable ("paymentStatusId") Long paymentStatusId){
        return paymentStatusService.getPaymentStatusById(paymentStatusId);
    }

    @PostMapping(path = "addPaymentStatus")
    public PaymentStatus addPaymentStatus(@RequestBody PaymentStatus paymentStatus){
        return paymentStatusService.addPaymentStatus(paymentStatus);
    }

    @PutMapping(path = "updatePaymentStatus/{paymentStatusId}")
    public PaymentStatus updatePaymentStatus(
            @PathVariable ("paymentStatusId") Long paymentStatusId,
            @RequestBody PaymentStatus newPaymentStatus
    ){
        return paymentStatusService.updatePaymentStatus(paymentStatusId, newPaymentStatus);
    }

    @DeleteMapping(path = "deletePaymentStatus/{paymentStatusId}")
    public void deletePaymentStatus(@PathVariable ("paymentStatusId") Long paymentStatusId){
        paymentStatusService.deletePaymentStatus(paymentStatusId);
    }
}
