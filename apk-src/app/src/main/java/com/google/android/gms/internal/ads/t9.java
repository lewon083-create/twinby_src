package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t9 implements u9 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f10527m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f10528n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, VKApiCodes.CODE_ACCESS_POLLS_WITHOUT_VOTE, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f10529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f10530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9 f10531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f10533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tk0 f10534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jx1 f10536h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10539l;

    public t9(b2 b2Var, w2 w2Var, x9 x9Var) throws eb {
        this.f10529a = b2Var;
        this.f10530b = w2Var;
        this.f10531c = x9Var;
        int i = x9Var.f12080b;
        int iMax = Math.max(1, i / 10);
        this.f10535g = iMax;
        tk0 tk0Var = new tk0(x9Var.f12083e);
        tk0Var.M();
        int iM = tk0Var.M();
        this.f10532d = iM;
        int i10 = x9Var.f12079a;
        int i11 = x9Var.f12081c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (x9Var.f12082d * i10)) + 1;
        if (iM != i12) {
            throw eb.a(null, pe.a.g(new StringBuilder(String.valueOf(i12).length() + 34 + String.valueOf(iM).length()), i12, "Expected frames per block: ", iM, "; got: "));
        }
        String str = cq0.f4293a;
        int i13 = ((iMax + iM) - 1) / iM;
        this.f10533e = new byte[i13 * i11];
        this.f10534f = new tk0((iM + iM) * i10 * i13);
        int i14 = ((i11 * i) * 8) / iM;
        ow1 ow1Var = new ow1();
        ow1Var.e("audio/raw");
        ow1Var.f8828g = i14;
        ow1Var.f8829h = i14;
        ow1Var.f8833m = (iMax + iMax) * i10;
        ow1Var.D = i10;
        ow1Var.E = i;
        ow1Var.F = 2;
        this.f10536h = new jx1(ow1Var);
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void a(int i, long j10) {
        this.f10529a.U(new y9(this.f10531c, this.f10532d, i, j10));
        this.f10530b.e(this.f10536h);
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void b(long j10) {
        this.i = 0;
        this.f10537j = j10;
        this.f10538k = 0;
        this.f10539l = 0L;
    }

    public final void c(int i) {
        x9 x9Var = this.f10531c;
        long jU = this.f10537j + cq0.u(this.f10539l, 1000000L, x9Var.f12080b, RoundingMode.DOWN);
        int i10 = (i + i) * x9Var.f12079a;
        this.f10530b.c(jU, 1, i10, this.f10538k - i10, null);
        this.f10539l += (long) i;
        this.f10538k -= i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0024->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.u9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(com.google.android.gms.internal.ads.a2 r25, long r26) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t9.d(com.google.android.gms.internal.ads.a2, long):boolean");
    }
}
