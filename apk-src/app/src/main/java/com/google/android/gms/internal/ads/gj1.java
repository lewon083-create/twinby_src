package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gj1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gj1 f5829c = new gj1("NIST_P256", lc1.f7480a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gj1 f5830d = new gj1("NIST_P384", lc1.f7481b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final gj1 f5831e = new gj1("NIST_P521", lc1.f7482c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ECParameterSpec f5833b;

    public gj1(String str, ECParameterSpec eCParameterSpec) {
        this.f5832a = str;
        this.f5833b = eCParameterSpec;
    }

    public final String toString() {
        return this.f5832a;
    }
}
