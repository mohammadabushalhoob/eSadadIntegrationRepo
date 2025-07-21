package com.esadad.service;

import com.esadad.model.BillPullResponse;

public interface BillPullService {
    BillPullResponse billPull(String guid, String xmlElement);
}
