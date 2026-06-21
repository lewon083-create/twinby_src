package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sx extends TextureView implements ey {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx f10424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fy f10425c;

    public sx(Context context) {
        super(context);
        this.f10424b = new xx();
        this.f10425c = new fy(context, this);
    }

    public void A(String str, String[] strArr, Integer num) {
        f(str);
    }

    public abstract String d();

    public abstract void e(vx vxVar);

    public abstract void f(String str);

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract int j();

    public abstract int k();

    public abstract void l(int i);

    public abstract void m(float f10, float f11);

    public abstract int n();

    public abstract int p();

    public abstract long q();

    public abstract long r();

    public abstract long s();

    public abstract int t();

    public Integer z() {
        return null;
    }

    public void B(int i) {
    }

    public void C(int i) {
    }

    public void a(int i) {
    }

    public void b(int i) {
    }

    public void c(int i) {
    }
}
