package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bn0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qs1 f3834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f3835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f3836c;

    public bn0(ls1 ls1Var, ls1 ls1Var2, d10 d10Var) {
        this.f3834a = ls1Var;
        this.f3835b = ls1Var2;
        this.f3836c = d10Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ml0 j() {
        return new ml0((ApplicationInfo) this.f3834a.j(), (PackageInfo) this.f3835b.j(), ((d10) this.f3836c).a(), 2);
    }
}
