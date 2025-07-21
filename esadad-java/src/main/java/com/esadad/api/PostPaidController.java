package com.esadad.api;

import com.esadad.model.BillPullResponse;
import com.esadad.service.BillPullService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postpaid")
public class PostPaidController {

    private final BillPullService billPullService;

    @Autowired
    public PostPaidController(BillPullService billPullService) {
        this.billPullService = billPullService;
    }

    @PostMapping("/BillPull")
    public BillPullResponse billPull(@RequestParam("GUID") String guid,
                                     @RequestBody String xmlElement,
                                     @RequestParam(value = "username", required = false) String username,
                                     @RequestParam(value = "password", required = false) String password) {
        return billPullService.billPull(guid, xmlElement);
    }
}
