package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ln3 implements mn3 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f40614m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f40615n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, VKApiCodes.CODE_ACCESS_POLLS_WITHOUT_VOTE, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qq0 f40616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p73 f40617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pn3 f40618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f40620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lb2 f40621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f40622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nx0 f40623h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f40624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f40626l;

    public ln3(qq0 qq0Var, p73 p73Var, pn3 pn3Var) throws qb2 {
        this.f40616a = qq0Var;
        this.f40617b = p73Var;
        this.f40618c = pn3Var;
        int iMax = Math.max(1, pn3Var.f41963b / 10);
        this.f40622g = iMax;
        lb2 lb2Var = new lb2(pn3Var.f41966e);
        lb2Var.h();
        int iH = lb2Var.h();
        this.f40619d = iH;
        int i = pn3Var.f41962a;
        int i10 = (((pn3Var.f41964c - (i * 4)) * 8) / (pn3Var.f41965d * i)) + 1;
        if (iH != i10) {
            throw qb2.a("Expected frames per block: " + i10 + "; got: " + iH);
        }
        int iA = lb3.a(iMax, iH);
        this.f40620e = new byte[pn3Var.f41964c * iA];
        this.f40621f = new lb2(a(iH, i) * iA);
        int i11 = ((pn3Var.f41963b * pn3Var.f41964c) * 8) / iH;
        this.f40623h = new mx0().d("audio/raw").a(i11).e(i11).c(a(iMax, i)).b(pn3Var.f41962a).g(pn3Var.f41963b).d(2).a();
    }

    public static int a(int i, int i10) {
        return i * 2 * i10;
    }

    @Override // yads.mn3
    public final void a(int i, long j10) {
        this.f40616a.a(new sn3(this.f40618c, this.f40619d, i, j10));
        this.f40617b.a(this.f40623h);
    }

    @Override // yads.mn3
    public final void a(long j10) {
        this.i = 0;
        this.f40624j = j10;
        this.f40625k = 0;
        this.f40626l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:11:0x0040). Please report as a decompilation issue!!! */
    @Override // yads.mn3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(yads.ld0 r20, long r21) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ln3.a(yads.ld0, long):boolean");
    }
}
