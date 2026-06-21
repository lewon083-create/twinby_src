package q4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f31773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.ads.identifier.c f31774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.google.android.gms.ads.identifier.c cVar, t tVar, t tVar2) {
        super(tVar);
        this.f31774c = cVar;
        this.f31773b = tVar2;
    }

    @Override // q4.p, q4.t
    public final s e(long j10) {
        s sVarE = this.f31773b.e(j10);
        u uVar = sVarE.f31761a;
        long j11 = uVar.f31764a;
        long j12 = uVar.f31765b;
        long j13 = this.f31774c.f2534c;
        u uVar2 = new u(j11, j12 + j13);
        u uVar3 = sVarE.f31762b;
        return new s(uVar2, new u(uVar3.f31764a, uVar3.f31765b + j13));
    }
}
