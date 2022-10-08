/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.auth;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link TokenFromOAuth1Error}
 * error.
 *
 * <p> This exception is raised by {@link
 * DbxAppAuthRequests#tokenFromOauth1(String,String)}. </p>
 */
public class TokenFromOAuth1ErrorException extends DbxApiException {
    // exception for routes:
    //     2/auth/token/from_oauth1

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxAppAuthRequests#tokenFromOauth1(String,String)}.
     */
    public final TokenFromOAuth1Error errorValue;

    public TokenFromOAuth1ErrorException(String routeName, String requestId, LocalizedText userMessage, TokenFromOAuth1Error errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
