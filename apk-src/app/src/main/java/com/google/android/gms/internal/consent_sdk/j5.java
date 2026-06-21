package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 extends k5 {
    @Override // com.google.android.gms.internal.consent_sdk.k5
    public final byte a(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return this.f13448c[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(l7.o.i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a0.u.k(i, "Index > length: ", ", 47"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.k5
    public final byte c(int i) {
        return this.f13448c[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.k5
    public final int e() {
        return 47;
    }
}
