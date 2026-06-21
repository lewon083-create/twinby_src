package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y82 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v82 f44950d = new v82();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile y82 f44951e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g03 f44952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ek0 f44953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sa3 f44954c;

    public y82(Context context, l31 l31Var) {
        x82 x82VarA = a(context);
        ep2 ep2VarB = b(context);
        w82 w82Var = new w82(x82VarA);
        this.f44954c = new sa3(x82VarA, l31Var);
        this.f44952a = new g03(ep2VarB, w82Var, l31Var);
        this.f44953b = new ek0(ep2VarB, context);
    }

    public static x82 a(Context context) {
        int i;
        try {
            int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / ((long) 1024));
            i = iMaxMemory / 8;
            int i10 = ((int) (((r6.widthPixels * r6.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024)) * 3;
            if (i > i10) {
                i = i10;
            }
        } catch (IllegalArgumentException unused) {
            i = 5120;
        }
        return new x82(i >= 5120 ? i : 5120);
    }

    public final g03 b() {
        return this.f44952a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.ep2 b(android.content.Context r2) {
        /*
            yads.gw2 r0 = yads.fw2.a()
            yads.pt2 r0 = r0.a(r2)
            if (r0 == 0) goto L1d
            java.lang.Integer r0 = r0.f42052s0
            if (r0 == 0) goto L1d
            int r1 = r0.intValue()
            if (r1 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1d
            int r0 = r0.intValue()
            goto L1e
        L1d:
            r0 = 4
        L1e:
            yads.ep2 r2 = yads.fp2.a(r2, r0)
            r2.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.y82.b(android.content.Context):yads.ep2");
    }

    public final ek0 a() {
        return this.f44953b;
    }
}
