package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f37538h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f37539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bw0 f37540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vs1 f37541l;

    public cw0(int i, int i10, int i11, int i12, int i13, int i14, int i15, long j10, bw0 bw0Var, vs1 vs1Var) {
        this.f37531a = i;
        this.f37532b = i10;
        this.f37533c = i11;
        this.f37534d = i12;
        this.f37535e = i13;
        this.f37536f = b(i13);
        this.f37537g = i14;
        this.f37538h = i15;
        this.i = a(i15);
        this.f37539j = j10;
        this.f37540k = bw0Var;
        this.f37541l = vs1Var;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j10;
        long j11;
        int i = this.f37534d;
        if (i > 0) {
            j10 = (((long) i) + ((long) this.f37533c)) / 2;
            j11 = 1;
        } else {
            int i10 = this.f37531a;
            j10 = ((((i10 != this.f37532b || i10 <= 0) ? 4096L : i10) * ((long) this.f37537g)) * ((long) this.f37538h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public final long b() {
        long j10 = this.f37539j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f37535e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.nx0 a(byte[] r4, yads.vs1 r5) {
        /*
            r3 = this;
            r0 = 4
            r1 = -128(0xffffffffffffff80, float:NaN)
            r4[r0] = r1
            int r0 = r3.f37534d
            if (r0 <= 0) goto La
            goto Lb
        La:
            r0 = -1
        Lb:
            yads.vs1 r1 = r3.f37541l
            if (r1 != 0) goto L10
            goto L28
        L10:
            if (r5 != 0) goto L13
            goto L18
        L13:
            yads.us1[] r5 = r5.f44117b
            int r2 = r5.length
            if (r2 != 0) goto L1a
        L18:
            r5 = r1
            goto L28
        L1a:
            yads.vs1 r2 = new yads.vs1
            yads.us1[] r1 = r1.f44117b
            java.lang.Object[] r5 = yads.lb3.a(r1, r5)
            yads.us1[] r5 = (yads.us1[]) r5
            r2.<init>(r5)
            r5 = r2
        L28:
            yads.mx0 r1 = new yads.mx0
            r1.<init>()
            java.lang.String r2 = "audio/flac"
            r1.f41075k = r2
            r1.f41076l = r0
            int r0 = r3.f37537g
            r1.f41088x = r0
            int r0 = r3.f37535e
            r1.f41089y = r0
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r1.f41077m = r4
            r1.i = r5
            yads.nx0 r4 = new yads.nx0
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cw0.a(byte[], yads.vs1):yads.nx0");
    }

    public cw0(int i, byte[] bArr) {
        kb2 kb2Var = new kb2(bArr);
        kb2Var.b(i * 8);
        this.f37531a = kb2Var.a(16);
        this.f37532b = kb2Var.a(16);
        this.f37533c = kb2Var.a(24);
        this.f37534d = kb2Var.a(24);
        int iA = kb2Var.a(20);
        this.f37535e = iA;
        this.f37536f = b(iA);
        this.f37537g = kb2Var.a(3) + 1;
        int iA2 = kb2Var.a(5) + 1;
        this.f37538h = iA2;
        this.i = a(iA2);
        this.f37539j = kb2Var.f();
        this.f37540k = null;
        this.f37541l = null;
    }

    public final long a(long j10) {
        long j11 = (j10 * ((long) this.f37535e)) / 1000000;
        long j12 = this.f37539j - 1;
        int i = lb3.f40466a;
        return Math.max(0L, Math.min(j11, j12));
    }
}
