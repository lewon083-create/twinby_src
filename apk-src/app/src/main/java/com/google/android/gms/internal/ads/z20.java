package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z20 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f12854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y40 f12855c;

    public /* synthetic */ z20(y40 y40Var, qs1 qs1Var, int i) {
        this.f12853a = i;
        this.f12855c = y40Var;
        this.f12854b = qs1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f12853a) {
            case 0:
                return new y20(this.f12855c.a(), ((k10) this.f12854b).j());
            case 1:
                return new u50(this.f12855c.a());
            case 2:
                return new x80(this.f12855c.a(), (bt0) this.f12854b.j());
            default:
                return new t80((Context) this.f12854b.j(), new HashSet(), this.f12855c.a());
        }
    }

    public /* synthetic */ z20(ls1 ls1Var, y40 y40Var, int i) {
        this.f12853a = i;
        this.f12854b = ls1Var;
        this.f12855c = y40Var;
    }
}
