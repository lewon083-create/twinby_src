package n5;

import com.google.android.gms.internal.measurement.h5;
import j3.c0;
import java.io.EOFException;
import m3.p;
import m3.z;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f29130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f29131b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f29136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j3.o f29137h;
    public boolean i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29133d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29134e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f29135f = z.f28609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f29132c = new p();

    public o(a0 a0Var, k kVar) {
        this.f29130a = a0Var;
        this.f29131b = kVar;
    }

    @Override // q4.a0
    public final void a(j3.o oVar) {
        oVar.f26335n.getClass();
        String str = oVar.f26335n;
        h5.h(c0.h(str) == 3);
        boolean zEquals = oVar.equals(this.f29137h);
        k kVar = this.f29131b;
        if (!zEquals) {
            this.f29137h = oVar;
            this.f29136g = kVar.c(oVar) ? kVar.b(oVar) : null;
        }
        m mVar = this.f29136g;
        a0 a0Var = this.f29130a;
        if (mVar == null) {
            a0Var.a(oVar);
            return;
        }
        j3.n nVarA = oVar.a();
        nVarA.f26292m = c0.n("application/x-media3-cues");
        nVarA.f26289j = str;
        nVarA.f26297r = Long.MAX_VALUE;
        nVarA.K = kVar.a(oVar);
        pe.a.q(nVarA, a0Var);
    }

    @Override // q4.a0
    public final void e(p pVar, int i, int i10) {
        if (this.f29136g == null) {
            this.f29130a.e(pVar, i, i10);
            return;
        }
        h(i);
        pVar.k(this.f29135f, this.f29134e, i);
        this.f29134e += i;
    }

    @Override // q4.a0
    public final void f(long j10, int i, int i10, int i11, q4.z zVar) {
        if (this.f29136g == null) {
            this.f29130a.f(j10, i, i10, i11, zVar);
            return;
        }
        h5.g("DRM on subtitles is not supported", zVar == null);
        int i12 = (this.f29134e - i11) - i10;
        try {
            this.f29136g.p(this.f29135f, i12, i10, l.f29124c, new n(this, j10, i));
        } catch (RuntimeException e3) {
            if (!this.i) {
                throw e3;
            }
            m3.b.t("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e3);
        }
        int i13 = i12 + i10;
        this.f29133d = i13;
        if (i13 == this.f29134e) {
            this.f29133d = 0;
            this.f29134e = 0;
        }
    }

    @Override // q4.a0
    public final int g(j3.h hVar, int i, boolean z5) throws EOFException {
        if (this.f29136g == null) {
            return this.f29130a.g(hVar, i, z5);
        }
        h(i);
        int i10 = hVar.read(this.f29135f, this.f29134e, i);
        if (i10 != -1) {
            this.f29134e += i10;
            return i10;
        }
        if (z5) {
            return -1;
        }
        throw new EOFException();
    }

    public final void h(int i) {
        int length = this.f29135f.length;
        int i10 = this.f29134e;
        if (length - i10 >= i) {
            return;
        }
        int i11 = i10 - this.f29133d;
        int iMax = Math.max(i11 * 2, i + i11);
        byte[] bArr = this.f29135f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f29133d, bArr2, 0, i11);
        this.f29133d = 0;
        this.f29134e = i11;
        this.f29135f = bArr2;
    }
}
