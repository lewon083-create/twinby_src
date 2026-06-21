package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0522u1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AppMetricaInitializerJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0522u1 f25142a;

    public AppMetricaInitializerJsInterface(@NonNull C0522u1 c0522u1) {
        this.f25142a = c0522u1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f25142a.c(str);
    }
}
