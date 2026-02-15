package responseModels;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;
import requestModels.ItemData;

public class CreateItemResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty ("createdAt")
    private String createdAt;

    @JsonProperty ("data")
    private ItemData data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ItemData getData() {
        return data;
    }

    public void setData(ItemData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CreateItemResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", data=" + data +
                '}';
    }
}
