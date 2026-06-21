package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8863a;

    public oz0(int i, byte[] bArr) {
        switch (i) {
            case 1:
                this.f8863a = bArr;
                break;
            default:
                this.f8863a = new byte[256];
                for (int i10 = 0; i10 < 256; i10++) {
                    this.f8863a[i10] = (byte) i10;
                }
                int i11 = 0;
                for (int i12 = 0; i12 < 256; i12++) {
                    byte[] bArr2 = this.f8863a;
                    byte b2 = bArr2[i12];
                    i11 = (i11 + b2 + bArr[i12 % bArr.length]) & KotlinVersion.MAX_COMPONENT_VALUE;
                    bArr2[i12] = bArr2[i11];
                    bArr2[i11] = b2;
                }
                break;
        }
    }
}
