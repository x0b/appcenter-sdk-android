/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 */

package com.microsoft.appcenter.distribute.download;

/**
 * Class to hold current download progress status.
 */
public class DownloadProgress {

    /**
     * Number of bytes downloaded so far.
     */
    private final long mCurrentSize;

    /**
     * Expected file size.
     */
    private final long mTotalSize;

    /**
     * Init.
     */
    public DownloadProgress(long currentSize, long totalSize) {
        mCurrentSize = currentSize;
        mTotalSize = totalSize;
    }

    /**
     * @return Number of bytes downloaded so far.
     */
    public long getCurrentSize() {
        return mCurrentSize;
    }

    /**
     * @return Expected file size.
     */
    public long getTotalSize() {
        return mTotalSize;
    }
}
