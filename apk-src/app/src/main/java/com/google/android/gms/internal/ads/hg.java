package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf f6127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6129c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class[] f6131e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Method f6130d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CountDownLatch f6132f = new CountDownLatch(1);

    public hg(qf qfVar, String str, String str2, Class... clsArr) {
        this.f6127a = qfVar;
        this.f6128b = str;
        this.f6129c = str2;
        this.f6131e = clsArr;
        qfVar.f9476b.submit(new s(7, this));
    }
}
