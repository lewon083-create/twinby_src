package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r5 implements o5, k5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f9711f;

    public r5(av0 av0Var) {
        tk0 tk0Var = av0Var.f3433d;
        this.f9711f = tk0Var;
        tk0Var.E(12);
        this.f9708c = tk0Var.h() & KotlinVersion.MAX_COMPONENT_VALUE;
        this.f9707b = tk0Var.h();
    }

    @Override // k5.a
    public int a() {
        return -1;
    }

    @Override // k5.a
    public int b() {
        return this.f9707b;
    }

    @Override // k5.a
    public int c() {
        m3.p pVar = (m3.p) this.f9711f;
        int i = this.f9708c;
        if (i == 8) {
            return pVar.z();
        }
        if (i == 16) {
            return pVar.G();
        }
        int i10 = this.f9709d;
        this.f9709d = i10 + 1;
        if (i10 % 2 != 0) {
            return this.f9710e & 15;
        }
        int iZ = pVar.z();
        this.f9710e = iZ;
        return (iZ & 240) >> 4;
    }

    @Override // com.google.android.gms.internal.ads.o5
    public int h() {
        return this.f9707b;
    }

    @Override // com.google.android.gms.internal.ads.o5
    public int j() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.o5
    public int l() {
        tk0 tk0Var = (tk0) this.f9711f;
        int i = this.f9708c;
        if (i == 8) {
            return tk0Var.K();
        }
        if (i == 16) {
            return tk0Var.L();
        }
        int i10 = this.f9709d;
        this.f9709d = i10 + 1;
        if (i10 % 2 != 0) {
            return this.f9710e & 15;
        }
        int iK = tk0Var.K();
        this.f9710e = iK;
        return (iK & 240) >> 4;
    }

    public r5(n3.d dVar) {
        m3.p pVar = dVar.f29043d;
        this.f9711f = pVar;
        pVar.M(12);
        this.f9708c = pVar.D() & KotlinVersion.MAX_COMPONENT_VALUE;
        this.f9707b = pVar.D();
    }
}
