package com.box.l10n.mojito.smartling;

public class SmartlingClientException extends Exception {
    public SmartlingClientException(String message) {
        super(message);
    }

    public SmartlingClientException(Throwable cause) {
        super(cause);
    }
}
