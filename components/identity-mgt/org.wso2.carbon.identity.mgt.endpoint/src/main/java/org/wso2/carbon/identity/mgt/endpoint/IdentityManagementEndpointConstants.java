/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.mgt.endpoint;

/**
 * This class defines the constants used within this web app.
 */
public class IdentityManagementEndpointConstants {

    public static final class ConfigConstants {
        public static final String ENABLE_EMAIL_NOTIFICATION = "EnableEmailNotification";
        public static final String PROCESS_ALL_SECURITY_QUESTIONS = "ProcessAllSecurityQuestions";
    }

    public static final class ServiceAuthenticationConstants {
        public static final String SERVICE_ACCESS_USERNAME = "ServiceAccessUsername";
        public static final String SERVICE_ACCESS_PASSWORD = "ServiceAccessPassword";
    }

    public static final class ServiceEndpoints {
        public static final String USER_REGISTRATION_SERVICE = "/UserRegistrationAdminService" +
                                                               ".UserRegistrationAdminServiceHttpsSoap11Endpoint/";
        public static final String USER_INFORMATION_RECOVERY_SERVICE = "/UserInformationRecoveryService" +
                                                                       ".UserInformationRecoveryServiceHttpsSoap11Endpoint/";

        public static final String USER_IDENTITY_MANAGEMENT_SERVICE = "/UserIdentityManagementAdminService" +
                                                                      ".UserIdentityManagementAdminServiceHttpsSoap11Endpoint/";
    }

    public static final class PasswordRecoveryOptions {
        public static final String EMAIL = "EMAIL";
        public static final String SECURITY_QUESTIONS = "SECURITY_QUESTIONS";
    }

    public static final class ClaimURIs {
        public static final String FIRST_NAME_CLAIM = "http://wso2.org/claims/givenname";
        public static final String LAST_NAME_CLAIM = "http://wso2.org/claims/lastname";
        public static final String EMAIL_CLAIM = "http://wso2.org/claims/emailaddress";
        public static final String CHALLENGE_QUESTION_URI_CLAIM = "http://wso2.org/claims/challengeQuestionUris";
        public static final String CHALLENGE_QUESTION_1_CLAIM = "http://wso2.org/claims/challengeQuestion1";
        public static final String CHALLENGE_QUESTION_2_CLAIM = "http://wso2.org/claims/challengeQuestion2";
    }

    public static final String PRIMARY_USER_STORE_DOMAIN = "PRIMARY";
    public static final String SUPER_TENANT = "carbon.super";
    public static final String TENANT_DOMAIN_SEPARATOR = "@";
    public static final String USER_STORE_DOMAIN_SEPARATOR = "/";

    public static final String WSO2_DIALECT = "http://wso2.org/claims";

    private IdentityManagementEndpointConstants() {
    }
}
