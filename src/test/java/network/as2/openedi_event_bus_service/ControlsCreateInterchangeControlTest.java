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
 * controls.create-interchange-control Test
 */
@RunWith(VertxUnitRunner.class)
public class ControlsCreateInterchangeControlTest extends BaseTest {

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
    public void test201(TestContext test) {
        Async async = test.async(2);
        String id;

        // TODO set parameters for controlsCreateInterchangeControlWithEmptyBody request
        id = null;
        apiClient.controlsCreateInterchangeControlWithEmptyBody(id, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(201, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for controlsCreateInterchangeControlWithJson request
        id = null;
        InterchangeControl body = null;
        apiClient.controlsCreateInterchangeControlWithJson(id, body, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(201, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });
    }

    @Test
    public void test400(TestContext test) {
        Async async = test.async(2);
        String id;

        // TODO set parameters for controlsCreateInterchangeControlWithEmptyBody request
        id = null;
        apiClient.controlsCreateInterchangeControlWithEmptyBody(id, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(400, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for controlsCreateInterchangeControlWithJson request
        id = null;
        InterchangeControl body = null;
        apiClient.controlsCreateInterchangeControlWithJson(id, body, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(400, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });
    }

    @Test
    public void test409(TestContext test) {
        Async async = test.async(2);
        String id;

        // TODO set parameters for controlsCreateInterchangeControlWithEmptyBody request
        id = null;
        apiClient.controlsCreateInterchangeControlWithEmptyBody(id, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(409, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for controlsCreateInterchangeControlWithJson request
        id = null;
        InterchangeControl body = null;
        apiClient.controlsCreateInterchangeControlWithJson(id, body, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(409, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });
    }


}