package com.mercadolibre.supply.core.entrypoints;

import com.mercadolibre.kisc.bricks.Brick;

@FunctionalInterface
public interface GetPriceTaskEntryPoint {

    Brick getPriceTask(String siteId);
}
