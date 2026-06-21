package com.google.android.gms.internal.ads;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ly1 implements mb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7676c;

    public /* synthetic */ ly1(n90 n90Var, ey1 ey1Var) {
        this.f7675b = n90Var;
        this.f7676c = ey1Var;
    }

    @Override // com.google.android.gms.internal.ads.mb0, com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo0a(Object obj) {
        ((ny1) obj).p(0, (hy1) ((n90) this.f7675b).f8248c, (ey1) this.f7676c);
    }

    public ly1(CopyOnWriteArrayList copyOnWriteArrayList, hy1 hy1Var) {
        this.f7676c = copyOnWriteArrayList;
        this.f7675b = hy1Var;
    }
}
