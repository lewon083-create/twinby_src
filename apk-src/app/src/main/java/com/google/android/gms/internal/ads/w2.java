package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface w2 {
    default void a(int i, tk0 tk0Var) {
        b(tk0Var, i, 0);
    }

    void b(tk0 tk0Var, int i, int i10);

    void c(long j10, int i, int i10, int i11, v2 v2Var);

    int d(ct1 ct1Var, int i, boolean z5);

    void e(jx1 jx1Var);

    default int f(ct1 ct1Var, int i, boolean z5) {
        return d(ct1Var, i, z5);
    }
}
