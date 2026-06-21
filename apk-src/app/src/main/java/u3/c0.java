package u3;

import com.google.android.gms.internal.measurement.h5;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends k3.l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f34089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f34090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f34091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f34092q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f34094s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f34097v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f34093r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f34095t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f34096u = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f34087l = 100000;
    public final float i = 0.2f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f34088m = 2000000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f34086k = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final short f34085j = 1024;

    public c0() {
        byte[] bArr = m3.z.f28609b;
        this.f34094s = bArr;
        this.f34097v = bArr;
    }

    @Override // k3.k
    public final void b(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f26872g.hasRemaining()) {
            int i = this.f34091p;
            short s10 = this.f34085j;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f34094s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s10) {
                        int i10 = this.f34089n;
                        iPosition = ((iLimit3 / i10) * i10) + i10;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f34091p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                h5.r(this.f34095t < this.f34094s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s10) {
                        int i11 = this.f34089n;
                        iLimit = (iPosition2 / i11) * i11;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f34095t;
                int i12 = this.f34096u;
                int length2 = length + i12;
                byte[] bArr = this.f34094s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i12 - (bArr.length - length);
                }
                int i13 = length - length2;
                boolean z5 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i13);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f34094s, length2, iMin);
                int i14 = this.f34096u + iMin;
                this.f34096u = i14;
                h5.r(i14 <= this.f34094s.length);
                boolean z10 = z5 && iPosition3 < i13;
                l(z10);
                if (z10) {
                    this.f34091p = 0;
                    this.f34093r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // k3.l
    public final k3.h f(k3.h hVar) throws k3.j {
        if (hVar.f26862c == 2) {
            return hVar.f26860a == -1 ? k3.h.f26859e : hVar;
        }
        throw new k3.j(hVar);
    }

    @Override // k3.l
    public final void g() {
        if (isActive()) {
            k3.h hVar = this.f26867b;
            int i = hVar.f26861b * 2;
            this.f34089n = i;
            int i10 = ((((int) ((this.f34087l * ((long) hVar.f26860a)) / 1000000)) / 2) / i) * i * 2;
            if (this.f34094s.length != i10) {
                this.f34094s = new byte[i10];
                this.f34097v = new byte[i10];
            }
        }
        this.f34091p = 0;
        this.f34092q = 0L;
        this.f34093r = 0;
        this.f34095t = 0;
        this.f34096u = 0;
    }

    @Override // k3.l
    public final void h() {
        if (this.f34096u > 0) {
            l(true);
            this.f34093r = 0;
        }
    }

    @Override // k3.l
    public final void i() {
        this.f34090o = false;
        byte[] bArr = m3.z.f28609b;
        this.f34094s = bArr;
        this.f34097v = bArr;
    }

    @Override // k3.l, k3.k
    public final boolean isActive() {
        return super.isActive() && this.f34090o;
    }

    public final int k(int i) {
        int length = ((((int) ((this.f34088m * ((long) this.f26867b.f26860a)) / 1000000)) - this.f34093r) * this.f34089n) - (this.f34094s.length / 2);
        h5.r(length >= 0);
        int iMin = (int) Math.min((i * this.i) + 0.5f, length);
        int i10 = this.f34089n;
        return (iMin / i10) * i10;
    }

    public final void l(boolean z5) {
        int length;
        int iK;
        int i = this.f34096u;
        byte[] bArr = this.f34094s;
        if (i == bArr.length || z5) {
            if (this.f34093r == 0) {
                if (z5) {
                    m(i, 3);
                    length = i;
                } else {
                    h5.r(i >= bArr.length / 2);
                    length = this.f34094s.length / 2;
                    m(length, 0);
                }
                iK = length;
            } else if (z5) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iK2 = k(length2) + (this.f34094s.length / 2);
                m(iK2, 2);
                iK = iK2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iK = k(length);
                m(iK, 1);
            }
            if (!(length % this.f34089n == 0)) {
                throw new IllegalStateException(hl.d.q("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
            }
            h5.r(i >= iK);
            this.f34096u -= length;
            int i10 = this.f34095t + length;
            this.f34095t = i10;
            this.f34095t = i10 % this.f34094s.length;
            int i11 = this.f34093r;
            int i12 = this.f34089n;
            this.f34093r = (iK / i12) + i11;
            this.f34092q += (long) ((length - iK) / i12);
        }
    }

    public final void m(int i, int i10) {
        if (i == 0) {
            return;
        }
        h5.h(this.f34096u >= i);
        if (i10 == 2) {
            int i11 = this.f34095t;
            int i12 = this.f34096u;
            int i13 = i11 + i12;
            byte[] bArr = this.f34094s;
            if (i13 <= bArr.length) {
                System.arraycopy(bArr, i13 - i, this.f34097v, 0, i);
            } else {
                int length = i12 - (bArr.length - i11);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f34097v, 0, i);
                } else {
                    int i14 = i - length;
                    System.arraycopy(bArr, bArr.length - i14, this.f34097v, 0, i14);
                    System.arraycopy(this.f34094s, 0, this.f34097v, i14, length);
                }
            }
        } else {
            int i15 = this.f34095t;
            int i16 = i15 + i;
            byte[] bArr2 = this.f34094s;
            if (i16 <= bArr2.length) {
                System.arraycopy(bArr2, i15, this.f34097v, 0, i);
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr2, i15, this.f34097v, 0, length2);
                System.arraycopy(this.f34094s, 0, this.f34097v, length2, i - length2);
            }
        }
        h5.e(i, "sizeToOutput is not aligned to frame size: %s", i % this.f34089n == 0);
        h5.r(this.f34095t < this.f34094s.length);
        byte[] bArr3 = this.f34097v;
        h5.e(i, "byteOutput size is not aligned to frame size %s", i % this.f34089n == 0);
        if (i10 != 3) {
            for (int i17 = 0; i17 < i; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & 255);
                int i20 = this.f34086k;
                if (i10 == 0) {
                    i20 = ((((i17 * 1000) / (i - 1)) * (i20 - 100)) / 1000) + 100;
                } else if (i10 == 2) {
                    i20 += (((i17 * 1000) * (100 - i20)) / (i - 1)) / 1000;
                }
                int i21 = (i19 * i20) / 100;
                if (i21 >= 32767) {
                    bArr3[i17] = -1;
                    bArr3[i18] = 127;
                } else if (i21 <= -32768) {
                    bArr3[i17] = 0;
                    bArr3[i18] = -128;
                } else {
                    bArr3[i17] = (byte) (i21 & KotlinVersion.MAX_COMPONENT_VALUE);
                    bArr3[i18] = (byte) (i21 >> 8);
                }
            }
        }
        j(i).put(bArr3, 0, i).flip();
    }
}
