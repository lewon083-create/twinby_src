package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14156c;

    public d0(Object obj, Object obj2, Object obj3) {
        this.f14154a = obj;
        this.f14155b = obj2;
        this.f14156c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f14154a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f14155b);
        return new IllegalArgumentException(t.z.g(t.z.j("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f14156c)));
    }
}
