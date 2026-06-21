package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1[] f13291a;

    public v0(a1... a1VarArr) {
        this.f13291a = a1VarArr;
    }

    @Override // com.google.android.gms.internal.auth.a1
    public final j1 c(Class cls) {
        for (int i = 0; i < 2; i++) {
            a1 a1Var = this.f13291a[i];
            if (a1Var.d(cls)) {
                return a1Var.c(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.a1
    public final boolean d(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f13291a[i].d(cls)) {
                return true;
            }
        }
        return false;
    }
}
