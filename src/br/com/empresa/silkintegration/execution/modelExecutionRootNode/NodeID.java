
package br.com.empresa.silkintegration.execution.modelExecutionRootNode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NodeID {

    @SerializedName("xsi:type")
    @Expose
    private String xsiType;
    @SerializedName("xsi:nil")
    @Expose
    private boolean xsiNil;

    public String getXsiType() {
        return xsiType;
    }

    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }

    public boolean isXsiNil() {
        return xsiNil;
    }

    public void setXsiNil(boolean xsiNil) {
        this.xsiNil = xsiNil;
    }

}
