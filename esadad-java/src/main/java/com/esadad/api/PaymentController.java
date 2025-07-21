package com.esadad.api;

import com.esadad.model.PaymentNotificationResponse;
import com.esadad.service.PaymentNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentNotificationService paymentNotificationService;

    @Autowired
    public PaymentController(PaymentNotificationService paymentNotificationService) {
        this.paymentNotificationService = paymentNotificationService;
    }

    @PostMapping("/ReceivePaymentNotification")
    public PaymentNotificationResponse receivePaymentNotification(@RequestParam("GUID") String guid,
                                                                  @RequestBody String xmlElement,
                                                                  @RequestParam(value = "username", required = false) String username,
                                                                  @RequestParam(value = "password", required = false) String password) {
        return paymentNotificationService.handleNotification(guid, xmlElement);
    }
}
