
package br.com.empresa.silkintegration.execution.modelExecutionRootNode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SoapenvEnvelope {

    @SerializedName("xmlns:xsd")
    @Expose
    private String xmlnsXsd;
    @SerializedName("soapenv:Body")
    @Expose
    private SoapenvBody soapenvBody;
    @SerializedName("xmlns:soapenv")
    @Expose
    private String xmlnsSoapenv;
    @SerializedName("xmlns:xsi")
    @Expose
    private String xmlnsXsi;

    public String getXmlnsXsd() {
        return xmlnsXsd;
    }

    public void setXmlnsXsd(String xmlnsXsd) {
        this.xmlnsXsd = xmlnsXsd;
    }

    public SoapenvBody getSoapenvBody() {
        return soapenvBody;
    }

    public void setSoapenvBody(SoapenvBody soapenvBody) {
        this.soapenvBody = soapenvBody;
    }

    public String getXmlnsSoapenv() {
        return xmlnsSoapenv;
    }

    public void setXmlnsSoapenv(String xmlnsSoapenv) {
        this.xmlnsSoapenv = xmlnsSoapenv;
    }

    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

}
