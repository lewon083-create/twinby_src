package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l01 implements k01 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wz0 f7366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jd f7367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i21 f7368f;

    public l01(String str, String str2, jd jdVar, wz0 wz0Var, i21 i21Var) {
        this.f7364b = str;
        this.f7365c = str2;
        this.f7367e = jdVar;
        this.f7366d = wz0Var;
        this.f7368f = i21Var;
    }

    public abstract void a(Method method, jd jdVar);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        i21 i21Var = this.f7368f;
        try {
            i21Var.a();
            Method methodB = this.f7366d.b(this.f7364b, this.f7365c);
            if (methodB != null) {
                a(methodB, this.f7367e);
            }
            i21Var.c();
            return null;
        } finally {
        }
    }
}
