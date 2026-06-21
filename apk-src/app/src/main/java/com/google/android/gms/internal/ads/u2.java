package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2 f10791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.ads.identifier.c f10792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.google.android.gms.ads.identifier.c cVar, o2 o2Var, o2 o2Var2) {
        super(o2Var);
        this.f10791b = o2Var2;
        this.f10792c = cVar;
    }

    @Override // com.google.android.gms.internal.ads.h2, com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        n2 n2VarB = this.f10791b.b(j10);
        p2 p2Var = n2VarB.f8151a;
        long j11 = p2Var.f8887a;
        long j12 = p2Var.f8888b;
        long j13 = this.f10792c.f2534c;
        p2 p2Var2 = new p2(j11, j12 + j13);
        p2 p2Var3 = n2VarB.f8152b;
        return new n2(p2Var2, new p2(p2Var3.f8887a, p2Var3.f8888b + j13));
    }
}
