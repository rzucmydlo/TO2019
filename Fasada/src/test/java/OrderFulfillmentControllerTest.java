import static org.junit.jupiter.api.Assertions.*;

public class OrderFulfillmentControllerTest {

    public void testOrderProduct() throws Exception {
        OrderFulfillmentController controller=new OrderFulfillmentController();
        controller.facade=new OrderServiceFacadeImpl();
        controller.orderProduct(9);
        boolean result=controller.orderFulfilled;
        assertTrue(result);
    }
}