package com.mercadolibre.supply.core.routers;

import com.mercadolibre.app.Application;
import com.mercadolibre.supply.business.entities.site.SiteId;
import com.mercadolibre.supply.core.BaseTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import spark.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MainRouterTest extends BaseTest {

    private MainRouter mainRouter;

    public MainRouterTest() {
        this.mainRouter = Application.getInstance(MainRouter.class);
    }

    @Test
    @Disabled
    void testBeforeWorkShop() throws Exception {
        final Response response = mainRouter.getPriceTask(mockRequest(SiteId.MLB.name()), new TestResponse());


        assertNotNull(response);
        assertEquals("{\"id\":\"price_task\",\"ui_type\":\"task\",\"data\":null,\"bricks\":null}", response.body());
    }


}
