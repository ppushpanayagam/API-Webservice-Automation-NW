package responseModels;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;
import requestModels.ItemData;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateItemResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty ("createdAt")
    private String createdAt;

    @JsonProperty ("data")
    private ItemData data;

    @JsonProperty ("timestamp")
    private String timestamp;

    @JsonProperty ("status")
    private String status;

    @JsonProperty ("error")
    private String error;

    @JsonProperty ("path")
    private String path;


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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "CreateItemResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", data=" + data +
                ", timestamp='" + timestamp + '\'' +
                ", status='" + status + '\'' +
                ", error='" + error + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
