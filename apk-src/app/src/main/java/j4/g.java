package j4;

import i4.a1;
import i4.b1;
import i4.i0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f26477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f26478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f26481f;

    public g(i iVar, i iVar2, a1 a1Var, int i) {
        this.f26481f = iVar;
        this.f26477b = iVar2;
        this.f26478c = a1Var;
        this.f26479d = i;
    }

    public final void b() {
        if (this.f26480e) {
            return;
        }
        i iVar = this.f26481f;
        i0 i0Var = iVar.f26488h;
        int[] iArr = iVar.f26483c;
        int i = this.f26479d;
        i0Var.b(iArr[i], iVar.f26484d[i], 0, null, iVar.f26500u);
        this.f26480e = true;
    }

    @Override // i4.b1
    public final int d(r3.b bVar, r3.e eVar, int i) {
        i iVar = this.f26481f;
        if (iVar.q()) {
            return -3;
        }
        a aVar = iVar.f26502w;
        a1 a1Var = this.f26478c;
        if (aVar != null && aVar.c(this.f26479d + 1) <= a1Var.t()) {
            return -3;
        }
        b();
        return a1Var.C(bVar, eVar, i, iVar.f26505z);
    }

    @Override // i4.b1
    public final int h(long j10) {
        i iVar = this.f26481f;
        if (iVar.q()) {
            return 0;
        }
        boolean z5 = iVar.f26505z;
        a1 a1Var = this.f26478c;
        int iV = a1Var.v(j10, z5);
        a aVar = iVar.f26502w;
        if (aVar != null) {
            iV = Math.min(iV, aVar.c(this.f26479d + 1) - a1Var.t());
        }
        a1Var.H(iV);
        if (iV > 0) {
            b();
        }
        return iV;
    }

    @Override // i4.b1
    public final boolean isReady() {
        i iVar = this.f26481f;
        return !iVar.q() && this.f26478c.x(iVar.f26505z);
    }

    @Override // i4.b1
    public final void a() {
    }
}
