package com.esadad.api;

import com.esadad.model.PrePaidResponse;
import com.esadad.service.PrepaidValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prepaid")
public class PrepaidController {

    private final PrepaidValidationService prepaidValidationService;

    @Autowired
    public PrepaidController(PrepaidValidationService prepaidValidationService) {
        this.prepaidValidationService = prepaidValidationService;
    }

    @PostMapping("/PrepaidValidation")
    public PrePaidResponse prepaidValidation(@RequestParam("GUID") String guid,
                                             @RequestBody String xmlElement,
                                             @RequestParam(value = "username", required = false) String username,
                                             @RequestParam(value = "password", required = false) String password) {
        return prepaidValidationService.validate(guid, xmlElement);
    }
}
