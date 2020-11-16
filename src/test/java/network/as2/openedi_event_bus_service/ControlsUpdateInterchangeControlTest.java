package network.as2.openedi_event_bus_service;

import io.vertx.ext.web.client.HttpResponse;
import io.vertx.core.AsyncResult;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.core.json.JsonObject;
import io.vertx.core.MultiMap;
import org.junit.*;
import org.junit.runner.RunWith;
import java.util.List;
import java.util.Map;

import network.as2.openedi_event_bus_service.models.*;

/**
 * controls.update-interchange-control Test
 */
@RunWith(VertxUnitRunner.class)
public class ControlsUpdateInterchangeControlTest extends BaseTest {

    @Override
    @Before
    public void before(TestContext context) {
        super.before(context);
        //TODO add some test initialization code like security token retrieval
    }

    @Override
    @After
    public void after(TestContext context) {
        //TODO add some test end code like session destroy
        super.after(context);
    }

    @Test
    public void test200(TestContext test) {
        Async async = test.async(2);
        String id;

        // TODO set parameters for controlsUpdateInterchangeControlWithEmptyBody request
        id = null;
        apiClient.controlsUpdateInterchangeControlWithEmptyBody(id, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(200, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for controlsUpdateInterchangeControlWithJson request
        id = null;
        InterchangeControl body = null;
        apiClient.controlsUpdateInterchangeControlWithJson(id, body, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(200, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });
    }

    @Test
    public void test404(TestContext test) {
        Async async = test.async(2);
        String id;

        // TODO set parameters for controlsUpdateInterchangeControlWithEmptyBody request
        id = null;
        apiClient.controlsUpdateInterchangeControlWithEmptyBody(id, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(404, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for controlsUpdateInterchangeControlWithJson request
        id = null;
        InterchangeControl body = null;
        apiClient.controlsUpdateInterchangeControlWithJson(id, body, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(404, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });
    }


}