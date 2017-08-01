
package br.com.empresa.silkintegration.execution.modelExecutionRootNode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Id {

    @SerializedName("xsi:type")
    @Expose
    private String xsiType;
    @SerializedName("content")
    @Expose
    private int content;

    public String getXsiType() {
        return xsiType;
    }

    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

}
