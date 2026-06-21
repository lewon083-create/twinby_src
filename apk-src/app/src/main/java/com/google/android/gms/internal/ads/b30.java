package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.concurrent.Executors;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b30 implements s20, k3.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f3574h;

    public b30(p30 p30Var) {
        this.f3574h = p30Var;
        int i = p30Var.f8909h;
        this.f3567a = new short[i];
        int i10 = i * p30Var.f8903b;
        this.f3568b = new short[i10];
        this.f3569c = new short[i10];
        this.f3570d = new short[i10];
    }

    @Override // k3.m
    public void A(int i) {
        this.f3570d = J((short[]) this.f3570d, ((p30) this.f3574h).f8911k, i);
    }

    @Override // k3.m
    public int B() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void C(int i, int i10) {
        int i11;
        short[] sArr = (short[]) this.f3568b;
        int i12 = 0;
        while (true) {
            p30 p30Var = (p30) this.f3574h;
            if (i12 >= p30Var.f8909h / i10) {
                return;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = p30Var.f8903b;
                i11 = i15 * i10;
                if (i13 < i11) {
                    i14 += sArr[(i11 * i12) + (i15 * i) + i13];
                    i13++;
                }
            }
            ((short[]) this.f3567a)[i12] = (short) (i14 / i11);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void D(int i, ByteBuffer byteBuffer) {
        p30 p30Var = (p30) this.f3574h;
        byteBuffer.asShortBuffer().get((short[]) this.f3568b, p30Var.i * p30Var.f8903b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // k3.m
    public void E(int i) {
        this.f3568b = J((short[]) this.f3568b, ((p30) this.f3574h).i, i);
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void F(int i, int i10) {
        for (int i11 = 0; i11 < ((p30) this.f3574h).f8903b * i10; i11++) {
            ((short[]) this.f3568b)[i + i11] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public int G(int i, int i10) {
        return L((short[]) this.f3567a, 0, i, i10);
    }

    @Override // k3.m
    public int H(int i, int i10) {
        return K((short[]) this.f3567a, 0, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void I(int i, ByteBuffer byteBuffer) {
        p30 p30Var = (p30) this.f3574h;
        byteBuffer.asShortBuffer().put((short[]) this.f3569c, 0, p30Var.f8903b * i);
        byteBuffer.position(((i + i) * p30Var.f8903b) + byteBuffer.position());
    }

    public short[] J(short[] sArr, int i, int i10) {
        int length = sArr.length;
        int i11 = ((p30) this.f3574h).f8903b;
        int i12 = length / i11;
        return i + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public int K(short[] sArr, int i, int i10, int i11) {
        int i12 = i * ((p30) this.f3574h).f8903b;
        int i13 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                iAbs += Math.abs(sArr[i12 + i17] - sArr[(i12 + i10) + i17]);
            }
            if (iAbs * i15 < i14 * i10) {
                i15 = i10;
                i14 = iAbs;
            }
            if (iAbs * i13 > i16 * i10) {
                i13 = i10;
                i16 = iAbs;
            }
            i10++;
        }
        this.f3571e = i14 / i15;
        this.f3572f = i16 / i13;
        return i15;
    }

    public int L(short[] sArr, int i, int i10, int i11) {
        int i12 = 1;
        int i13 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i14 = 0;
        int i15 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = ((p30) this.f3574h).f8903b * i;
                iAbs += Math.abs(sArr[i17 + i16] - sArr[(i17 + i10) + i16]);
            }
            int i18 = iAbs * i14;
            int i19 = i12 * i10;
            if (i18 < i19) {
                i12 = iAbs;
            }
            if (i18 < i19) {
                i14 = i10;
            }
            int i20 = iAbs * i13;
            int i21 = i15 * i10;
            if (i20 > i21) {
                i15 = iAbs;
            }
            if (i20 > i21) {
                i13 = i10;
            }
            i10++;
        }
        this.f3571e = i12 / i14;
        this.f3572f = i15 / i13;
        return i14;
    }

    public short[] M(short[] sArr, int i, int i10) {
        p30 p30Var = (p30) this.f3574h;
        int length = sArr.length;
        int i11 = p30Var.f8903b;
        int i12 = length / i11;
        return i + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    @Override // k3.m
    public void a(int i, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.f3568b;
        p30 p30Var = (p30) this.f3574h;
        shortBufferAsShortBuffer.get(sArr, p30Var.i * p30Var.f8903b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // k3.m
    public void b(int i, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.f3569c;
        p30 p30Var = (p30) this.f3574h;
        shortBufferAsShortBuffer.put(sArr, 0, p30Var.f8903b * i);
        byteBuffer.position((i * 2 * p30Var.f8903b) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void c(int i) {
        this.f3568b = M((short[]) this.f3568b, ((p30) this.f3574h).i, i);
    }

    @Override // com.google.android.gms.internal.ads.s20
    public int d(int i, int i10, int i11) {
        return L((short[]) this.f3568b, i, i10, i11);
    }

    @Override // k3.m
    public void e(int i, long j10, long j11) {
        int i10 = 0;
        while (true) {
            p30 p30Var = (p30) this.f3574h;
            int i11 = p30Var.f8903b;
            if (i10 >= i11) {
                return;
            }
            short[] sArr = (short[]) this.f3569c;
            int i12 = (p30Var.f8910j * i11) + i10;
            short[] sArr2 = (short[]) this.f3570d;
            int i13 = (i * i11) + i10;
            short s10 = sArr2[i13];
            short s11 = sArr2[i13 + i11];
            long j12 = ((long) p30Var.f8913m) * j10;
            int i14 = p30Var.f8912l;
            long j13 = ((long) (i14 + 1)) * j11;
            long j14 = j13 - j12;
            long j15 = j13 - (((long) i14) * j11);
            sArr[i12] = (short) ((((j15 - j14) * ((long) s11)) + (((long) s10) * j14)) / j15);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void f() {
        this.f3573g = this.f3571e;
    }

    @Override // k3.m
    public void flush() {
        this.f3573g = 0;
        this.f3571e = 0;
        this.f3572f = 0;
    }

    @Override // k3.m
    public void g(int i, int i10) {
        for (int i11 = 0; i11 < ((p30) this.f3574h).f8903b * i10; i11++) {
            ((short[]) this.f3568b)[i + i11] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public int h() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void i(int i, long j10, long j11) {
        int i10 = 0;
        while (true) {
            p30 p30Var = (p30) this.f3574h;
            int i11 = p30Var.f8903b;
            if (i10 >= i11) {
                return;
            }
            short[] sArr = (short[]) this.f3569c;
            int i12 = p30Var.f8910j;
            short[] sArr2 = (short[]) this.f3570d;
            int i13 = (i * i11) + i10;
            short s10 = sArr2[i13];
            short s11 = sArr2[i13 + i11];
            long j12 = ((long) p30Var.f8913m) * j10;
            int i14 = p30Var.f8912l;
            long j13 = ((long) i14) * j11;
            long j14 = ((long) (i14 + 1)) * j11;
            int i15 = i10;
            long j15 = j14 - j13;
            long j16 = j14 - j12;
            sArr[(i12 * i11) + i15] = (short) ((((j15 - j16) * ((long) s11)) + (j16 * ((long) s10))) / j15);
            i10 = i15 + 1;
        }
    }

    @Override // k3.m
    public void j(int i, int i10) {
        short[] sArr = (short[]) this.f3568b;
        p30 p30Var = (p30) this.f3574h;
        int i11 = p30Var.f8909h / i10;
        int i12 = p30Var.f8903b;
        int i13 = i10 * i12;
        int i14 = i * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            ((short[]) this.f3567a)[i15] = (short) (i16 / i13);
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void k() {
        this.f3573g = 0;
        this.f3571e = 0;
        this.f3572f = 0;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public boolean l() {
        int i = this.f3571e;
        return i != 0 && ((p30) this.f3574h).f8915o != 0 && this.f3572f <= i * 3 && i + i > this.f3573g * 3;
    }

    @Override // k3.m
    public int m(int i, int i10, int i11) {
        return K((short[]) this.f3568b, i, i10, i11);
    }

    @Override // k3.m
    public void n() {
        this.f3573g = this.f3571e;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public /* synthetic */ Object o() {
        return (short[]) this.f3569c;
    }

    @Override // k3.m
    public Object p() {
        return (short[]) this.f3568b;
    }

    @Override // k3.m
    public Object q() {
        return (short[]) this.f3569c;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void r(int i) {
        this.f3570d = M((short[]) this.f3570d, ((p30) this.f3574h).f8911k, i);
    }

    @Override // com.google.android.gms.internal.ads.s20
    public /* synthetic */ Object s() {
        return (short[]) this.f3570d;
    }

    @Override // k3.m
    public void t(int i) {
        this.f3569c = J((short[]) this.f3569c, ((p30) this.f3574h).f8910j, i);
    }

    @Override // k3.m
    public boolean u() {
        int i = this.f3571e;
        return i != 0 && ((p30) this.f3574h).f8915o != 0 && this.f3572f <= i * 3 && i * 2 > this.f3573g * 3;
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void v(int i) {
        this.f3569c = M((short[]) this.f3569c, ((p30) this.f3574h).f8910j, i);
    }

    @Override // com.google.android.gms.internal.ads.s20
    public void w(int i, int i10, int i11, int i12, int i13) {
        short[] sArr = (short[]) this.f3569c;
        short[] sArr2 = (short[]) this.f3568b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i; i18++) {
                sArr[i17] = (short) (((sArr2[i16] * i18) + ((i - i18) * sArr2[i15])) / i);
                i17 += i10;
                i15 += i10;
                i16 += i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s20
    public /* synthetic */ Object x() {
        return (short[]) this.f3568b;
    }

    @Override // k3.m
    public Object y() {
        return (short[]) this.f3570d;
    }

    @Override // k3.m
    public void z(int i, int i10, int i11, int i12, int i13) {
        short[] sArr = (short[]) this.f3569c;
        short[] sArr2 = (short[]) this.f3568b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i; i18++) {
                sArr[i15] = (short) (((sArr2[i16] * i18) + ((i - i18) * sArr2[i17])) / i);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public b30(l7.b bVar) {
        this.f3567a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new l7.a(false));
        this.f3568b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new l7.a(true));
        String str = l7.v.f28057a;
        this.f3569c = new l7.u();
        this.f3570d = new l7.i(0);
        this.f3574h = new m7.a(0);
        this.f3571e = 4;
        this.f3572f = Integer.MAX_VALUE;
        this.f3573g = 20;
    }

    public b30(p30 p30Var, boolean z5) {
        this.f3574h = p30Var;
        int i = p30Var.f8909h;
        this.f3567a = new short[i];
        int i10 = i * p30Var.f8903b;
        this.f3568b = new short[i10];
        this.f3569c = new short[i10];
        this.f3570d = new short[i10];
    }
}
