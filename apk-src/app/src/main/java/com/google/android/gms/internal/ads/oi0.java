package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f8695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f8696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zj0 f8697c;

    public oi0(zj0 zj0Var, m mVar, Executor executor) {
        this.f8697c = zj0Var;
        this.f8695a = new WeakReference(mVar);
        this.f8696b = executor;
    }
}
