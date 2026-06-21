package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Looper f6269b;

    public hv0(Context context, Looper looper) {
        this.f6268a = context;
        this.f6269b = looper;
    }

    public final void a(String str) {
        mv0 mv0VarZ = nv0.z();
        Context context = this.f6268a;
        String packageName = context.getPackageName();
        mv0VarZ.b();
        ((nv0) mv0VarZ.f9560c).A(packageName);
        mv0VarZ.b();
        ((nv0) mv0VarZ.f9560c).C(2);
        jv0 jv0VarZ = lv0.z();
        jv0VarZ.b();
        ((lv0) jv0VarZ.f9560c).A(str);
        jv0VarZ.b();
        ((lv0) jv0VarZ.f9560c).B(2);
        mv0VarZ.b();
        ((nv0) mv0VarZ.f9560c).B((lv0) jv0VarZ.d());
        tr0 tr0Var = new tr0(context, this.f6269b, (nv0) mv0VarZ.d());
        synchronized (tr0Var.f10705f) {
            try {
                if (!tr0Var.f10701b) {
                    tr0Var.f10701b = true;
                    ((rv0) tr0Var.f10703d).d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
