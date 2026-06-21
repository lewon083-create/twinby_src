package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFd1aSDK;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFd1aSDK getMonetizationNetwork;

    public HttpException(Throwable th2, AFd1aSDK aFd1aSDK) {
        super(th2.getMessage(), th2);
        this.getMonetizationNetwork = aFd1aSDK;
    }

    public AFd1aSDK getMetrics() {
        return this.getMonetizationNetwork;
    }
}
