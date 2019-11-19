package com.mercadolibre.supply.core.entrypoints.impl;

import com.mercadolibre.kisc.bricks.Brick;
import com.mercadolibre.supply.core.blueprints.PriceTask;
import com.mercadolibre.supply.core.entrypoints.GetPriceTaskEntryPoint;

public class DefaultGetPriceTaskEntryPoint implements GetPriceTaskEntryPoint {

    @Override
    public Brick getPriceTask(String siteId) {
        return new PriceTask().build(null).orElse(null);
    }

}
