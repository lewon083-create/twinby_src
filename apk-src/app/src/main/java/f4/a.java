package f4;

import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.measurement.j4;
import hl.l;
import java.math.RoundingMode;
import m3.p;
import m3.z;
import q4.a0;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.k f16577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2 f16578c = new y2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16583h;
    public a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16584j;

    public a(e4.k kVar) {
        this.f16577b = kVar;
        this.f16579d = kVar.f16139b;
        String str = (String) kVar.f16141d.get("mode");
        str.getClass();
        if (j4.n(str, "AAC-hbr")) {
            this.f16580e = 13;
            this.f16581f = 3;
        } else {
            if (!j4.n(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f16580e = 6;
            this.f16581f = 2;
        }
        this.f16582g = this.f16581f + this.f16580e;
    }

    @Override // f4.i
    public final void a(long j10) {
        this.f16583h = j10;
    }

    @Override // f4.i
    public final void b(p pVar, long j10, int i, boolean z5) {
        this.i.getClass();
        short sW = pVar.w();
        int i10 = sW / this.f16582g;
        long jT = l.t(this.f16584j, this.f16579d, j10, this.f16583h);
        y2 y2Var = this.f16578c;
        y2Var.p(pVar);
        int i11 = this.f16581f;
        int i12 = this.f16580e;
        if (i10 == 1) {
            int i13 = y2Var.i(i12);
            y2Var.t(i11);
            this.i.d(pVar.a(), pVar);
            if (z5) {
                this.i.f(jT, 1, i13, 0, null);
                return;
            }
            return;
        }
        pVar.N((sW + 7) / 8);
        long jU = jT;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = y2Var.i(i12);
            y2Var.t(i11);
            this.i.d(i15, pVar);
            this.i.f(jU, 1, i15, 0, null);
            jU += z.U(i10, 1000000L, this.f16579d, RoundingMode.DOWN);
        }
    }

    @Override // f4.i
    public final void c(m mVar, int i) {
        a0 a0VarP = mVar.P(i, 1);
        this.i = a0VarP;
        a0VarP.a(this.f16577b.f16140c);
    }

    @Override // f4.i
    public final void seek(long j10, long j11) {
        this.f16583h = j10;
        this.f16584j = j11;
    }
}
