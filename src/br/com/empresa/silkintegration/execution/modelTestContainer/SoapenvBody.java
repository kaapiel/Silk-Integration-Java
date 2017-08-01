
package br.com.empresa.silkintegration.execution.modelTestContainer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SoapenvBody {

    @SerializedName("ns1:getTestContainersResponse")
    @Expose
    private Ns1GetTestContainersResponse ns1GetTestContainersResponse;

    public Ns1GetTestContainersResponse getNs1GetTestContainersResponse() {
        return ns1GetTestContainersResponse;
    }

    public void setNs1GetTestContainersResponse(Ns1GetTestContainersResponse ns1GetTestContainersResponse) {
        this.ns1GetTestContainersResponse = ns1GetTestContainersResponse;
    }

}
