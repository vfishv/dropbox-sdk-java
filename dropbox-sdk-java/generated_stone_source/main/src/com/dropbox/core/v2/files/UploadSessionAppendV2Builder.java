/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxUploadStyleBuilder;

/**
 * The request builder returned by {@link
 * DbxUserFilesRequests#uploadSessionAppendV2Builder}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class UploadSessionAppendV2Builder extends DbxUploadStyleBuilder<Void, UploadSessionAppendError, UploadSessionAppendErrorException> {
    private final DbxUserFilesRequests _client;
    private final UploadSessionAppendArg.Builder _builder;

    /**
     * Creates a new instance of this builder.
     *
     * @param _client  Dropbox namespace-specific client used to issue files
     *     requests.
     * @param _builder  Request argument builder.
     *
     * @return instsance of this builder
     */
    UploadSessionAppendV2Builder(DbxUserFilesRequests _client, UploadSessionAppendArg.Builder _builder) {
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
     * <p> If left unset or set to {@code null}, defaults to {@code false}. </p>
     *
     * @param close  If true, the current session will be closed, at which point
     *     you won't be able to call {@link
     *     DbxUserFilesRequests#uploadSessionAppendV2(UploadSessionCursor)}
     *     anymore with the current session. Defaults to {@code false} when set
     *     to {@code null}.
     *
     * @return this builder
     */
    public UploadSessionAppendV2Builder withClose(Boolean close) {
        this._builder.withClose(close);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @param contentHash  A hash of the file content uploaded in this call. If
     *     provided and the uploaded content does not match this hash, an error
     *     will be returned. For more information see our <a
     *     href="https://www.dropbox.com/developers/reference/content-hash">Content
     *     hash</a> page. Must have length of at least 64 and have length of at
     *     most 64.
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public UploadSessionAppendV2Builder withContentHash(String contentHash) {
        this._builder.withContentHash(contentHash);
        return this;
    }

    @Override
    public UploadSessionAppendV2Uploader start() throws UploadSessionAppendErrorException, DbxException {
        UploadSessionAppendArg arg_ = this._builder.build();
        return _client.uploadSessionAppendV2(arg_);
    }
}
