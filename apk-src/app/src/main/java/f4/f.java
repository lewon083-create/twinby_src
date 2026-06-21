package f4;

import ad.g1;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.measurement.h5;
import hl.l;
import j3.d0;
import l7.o;
import m3.p;
import m3.z;
import q4.a0;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.k f16622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f16624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16628h;
    public long i;

    public f(e4.k kVar) {
        this.f16622b = kVar;
        try {
            this.f16623c = d(kVar.f16141d);
            this.f16625e = -9223372036854775807L;
            this.f16626f = -1;
            this.f16627g = 0;
            this.f16628h = 0L;
            this.i = -9223372036854775807L;
        } catch (d0 e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static int d(g1 g1Var) throws d0 {
        String str = (String) g1Var.get("config");
        int i = 0;
        i = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] bArrT = z.t(str);
            y2 y2Var = new y2(bArrT.length, bArrT);
            int i10 = y2Var.i(1);
            if (i10 != 0) {
                throw new d0(o.i(i10, "unsupported audio mux version: "), null, true, 0);
            }
            h5.g("Only supports allStreamsSameTimeFraming.", y2Var.i(1) == 1);
            int i11 = y2Var.i(6);
            h5.g("Only suppors one program.", y2Var.i(4) == 0);
            h5.g("Only suppors one layer.", y2Var.i(3) == 0);
            i = i11;
        }
        return i + 1;
    }

    @Override // f4.i
    public final void a(long j10) {
        h5.r(this.f16625e == -9223372036854775807L);
        this.f16625e = j10;
    }

    @Override // f4.i
    public final void b(p pVar, long j10, int i, boolean z5) {
        this.f16624d.getClass();
        int iA = e4.h.a(this.f16626f);
        if (this.f16627g > 0 && iA < i) {
            a0 a0Var = this.f16624d;
            a0Var.getClass();
            a0Var.f(this.i, 1, this.f16627g, 0, null);
            this.f16627g = 0;
            this.i = -9223372036854775807L;
        }
        for (int i10 = 0; i10 < this.f16623c; i10++) {
            int i11 = 0;
            while (pVar.f28590b < pVar.f28591c) {
                int iZ = pVar.z();
                i11 += iZ;
                if (iZ != 255) {
                    break;
                }
            }
            this.f16624d.d(i11, pVar);
            this.f16627g += i11;
        }
        this.i = l.t(this.f16628h, this.f16622b.f16139b, j10, this.f16625e);
        if (z5) {
            a0 a0Var2 = this.f16624d;
            a0Var2.getClass();
            a0Var2.f(this.i, 1, this.f16627g, 0, null);
            this.f16627g = 0;
            this.i = -9223372036854775807L;
        }
        this.f16626f = i;
    }

    @Override // f4.i
    public final void c(m mVar, int i) {
        a0 a0VarP = mVar.P(i, 2);
        this.f16624d = a0VarP;
        String str = z.f28608a;
        a0VarP.a(this.f16622b.f16140c);
    }

    @Override // f4.i
    public final void seek(long j10, long j11) {
        this.f16625e = j10;
        this.f16627g = 0;
        this.f16628h = j11;
    }
}
