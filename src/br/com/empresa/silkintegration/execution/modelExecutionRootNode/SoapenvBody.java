
package br.com.empresa.silkintegration.execution.modelExecutionRootNode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SoapenvBody {

    @SerializedName("ns1:getExecutionRootNodeResponse")
    @Expose
    private Ns1GetExecutionRootNodeResponse ns1GetExecutionRootNodeResponse;

    public Ns1GetExecutionRootNodeResponse getNs1GetExecutionRootNodeResponse() {
        return ns1GetExecutionRootNodeResponse;
    }

    public void setNs1GetExecutionRootNodeResponse(Ns1GetExecutionRootNodeResponse ns1GetExecutionRootNodeResponse) {
        this.ns1GetExecutionRootNodeResponse = ns1GetExecutionRootNodeResponse;
    }

}
