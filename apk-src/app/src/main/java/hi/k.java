package hi;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f20614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f20615h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s7.g f20616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String[] f20617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k[] f20618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Locale[] f20619m;

    public k(boolean z5, boolean z10, boolean z11, boolean z12, boolean z13, int i, l lVar, Integer num, String str, s7.g gVar, String[] strArr, k[] kVarArr, Locale[] localeArr) {
        this.f20608a = z5;
        this.f20609b = z10;
        this.f20610c = z11;
        this.f20611d = z12;
        this.f20612e = z13;
        this.f20613f = i;
        this.f20614g = lVar;
        this.f20615h = num;
        this.i = str;
        this.f20616j = gVar;
        this.f20617k = strArr;
        this.f20618l = kVarArr;
        this.f20619m = localeArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 hi.k, still in use, count: 2, list:
          (r8v1 hi.k) from 0x021e: PHI (r8v2 hi.k) = (r8v1 hi.k), (r8v4 hi.k) binds: [B:120:0x0211, B:312:0x04fc] A[DONT_GENERATE, DONT_INLINE]
          (r8v1 hi.k) from 0x01e8: MOVE (r30v5 hi.k) = (r8v1 hi.k) (LINE:489)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static hi.k a(org.json.JSONObject r35) {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.k.a(org.json.JSONObject):hi.k");
    }
}
