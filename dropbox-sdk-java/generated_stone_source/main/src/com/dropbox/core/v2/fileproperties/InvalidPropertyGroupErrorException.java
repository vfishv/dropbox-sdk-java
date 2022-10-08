/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.fileproperties;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * InvalidPropertyGroupError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserFilePropertiesRequests#propertiesOverwrite(String,java.util.List)} and
 * {@link
 * com.dropbox.core.v2.files.DbxUserFilesRequests#propertiesOverwrite(String,java.util.List)}.
 * </p>
 */
public class InvalidPropertyGroupErrorException extends DbxApiException {
    // exception for routes:
    //     2/file_properties/properties/overwrite
    //     2/files/properties/overwrite

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserFilePropertiesRequests#propertiesOverwrite(String,java.util.List)}
     * and {@link
     * com.dropbox.core.v2.files.DbxUserFilesRequests#propertiesOverwrite(String,java.util.List)}.
     */
    public final InvalidPropertyGroupError errorValue;

    public InvalidPropertyGroupErrorException(String routeName, String requestId, LocalizedText userMessage, InvalidPropertyGroupError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
