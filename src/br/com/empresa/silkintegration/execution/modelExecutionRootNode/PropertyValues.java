
package br.com.empresa.silkintegration.execution.modelExecutionRootNode;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PropertyValues {

    @SerializedName("xsi:type")
    @Expose
    private String xsiType;
    @SerializedName("propertyValues")
    @Expose
    private List<PropertyValue> propertyValues = null;
    @SerializedName("xmlns:soapenc")
    @Expose
    private String xmlnsSoapenc;
    @SerializedName("soapenc:arrayType")
    @Expose
    private String soapencArrayType;

    public String getXsiType() {
        return xsiType;
    }

    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }

    public List<PropertyValue> getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(List<PropertyValue> propertyValues) {
        this.propertyValues = propertyValues;
    }

    public String getXmlnsSoapenc() {
        return xmlnsSoapenc;
    }

    public void setXmlnsSoapenc(String xmlnsSoapenc) {
        this.xmlnsSoapenc = xmlnsSoapenc;
    }

    public String getSoapencArrayType() {
        return soapencArrayType;
    }

    public void setSoapencArrayType(String soapencArrayType) {
        this.soapencArrayType = soapencArrayType;
    }

}
