package com.jgarciarivera.decryptionservice;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: Rename class
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostRequest {

    @JsonProperty("encryptedMessage")
    private String encryptedMessage;

    @JsonProperty("cipher")
    private List<Integer> cipher;

    @JsonProperty("encryptedMessage")
    public String getEncryptedMessage() {
        return encryptedMessage;
    }

    @JsonProperty("encryptedMessage")
    public void setEncryptedMessage(String encryptedMessage) {
        this.encryptedMessage = encryptedMessage;
    }

    @JsonProperty("cipher")
    public List<Integer> getCipher() {
        return cipher;
    }

    @JsonProperty("cipher")
    public void setCipher(List<Integer> cipher) {
        this.cipher = cipher;
    }
}
