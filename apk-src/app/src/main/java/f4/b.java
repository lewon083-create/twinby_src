package f4;

import com.google.android.gms.internal.ads.vq0;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.measurement.h5;
import hl.l;
import kotlin.KotlinVersion;
import m3.p;
import m3.z;
import q4.a0;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.k f16585b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f16587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16588e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16591h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2 f16586c = new y2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16589f = -9223372036854775807L;

    public b(e4.k kVar) {
        this.f16585b = kVar;
    }

    @Override // f4.i
    public final void a(long j10) {
        h5.r(this.f16589f == -9223372036854775807L);
        this.f16589f = j10;
    }

    @Override // f4.i
    public final void b(p pVar, long j10, int i, boolean z5) {
        int iZ = pVar.z() & 3;
        int iZ2 = pVar.z() & KotlinVersion.MAX_COMPONENT_VALUE;
        long jT = l.t(this.f16591h, this.f16585b.f16139b, j10, this.f16589f);
        if (iZ != 0) {
            if (iZ == 1 || iZ == 2) {
                int i10 = this.f16588e;
                if (i10 > 0) {
                    a0 a0Var = this.f16587d;
                    String str = z.f28608a;
                    a0Var.f(this.f16590g, 1, i10, 0, null);
                    this.f16588e = 0;
                }
            } else if (iZ != 3) {
                throw new IllegalArgumentException(String.valueOf(iZ));
            }
            int iA = pVar.a();
            a0 a0Var2 = this.f16587d;
            a0Var2.getClass();
            a0Var2.d(iA, pVar);
            int i11 = this.f16588e + iA;
            this.f16588e = i11;
            this.f16590g = jT;
            if (z5 && iZ == 3) {
                a0 a0Var3 = this.f16587d;
                String str2 = z.f28608a;
                a0Var3.f(jT, 1, i11, 0, null);
                this.f16588e = 0;
                return;
            }
            return;
        }
        int i12 = this.f16588e;
        if (i12 > 0) {
            a0 a0Var4 = this.f16587d;
            String str3 = z.f28608a;
            a0Var4.f(this.f16590g, 1, i12, 0, null);
            this.f16588e = 0;
        }
        if (iZ2 == 1) {
            int iA2 = pVar.a();
            a0 a0Var5 = this.f16587d;
            a0Var5.getClass();
            a0Var5.d(iA2, pVar);
            a0 a0Var6 = this.f16587d;
            String str4 = z.f28608a;
            a0Var6.f(jT, 1, iA2, 0, null);
            return;
        }
        byte[] bArr = pVar.f28589a;
        y2 y2Var = this.f16586c;
        y2Var.getClass();
        y2Var.o(bArr.length, bArr);
        y2Var.u(2);
        long j11 = jT;
        for (int i13 = 0; i13 < iZ2; i13++) {
            vq0 vq0VarQ = q4.b.q(y2Var);
            int i14 = vq0VarQ.f11443c;
            a0 a0Var7 = this.f16587d;
            a0Var7.getClass();
            a0Var7.d(i14, pVar);
            a0 a0Var8 = this.f16587d;
            String str5 = z.f28608a;
            a0Var8.f(j11, 1, vq0VarQ.f11443c, 0, null);
            j11 += ((long) (vq0VarQ.f11444d / vq0VarQ.f11441a)) * 1000000;
            y2Var.u(i14);
        }
    }

    @Override // f4.i
    public final void c(m mVar, int i) {
        a0 a0VarP = mVar.P(i, 1);
        this.f16587d = a0VarP;
        a0VarP.a(this.f16585b.f16140c);
    }

    @Override // f4.i
    public final void seek(long j10, long j11) {
        this.f16589f = j10;
        this.f16591h = j11;
    }
}
