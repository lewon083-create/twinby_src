package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ns1 implements ms1, js1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ns1 f8432b = new ns1(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8433a;

    public ns1(Object obj) {
        this.f8433a = obj;
    }

    public static ns1 a(Object obj) {
        if (obj != null) {
            return new ns1(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public static ns1 b(Object obj) {
        return obj == null ? f8432b : new ns1(obj);
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        return this.f8433a;
    }
}
