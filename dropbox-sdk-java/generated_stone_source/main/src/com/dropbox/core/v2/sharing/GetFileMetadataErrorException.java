/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link GetFileMetadataError}
 * error.
 *
 * <p> This exception is raised by {@link
 * DbxUserSharingRequests#getFileMetadata(String,java.util.List)}. </p>
 */
public class GetFileMetadataErrorException extends DbxApiException {
    // exception for routes:
    //     2/sharing/get_file_metadata

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserSharingRequests#getFileMetadata(String,java.util.List)}.
     */
    public final GetFileMetadataError errorValue;

    public GetFileMetadataErrorException(String routeName, String requestId, LocalizedText userMessage, GetFileMetadataError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
