package apiConfig;

import java.util.Arrays;

public enum StatusCode {

    CODE_200(200, "OK"),
    CODE_201(201, "CREATED"),
    CODE_400(400, "BAD REQUEST"),
    CODE_404(404, "NOT FOUND");

    public final int code;
    public final String message;

    StatusCode(int code, String message){

        this.code = code;
        this.message = message;
    }

    public static StatusCode expectedCode(int code){
        return Arrays.stream(values())
                .filter(s -> s.code == code)
                .findFirst().orElseThrow(()-> new IllegalArgumentException(
                        "Unknown Status Code: "+code
        ));
    }
}
