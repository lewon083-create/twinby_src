package com.google.android.gms.internal.ads;

import com.yandex.varioqub.config.model.ConfigValue;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w30 implements t10 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f11614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f11615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l00 f11616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l00 f11617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l00 f11618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l00 f11619h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p30 f11620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f11621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ByteBuffer f11622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11625o;

    @Override // com.google.android.gms.internal.ads.t10
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            p30 p30Var = this.f11620j;
            p30Var.getClass();
            this.f11623m += (long) byteBuffer.remaining();
            s20 s20Var = (s20) p30Var.f8917q;
            int iRemaining = byteBuffer.remaining();
            int iH = iRemaining / (s20Var.h() * p30Var.f8903b);
            s20Var.c(iH);
            s20Var.D(iRemaining, byteBuffer);
            p30Var.i += iH;
            p30Var.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final long b(long j10) {
        if (this.f11624n < 1024) {
            return (long) (j10 / ((double) this.f11614c));
        }
        long j11 = this.f11623m;
        p30 p30Var = this.f11620j;
        p30Var.getClass();
        long jH = j11 - ((long) (((s20) p30Var.f8917q).h() * (p30Var.i * p30Var.f8903b)));
        int i = this.f11619h.f7360a;
        int i10 = this.f11618g.f7360a;
        return i == i10 ? cq0.u(j10, this.f11624n, jH, RoundingMode.DOWN) : cq0.u(j10, this.f11624n * ((long) i10), jH * ((long) i), RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final ByteBuffer c() {
        p30 p30Var = this.f11620j;
        if (p30Var != null) {
            s20 s20Var = (s20) p30Var.f8917q;
            int i = p30Var.f8903b;
            ix.k0(p30Var.f8910j >= 0);
            int iH = s20Var.h() * p30Var.f8910j * i;
            if (iH > 0) {
                if (this.f11621k.capacity() < iH) {
                    this.f11621k = ByteBuffer.allocateDirect(iH).order(ByteOrder.nativeOrder());
                } else {
                    this.f11621k.clear();
                }
                ByteBuffer byteBuffer = this.f11621k;
                ix.k0(p30Var.f8910j >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (s20Var.h() * i), p30Var.f8910j);
                s20Var.I(iMin, byteBuffer);
                p30Var.f8910j -= iMin;
                System.arraycopy(s20Var.o(), iMin * i, s20Var.o(), 0, p30Var.f8910j * i);
                this.f11621k.flip();
                this.f11624n += (long) iH;
                this.f11622l = this.f11621k;
            }
        }
        ByteBuffer byteBuffer2 = this.f11622l;
        this.f11622l = t10.f10463a;
        return byteBuffer2;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void d() {
        this.f11614c = 1.0f;
        this.f11615d = 1.0f;
        l00 l00Var = l00.f7359e;
        this.f11616e = l00Var;
        this.f11617f = l00Var;
        this.f11618g = l00Var;
        this.f11619h = l00Var;
        ByteBuffer byteBuffer = t10.f10463a;
        this.f11621k = byteBuffer;
        this.f11622l = byteBuffer;
        this.f11613b = -1;
        this.i = false;
        this.f11620j = null;
        this.f11623m = 0L;
        this.f11624n = 0L;
        this.f11625o = false;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final l00 e(l00 l00Var) throws i10 {
        int i = l00Var.f7362c;
        if (i != 2 && i != 4) {
            throw new i10("Unhandled input format:", l00Var);
        }
        int i10 = this.f11613b;
        if (i10 == -1) {
            i10 = l00Var.f7360a;
        }
        this.f11616e = l00Var;
        l00 l00Var2 = new l00(i10, l00Var.f7361b, i);
        this.f11617f = l00Var2;
        this.i = true;
        return l00Var2;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void f() {
        if (l()) {
            l00 l00Var = this.f11616e;
            this.f11618g = l00Var;
            l00 l00Var2 = this.f11617f;
            this.f11619h = l00Var2;
            if (this.i) {
                this.f11620j = new p30(l00Var.f7360a, l00Var.f7361b, this.f11614c, this.f11615d, l00Var2.f7360a, l00Var.f7362c == 4, 0);
            } else {
                p30 p30Var = this.f11620j;
                if (p30Var != null) {
                    p30Var.i = 0;
                    p30Var.f8910j = 0;
                    p30Var.f8911k = 0;
                    p30Var.f8912l = 0;
                    p30Var.f8913m = 0;
                    p30Var.f8914n = 0;
                    p30Var.f8915o = 0;
                    p30Var.f8916p = ConfigValue.DOUBLE_DEFAULT_VALUE;
                    ((s20) p30Var.f8917q).k();
                }
            }
        }
        this.f11622l = t10.f10463a;
        this.f11623m = 0L;
        this.f11624n = 0L;
        this.f11625o = false;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void i() {
        p30 p30Var = this.f11620j;
        if (p30Var != null) {
            int i = p30Var.i;
            int i10 = p30Var.f8914n;
            int i11 = p30Var.f8910j;
            float f10 = p30Var.f8904c;
            float f11 = p30Var.f8905d;
            int i12 = i11 + ((int) ((((((((double) (i - i10)) / ((double) (f10 / f11))) + ((double) i10)) + p30Var.f8916p) + ((double) p30Var.f8911k)) / ((double) (p30Var.f8906e * f11))) + 0.5d));
            p30Var.f8916p = ConfigValue.DOUBLE_DEFAULT_VALUE;
            int i13 = p30Var.f8909h;
            int i14 = i13 + i13;
            s20 s20Var = (s20) p30Var.f8917q;
            s20Var.c(i + i14);
            s20Var.F(i * p30Var.f8903b, i14);
            p30Var.i += i14;
            p30Var.d();
            if (p30Var.f8910j > i12) {
                p30Var.f8910j = Math.max(i12, 0);
            }
            p30Var.i = 0;
            p30Var.f8914n = 0;
            p30Var.f8911k = 0;
        }
        this.f11625o = true;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final boolean k() {
        if (this.f11625o) {
            p30 p30Var = this.f11620j;
            if (p30Var != null) {
                ix.k0(p30Var.f8910j >= 0);
                if (((s20) p30Var.f8917q).h() * p30Var.f8910j * p30Var.f8903b != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final boolean l() {
        if (this.f11617f.f7360a != -1) {
            return Math.abs(this.f11614c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f11615d + (-1.0f)) >= 1.0E-4f || this.f11617f.f7360a != this.f11616e.f7360a;
        }
        return false;
    }
}
