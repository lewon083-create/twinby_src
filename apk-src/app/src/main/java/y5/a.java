package y5;

import com.google.android.gms.internal.ads.x9;
import com.vk.api.sdk.exceptions.VKApiCodes;
import j3.c0;
import j3.d0;
import j3.n;
import j3.o;
import java.math.RoundingMode;
import m3.p;
import m3.z;
import q4.a0;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f36458m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f36459n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, VKApiCodes.CODE_ACCESS_POLLS_WITHOUT_VOTE, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f36460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f36461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9 f36462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f36464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f36465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f36467h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f36468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f36470l;

    public a(m mVar, a0 a0Var, x9 x9Var) throws d0 {
        this.f36460a = mVar;
        this.f36461b = a0Var;
        this.f36462c = x9Var;
        int i = x9Var.f12080b;
        int iMax = Math.max(1, i / 10);
        this.f36466g = iMax;
        p pVar = new p(x9Var.f12083e);
        pVar.s();
        int iS = pVar.s();
        this.f36463d = iS;
        int i10 = x9Var.f12079a;
        int i11 = x9Var.f12081c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (x9Var.f12082d * i10)) + 1;
        if (iS != i12) {
            throw d0.a(null, "Expected frames per block: " + i12 + "; got: " + iS);
        }
        int iG = z.g(iMax, iS);
        this.f36464e = new byte[iG * i11];
        this.f36465f = new p(iS * 2 * i10 * iG);
        int i13 = ((i11 * i) * 8) / iS;
        n nVar = new n();
        nVar.f26292m = c0.n("audio/raw");
        nVar.f26288h = i13;
        nVar.i = i13;
        nVar.f26293n = iMax * 2 * i10;
        nVar.E = i10;
        nVar.F = i;
        nVar.G = 2;
        this.f36467h = new o(nVar);
    }

    public final void a(int i) {
        long j10 = this.f36468j;
        long j11 = this.f36470l;
        x9 x9Var = this.f36462c;
        long j12 = x9Var.f12080b;
        String str = z.f28608a;
        long jU = j10 + z.U(j11, 1000000L, j12, RoundingMode.DOWN);
        int i10 = i * 2 * x9Var.f12079a;
        this.f36461b.f(jU, 1, i10, this.f36469k - i10, null);
        this.f36470l += (long) i;
        this.f36469k -= i10;
    }

    @Override // y5.b
    public final void c(long j10) {
        this.i = 0;
        this.f36468j = j10;
        this.f36469k = 0;
        this.f36470l = 0L;
    }

    @Override // y5.b
    public final void e(int i, long j10) {
        e eVar = new e(this.f36462c, this.f36463d, i, j10);
        this.f36460a.j(eVar);
        o oVar = this.f36467h;
        a0 a0Var = this.f36461b;
        a0Var.a(oVar);
        a0Var.b(eVar.f36484e);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // y5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(q4.l r25, long r26) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.a.f(q4.l, long):boolean");
    }
}
