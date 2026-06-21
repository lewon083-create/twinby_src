package com.google.android.gms.internal.ads;

import com.yandex.varioqub.config.model.ConfigValue;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j20 implements s20, k3.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f6687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f6688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f6689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f6690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f6691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f6692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f6693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6694h;

    public j20(p30 p30Var) {
        this.f6694h = p30Var;
        int i = p30Var.f8909h;
        this.f6687a = new float[i];
        int i10 = i * p30Var.f8903b;
        this.f6688b = new float[i10];
        this.f6689c = new float[i10];
        this.f6690d = new float[i10];
    }

    @Override // k3.m
    public void A(int i) {
        this.f6690d = J(this.f6690d, ((p30) this.f6694h).f8911k, i);
    }

    @Override // k3.m
    public int B() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void C(int i, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            p30 p30Var = (p30) this.f6694h;
            if (i12 >= p30Var.f8909h / i10) {
                return;
            }
            double d10 = ConfigValue.DOUBLE_DEFAULT_VALUE;
            int i13 = 0;
            while (true) {
                int i14 = p30Var.f8903b;
                i11 = i14 * i10;
                if (i13 < i11) {
                    d10 += (double) this.f6688b[(i11 * i12) + (i14 * i) + i13];
                    i13++;
                }
            }
            this.f6687a[i12] = (float) (d10 / ((double) i11));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void D(int i, ByteBuffer byteBuffer) {
        p30 p30Var = (p30) this.f6694h;
        byteBuffer.asFloatBuffer().get(this.f6688b, p30Var.i * p30Var.f8903b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // k3.m
    public void E(int i) {
        this.f6688b = J(this.f6688b, ((p30) this.f6694h).i, i);
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void F(int i, int i10) {
        for (int i11 = 0; i11 < ((p30) this.f6694h).f8903b * i10; i11++) {
            this.f6688b[i + i11] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public int G(int i, int i10) {
        return L(this.f6687a, 0, i, i10);
    }

    @Override // k3.m
    public int H(int i, int i10) {
        return K(this.f6687a, 0, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void I(int i, ByteBuffer byteBuffer) {
        p30 p30Var = (p30) this.f6694h;
        byteBuffer.asFloatBuffer().put(this.f6689c, 0, p30Var.f8903b * i);
        byteBuffer.position((i * 4 * p30Var.f8903b) + byteBuffer.position());
    }

    public float[] J(float[] fArr, int i, int i10) {
        int length = fArr.length;
        int i11 = ((p30) this.f6694h).f8903b;
        int i12 = length / i11;
        return i + i10 <= i12 ? fArr : Arrays.copyOf(fArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public int K(float[] fArr, int i, int i10, int i11) {
        int i12 = ((p30) this.f6694h).f8903b * i;
        double d10 = 1.0d;
        int i13 = 0;
        double d11 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        int i14 = 255;
        int i15 = i10;
        while (i15 <= i11) {
            double dAbs = ConfigValue.DOUBLE_DEFAULT_VALUE;
            for (int i16 = 0; i16 < i15; i16++) {
                dAbs += (double) Math.abs(fArr[i12 + i16] - fArr[(i12 + i15) + i16]);
            }
            int i17 = i12;
            double d12 = i15;
            if (((double) i13) * dAbs < d10 * d12) {
                i13 = i15;
                d10 = dAbs;
            }
            if (((double) i14) * dAbs > d12 * d11) {
                i14 = i15;
                d11 = dAbs;
            }
            i15++;
            i12 = i17;
        }
        this.f6691e = d10 / ((double) i13);
        this.f6692f = d11 / ((double) i14);
        return i13;
    }

    public int L(float[] fArr, int i, int i10, int i11) {
        int i12 = 255;
        int i13 = 0;
        double d10 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        double d11 = 1.0d;
        int i14 = i10;
        while (true) {
            double d12 = i12;
            double d13 = i13;
            if (i14 > i11) {
                this.f6691e = d11 / d13;
                this.f6692f = d10 / d12;
                return i13;
            }
            int i15 = 0;
            double dAbs = ConfigValue.DOUBLE_DEFAULT_VALUE;
            while (i15 < i14) {
                int i16 = ((p30) this.f6694h).f8903b * i;
                dAbs += (double) Math.abs(fArr[i16 + i15] - fArr[(i16 + i14) + i15]);
                i15++;
                i12 = i12;
            }
            int i17 = i12;
            double d14 = d13 * dAbs;
            double d15 = i14;
            double d16 = d11 * d15;
            if (d14 < d16) {
                d11 = dAbs;
            }
            if (d14 < d16) {
                i13 = i14;
            }
            double d17 = d12 * dAbs;
            double d18 = d15 * d10;
            if (d17 > d18) {
                d10 = dAbs;
            }
            i12 = d17 > d18 ? i14 : i17;
            i14++;
        }
    }

    public float[] M(float[] fArr, int i, int i10) {
        p30 p30Var = (p30) this.f6694h;
        int length = fArr.length;
        int i11 = p30Var.f8903b;
        int i12 = length / i11;
        return i + i10 <= i12 ? fArr : Arrays.copyOf(fArr, (((i12 * 3) / 2) + i10) * i11);
    }

    @Override // k3.m
    public void a(int i, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f6688b;
        p30 p30Var = (p30) this.f6694h;
        floatBufferAsFloatBuffer.get(fArr, p30Var.i * p30Var.f8903b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // k3.m
    public void b(int i, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f6689c;
        p30 p30Var = (p30) this.f6694h;
        floatBufferAsFloatBuffer.put(fArr, 0, p30Var.f8903b * i);
        byteBuffer.position((i * 4 * p30Var.f8903b) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void c(int i) {
        this.f6688b = M(this.f6688b, ((p30) this.f6694h).i, i);
    }

    @Override // com.google.android.gms.internal.ads.s20
    public int d(int i, int i10, int i11) {
        return L(this.f6688b, i, i10, i11);
    }

    @Override // k3.m
    public void e(int i, long j10, long j11) {
        int i10 = 0;
        while (true) {
            p30 p30Var = (p30) this.f6694h;
            int i11 = p30Var.f8903b;
            if (i10 >= i11) {
                return;
            }
            float[] fArr = this.f6689c;
            int i12 = (p30Var.f8910j * i11) + i10;
            float[] fArr2 = this.f6690d;
            int i13 = (i * i11) + i10;
            float f10 = fArr2[i13];
            float f11 = fArr2[i13 + i11];
            long j12 = ((long) p30Var.f8913m) * j10;
            int i14 = p30Var.f8912l;
            long j13 = ((long) (i14 + 1)) * j11;
            long j14 = j13 - j12;
            fArr[i12] = (((r10 - j14) * f11) + (j14 * f10)) / (j13 - (((long) i14) * j11));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void f() {
        this.f6693g = this.f6691e;
    }

    @Override // k3.m
    public void flush() {
        this.f6693g = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f6691e = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f6692f = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    @Override // k3.m
    public void g(int i, int i10) {
        for (int i11 = 0; i11 < ((p30) this.f6694h).f8903b * i10; i11++) {
            this.f6688b[i + i11] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public int h() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void i(int i, long j10, long j11) {
        int i10 = 0;
        while (true) {
            p30 p30Var = (p30) this.f6694h;
            int i11 = p30Var.f8903b;
            if (i10 >= i11) {
                return;
            }
            float[] fArr = this.f6689c;
            int i12 = p30Var.f8910j;
            float[] fArr2 = this.f6690d;
            int i13 = (i * i11) + i10;
            float f10 = fArr2[i13];
            float f11 = fArr2[i13 + i11];
            long j12 = ((long) p30Var.f8913m) * j10;
            int i14 = p30Var.f8912l;
            long j13 = ((long) (i14 + 1)) * j11;
            long j14 = j13 - j12;
            fArr[(i12 * i11) + i10] = ((j14 * f10) + ((r12 - j14) * f11)) / (j13 - (((long) i14) * j11));
            i10++;
        }
    }

    @Override // k3.m
    public void j(int i, int i10) {
        p30 p30Var = (p30) this.f6694h;
        int i11 = p30Var.f8909h / i10;
        int i12 = p30Var.f8903b;
        int i13 = i10 * i12;
        int i14 = i * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            double d10 = ConfigValue.DOUBLE_DEFAULT_VALUE;
            for (int i16 = 0; i16 < i13; i16++) {
                d10 += (double) this.f6688b[(i15 * i13) + i14 + i16];
            }
            this.f6687a[i15] = (float) (d10 / ((double) i13));
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void k() {
        this.f6693g = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f6691e = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f6692f = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public boolean l() {
        double d10 = this.f6691e;
        return d10 != ConfigValue.DOUBLE_DEFAULT_VALUE && ((p30) this.f6694h).f8915o != 0 && this.f6692f <= d10 * 3.0d && d10 + d10 > this.f6693g * 3.0d;
    }

    @Override // k3.m
    public int m(int i, int i10, int i11) {
        return K(this.f6688b, i, i10, i11);
    }

    @Override // k3.m
    public void n() {
        this.f6693g = this.f6691e;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public /* synthetic */ Object o() {
        return this.f6689c;
    }

    @Override // k3.m
    public Object p() {
        return this.f6688b;
    }

    @Override // k3.m
    public Object q() {
        return this.f6689c;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void r(int i) {
        this.f6690d = M(this.f6690d, ((p30) this.f6694h).f8911k, i);
    }

    @Override // com.google.android.gms.internal.ads.s20
    public /* synthetic */ Object s() {
        return this.f6690d;
    }

    @Override // k3.m
    public void t(int i) {
        this.f6689c = J(this.f6689c, ((p30) this.f6694h).f8910j, i);
    }

    @Override // k3.m
    public boolean u() {
        double d10 = this.f6691e;
        return d10 != ConfigValue.DOUBLE_DEFAULT_VALUE && ((p30) this.f6694h).f8915o != 0 && this.f6692f <= d10 * 3.0d && d10 * 2.0d > this.f6693g * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void v(int i) {
        this.f6689c = M(this.f6689c, ((p30) this.f6694h).f8910j, i);
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void w(int i, int i10, int i11, int i12, int i13) {
        float[] fArr = this.f6689c;
        float[] fArr2 = this.f6688b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i; i18++) {
                fArr[i17] = ((fArr2[i16] * i18) + (fArr2[i15] * (i - i18))) / i;
                i17 += i10;
                i15 += i10;
                i16 += i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public /* synthetic */ Object x() {
        return this.f6688b;
    }

    @Override // k3.m
    public Object y() {
        return this.f6690d;
    }

    @Override // k3.m
    public void z(int i, int i10, int i11, int i12, int i13) {
        float[] fArr = this.f6689c;
        float[] fArr2 = this.f6688b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i; i18++) {
                fArr[i15] = ((fArr2[i16] * i18) + (fArr2[i17] * (i - i18))) / i;
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public j20(p30 p30Var, boolean z5) {
        this.f6694h = p30Var;
        int i = p30Var.f8909h;
        this.f6687a = new float[i];
        int i10 = i * p30Var.f8903b;
        this.f6688b = new float[i10];
        this.f6689c = new float[i10];
        this.f6690d = new float[i10];
    }
}
