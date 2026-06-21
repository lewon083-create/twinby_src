package l4;

import j3.p0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends n implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27858g;

    public g(int i, p0 p0Var, int i10, j jVar, int i11) {
        int i12;
        super(i, p0Var, i10);
        this.f27857f = s3.a.l(i11, jVar.B) ? 1 : 0;
        j3.o oVar = this.f27882e;
        int i13 = oVar.f26342u;
        int i14 = -1;
        if (i13 != -1 && (i12 = oVar.f26343v) != -1) {
            i14 = i13 * i12;
        }
        this.f27858g = i14;
    }

    @Override // l4.n
    public final int a() {
        return this.f27857f;
    }

    @Override // l4.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f27858g, ((g) obj).f27858g);
    }
}
