package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ox2 extends cs2 {
    public final rr i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mx2 f41761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f41762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bs f41763l;

    public ox2(nx2 nx2Var, rr rrVar, mx2 mx2Var, byte[] bArr) {
        this.i = rrVar;
        this.f41761j = mx2Var;
        this.f41762k = bArr;
        this.f41763l = new bs(rrVar, nx2Var.f41390c, bArr, mx2Var);
    }

    @Override // yads.cs2
    public final void a() {
        this.f41763l.f37132j = true;
    }

    @Override // yads.cs2
    public final Object b() throws IOException {
        float f10;
        this.f41763l.a();
        mx2 mx2Var = this.f41761j;
        if (mx2Var == null) {
            return null;
        }
        int i = mx2Var.f41098e + 1;
        mx2Var.f41098e = i;
        rj0 rj0Var = mx2Var.f41094a;
        long j10 = mx2Var.f41095b;
        long j11 = mx2Var.f41097d;
        if (j10 == -1 || j10 == 0) {
            int i10 = mx2Var.f41096c;
            f10 = i10 != 0 ? (i * 100.0f) / i10 : -1.0f;
        } else {
            f10 = (j11 * 100.0f) / j10;
        }
        ((mj0) rj0Var).a(j10, j11, f10);
        return null;
    }
}
