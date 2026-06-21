package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sw1 extends c20 {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f10421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10422n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10423o;

    @Override // com.google.android.gms.internal.ads.t10
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f10420l);
        this.f10423o += (long) (iMin / this.f3995b.f7363d);
        this.f10420l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f10420l <= 0) {
            int i10 = i - iMin;
            int length = (this.f10422n + i10) - this.f10421m.length;
            ByteBuffer byteBufferG = g(length);
            int i11 = this.f10422n;
            String str = cq0.f4293a;
            int iMax = Math.max(0, Math.min(length, i11));
            byteBufferG.put(this.f10421m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i10));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferG.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i12 = i10 - iMax2;
            int i13 = this.f10422n - iMax;
            this.f10422n = i13;
            byte[] bArr = this.f10421m;
            System.arraycopy(bArr, iMax, bArr, 0, i13);
            byteBuffer.get(this.f10421m, this.f10422n, i12);
            this.f10422n += i12;
            byteBufferG.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final long b(long j10) {
        return Math.max(0L, j10 - cq0.t(this.f3995b.f7360a, this.f10418j + this.i));
    }

    @Override // com.google.android.gms.internal.ads.c20, com.google.android.gms.internal.ads.t10
    public final ByteBuffer c() {
        int i;
        if (super.k() && (i = this.f10422n) > 0) {
            g(i).put(this.f10421m, 0, this.f10422n).flip();
            this.f10422n = 0;
        }
        return super.c();
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final l00 h(l00 l00Var) throws i10 {
        if (!cq0.a(l00Var.f7362c)) {
            throw new i10("Unhandled input format:", l00Var);
        }
        this.f10419k = true;
        return (this.i == 0 && this.f10418j == 0) ? l00.f7359e : l00Var;
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final void j() {
        if (this.f10419k) {
            int i = this.f10422n;
            if (i > 0) {
                this.f10423o += (long) (i / this.f3995b.f7363d);
            }
            this.f10422n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.c20, com.google.android.gms.internal.ads.t10
    public final boolean k() {
        return super.k() && this.f10422n == 0;
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final void m() {
        if (this.f10419k) {
            this.f10419k = false;
            int i = this.f10418j;
            int i10 = this.f3995b.f7363d;
            this.f10421m = new byte[i * i10];
            this.f10420l = this.i * i10;
        }
        this.f10422n = 0;
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final void n() {
        this.f10421m = cq0.f4294b;
    }
}
