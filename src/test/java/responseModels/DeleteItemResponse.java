package responseModels;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteItemResponse {

    @JsonProperty("message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DeleteItemResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
