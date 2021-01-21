/*
 * Copyright 2019 AraguaneyBits.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.araguaneybits.crypto.bitcoinrpc.methods.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class BtcRpcDecodePsbtScriptPubKeyResponse.
 *
 * @author jestevez
 */
@Data
@NoArgsConstructor
public class BtcRpcDecodePsbtScriptPubKeyResponse implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4221892764501221126L;

    /** The asm. */
    @JsonProperty("asm")
    private String asm;

    /** The hex. */
    @JsonProperty("hex")
    private String hex;

    /** The req sigs. */
    @JsonProperty("reqSigs")
    private Integer reqSigs;

    /** The type. */
    @JsonProperty("type")
    private String type;

    /** The addresses. */
    @JsonProperty("addresses")
    private List<String> addresses;

}
