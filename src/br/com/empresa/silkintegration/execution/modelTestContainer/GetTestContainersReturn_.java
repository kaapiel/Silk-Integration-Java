
package br.com.empresa.silkintegration.execution.modelTestContainer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetTestContainersReturn_ {

    @SerializedName("xsi:type")
    @Expose
    private String xsiType;
    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("id")
    @Expose
    private Id id;

    public String getXsiType() {
        return xsiType;
    }

    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

}
