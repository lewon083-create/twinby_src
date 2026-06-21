package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mf0 extends ea.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pf0 f7885f;

    public mf0(pf0 pf0Var, String str) {
        this.f7884e = str;
        Objects.requireNonNull(pf0Var);
        this.f7885f = pf0Var;
    }

    @Override // k9.v
    public final void d(k9.m mVar) {
        this.f7885f.m4(pf0.p4(mVar));
    }

    @Override // k9.v
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        String str = this.f7884e;
        this.f7885f.l4((sv) obj, str);
    }
}
