package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0213hh extends N5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4 f23990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0187gh f23991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D3 f23992d;

    public C0213hh(@NonNull Y4 y42, @NonNull InterfaceC0187gh interfaceC0187gh) {
        this(y42, interfaceC0187gh, new D3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0264jh load(@NonNull M5 m52) {
        C0264jh c0264jh = (C0264jh) super.load(m52);
        c0264jh.f24162m = ((C0135eh) m52.componentArguments).f23769a;
        c0264jh.f24167r = this.f23990b.f23300t.a();
        c0264jh.f24172w = this.f23990b.f23297q.a();
        C0135eh c0135eh = (C0135eh) m52.componentArguments;
        c0264jh.f24154d = c0135eh.f23770b;
        c0264jh.f24155e = c0135eh.f23771c;
        c0264jh.f24156f = c0135eh.f23772d;
        c0264jh.i = c0135eh.f23773e;
        c0264jh.f24157g = c0135eh.f23774f;
        c0264jh.f24158h = c0135eh.f23775g;
        Boolean boolValueOf = Boolean.valueOf(c0135eh.f23776h);
        InterfaceC0187gh interfaceC0187gh = this.f23991c;
        c0264jh.f24159j = boolValueOf;
        c0264jh.f24160k = interfaceC0187gh;
        C0135eh c0135eh2 = (C0135eh) m52.componentArguments;
        c0264jh.f24171v = c0135eh2.f23777j;
        C0140em c0140em = m52.f22651a;
        C0326m4 c0326m4 = c0140em.f23797n;
        c0264jh.f24163n = c0326m4.f24331a;
        C0610xe c0610xe = c0140em.f23802s;
        if (c0610xe != null) {
            c0264jh.f24168s = c0610xe.f25021a;
            c0264jh.f24169t = c0610xe.f25022b;
        }
        c0264jh.f24164o = c0326m4.f24332b;
        c0264jh.f24166q = c0140em.f23789e;
        c0264jh.f24165p = c0140em.f23794k;
        D3 d32 = this.f23992d;
        Map<String, String> map = c0135eh2.i;
        A3 a3F = C0382oa.I.f();
        d32.getClass();
        c0264jh.f24170u = D3.a(map, c0140em, a3F);
        c0264jh.f24173x = this.f23990b.f23302v.f24611e.keySet();
        return c0264jh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C0264jh(this.f23990b);
    }

    public C0213hh(Y4 y42, InterfaceC0187gh interfaceC0187gh, D3 d32) {
        super(y42.getContext(), y42.b().c());
        this.f23990b = y42;
        this.f23991c = interfaceC0187gh;
        this.f23992d = d32;
    }

    @NonNull
    public final C0264jh a() {
        return new C0264jh(this.f23990b);
    }
}
