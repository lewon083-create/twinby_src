package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class S3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R3 f22940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile A9 f22941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile A9 f22942c;

    public S3() {
        this(new R3());
    }

    public final IHandlerExecutor a() {
        if (this.f22941b == null) {
            synchronized (this) {
                try {
                    if (this.f22941b == null) {
                        this.f22940a.getClass();
                        HandlerThreadC0104db handlerThreadC0104dbA = A9.a("IAA-CDE");
                        this.f22941b = new A9(handlerThreadC0104dbA, handlerThreadC0104dbA.getLooper(), new Handler(handlerThreadC0104dbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f22941b;
    }

    public final ICommonExecutor b() {
        if (this.f22942c == null) {
            synchronized (this) {
                try {
                    if (this.f22942c == null) {
                        this.f22940a.getClass();
                        HandlerThreadC0104db handlerThreadC0104dbA = A9.a("IAA-CRS");
                        this.f22942c = new A9(handlerThreadC0104dbA, handlerThreadC0104dbA.getLooper(), new Handler(handlerThreadC0104dbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f22942c;
    }

    public S3(R3 r32) {
        this.f22940a = r32;
    }
}
