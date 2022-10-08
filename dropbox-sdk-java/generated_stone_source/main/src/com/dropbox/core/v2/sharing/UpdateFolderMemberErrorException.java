/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * UpdateFolderMemberError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserSharingRequests#updateFolderMember(String,MemberSelector,AccessLevel)}.
 * </p>
 */
public class UpdateFolderMemberErrorException extends DbxApiException {
    // exception for routes:
    //     2/sharing/update_folder_member

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserSharingRequests#updateFolderMember(String,MemberSelector,AccessLevel)}.
     */
    public final UpdateFolderMemberError errorValue;

    public UpdateFolderMemberErrorException(String routeName, String requestId, LocalizedText userMessage, UpdateFolderMemberError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
