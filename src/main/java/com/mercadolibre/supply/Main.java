package com.mercadolibre.supply;

import com.mercadolibre.app.Application;
import com.mercadolibre.supply.core.configuration.ApplicationModule;
import com.mercadolibre.supply.core.routers.MainRouter;

import static spark.Spark.get;

public class Main extends Application {

    public static void main(String[] args) {
        new Main().init();
    }

    @Override
    public void addRoutes() {
        get("/get-price-task", (request, response) -> Application.getInstance(MainRouter.class).getPriceTask(request, response));
    }

    @Override
    protected void configure() {
        install(new ApplicationModule());
    }
}
