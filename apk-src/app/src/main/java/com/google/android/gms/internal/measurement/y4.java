package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 extends z4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14095e;

    public y4(int i, byte[] bArr) {
        super(bArr);
        z4.g(0, i, bArr.length);
        this.f14095e = i;
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final byte a(int i) {
        int i10 = this.f14095e;
        if (((i10 - (i + 1)) | i) >= 0) {
            return this.f14116c[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(l7.o.j(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
        }
        throw new ArrayIndexOutOfBoundsException(pe.a.g(new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i10).length()), i, "Index > length: ", i10, ", "));
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final byte c(int i) {
        return this.f14116c[i];
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final int e() {
        return this.f14095e;
    }
}
