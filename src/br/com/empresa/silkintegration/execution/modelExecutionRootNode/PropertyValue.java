
package br.com.empresa.silkintegration.execution.modelExecutionRootNode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PropertyValue {

    @SerializedName("propertyTypeID")
    @Expose
    private PropertyTypeID propertyTypeID;
    @SerializedName("children")
    @Expose
    private Children children;
    @SerializedName("xsi:type")
    @Expose
    private String xsiType;
    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("modifyCount")
    @Expose
    private ModifyCount modifyCount;
    @SerializedName("type")
    @Expose
    private Type type;
    @SerializedName("nodeID")
    @Expose
    private NodeID nodeID;
    @SerializedName("propertyID")
    @Expose
    private PropertyID propertyID;
    @SerializedName("value")
    @Expose
    private Value value;

    public PropertyTypeID getPropertyTypeID() {
        return propertyTypeID;
    }

    public void setPropertyTypeID(PropertyTypeID propertyTypeID) {
        this.propertyTypeID = propertyTypeID;
    }

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

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

    public ModifyCount getModifyCount() {
        return modifyCount;
    }

    public void setModifyCount(ModifyCount modifyCount) {
        this.modifyCount = modifyCount;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public NodeID getNodeID() {
        return nodeID;
    }

    public void setNodeID(NodeID nodeID) {
        this.nodeID = nodeID;
    }

    public PropertyID getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(PropertyID propertyID) {
        this.propertyID = propertyID;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

}
