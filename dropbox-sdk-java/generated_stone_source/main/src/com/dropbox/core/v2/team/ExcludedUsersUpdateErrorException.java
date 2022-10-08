/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * ExcludedUsersUpdateError} error.
 *
 * <p> This exception is raised by {@link
 * DbxTeamTeamRequests#memberSpaceLimitsExcludedUsersAdd(java.util.List)} and
 * {@link
 * DbxTeamTeamRequests#memberSpaceLimitsExcludedUsersRemove(java.util.List)}.
 * </p>
 */
public class ExcludedUsersUpdateErrorException extends DbxApiException {
    // exception for routes:
    //     2/team/member_space_limits/excluded_users/add
    //     2/team/member_space_limits/excluded_users/remove

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxTeamTeamRequests#memberSpaceLimitsExcludedUsersAdd(java.util.List)}
     * and {@link
     * DbxTeamTeamRequests#memberSpaceLimitsExcludedUsersRemove(java.util.List)}.
     */
    public final ExcludedUsersUpdateError errorValue;

    public ExcludedUsersUpdateErrorException(String routeName, String requestId, LocalizedText userMessage, ExcludedUsersUpdateError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
