package com.mercadolibre.supply.core;

import com.google.inject.Guice;
import com.mercadolibre.config.Config;
import com.mercadolibre.supply.Main;
import com.mercadolibre.supply.core.configuration.ApplicationModule;
import spark.Request;
import spark.Response;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BaseTest {

    public BaseTest() {
        Config.addInjector(Main.APP, Guice.createInjector(new ApplicationModule()));
    }


    protected Request mockRequest(String siteId) {
        final Request request = mock(Request.class);

        when(request.params("site_id")).thenReturn(siteId);

        return request;
    }

    public class TestResponse extends Response {

        @Override
        public void type(String contentType) {}

        @Override
        public void status(int statusCode) {}
    }
}
