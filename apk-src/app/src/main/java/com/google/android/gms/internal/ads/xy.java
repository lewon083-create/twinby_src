package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f12373d;

    public xy(sz szVar) {
        Context context = szVar.getContext();
        this.f12371b = context;
        this.f12372c = p9.k.C.f31297c.F(context, szVar.v().f34365b);
        this.f12373d = new WeakReference(szVar);
    }

    public abstract boolean b(String str);

    public boolean c(String str, String[] strArr) {
        return b(str);
    }

    public boolean e(String str, String[] strArr, py pyVar) {
        return b(str);
    }

    public abstract void k();

    public final void l(String str, String str2, String str3, String str4) {
        u9.d.f34372b.post(new wy(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void n(HashMap map) {
        sz szVar = (sz) this.f12373d.get();
        if (szVar != null) {
            szVar.c("onPrecacheEvent", map);
        }
    }

    public void a() {
    }

    public void f(int i) {
    }

    public void h(int i) {
    }

    public void i(int i) {
    }

    public void j(int i) {
    }
}
