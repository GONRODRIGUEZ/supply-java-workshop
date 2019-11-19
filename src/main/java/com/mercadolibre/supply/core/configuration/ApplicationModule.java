package com.mercadolibre.supply.core.configuration;

import com.google.inject.AbstractModule;
import com.mercadolibre.json.Json;
import com.mercadolibre.json_jackson.JsonJackson;
import com.mercadolibre.supply.core.entrypoints.GetPriceTaskEntryPoint;
import com.mercadolibre.supply.core.entrypoints.impl.DefaultGetPriceTaskEntryPoint;

public class ApplicationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(GetPriceTaskEntryPoint.class).to(DefaultGetPriceTaskEntryPoint.class);
        bind(Json.class).to(JsonJackson.class);
    }

}
