
package br.com.empresa.silkintegration.execution.modelTestContainer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TestContainer {

    @SerializedName("soapenv:Envelope")
    @Expose
    private SoapenvEnvelope soapenvEnvelope;

    public SoapenvEnvelope getSoapenvEnvelope() {
        return soapenvEnvelope;
    }

    public void setSoapenvEnvelope(SoapenvEnvelope soapenvEnvelope) {
        this.soapenvEnvelope = soapenvEnvelope;
    }

}
