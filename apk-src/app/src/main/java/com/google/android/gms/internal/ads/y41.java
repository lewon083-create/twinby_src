package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12495c;

    public y41(Object obj, Object obj2, Object obj3) {
        this.f12493a = obj;
        this.f12494b = obj2;
        this.f12495c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f12493a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f12494b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f12495c);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        l7.o.t(sb2, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
        return new IllegalArgumentException(om1.n(sb2, " and ", strValueOf3, "=", strValueOf4));
    }
}
