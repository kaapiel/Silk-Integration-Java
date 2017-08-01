
package br.com.empresa.silkintegration.execution.modelTestContainer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ns1GetTestContainersResponse {

    @SerializedName("xmlns:ns1")
    @Expose
    private String xmlnsNs1;
    @SerializedName("getTestContainersReturn")
    @Expose
    private GetTestContainersReturn getTestContainersReturn;
    @SerializedName("soapenv:encodingStyle")
    @Expose
    private String soapenvEncodingStyle;

    public String getXmlnsNs1() {
        return xmlnsNs1;
    }

    public void setXmlnsNs1(String xmlnsNs1) {
        this.xmlnsNs1 = xmlnsNs1;
    }

    public GetTestContainersReturn getGetTestContainersReturn() {
        return getTestContainersReturn;
    }

    public void setGetTestContainersReturn(GetTestContainersReturn getTestContainersReturn) {
        this.getTestContainersReturn = getTestContainersReturn;
    }

    public String getSoapenvEncodingStyle() {
        return soapenvEncodingStyle;
    }

    public void setSoapenvEncodingStyle(String soapenvEncodingStyle) {
        this.soapenvEncodingStyle = soapenvEncodingStyle;
    }

}
