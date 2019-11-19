package com.mercadolibre.supply.core.routers;

import com.mercadolibre.json.Json;
import com.mercadolibre.kisc.bricks.Brick;
import com.mercadolibre.restclient.http.ContentType;
import com.mercadolibre.supply.core.entrypoints.GetPriceTaskEntryPoint;
import com.newrelic.api.agent.Trace;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import spark.Request;
import spark.Response;

import javax.inject.Inject;

@Slf4j
public class MainRouter {

    @Inject
    private GetPriceTaskEntryPoint getPriceTaskEntryPoint;

    @Inject
    private Json json;

    @Trace(metricName = "GetPriceTask")
    public Response getPriceTask(Request request, Response response) throws Exception {
        final String siteId = request.params("site_id");

        Brick brick = getPriceTaskEntryPoint.getPriceTask(siteId);

        response.body(json.toJsonString(brick));
        response.type(ContentType.APPLICATION_JSON.getMimeType());
        response.status(HttpStatus.SC_OK);

        return response;
    }
}
