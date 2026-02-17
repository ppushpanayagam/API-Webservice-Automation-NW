package responseModels;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class GetListOfAllItemsResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty ("data")
    private Map<String, Object> data;

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("status")
    private String status;

    @JsonProperty("path")
    private String path;

    @JsonProperty("error")
    private String error;

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

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "GetListOfAllItemsResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", data=" + data +
                ", timestamp='" + timestamp + '\'' +
                ", status='" + status + '\'' +
                ", path='" + path + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
