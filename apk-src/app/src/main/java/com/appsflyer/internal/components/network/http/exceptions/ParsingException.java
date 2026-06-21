package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1wSDK;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ParsingException extends IOException {
    private final AFe1wSDK<String> getCurrencyIso4217Code;

    public ParsingException(String str, Throwable th2, AFe1wSDK<String> aFe1wSDK) {
        super(str, th2);
        this.getCurrencyIso4217Code = aFe1wSDK;
    }

    public AFe1wSDK<String> getRawResponse() {
        return this.getCurrencyIso4217Code;
    }
}
