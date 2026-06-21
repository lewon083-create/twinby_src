package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0446r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xn f24671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f24672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ca f24673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Da f24674d;

    public C0446r0() {
        this(new Xn());
    }

    public final synchronized Ca a(Context context, S3 s32) {
        try {
            if (this.f24673c == null) {
                if (a(context)) {
                    this.f24673c = new C0546v0();
                } else {
                    this.f24673c = new C0422q0(context, s32);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24673c;
    }

    public C0446r0(Xn xn) {
        this.f24671a = xn;
    }

    public final boolean a(Context context) {
        Boolean boolValueOf = this.f24672b;
        if (boolValueOf == null) {
            synchronized (this) {
                try {
                    boolValueOf = this.f24672b;
                    if (boolValueOf == null) {
                        this.f24671a.getClass();
                        boolean zA = Xn.a(context);
                        boolValueOf = Boolean.valueOf(!zA);
                        this.f24672b = boolValueOf;
                        if (!zA) {
                            ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return boolValueOf.booleanValue();
    }
}
