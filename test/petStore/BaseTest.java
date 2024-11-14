package petStore;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import juiceShop.frameworkUtils.Utils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

    protected static String petStoreBaseUrl = Utils.getConfigProperty("petstoreURL");
    protected RequestSpecification httpRequest;
    @BeforeMethod
    public void setupUp(){
        RestAssured.baseURI = petStoreBaseUrl;
        httpRequest = RestAssured.given();
    }
}
