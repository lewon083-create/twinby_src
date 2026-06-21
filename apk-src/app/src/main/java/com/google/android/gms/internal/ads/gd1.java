package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gd1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gd1 f5783b = new gd1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fd1 f5784c = new fd1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f5785a = new AtomicReference();

    public final fd1 a() {
        fd1 fd1Var = (fd1) this.f5785a.get();
        return fd1Var == null ? f5784c : fd1Var;
    }
}
