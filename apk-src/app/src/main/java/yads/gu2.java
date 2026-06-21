package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gu2 implements fq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko2 f38876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fq2 f38877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j53 f38878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final im0 f38879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ip f38880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final en0 f38881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u7 f38882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s33 f38883h;
    public final fy2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qd2 f38884j;

    public gu2(ct1 ct1Var, fq2 fq2Var, j53 j53Var, im0 im0Var, ip ipVar, en0 en0Var, u7 u7Var, s33 s33Var, fy2 fy2Var, qd2 qd2Var) {
        this.f38876a = ct1Var;
        this.f38877b = fq2Var;
        this.f38878c = j53Var;
        this.f38879d = im0Var;
        this.f38880e = ipVar;
        this.f38881f = en0Var;
        this.f38882g = u7Var;
        this.f38883h = s33Var;
        this.i = fy2Var;
        this.f38884j = qd2Var;
    }

    public static Integer a(String str, JSONObject jSONObject) {
        Object objS;
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            ij.k kVar = ij.m.f21341c;
            objS = Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        return (Integer) (objS instanceof ij.l ? null : objS);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    @Override // yads.fq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(yads.yp2 r101) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gu2.a(yads.yp2):java.lang.Object");
    }
}
