package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qw1 extends c20 {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f9615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f9618q;

    @Override // com.google.android.gms.internal.ads.t10
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f4000g.hasRemaining()) {
            if (this.f9612k != 0) {
                ix.k0(this.f9616o < this.f9615n.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > 1024) {
                        int i10 = this.i;
                        iLimit = (iPosition2 / i10) * i10;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i11 = this.f9616o;
                int i12 = this.f9617p;
                int i13 = i11 + i12;
                int length = this.f9615n.length;
                if (i13 < length) {
                    i = length - i13;
                } else {
                    i13 = i12 - (length - i11);
                    i = i11 - i13;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f9615n, i13, iMin);
                int i14 = this.f9617p + iMin;
                this.f9617p = i14;
                ix.k0(i14 <= this.f9615n.length);
                boolean z5 = iLimit < iLimit2 && iPosition3 < i;
                o(z5);
                if (z5) {
                    this.f9612k = 0;
                    this.f9614m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f9615n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit4) << 8) | (byteBuffer.get(iLimit4 - 1) & 255)) > 1024) {
                        int i15 = this.i;
                        iPosition = ((iLimit4 / i15) * i15) + i15;
                        break;
                    }
                    iLimit4 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f9612k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    g(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final l00 h(l00 l00Var) throws i10 {
        if (l00Var.f7362c == 2) {
            return l00Var.f7360a == -1 ? l00.f7359e : l00Var;
        }
        throw new i10("Unhandled input format:", l00Var);
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final void j() {
        if (this.f9617p > 0) {
            o(true);
            this.f9614m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.c20, com.google.android.gms.internal.ads.t10
    public final boolean l() {
        return super.l() && this.f9611j;
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final void m() {
        if (l()) {
            l00 l00Var = this.f3995b;
            int i = l00Var.f7361b;
            int i10 = i + i;
            this.i = i10;
            int i11 = ((((int) ((100000 * ((long) l00Var.f7360a)) / 1000000)) / 2) / i10) * i10;
            int i12 = i11 + i11;
            if (this.f9615n.length != i12) {
                this.f9615n = new byte[i12];
                this.f9618q = new byte[i12];
            }
        }
        this.f9612k = 0;
        this.f9613l = 0L;
        this.f9614m = 0;
        this.f9616o = 0;
        this.f9617p = 0;
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final void n() {
        this.f9611j = false;
        byte[] bArr = cq0.f4294b;
        this.f9615n = bArr;
        this.f9618q = bArr;
    }

    public final void o(boolean z5) {
        int i;
        int length;
        int i10 = this.f9617p;
        int length2 = this.f9615n.length;
        if (i10 != length2) {
            if (!z5) {
                return;
            } else {
                z5 = true;
            }
        }
        if (this.f9614m == 0) {
            if (z5) {
                q(i10, 3);
                length = i10;
            } else {
                ix.k0(i10 >= (length2 >> 1));
                length = this.f9615n.length >> 1;
                q(length, 0);
            }
            i = length;
        } else {
            int i11 = length2 >> 1;
            int i12 = i10 - i11;
            if (z5) {
                int iP = p(i12) + (this.f9615n.length >> 1);
                q(iP, 2);
                int i13 = i11 + i12;
                i = iP;
                length = i13;
            } else {
                int iP2 = p(i12);
                q(iP2, 1);
                i = iP2;
                length = i12;
            }
        }
        if (length % this.i != 0) {
            throw new IllegalStateException(gr.P("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        ix.k0(i10 >= i);
        this.f9617p -= length;
        int i14 = this.f9616o + length;
        this.f9616o = i14;
        this.f9616o = i14 % this.f9615n.length;
        int i15 = this.f9614m;
        int i16 = this.i;
        this.f9614m = (i / i16) + i15;
        this.f9613l += (long) ((length - i) / i16);
    }

    public final int p(int i) {
        int length = ((((int) ((2000000 * ((long) this.f3995b.f7360a)) / 1000000)) - this.f9614m) * this.i) - (this.f9615n.length >> 1);
        ix.k0(length >= 0);
        int iMin = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i10 = this.i;
        return (iMin / i10) * i10;
    }

    public final void q(int i, int i10) {
        int i11;
        if (i == 0) {
            return;
        }
        ix.o(this.f9617p >= i);
        if (i10 == 2) {
            int i12 = this.f9616o;
            int i13 = this.f9617p;
            int i14 = i12 + i13;
            byte[] bArr = this.f9615n;
            int length = bArr.length;
            if (i14 <= length) {
                System.arraycopy(bArr, i14 - i, this.f9618q, 0, i);
            } else {
                int i15 = i13 - (length - i12);
                if (i15 >= i) {
                    System.arraycopy(bArr, i15 - i, this.f9618q, 0, i);
                } else {
                    int i16 = i - i15;
                    System.arraycopy(bArr, length - i16, this.f9618q, 0, i16);
                    System.arraycopy(this.f9615n, 0, this.f9618q, i16, i15);
                }
            }
        } else {
            int i17 = this.f9616o;
            int i18 = i17 + i;
            byte[] bArr2 = this.f9615n;
            int length2 = bArr2.length;
            if (i18 <= length2) {
                System.arraycopy(bArr2, i17, this.f9618q, 0, i);
            } else {
                int i19 = length2 - i17;
                System.arraycopy(bArr2, i17, this.f9618q, 0, i19);
                System.arraycopy(this.f9615n, 0, this.f9618q, i19, i - i19);
            }
        }
        ix.Q(i, "sizeToOutput is not aligned to frame size: %s", i % this.i == 0);
        ix.k0(this.f9616o < this.f9615n.length);
        byte[] bArr3 = this.f9618q;
        ix.Q(i, "byteOutput size is not aligned to frame size %s", i % this.i == 0);
        if (i10 != 3) {
            for (int i20 = 0; i20 < i; i20 += 2) {
                int i21 = i20 + 1;
                int i22 = (bArr3[i21] << 8) | (bArr3[i20] & 255);
                if (i10 == 0) {
                    i11 = ((((i20 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i11 = 10;
                    if (i10 == 2) {
                        i11 = 10 + (((90000 * i20) / (i - 1)) / 1000);
                    }
                }
                int i23 = (i22 * i11) / 100;
                if (i23 >= 32767) {
                    bArr3[i20] = -1;
                    bArr3[i21] = 127;
                } else if (i23 <= -32768) {
                    bArr3[i20] = 0;
                    bArr3[i21] = -128;
                } else {
                    bArr3[i20] = (byte) (i23 & KotlinVersion.MAX_COMPONENT_VALUE);
                    bArr3[i21] = (byte) (i23 >> 8);
                }
            }
        }
        g(i).put(bArr3, 0, i).flip();
    }
}
