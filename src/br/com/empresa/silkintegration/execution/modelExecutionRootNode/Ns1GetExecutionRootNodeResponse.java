
package br.com.empresa.silkintegration.execution.modelExecutionRootNode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ns1GetExecutionRootNodeResponse {

    @SerializedName("xmlns:ns1")
    @Expose
    private String xmlnsNs1;
    @SerializedName("soapenv:encodingStyle")
    @Expose
    private String soapenvEncodingStyle;
    @SerializedName("getExecutionRootNodeReturn")
    @Expose
    private GetExecutionRootNodeReturn getExecutionRootNodeReturn;

    public String getXmlnsNs1() {
        return xmlnsNs1;
    }

    public void setXmlnsNs1(String xmlnsNs1) {
        this.xmlnsNs1 = xmlnsNs1;
    }

    public String getSoapenvEncodingStyle() {
        return soapenvEncodingStyle;
    }

    public void setSoapenvEncodingStyle(String soapenvEncodingStyle) {
        this.soapenvEncodingStyle = soapenvEncodingStyle;
    }

    public GetExecutionRootNodeReturn getGetExecutionRootNodeReturn() {
        return getExecutionRootNodeReturn;
    }

    public void setGetExecutionRootNodeReturn(GetExecutionRootNodeReturn getExecutionRootNodeReturn) {
        this.getExecutionRootNodeReturn = getExecutionRootNodeReturn;
    }

}
