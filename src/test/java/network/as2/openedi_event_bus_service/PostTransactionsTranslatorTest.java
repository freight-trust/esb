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
 * postTransactionsTranslator Test
 */
@RunWith(VertxUnitRunner.class)
public class PostTransactionsTranslatorTest extends BaseTest {

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
        Async async = test.async(5);
        Object X-TradingChannelName;

        // TODO set parameters for postTransactionsTranslatorWithEmptyBody request
        X-TradingChannelName = null;
        apiClient.postTransactionsTranslatorWithEmptyBody(X-TradingChannelName, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(200, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsTranslatorWithEDIX12Buffer request
        X-TradingChannelName = null;
        Buffer buffer = null;
        apiClient.postTransactionsTranslatorWithEDIX12Buffer(X-TradingChannelName, buffer, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(200, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsTranslatorWithEDIX12Stream request
        X-TradingChannelName = null;
        ReadStream<Buffer> stream = null;
        apiClient.postTransactionsTranslatorWithEDIX12Stream(X-TradingChannelName, stream, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(200, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsTranslatorWithEDIFACTBuffer request
        X-TradingChannelName = null;
        Buffer buffer = null;
        apiClient.postTransactionsTranslatorWithEDIFACTBuffer(X-TradingChannelName, buffer, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(200, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsTranslatorWithEDIFACTStream request
        X-TradingChannelName = null;
        ReadStream<Buffer> stream = null;
        apiClient.postTransactionsTranslatorWithEDIFACTStream(X-TradingChannelName, stream, (AsyncResult<HttpResponse> ar) -> {
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
    public void test400(TestContext test) {
        Async async = test.async(5);
        Object X-TradingChannelName;

        // TODO set parameters for postTransactionsTranslatorWithEmptyBody request
        X-TradingChannelName = null;
        apiClient.postTransactionsTranslatorWithEmptyBody(X-TradingChannelName, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(400, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsTranslatorWithEDIX12Buffer request
        X-TradingChannelName = null;
        Buffer buffer = null;
        apiClient.postTransactionsTranslatorWithEDIX12Buffer(X-TradingChannelName, buffer, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(400, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsTranslatorWithEDIX12Stream request
        X-TradingChannelName = null;
        ReadStream<Buffer> stream = null;
        apiClient.postTransactionsTranslatorWithEDIX12Stream(X-TradingChannelName, stream, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(400, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsTranslatorWithEDIFACTBuffer request
        X-TradingChannelName = null;
        Buffer buffer = null;
        apiClient.postTransactionsTranslatorWithEDIFACTBuffer(X-TradingChannelName, buffer, (AsyncResult<HttpResponse> ar) -> {
            if (ar.succeeded()) {
                test.assertEquals(400, ar.result().statusCode());
                //TODO add your asserts
            } else {
                test.fail("Request failed");
            }
            async.countDown();
        });

        // TODO set parameters for postTransactionsTranslatorWithEDIFACTStream request
        X-TradingChannelName = null;
        ReadStream<Buffer> stream = null;
        apiClient.postTransactionsTranslatorWithEDIFACTStream(X-TradingChannelName, stream, (AsyncResult<HttpResponse> ar) -> {
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