package com.esadad.service.impl;

import com.esadad.model.PaymentNotificationResponse;
import com.esadad.service.PaymentNotificationService;
import org.springframework.stereotype.Service;

@Service
public class PaymentNotificationServiceImpl implements PaymentNotificationService {
    @Override
    public PaymentNotificationResponse handleNotification(String guid, String xmlElement) {
        PaymentNotificationResponse response = new PaymentNotificationResponse();
        response.setGuid(guid);
        response.setMessage("Received");
        return response;
    }
}
