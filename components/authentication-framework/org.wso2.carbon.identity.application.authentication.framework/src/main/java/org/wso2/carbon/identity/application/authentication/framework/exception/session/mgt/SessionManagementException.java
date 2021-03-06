/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.authentication.framework.exception.session.mgt;

import org.wso2.carbon.identity.application.authentication.framework.util.SessionMgtConstants;
import org.wso2.carbon.identity.base.IdentityException;

/**
 * Base exception for consent management feature.
 * This exceptions must have the message, error code and description
 */
public class SessionManagementException extends IdentityException {

    private String errorCode;
    private String description;

    public SessionManagementException(SessionMgtConstants.ErrorMessages error, String description, Throwable cause) {

        super(error.getMessage(), cause);
        this.errorCode = error.getCode();
        this.description = description;
    }

    public SessionManagementException(String message, String errorCode, String description, Throwable cause) {

        super(message, cause);
        this.errorCode = errorCode;
        this.description = description;
    }

    /**
     * The constructor is made private to avoid generating exceptions without error code and description.
     */
    private SessionManagementException(String message, Throwable cause) {

        super(message, cause);
    }

    public String getErrorCode() {

        return errorCode;
    }

    public void setErrorCode(String errorCode) {

        this.errorCode = errorCode;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
