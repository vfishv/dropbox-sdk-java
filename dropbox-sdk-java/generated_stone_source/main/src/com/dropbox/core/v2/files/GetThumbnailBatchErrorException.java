/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * GetThumbnailBatchError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserFilesRequests#getThumbnailBatch(java.util.List)}. </p>
 */
public class GetThumbnailBatchErrorException extends DbxApiException {
    // exception for routes:
    //     2/files/get_thumbnail_batch

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserFilesRequests#getThumbnailBatch(java.util.List)}.
     */
    public final GetThumbnailBatchError errorValue;

    public GetThumbnailBatchErrorException(String routeName, String requestId, LocalizedText userMessage, GetThumbnailBatchError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
