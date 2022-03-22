package com.neobis.week6.paymentStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentStatusService {

    private final PaymentStatusRepository paymentStatusRepository;

    @Autowired
    public PaymentStatusService(PaymentStatusRepository paymentStatusRepository) {
        this.paymentStatusRepository = paymentStatusRepository;
    }

    public List<PaymentStatus> getPaymentStatus() {
        return paymentStatusRepository.findAll();
    }

    public Optional<PaymentStatus> getPaymentStatusById(Long paymentStatusId) {
        return paymentStatusRepository.findById(paymentStatusId);
    }

    public PaymentStatus addPaymentStatus(PaymentStatus paymentStatus) {
        return paymentStatusRepository.save(paymentStatus);
    }

    public PaymentStatus updatePaymentStatus(Long paymentStatusId, PaymentStatus newPaymentStatus) {
        PaymentStatus paymentStatus = paymentStatusRepository.findById(paymentStatusId)
                .orElseThrow(() -> new IllegalStateException(
                                "There is no payment status with id = " + paymentStatusId
                        )
                );
        paymentStatus.setName(newPaymentStatus.getName());
        return paymentStatusRepository.save(paymentStatus);
    }

    public void deletePaymentStatus(Long paymentStatusId) {
        paymentStatusRepository.deleteById(paymentStatusId);
    }
}
