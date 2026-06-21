package s4;

import com.google.android.gms.internal.measurement.h5;
import java.math.RoundingMode;
import m3.z;
import q4.a0;
import q4.s;
import q4.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f32757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f32758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f32761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32764h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f32767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f32768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f32769n;

    public e(int i, d dVar, a0 a0Var) {
        int i10 = dVar.f32754d;
        this.f32757a = dVar;
        int iA = dVar.a();
        boolean z5 = true;
        if (iA != 1 && iA != 2) {
            z5 = false;
        }
        h5.h(z5);
        int i11 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f32759c = (iA == 2 ? 1667497984 : 1651965952) | i11;
        long j10 = ((long) dVar.f32752b) * 1000000;
        long j11 = dVar.f32753c;
        String str = z.f28608a;
        this.f32761e = z.U(i10, j10, j11, RoundingMode.DOWN);
        this.f32758b = a0Var;
        this.f32760d = iA == 2 ? i11 | 1650720768 : -1;
        this.f32767l = -1L;
        this.f32768m = new long[512];
        this.f32769n = new int[512];
        this.f32762f = i10;
    }

    public final u a(int i) {
        return new u(((this.f32761e * ((long) 1)) / ((long) this.f32762f)) * ((long) this.f32769n[i]), this.f32768m[i]);
    }

    public final s b(long j10) {
        if (this.f32766k == 0) {
            u uVar = new u(0L, this.f32767l);
            return new s(uVar, uVar);
        }
        int i = (int) (j10 / ((this.f32761e * ((long) 1)) / ((long) this.f32762f)));
        int iE = z.e(this.f32769n, i, true, true);
        if (this.f32769n[iE] == i) {
            u uVarA = a(iE);
            return new s(uVarA, uVarA);
        }
        u uVarA2 = a(iE);
        int i10 = iE + 1;
        return i10 < this.f32768m.length ? new s(uVarA2, a(i10)) : new s(uVarA2, uVarA2);
    }
}
