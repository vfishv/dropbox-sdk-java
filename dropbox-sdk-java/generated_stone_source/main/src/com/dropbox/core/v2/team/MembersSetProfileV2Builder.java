/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.DbxException;

/**
 * The request builder returned by {@link
 * DbxTeamTeamRequests#membersSetProfileV2Builder}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class MembersSetProfileV2Builder {
    private final DbxTeamTeamRequests _client;
    private final MembersSetProfileArg.Builder _builder;

    /**
     * Creates a new instance of this builder.
     *
     * @param _client  Dropbox namespace-specific client used to issue team
     *     requests.
     * @param _builder  Request argument builder.
     *
     * @return instsance of this builder
     */
    MembersSetProfileV2Builder(DbxTeamTeamRequests _client, MembersSetProfileArg.Builder _builder) {
        if (_client == null) {
            throw new NullPointerException("_client");
        }
        this._client = _client;
        if (_builder == null) {
            throw new NullPointerException("_builder");
        }
        this._builder = _builder;
    }

    /**
     * Set value for optional field.
     *
     * @param newEmail  New email for member. Must have length of at most 255
     *     and match pattern "{@code
     *     ^['#&A-Za-z0-9._%+-]+@[A-Za-z0-9-][A-Za-z0-9.-]*\\.[A-Za-z]{2,15}$}".
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public MembersSetProfileV2Builder withNewEmail(String newEmail) {
        this._builder.withNewEmail(newEmail);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @param newExternalId  New external ID for member. Must have length of at
     *     most 64.
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public MembersSetProfileV2Builder withNewExternalId(String newExternalId) {
        this._builder.withNewExternalId(newExternalId);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @param newGivenName  New given name for member. Must have length of at
     *     most 100 and match pattern "{@code [^/:?*<>\"|]*}".
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public MembersSetProfileV2Builder withNewGivenName(String newGivenName) {
        this._builder.withNewGivenName(newGivenName);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @param newSurname  New surname for member. Must have length of at most
     *     100 and match pattern "{@code [^/:?*<>\"|]*}".
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public MembersSetProfileV2Builder withNewSurname(String newSurname) {
        this._builder.withNewSurname(newSurname);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @param newPersistentId  New persistent ID. This field only available to
     *     teams using persistent ID SAML configuration.
     *
     * @return this builder
     */
    public MembersSetProfileV2Builder withNewPersistentId(String newPersistentId) {
        this._builder.withNewPersistentId(newPersistentId);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @param newIsDirectoryRestricted  New value for whether the user is a
     *     directory restricted user.
     *
     * @return this builder
     */
    public MembersSetProfileV2Builder withNewIsDirectoryRestricted(Boolean newIsDirectoryRestricted) {
        this._builder.withNewIsDirectoryRestricted(newIsDirectoryRestricted);
        return this;
    }

    /**
     * Issues the request.
     */
    public TeamMemberInfoV2Result start() throws MembersSetProfileErrorException, DbxException {
        MembersSetProfileArg arg_ = this._builder.build();
        return _client.membersSetProfileV2(arg_);
    }
}
