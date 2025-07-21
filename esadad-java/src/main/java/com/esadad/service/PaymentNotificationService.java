package com.esadad.service;

import com.esadad.model.PaymentNotificationResponse;

public interface PaymentNotificationService {
    PaymentNotificationResponse handleNotification(String guid, String xmlElement);
}
