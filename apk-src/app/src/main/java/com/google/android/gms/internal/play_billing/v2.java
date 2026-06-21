package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends w2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14339e;

    public v2(int i, byte[] bArr) {
        super(bArr);
        w2.f(0, i, bArr.length);
        this.f14339e = i;
    }

    @Override // com.google.android.gms.internal.play_billing.w2
    public final byte a(int i) {
        int i10 = this.f14339e;
        if (((i10 - (i + 1)) | i) >= 0) {
            return this.f14353c[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(l7.o.i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a0.u.j(i, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.w2
    public final byte c(int i) {
        return this.f14353c[i];
    }

    @Override // com.google.android.gms.internal.play_billing.w2
    public final int e() {
        return this.f14339e;
    }
}
