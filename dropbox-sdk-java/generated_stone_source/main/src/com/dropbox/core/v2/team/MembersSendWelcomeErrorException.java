/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * MembersSendWelcomeError} error.
 *
 * <p> This exception is raised by {@link
 * DbxTeamTeamRequests#membersSendWelcomeEmail}. </p>
 */
public class MembersSendWelcomeErrorException extends DbxApiException {
    // exception for routes:
    //     2/team/members/send_welcome_email

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxTeamTeamRequests#membersSendWelcomeEmail}.
     */
    public final MembersSendWelcomeError errorValue;

    public MembersSendWelcomeErrorException(String routeName, String requestId, LocalizedText userMessage, MembersSendWelcomeError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
