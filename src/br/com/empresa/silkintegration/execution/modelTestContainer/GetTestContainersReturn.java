
package br.com.empresa.silkintegration.execution.modelTestContainer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetTestContainersReturn {

    @SerializedName("xmlns:ns2")
    @Expose
    private String xmlnsNs2;
    @SerializedName("xsi:type")
    @Expose
    private String xsiType;
    @SerializedName("xmlns:soapenc")
    @Expose
    private String xmlnsSoapenc;
    @SerializedName("getTestContainersReturn")
    @Expose
    private GetTestContainersReturn_ getTestContainersReturn;
    @SerializedName("soapenc:arrayType")
    @Expose
    private String soapencArrayType;

    public String getXmlnsNs2() {
        return xmlnsNs2;
    }

    public void setXmlnsNs2(String xmlnsNs2) {
        this.xmlnsNs2 = xmlnsNs2;
    }

    public String getXsiType() {
        return xsiType;
    }

    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }

    public String getXmlnsSoapenc() {
        return xmlnsSoapenc;
    }

    public void setXmlnsSoapenc(String xmlnsSoapenc) {
        this.xmlnsSoapenc = xmlnsSoapenc;
    }

    public GetTestContainersReturn_ getGetTestContainersReturn() {
        return getTestContainersReturn;
    }

    public void setGetTestContainersReturn(GetTestContainersReturn_ getTestContainersReturn) {
        this.getTestContainersReturn = getTestContainersReturn;
    }

    public String getSoapencArrayType() {
        return soapencArrayType;
    }

    public void setSoapencArrayType(String soapencArrayType) {
        this.soapencArrayType = soapencArrayType;
    }

}
