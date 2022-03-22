package com.neobis.week6.paymentItems;

import com.neobis.week6.paymentStatus.PaymentStatus;
import com.neobis.week6.paymentStatus.PaymentStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentItemsService {

    private final PaymentItemsRepository paymentItemsRepository;

    @Autowired
    public PaymentItemsService(PaymentItemsRepository paymentItemsRepository) {
        this.paymentItemsRepository = paymentItemsRepository;
    }

    public List<PaymentItems> getPaymentItems() {
        return paymentItemsRepository.findAll();
    }

    public Optional<PaymentItems> getPaymentItemsByid(Long paymentItemId) {
        return paymentItemsRepository.findById(paymentItemId);
    }

    public PaymentItems addPaymentItems(PaymentItems paymentItems) {
        return paymentItemsRepository.save(paymentItems);
    }

    public PaymentItems updatePaymentItems(
            Long paymentItemId, PaymentItems newPaymentItems) {
        PaymentItems paymentItems = paymentItemsRepository.findById(paymentItemId)
                .orElseThrow(() -> new IllegalStateException(
                                "There is no payment items with id = " + paymentItemId
                        )
                );
        paymentItems.setPaymentStatusId(newPaymentItems.getPaymentStatusId());
        paymentItems.setPaymentTotal(newPaymentItems.getPaymentTotal());
        paymentItems.setCustomerId(newPaymentItems.getCustomerId());
        paymentItems.setDueDate(newPaymentItems.getDueDate());
        return paymentItemsRepository.save(paymentItems);
    }

    public void deletePaymentItems(Long paymentItemId) {
        paymentItemsRepository.deleteById(paymentItemId);
    }
}
