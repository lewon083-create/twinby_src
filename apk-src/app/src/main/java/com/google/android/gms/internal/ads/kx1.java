package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kx1 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lx1 f7327b;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        HashMap map = mx1.f8033a;
        lx1 lx1Var = this.f7327b;
        return lx1Var.a(obj2) - lx1Var.a(obj);
    }
}
