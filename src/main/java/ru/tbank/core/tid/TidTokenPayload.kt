/*
 * Copyright © 2024 T-Bank
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.tbank.core.tid

/**
 * Model that contains T-Bank session information
 *
 * @author Stanislav Mukhametshin
 */
public data class TidTokenPayload(
    /** Token to access T-Bank Api */
    val accessToken: String,
    /** Time after which access token will expire */
    val expiresIn: Int,
    /** User id in jwt format */
    val idToken: String?,
    /** Token needed to get new [accessToken] */
    val refreshToken: String
)
