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

/**
 * The Class BtcRpcDecodePsbtResponse.
 *
 * @author jestevez
 */
public class BtcRpcDecodePsbtResponse implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2618805431431158735L;

    /** The tx. */
    @JsonProperty("tx")
    private BtcRpcDecodePsbtTxResponse tx;

    /** The unknown. */
    @JsonProperty("unknown")
    private Object unknown;

    /** The inputs. */
    @JsonProperty("inputs")
    private List<Object> inputs;

    /** The outputs. */
    @JsonProperty("outputs")
    private List<Object> outputs;

    /**
     * Instantiates a new btc rpc decode psbt response.
     */
    public BtcRpcDecodePsbtResponse() {
        super();
    }

    /**
     * Gets the tx.
     *
     * @return the tx
     */
    public BtcRpcDecodePsbtTxResponse getTx() {
        return tx;
    }

    /**
     * Sets the tx.
     *
     * @param tx the new tx
     */
    public void setTx(BtcRpcDecodePsbtTxResponse tx) {
        this.tx = tx;
    }

    /**
     * Gets the unknown.
     *
     * @return the unknown
     */
    public Object getUnknown() {
        return unknown;
    }

    /**
     * Sets the unknown.
     *
     * @param unknown the new unknown
     */
    public void setUnknown(Object unknown) {
        this.unknown = unknown;
    }

    /**
     * Gets the inputs.
     *
     * @return the inputs
     */
    public List<Object> getInputs() {
        return inputs;
    }

    /**
     * Sets the inputs.
     *
     * @param inputs the new inputs
     */
    public void setInputs(List<Object> inputs) {
        this.inputs = inputs;
    }

    /**
     * Gets the outputs.
     *
     * @return the outputs
     */
    public List<Object> getOutputs() {
        return outputs;
    }

    /**
     * Sets the outputs.
     *
     * @param outputs the new outputs
     */
    public void setOutputs(List<Object> outputs) {
        this.outputs = outputs;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "BtcRpcDecodePsbtResponse [tx=" + tx + ", unknown=" + unknown + ", inputs=" + inputs + ", outputs=" + outputs + "]";
    }

}
