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
 * getSchemasControl Test
 */
@RunWith(VertxUnitRunner.class)
public class GetSchemasControlTest extends BaseTest {

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
    public void testDefault(TestContext test) {
        Async async = test.async(1);
        String standard;
        String version;

        // TODO set parameters for getSchemasControl request
        standard = null;
        version = null;
        apiClient.getSchemasControl(standard, version, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });
    }


}