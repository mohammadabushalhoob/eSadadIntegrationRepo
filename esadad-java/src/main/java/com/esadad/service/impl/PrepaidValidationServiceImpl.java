package com.esadad.service.impl;

import com.esadad.model.PrePaidResponse;
import com.esadad.service.PrepaidValidationService;
import org.springframework.stereotype.Service;

@Service
public class PrepaidValidationServiceImpl implements PrepaidValidationService {
    @Override
    public PrePaidResponse validate(String guid, String xmlElement) {
        PrePaidResponse response = new PrePaidResponse();
        response.setGuid(guid);
        response.setStatus("Validated");
        return response;
    }
}
