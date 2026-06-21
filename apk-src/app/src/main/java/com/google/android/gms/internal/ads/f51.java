package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class f51 extends g41 implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient w51 f5243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f5244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient e51 f5245g;

    public f51(w51 w51Var, int i) {
        this.f5243e = w51Var;
        this.f5244f = i;
        Object[] objArr = x51.f12048j;
    }

    @Override // com.google.android.gms.internal.ads.f41
    public final /* synthetic */ Collection a() {
        return new b51(this);
    }

    @Override // com.google.android.gms.internal.ads.f41
    public final Map b() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.f41
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // com.google.android.gms.internal.ads.f41
    public /* synthetic */ Map d() {
        return this.f5243e;
    }
}
