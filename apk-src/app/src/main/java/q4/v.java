package q4;

import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.measurement.h5;
import j3.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f31771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0 f31772g;

    public v(int i, int i10, String str) {
        this.f31766a = i;
        this.f31767b = i10;
        this.f31768c = str;
    }

    @Override // q4.k
    public final int a(l lVar, e2 e2Var) {
        int i = this.f31770e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        a0 a0Var = this.f31772g;
        a0Var.getClass();
        int iC = a0Var.c(lVar, 1024, true);
        if (iC != -1) {
            this.f31769d += iC;
            return 0;
        }
        this.f31770e = 2;
        this.f31772g.f(0L, 1, this.f31769d, 0, null);
        this.f31769d = 0;
        return 0;
    }

    @Override // q4.k
    public final void b(m mVar) {
        this.f31771f = mVar;
        a0 a0VarP = mVar.P(1024, 4);
        this.f31772g = a0VarP;
        j3.n nVar = new j3.n();
        String str = this.f31768c;
        nVar.f26291l = c0.n(str);
        nVar.f26292m = c0.n(str);
        pe.a.q(nVar, a0VarP);
        this.f31771f.G();
        this.f31771f.j(new w());
        this.f31770e = 1;
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        int i = this.f31767b;
        int i10 = this.f31766a;
        h5.r((i10 == -1 || i == -1) ? false : true);
        m3.p pVar = new m3.p(i);
        ((h) lVar).y(pVar.f28589a, 0, i, false);
        return pVar.G() == i10;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        if (j10 == 0 || this.f31770e == 1) {
            this.f31770e = 1;
            this.f31769d = 0;
        }
    }

    @Override // q4.k
    public final void release() {
    }
}
