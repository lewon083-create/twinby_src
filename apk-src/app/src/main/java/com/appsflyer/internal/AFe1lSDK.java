package com.appsflyer.internal;

import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFe1lSDK extends TimerTask {
    private final Thread getCurrencyIso4217Code;

    public AFe1lSDK(Thread thread) {
        this.getCurrencyIso4217Code = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.getCurrencyIso4217Code.interrupt();
    }
}
