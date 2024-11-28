package petStore.test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import petStore.models.Order;
import petStore.models.Status;
import petStore.utils.utils;

public class StoreTest extends BaseTest {
    private int generatedOrderId;
    @Test
    public void placeOrderTest() {
        // Arrange: Create an Order object with random ID, product details, and status
        Order order = new Order(
                utils.generateRandomNumber(2222), 12111,2,
                utils.getCurrentDateTimeInFormat(),Status.PLACED.getStatus(),true);

        // Act: Prepare and send the HTTP POST request to place the order
        httpRequest.contentType("application/json");
        httpRequest.body(utils.convertObjectToJson(order));
        Response response = httpRequest.request(Method.POST, "/store/order"); // Send POST request

        Assert.assertEquals(response.statusCode(), 200, "Order placement failed.");

        generatedOrderId = response.jsonPath().getInt("id");
        Assert.assertNotNull(generatedOrderId, "Order ID should not be null.");
    }

    @Test(dependsOnMethods = "placeOrderTest")
    public void findOrderByIdTest() {
        // Act: Prepare and send the HTTP GET request to retrieve the order by ID
        httpRequest.pathParam("orderId", generatedOrderId);
        Response response = httpRequest.request(Method.GET, "/store/order/{orderId}"); // Send the GET request
        // Deserialize the response JSON into an Order object
        Order order = utils.convertJsonToObject(response.getBody().asString(), Order.class);

        Assert.assertEquals(response.statusCode(), 200, "Failed to retrieve the order.");

        Assert.assertEquals(order.getId(), generatedOrderId, "Order ID mismatch.");
    }
}
