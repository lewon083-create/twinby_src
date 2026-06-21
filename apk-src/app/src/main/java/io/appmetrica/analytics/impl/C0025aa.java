package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0025aa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0025aa f23424c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23426b = new HashMap();

    public C0025aa(Context context) {
        this.f23425a = context;
    }

    public static final C0025aa a(Context context) {
        if (f23424c == null) {
            synchronized (kotlin.jvm.internal.g0.a(C0025aa.class)) {
                try {
                    if (f23424c == null) {
                        f23424c = new C0025aa(context);
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C0025aa c0025aa = f23424c;
        if (c0025aa != null) {
            return c0025aa;
        }
        Intrinsics.g("INSTANCE");
        throw null;
    }

    public final synchronized C0630y9 b(String str) {
        Object c0630y9;
        try {
            HashMap map = this.f23426b;
            c0630y9 = map.get(str);
            if (c0630y9 == null) {
                c0630y9 = new C0630y9(this.f23425a, str);
                map.put(str, c0630y9);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C0630y9) c0630y9;
    }

    public final synchronized void a(String str) {
        this.f23426b.remove(str);
    }
}
