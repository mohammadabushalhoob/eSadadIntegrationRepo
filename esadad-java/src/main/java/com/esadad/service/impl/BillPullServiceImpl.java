package com.esadad.service.impl;

import com.esadad.model.BillPullResponse;
import com.esadad.service.BillPullService;
import org.springframework.stereotype.Service;

@Service
public class BillPullServiceImpl implements BillPullService {
    @Override
    public BillPullResponse billPull(String guid, String xmlElement) {
        BillPullResponse response = new BillPullResponse();
        response.setGuid(guid);
        response.setMessage("Bill pulled");
        return response;
    }
}
