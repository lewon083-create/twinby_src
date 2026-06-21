package k3;

import com.google.android.gms.internal.ads.p30;
import com.google.android.gms.internal.measurement.h5;
import com.yandex.varioqub.config.model.ConfigValue;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f26876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f26877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f26878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f26879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f26880h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p30 f26881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f26882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ByteBuffer f26883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f26884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f26885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26886o;

    @Override // k3.k
    public final ByteBuffer a() {
        p30 p30Var = this.f26881j;
        if (p30Var != null) {
            m mVar = (m) p30Var.f8917q;
            int i = p30Var.f8903b;
            h5.r(p30Var.f8910j >= 0);
            int iB = mVar.B() * p30Var.f8910j * i;
            if (iB > 0) {
                if (this.f26882k.capacity() < iB) {
                    this.f26882k = ByteBuffer.allocateDirect(iB).order(ByteOrder.nativeOrder());
                } else {
                    this.f26882k.clear();
                }
                ByteBuffer byteBuffer = this.f26882k;
                h5.r(p30Var.f8910j >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (mVar.B() * i), p30Var.f8910j);
                mVar.b(iMin, byteBuffer);
                p30Var.f8910j -= iMin;
                System.arraycopy(mVar.q(), iMin * i, mVar.q(), 0, p30Var.f8910j * i);
                this.f26882k.flip();
                this.f26885n += (long) iB;
                this.f26883l = this.f26882k;
            }
        }
        ByteBuffer byteBuffer2 = this.f26883l;
        this.f26883l = k.f26866a;
        return byteBuffer2;
    }

    @Override // k3.k
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            p30 p30Var = this.f26881j;
            p30Var.getClass();
            this.f26884m += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = p30Var.f8903b;
            m mVar = (m) p30Var.f8917q;
            int iB = iRemaining / (mVar.B() * i);
            mVar.E(iB);
            mVar.a(iRemaining, byteBuffer);
            p30Var.i += iB;
            p30Var.b();
        }
    }

    @Override // k3.k
    public final void c() {
        p30 p30Var = this.f26881j;
        if (p30Var != null) {
            int i = p30Var.i;
            float f10 = p30Var.f8904c;
            float f11 = p30Var.f8905d;
            double d10 = f10 / f11;
            double d11 = p30Var.f8906e * f11;
            int i10 = p30Var.f8914n;
            int i11 = p30Var.f8910j + ((int) ((((((((double) (i - i10)) / d10) + ((double) i10)) + p30Var.f8916p) + ((double) p30Var.f8911k)) / d11) + 0.5d));
            p30Var.f8916p = ConfigValue.DOUBLE_DEFAULT_VALUE;
            m mVar = (m) p30Var.f8917q;
            int i12 = p30Var.f8909h * 2;
            mVar.E(i12 + i);
            mVar.g(i * p30Var.f8903b, i12);
            p30Var.i = i12 + p30Var.i;
            p30Var.b();
            if (p30Var.f8910j > i11) {
                p30Var.f8910j = Math.max(i11, 0);
            }
            p30Var.i = 0;
            p30Var.f8914n = 0;
            p30Var.f8911k = 0;
        }
        this.f26886o = true;
    }

    @Override // k3.k
    public final long d(long j10) {
        if (this.f26885n < 1024) {
            return (long) (j10 / ((double) this.f26875c));
        }
        long j11 = this.f26884m;
        p30 p30Var = this.f26881j;
        p30Var.getClass();
        long jB = j11 - ((long) (((m) p30Var.f8917q).B() * (p30Var.i * p30Var.f8903b)));
        int i = this.f26880h.f26860a;
        int i10 = this.f26879g.f26860a;
        return i == i10 ? z.U(j10, this.f26885n, jB, RoundingMode.DOWN) : z.U(j10, this.f26885n * ((long) i10), jB * ((long) i), RoundingMode.DOWN);
    }

    @Override // k3.k
    public final h e(h hVar) throws j {
        int i = hVar.f26862c;
        if (i != 2 && i != 4) {
            throw new j(hVar);
        }
        int i10 = this.f26874b;
        if (i10 == -1) {
            i10 = hVar.f26860a;
        }
        this.f26877e = hVar;
        h hVar2 = new h(i10, hVar.f26861b, i);
        this.f26878f = hVar2;
        this.i = true;
        return hVar2;
    }

    @Override // k3.k
    public final void flush() {
        if (isActive()) {
            h hVar = this.f26877e;
            this.f26879g = hVar;
            h hVar2 = this.f26878f;
            this.f26880h = hVar2;
            if (this.i) {
                this.f26881j = new p30(hVar.f26860a, hVar.f26861b, this.f26875c, this.f26876d, hVar2.f26860a, hVar.f26862c == 4, 1);
            } else {
                p30 p30Var = this.f26881j;
                if (p30Var != null) {
                    p30Var.i = 0;
                    p30Var.f8910j = 0;
                    p30Var.f8911k = 0;
                    p30Var.f8912l = 0;
                    p30Var.f8913m = 0;
                    p30Var.f8914n = 0;
                    p30Var.f8915o = 0;
                    p30Var.f8916p = ConfigValue.DOUBLE_DEFAULT_VALUE;
                    ((m) p30Var.f8917q).flush();
                }
            }
        }
        this.f26883l = k.f26866a;
        this.f26884m = 0L;
        this.f26885n = 0L;
        this.f26886o = false;
    }

    @Override // k3.k
    public final boolean isActive() {
        if (this.f26878f.f26860a != -1) {
            return Math.abs(this.f26875c - 1.0f) >= 1.0E-4f || Math.abs(this.f26876d - 1.0f) >= 1.0E-4f || this.f26878f.f26860a != this.f26877e.f26860a;
        }
        return false;
    }

    @Override // k3.k
    public final boolean isEnded() {
        if (this.f26886o) {
            p30 p30Var = this.f26881j;
            if (p30Var != null) {
                h5.r(p30Var.f8910j >= 0);
                if (((m) p30Var.f8917q).B() * p30Var.f8910j * p30Var.f8903b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // k3.k
    public final void reset() {
        this.f26875c = 1.0f;
        this.f26876d = 1.0f;
        h hVar = h.f26859e;
        this.f26877e = hVar;
        this.f26878f = hVar;
        this.f26879g = hVar;
        this.f26880h = hVar;
        ByteBuffer byteBuffer = k.f26866a;
        this.f26882k = byteBuffer;
        this.f26883l = byteBuffer;
        this.f26874b = -1;
        this.i = false;
        this.f26881j = null;
        this.f26884m = 0L;
        this.f26885n = 0L;
        this.f26886o = false;
    }
}
