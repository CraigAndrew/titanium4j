package com.emitrom.ti4j.mobile.client.app;

import com.emitrom.ti4j.mobile.client.core.TiModule;

class IOs extends TiModule {

    private static final IOs INSTANCE = new IOs();

    public static IOs get() {
        return INSTANCE;
    }

    @Override
    public void createPeer() {
        // TODO Auto-generated method stub

    }

}
