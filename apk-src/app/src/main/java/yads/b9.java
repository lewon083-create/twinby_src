package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8 f36963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8 f36964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8 f36965c;

    public b9(p8 p8Var, q8 q8Var, z8 z8Var) {
        this.f36963a = p8Var;
        this.f36964b = q8Var;
        this.f36965c = z8Var;
    }

    public final a9 a(Context context) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            pt2 pt2VarA = fw2.a().a(context);
            f8 f8VarA = pt2VarA != null ? pt2VarA.a() : null;
            if (f8VarA == null || !f8VarA.a()) {
                objS = new w7();
            } else {
                this.f36964b.getClass();
                q8.a(f8VarA);
                this.f36963a.getClass();
                p8.a();
                objS = new w7();
            }
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        Throwable thA = ij.m.a(objS);
        if (thA != null) {
            thA.getMessage();
            objS = new w7();
        }
        return (a9) objS;
    }
}
