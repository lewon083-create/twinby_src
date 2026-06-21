package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c20 implements t10 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l00 f3995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l00 f3996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l00 f3997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l00 f3998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f3999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f4000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4001h;

    public c20() {
        ByteBuffer byteBuffer = t10.f10463a;
        this.f3999f = byteBuffer;
        this.f4000g = byteBuffer;
        l00 l00Var = l00.f7359e;
        this.f3997d = l00Var;
        this.f3998e = l00Var;
        this.f3995b = l00Var;
        this.f3996c = l00Var;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f4000g;
        this.f4000g = t10.f10463a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void d() {
        ByteBuffer byteBuffer = t10.f10463a;
        this.f4000g = byteBuffer;
        this.f4001h = false;
        this.f3999f = byteBuffer;
        l00 l00Var = l00.f7359e;
        this.f3997d = l00Var;
        this.f3998e = l00Var;
        this.f3995b = l00Var;
        this.f3996c = l00Var;
        n();
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final l00 e(l00 l00Var) {
        this.f3997d = l00Var;
        this.f3998e = h(l00Var);
        return l() ? this.f3998e : l00.f7359e;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void f() {
        this.f4000g = t10.f10463a;
        this.f4001h = false;
        this.f3995b = this.f3997d;
        this.f3996c = this.f3998e;
        m();
    }

    public final ByteBuffer g(int i) {
        if (this.f3999f.capacity() < i) {
            this.f3999f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f3999f.clear();
        }
        ByteBuffer byteBuffer = this.f3999f;
        this.f4000g = byteBuffer;
        return byteBuffer;
    }

    public abstract l00 h(l00 l00Var);

    @Override // com.google.android.gms.internal.ads.t10
    public final void i() {
        this.f4001h = true;
        j();
    }

    @Override // com.google.android.gms.internal.ads.t10
    public boolean k() {
        return this.f4001h && this.f4000g == t10.f10463a;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public boolean l() {
        return this.f3998e != l00.f7359e;
    }

    public void j() {
    }

    public void m() {
    }

    public void n() {
    }
}
