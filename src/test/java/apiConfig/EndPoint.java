package apiConfig;

public enum EndPoint {

    CREATE_ITEM("objects"),
    LIST_OF_ITEMS("objects"),
    INVALID_CREATE_ITEM("object");

    public final String url;

    EndPoint(String url){this.url = url;}
}
