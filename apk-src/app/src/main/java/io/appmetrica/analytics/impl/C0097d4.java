package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0097d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0048b7 f23654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0507tb f23655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0532ub f23656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0027ac f23657d;

    public C0097d4(File file) {
        this.f23654a = new C0048b7(file);
    }

    public final synchronized Ia a(Context context) {
        C0532ub c0532ub;
        c0532ub = this.f23656c;
        if (c0532ub == null) {
            c0532ub = new C0532ub(c(context));
            this.f23656c = c0532ub;
        }
        return c0532ub;
    }

    public final synchronized Ia b(Context context) {
        return c(context);
    }

    public final Ia c(Context context) {
        C0027ac c0027ac;
        C0507tb c0507tb = this.f23655b;
        if (c0507tb != null) {
            return c0507tb;
        }
        synchronized (this) {
            c0027ac = this.f23657d;
            if (c0027ac == null) {
                C0048b7 c0048b7 = this.f23654a;
                String strA = new C0022a7(c0048b7.f23493a, c0048b7.f23494b, true).a(context, new O3());
                N6 n62 = AbstractC0601x5.f25007c;
                n62.getClass();
                HashMap map = new HashMap();
                map.put("preferences", InterfaceC0526u5.f24834a);
                C0193gn c0193gn = n62.f22721c;
                X6 x62 = n62.f22719a;
                T6 t62 = x62.f23244c;
                U6 u62 = x62.f23245d;
                C0432qa c0432qa = new C0432qa(false);
                c0432qa.a(112, new P3());
                C0270jn c0270jn = new C0270jn("service database", map);
                c0193gn.getClass();
                c0027ac = new C0027ac(context, strA, new Z9(strA), new C0219hn(t62, u62, c0432qa, c0270jn));
                this.f23657d = c0027ac;
            }
        }
        C0507tb c0507tb2 = new C0507tb(c0027ac);
        this.f23655b = c0507tb2;
        return c0507tb2;
    }
}
