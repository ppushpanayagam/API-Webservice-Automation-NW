package responseModels;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteItemResponse {

    @JsonProperty("message")
    private String message;

    @JsonProperty("error")
    private String error;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isSuccess(){return message != null; }
    public boolean isError(){return error != null;}

    public String getResponseTextForDeletion(){
        return isSuccess() ? message : error;
    }

    @Override
    public String toString() {
        return "DeleteItemResponse{" +
                "message='" + message + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
