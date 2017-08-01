
package br.com.empresa.silkintegration.execution.modelExecutionRootNode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetExecutionRootNodeReturn {

    @SerializedName("kind")
    @Expose
    private Kind kind;
    @SerializedName("xsi:type")
    @Expose
    private String xsiType;
    @SerializedName("propertyValues")
    @Expose
    private PropertyValues propertyValues;
    @SerializedName("id")
    @Expose
    private Id id;

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public String getXsiType() {
        return xsiType;
    }

    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

}
