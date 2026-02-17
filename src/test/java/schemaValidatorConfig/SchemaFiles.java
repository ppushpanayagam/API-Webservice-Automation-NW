package schemaValidatorConfig;

public enum SchemaFiles {

    CREATE_ITEM_FILE("CreateItemSchema.json"),
    GET_CREATED_ITEM("GetCreatedItem.json");

    public final String fileName;

    SchemaFiles(String fileName){
        this.fileName = fileName;
    }
}
