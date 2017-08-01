
package br.com.empresa.silkintegration.execution.modelExecutionRootNode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Children {

    @SerializedName("xsi:type")
    @Expose
    private String xsiType;
    @SerializedName("soapenc:arrayType")
    @Expose
    private String soapencArrayType;

    public String getXsiType() {
        return xsiType;
    }

    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }

    public String getSoapencArrayType() {
        return soapencArrayType;
    }

    public void setSoapencArrayType(String soapencArrayType) {
        this.soapencArrayType = soapencArrayType;
    }

}
