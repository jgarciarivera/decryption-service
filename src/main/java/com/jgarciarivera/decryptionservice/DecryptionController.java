package com.jgarciarivera.decryptionservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DecryptionController {

    // TODO: Move to constants file
    private static final String POST_ENDPOINT = "/decrypt";

    // TODO: Create service interface and add @Autowired annotation
    private DecryptionService decryptionService = new DecryptionService();

    @PostMapping(POST_ENDPOINT)
    public void decrypt(@RequestBody PostRequest postRequest) {

        String encryptedMessage = postRequest.getEncryptedMessage();

        int[] cipher = postRequest
                .getCipher()
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        String decryptedMessage = decryptionService.decrypt(encryptedMessage, cipher);

        // TODO: Create storage service interface and implementation
        // storageService.store(decryptedMessage);
    }
}
