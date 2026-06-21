package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ni, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0365ni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f24447a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0646z0 f24448b;

    public C0365ni(C0646z0 c0646z0) {
        this.f24448b = c0646z0;
    }

    public static C0365ni a() {
        return AbstractC0340mi.f24376a;
    }

    public final C0162fi a(Context context, String str) {
        C0162fi c0162fi;
        C0162fi c0162fi2 = (C0162fi) this.f24447a.get(str);
        if (c0162fi2 != null) {
            return c0162fi2;
        }
        synchronized (this.f24447a) {
            try {
                c0162fi = (C0162fi) this.f24447a.get(str);
                if (c0162fi == null) {
                    IHandlerExecutor iHandlerExecutorA = C0071c4.l().f23537c.a();
                    this.f24448b.getClass();
                    if (C0621y0.f25055e == null) {
                        ((A9) iHandlerExecutorA).f22059b.post(new RunnableC0315li(this, context));
                    }
                    c0162fi = new C0162fi(context.getApplicationContext(), str, new C0646z0());
                    this.f24447a.put(str, c0162fi);
                    c0162fi.d(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0162fi;
    }
}
