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

public class Error {

    private Type mType;

    public Error(Type type) {
        mType = type;
    }

    public Error() {
        mType = Type.UNKNOWN_ERROR;
    }

    public boolean isServerError() {
        return mType == Type.SERVER_ERROR;
    }

    public void setServerError(boolean serverError) {
        mType = Type.SERVER_ERROR;
    }

    public boolean isConnectionError() {
        return mType == Type.CONNECTION_ERROR;
    }

    public void setConnectionError(boolean connectionError) {
        mType = Type.CONNECTION_ERROR;
    }

    public void setType(Type type) {
        mType = type;
    }

    public Type getType() {
        return mType;
    }

    public enum Type {
        CONNECTION_ERROR,
        SERVER_ERROR,
        NO_SPACE,
        UNKNOWN_ERROR
    }
}
