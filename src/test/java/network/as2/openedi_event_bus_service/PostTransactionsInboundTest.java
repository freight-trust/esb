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
 * postTransactionsInbound Test
 */
@RunWith(VertxUnitRunner.class)
public class PostTransactionsInboundTest extends BaseTest {

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
    public void test202(TestContext test) {
        Async async = test.async(5);
        Object X-TradingChannelName;

        // TODO set parameters for postTransactionsInboundWithEmptyBody request
        X-TradingChannelName = null;
        apiClient.postTransactionsInboundWithEmptyBody(X-TradingChannelName, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(202, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsInboundWithEDIX12Buffer request
        X-TradingChannelName = null;
        Buffer buffer = null;
        apiClient.postTransactionsInboundWithEDIX12Buffer(X-TradingChannelName, buffer, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(202, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsInboundWithEDIX12Stream request
        X-TradingChannelName = null;
        ReadStream<Buffer> stream = null;
        apiClient.postTransactionsInboundWithEDIX12Stream(X-TradingChannelName, stream, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(202, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsInboundWithEDIFACTBuffer request
        X-TradingChannelName = null;
        Buffer buffer = null;
        apiClient.postTransactionsInboundWithEDIFACTBuffer(X-TradingChannelName, buffer, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(202, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsInboundWithEDIFACTStream request
        X-TradingChannelName = null;
        ReadStream<Buffer> stream = null;
        apiClient.postTransactionsInboundWithEDIFACTStream(X-TradingChannelName, stream, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(202, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });
    }

    @Test
    public void test400(TestContext test) {
        Async async = test.async(5);
        Object X-TradingChannelName;

        // TODO set parameters for postTransactionsInboundWithEmptyBody request
        X-TradingChannelName = null;
        apiClient.postTransactionsInboundWithEmptyBody(X-TradingChannelName, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(400, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsInboundWithEDIX12Buffer request
        X-TradingChannelName = null;
        Buffer buffer = null;
        apiClient.postTransactionsInboundWithEDIX12Buffer(X-TradingChannelName, buffer, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(400, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsInboundWithEDIX12Stream request
        X-TradingChannelName = null;
        ReadStream<Buffer> stream = null;
        apiClient.postTransactionsInboundWithEDIX12Stream(X-TradingChannelName, stream, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(400, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsInboundWithEDIFACTBuffer request
        X-TradingChannelName = null;
        Buffer buffer = null;
        apiClient.postTransactionsInboundWithEDIFACTBuffer(X-TradingChannelName, buffer, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(400, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsInboundWithEDIFACTStream request
        X-TradingChannelName = null;
        ReadStream<Buffer> stream = null;
        apiClient.postTransactionsInboundWithEDIFACTStream(X-TradingChannelName, stream, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(400, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });
    }


}