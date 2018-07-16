/*
 *    Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.downloader;

/**
 * Created by amitshekhar on 13/11/17.
 */

public final class Constants {

    public static final int UPDATE = 0x01;
    public static final String RANGE = "Range";
    public static final String ETAG = "ETag";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String USER_AGENT = "User-Agent";
    public static final String DEFAULT_USER_AGENT = "PRDownloader";
    public static final int DEFAULT_READ_TIMEOUT_IN_MILLS = 20_000;
    public static final int DEFAULT_CONNECT_TIMEOUT_IN_MILLS = 20_000;
    public static final int HTTP_RANGE_NOT_SATISFIABLE = 416;
    public static final int HTTP_TEMPORARY_REDIRECT = 307;
    public static final int HTTP_PERMANENT_REDIRECT = 308;

    private Constants() {
        // no instance
    }

}
