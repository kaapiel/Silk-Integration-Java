
package br.com.empresa.silkintegration.execution.modelExecutionRootNode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value {

    @SerializedName("xsi:type")
    @Expose
    private String xsiType;
    @SerializedName("content")
    @Expose
    private String content;

    public String getXsiType() {
        return xsiType;
    }

    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
