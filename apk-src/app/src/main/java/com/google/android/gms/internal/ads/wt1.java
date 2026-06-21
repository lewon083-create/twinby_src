package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface wt1 {
    void a(fv1 fv1Var);

    void b(fv1 fv1Var);

    long c();

    default boolean d() {
        rs.r("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    boolean e(vt1 vt1Var);

    void f(fv1 fv1Var);

    boolean g(vt1 vt1Var);

    void h(vt1 vt1Var, d[] dVarArr);

    i i(fv1 fv1Var);
}
