package com.mercadolibre.supply.core.blueprints;

import com.mercadolibre.kisc.bricks.mold.Blueprint;
import com.mercadolibre.supply.business.entities.site.Site;

public class PriceTask extends Blueprint<Site> {

    public PriceTask() {
        super(Site.class);
    }

    @Override
    protected void createTemplate() {
        id("price_task");
        uiType("task");
    }
}
