/* DO NOT EDIT */
/* This file was generated from shared_links.stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.stone.StoneDeserializerLogger;
import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * check documentation for VisibilityPolicyDisallowedReason.
 */
public enum LinkAudienceDisallowedReason {
    // union sharing.LinkAudienceDisallowedReason (shared_links.stone)
    /**
     * The user needs to delete and recreate the link to change the visibility
     * policy.
     */
    DELETE_AND_RECREATE,
    /**
     * The parent shared folder restricts sharing of links outside the shared
     * folder. To change the visibility policy, remove the restriction from the
     * parent shared folder.
     */
    RESTRICTED_BY_SHARED_FOLDER,
    /**
     * The team policy prevents links being shared outside the team.
     */
    RESTRICTED_BY_TEAM,
    /**
     * The user needs to be on a team to set this policy.
     */
    USER_NOT_ON_TEAM,
    /**
     * The user is a basic user or is on a limited team.
     */
    USER_ACCOUNT_TYPE,
    /**
     * The user does not have permission.
     */
    PERMISSION_DENIED,
    /**
     * Catch-all used for unknown tag values returned by the Dropbox servers.
     *
     * <p> Receiving a catch-all value typically indicates this SDK version is
     * not up to date. Consider updating your SDK version to handle the new
     * tags. </p>
     */
    OTHER;

    /**
     * For internal use only.
     */
    static class Serializer extends UnionSerializer<LinkAudienceDisallowedReason> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(LinkAudienceDisallowedReason value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case DELETE_AND_RECREATE: {
                    g.writeString("delete_and_recreate");
                    break;
                }
                case RESTRICTED_BY_SHARED_FOLDER: {
                    g.writeString("restricted_by_shared_folder");
                    break;
                }
                case RESTRICTED_BY_TEAM: {
                    g.writeString("restricted_by_team");
                    break;
                }
                case USER_NOT_ON_TEAM: {
                    g.writeString("user_not_on_team");
                    break;
                }
                case USER_ACCOUNT_TYPE: {
                    g.writeString("user_account_type");
                    break;
                }
                case PERMISSION_DENIED: {
                    g.writeString("permission_denied");
                    break;
                }
                case OTHER: {
                    g.writeString("other");
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unrecognized tag: " + value);
                }
            }
        }

        @Override
        public LinkAudienceDisallowedReason deserialize(JsonParser p) throws IOException, JsonParseException {
            LinkAudienceDisallowedReason value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException(p, "Required field missing: " + TAG_FIELD);
            }
            else if ("delete_and_recreate".equals(tag)) {
                value = LinkAudienceDisallowedReason.DELETE_AND_RECREATE;
            }
            else if ("restricted_by_shared_folder".equals(tag)) {
                value = LinkAudienceDisallowedReason.RESTRICTED_BY_SHARED_FOLDER;
            }
            else if ("restricted_by_team".equals(tag)) {
                value = LinkAudienceDisallowedReason.RESTRICTED_BY_TEAM;
            }
            else if ("user_not_on_team".equals(tag)) {
                value = LinkAudienceDisallowedReason.USER_NOT_ON_TEAM;
            }
            else if ("user_account_type".equals(tag)) {
                value = LinkAudienceDisallowedReason.USER_ACCOUNT_TYPE;
            }
            else if ("permission_denied".equals(tag)) {
                value = LinkAudienceDisallowedReason.PERMISSION_DENIED;
            }
            else if ("other".equals(tag)) {
                value = LinkAudienceDisallowedReason.OTHER;
            }
            else {
                throw new JsonParseException(p, "Unknown tag: " + tag);
            }
            if (!collapsed) {
                skipFields(p);
                expectEndObject(p);
            }
            return value;
        }
    }
}
