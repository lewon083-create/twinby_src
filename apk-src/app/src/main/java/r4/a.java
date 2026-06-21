package r4;

import com.google.android.gms.internal.ads.lg0;
import j3.d0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m3.z;
import q4.a0;
import q4.j;
import q4.k;
import q4.l;
import q4.m;
import q4.r;
import q4.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f32210q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f32211r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f32212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f32213t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f32215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f32217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32219f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32221h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f32222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a0 f32223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a0 f32224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t f32225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f32227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f32228p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f32214a = new byte[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32220g = -1;

    static {
        String str = z.f28608a;
        Charset charset = StandardCharsets.UTF_8;
        f32212s = "#!AMR\n".getBytes(charset);
        f32213t = "#!AMR-WB\n".getBytes(charset);
    }

    public a() {
        j jVar = new j();
        this.f32215b = jVar;
        this.f32224l = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[PHI: r4
      0x00eb: PHI (r4v1 q4.l) = (r4v0 q4.l), (r4v6 q4.l) binds: [B:53:0x00e9, B:56:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q4.l r18, com.google.android.gms.internal.ads.e2 r19) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.a.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // q4.k
    public final void b(m mVar) {
        this.f32222j = mVar;
        a0 a0VarP = mVar.P(0, 1);
        this.f32223k = a0VarP;
        this.f32224l = a0VarP;
        mVar.G();
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        return f(lVar);
    }

    public final int e(l lVar) throws d0 {
        boolean z5;
        lVar.L();
        byte[] bArr = this.f32214a;
        lVar.V(bArr, 0, 1);
        byte b2 = bArr[0];
        if ((b2 & 131) > 0) {
            throw d0.a(null, "Invalid padding bits for frame header " + ((int) b2));
        }
        int i = (b2 >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z5 = this.f32216c) && (i < 10 || i > 13)) || (!z5 && (i < 12 || i > 14)))) {
            return z5 ? f32211r[i] : f32210q[i];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f32216c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i);
        throw d0.a(null, sb2.toString());
    }

    public final boolean f(l lVar) {
        lVar.L();
        byte[] bArr = f32212s;
        byte[] bArr2 = new byte[bArr.length];
        lVar.V(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f32216c = false;
            lVar.M(bArr.length);
            return true;
        }
        lVar.L();
        byte[] bArr3 = f32213t;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.V(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f32216c = true;
        lVar.M(bArr3.length);
        return true;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        this.f32217d = 0L;
        this.f32218e = 0;
        this.f32219f = 0;
        this.f32227o = j11;
        t tVar = this.f32225m;
        if (!(tVar instanceof r)) {
            if (j10 == 0 || !(tVar instanceof j5.a)) {
                this.i = 0L;
                return;
            } else {
                j5.a aVar = (j5.a) tVar;
                this.i = (Math.max(0L, j10 - aVar.f26522b) * 8000000) / ((long) aVar.f26525e);
                return;
            }
        }
        r rVar = (r) tVar;
        lg0 lg0Var = rVar.f31759b;
        long jC = lg0Var.f7509a == 0 ? -9223372036854775807L : lg0Var.c(z.c(rVar.f31758a, j10));
        this.i = jC;
        if (Math.abs(this.f32227o - jC) < 20000) {
            return;
        }
        this.f32226n = true;
        this.f32224l = this.f32215b;
    }

    @Override // q4.k
    public final void release() {
    }
}
