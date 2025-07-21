package com.esadad.service;

import com.esadad.model.PrePaidResponse;

public interface PrepaidValidationService {
    PrePaidResponse validate(String guid, String xmlElement);
}
