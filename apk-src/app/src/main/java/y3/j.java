package y3;

import ad.b1;
import ad.h0;
import ad.j0;
import android.net.Uri;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import m3.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends j4.m {
    public static final AtomicInteger N = new AtomicInteger();
    public final m3.p A;
    public final boolean B;
    public final boolean C;
    public b D;
    public q E;
    public int F;
    public boolean G;
    public volatile boolean H;
    public boolean I;
    public j0 J;
    public boolean K;
    public long L;
    public boolean M;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f36341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f36342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Uri f36343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f36344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f36345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p3.h f36346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p3.l f36347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f36348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f36349t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f36350u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w f36351v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f36352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f36353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j3.l f36354y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e5.i f36355z;

    public j(c cVar, p3.h hVar, p3.l lVar, j3.o oVar, boolean z5, p3.h hVar2, p3.l lVar2, boolean z10, Uri uri, List list, int i, Object obj, long j10, long j11, long j12, int i10, boolean z11, int i11, boolean z12, boolean z13, w wVar, j3.l lVar3, b bVar, e5.i iVar, m3.p pVar, boolean z14, boolean z15, t3.j jVar) {
        super(hVar, lVar, oVar, i, obj, j10, j11, j12);
        this.B = z5;
        this.f36345p = i10;
        this.L = z11 ? j11 - j10 : -9223372036854775807L;
        this.f36342m = i11;
        this.f36347r = lVar2;
        this.f36346q = hVar2;
        this.G = lVar2 != null;
        this.C = z10;
        this.f36343n = uri;
        this.f36349t = z13;
        this.f36351v = wVar;
        this.f36350u = z12;
        this.f36352w = cVar;
        this.f36353x = list;
        this.f36354y = lVar3;
        this.f36348s = bVar;
        this.f36355z = iVar;
        this.A = pVar;
        this.M = z14;
        this.f36344o = z15;
        h0 h0Var = j0.f818c;
        this.J = b1.f768f;
        this.f36341l = N.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (j4.x(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // j4.m
    public final boolean b() {
        throw null;
    }

    public final void c(p3.h hVar, p3.l lVar, boolean z5, boolean z10) {
        p3.l lVarC;
        boolean z11;
        long j10;
        if (z5) {
            z11 = this.F != 0;
            lVarC = lVar;
        } else {
            lVarC = lVar.c(this.F);
            z11 = false;
        }
        try {
            q4.h hVarH = h(hVar, lVarC, z10);
            if (z11) {
                hVarH.x(this.F, false);
            }
            while (!this.H && this.D.f36305a.a(hVarH, b.f36304f) == 0) {
                try {
                    try {
                    } catch (EOFException e3) {
                        if ((this.f26472e.f26328f & 16384) == 0) {
                            throw e3;
                        }
                        this.D.f36305a.seek(0L, 0L);
                        j10 = hVarH.f31739e;
                    }
                } catch (Throwable th2) {
                    this.F = (int) (hVarH.f31739e - lVar.f31177f);
                    throw th2;
                }
            }
            j10 = hVarH.f31739e;
            this.F = (int) (j10 - lVar.f31177f);
        } finally {
            j4.g(hVar);
        }
    }

    @Override // m4.k
    public final void d() {
        this.H = true;
    }

    public final int f(int i) {
        h5.r(!this.M);
        if (i >= this.J.size()) {
            return 0;
        }
        return ((Integer) this.J.get(i)).intValue();
    }

    public final boolean g() {
        return this.L != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[PHI: r16
      0x0080: PHI (r16v1 long) = (r16v0 long), (r16v3 long), (r16v3 long) binds: [B:40:0x00d0, B:22:0x007e, B:37:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q4.h h(p3.h r34, p3.l r35, boolean r36) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.j.h(p3.h, p3.l, boolean):q4.h");
    }

    @Override // m4.k
    public final void load() {
        b bVar;
        this.E.getClass();
        if (this.D == null && (bVar = this.f36348s) != null) {
            q4.k kVar = bVar.f36305a;
            if ((kVar instanceof x5.t) || (kVar instanceof k5.h)) {
                this.D = bVar;
                this.G = false;
            }
        }
        p3.l lVar = this.f36347r;
        p3.h hVar = this.f36346q;
        if (this.G) {
            hVar.getClass();
            lVar.getClass();
            c(hVar, lVar, this.C, false);
            this.F = 0;
            this.G = false;
        }
        if (this.H) {
            return;
        }
        if (!this.f36350u) {
            c(this.f26476j, this.f26470c, this.B, true);
        }
        this.I = !this.H;
    }
}
