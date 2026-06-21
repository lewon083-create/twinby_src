package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 extends ci {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f7031g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n5 f7035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f7036f;

    static {
        v41 v41Var = x41.f12018c;
        r51 r51Var = r51.f9713f;
        List list = Collections.EMPTY_LIST;
        r51 r51Var2 = r51.f9713f;
        b4 b4Var = b4.f3576a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new q2(uri, r51Var2);
        }
        new h0();
        r7 r7Var = r7.B;
    }

    public jz1(long j10, long j11, boolean z5, n5 n5Var, c2 c2Var) {
        this.f7032b = j10;
        this.f7033c = j11;
        this.f7034d = z5;
        n5Var.getClass();
        this.f7035e = n5Var;
        this.f7036f = c2Var;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final nh b(int i, nh nhVar, long j10) {
        ix.n0(i, 1);
        Object obj = nh.f8296m;
        nhVar.a(this.f7035e, this.f7034d, false, this.f7036f, this.f7033c);
        return nhVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final bh d(int i, bh bhVar, boolean z5) {
        ix.n0(i, 1);
        Object obj = z5 ? f7031g : null;
        ou ouVar = ou.f8799b;
        bhVar.a(null, obj, 0, this.f7032b, false);
        return bhVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int e(Object obj) {
        return f7031g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final Object f(int i) {
        ix.n0(i, 1);
        return f7031g;
    }
}
