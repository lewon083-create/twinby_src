package yads;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xz2 extends mo {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u30 f44853h;
    public final o30 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nx0 f44854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f44855k = -9223372036854775807L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ae0 f44856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f44857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sz2 f44858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hm1 f44859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u83 f44860p;

    public xz2(fm1 fm1Var, o30 o30Var, ae0 ae0Var, boolean z5) {
        this.i = o30Var;
        this.f44856l = ae0Var;
        this.f44857m = z5;
        new tl1().a(Uri.EMPTY);
        throw null;
    }

    @Override // yads.mo
    public final void a(u83 u83Var) {
        this.f44860p = u83Var;
        a(this.f44858n);
    }

    @Override // yads.mo
    public final hm1 c() {
        return this.f44859o;
    }

    @Override // yads.mo
    public final void a(rm1 rm1Var) {
        ((wz2) rm1Var).f44543j.a((eg1) null);
    }

    @Override // yads.mo
    public final rm1 a(an1 an1Var, qe qeVar, long j10) {
        return new wz2(this.f44853h, this.i, this.f44860p, this.f44854j, this.f44855k, this.f44856l, b(an1Var), this.f44857m);
    }

    @Override // yads.mo
    public final void d() {
    }

    @Override // yads.mo
    public final void e() {
    }
}
