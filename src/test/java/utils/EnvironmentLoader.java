package utils;

import context.ScenarioContext;

import java.util.Properties;

public class EnvironmentLoader {

    private Properties properties;
    private static EnvironmentLoader environmentLoader;
    ScenarioContext scenarioContext = ScenarioContext.getInstance();

    private EnvironmentLoader(){
        String env =System.getProperty("env", String.valueOf(EnvType.QA));
        switch(EnvType.valueOf(env)){
            case QA ->properties =PropertyConfig.environmentLoader("src/test/resources/qa.properties");
            case UAT ->properties =PropertyConfig.environmentLoader("src/test/resources/uat.properties");
        }
    }

    public static EnvironmentLoader getInstance(){
        if(environmentLoader == null){
            environmentLoader = new EnvironmentLoader();
        }
        return environmentLoader;
    }

    public String getBaseUrl(){
        String prop =properties.getProperty("BASE_URL");
        if(prop != null) return prop;
        else throw new RuntimeException("Base URL is not found");
    }

    public String getApiKey(){
        String prop =properties.getProperty("API_KEY");
        if(prop != null) return prop;
        else throw new RuntimeException("Base URL is not found");
    }
}
