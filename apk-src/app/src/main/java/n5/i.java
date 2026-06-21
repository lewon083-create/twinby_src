package n5;

import com.google.android.gms.internal.measurement.h5;
import j3.c0;
import java.util.ArrayList;
import m3.p;
import m3.z;
import q4.a0;
import q4.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements q4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f29114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.o f29115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f29116c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f29119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29121h;
    public long[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f29122j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f29118e = z.f28609b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f29117d = new p();

    public i(m mVar, j3.o oVar) {
        j3.o oVar2;
        this.f29114a = mVar;
        if (oVar != null) {
            j3.n nVarA = oVar.a();
            nVarA.f26292m = c0.n("application/x-media3-cues");
            nVarA.f26289j = oVar.f26335n;
            nVarA.K = mVar.s();
            oVar2 = new j3.o(nVarA);
        } else {
            oVar2 = null;
        }
        this.f29115b = oVar2;
        this.f29116c = new ArrayList();
        this.f29121h = 0;
        this.i = z.f28610c;
        this.f29122j = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x007e A[EXC_TOP_SPLITTER, PHI: r22
      0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q4.l r21, com.google.android.gms.internal.ads.e2 r22) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.i.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // q4.k
    public final void b(q4.m mVar) {
        h5.r(this.f29121h == 0);
        a0 a0VarP = mVar.P(0, 3);
        this.f29119f = a0VarP;
        j3.o oVar = this.f29115b;
        if (oVar != null) {
            a0VarP.a(oVar);
            mVar.G();
            mVar.j(new r(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f29121h = 1;
    }

    @Override // q4.k
    public final boolean d(q4.l lVar) {
        return true;
    }

    public final void e(h hVar) {
        this.f29119f.getClass();
        byte[] bArr = hVar.f29113c;
        int length = bArr.length;
        p pVar = this.f29117d;
        pVar.getClass();
        pVar.K(bArr.length, bArr);
        this.f29119f.d(length, pVar);
        this.f29119f.f(hVar.f29112b, 1, length, 0, null);
    }

    @Override // q4.k
    public final void release() {
        if (this.f29121h == 5) {
            return;
        }
        this.f29114a.reset();
        this.f29121h = 5;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        int i = this.f29121h;
        h5.r((i == 0 || i == 5) ? false : true);
        this.f29122j = j11;
        if (this.f29121h == 2) {
            this.f29121h = 1;
        }
        if (this.f29121h == 4) {
            this.f29121h = 3;
        }
    }
}
