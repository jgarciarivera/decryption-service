package com.jgarciarivera.decryptionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DecryptionController {

    @Autowired
    private DecryptionService decryptionService;

    @PostMapping("/decrypt")
    public void decrypt() {
//        String decryptedMessage = decryptionService.decrypt(model);
//        storageService.store(decryptedMessage);
    }
}
