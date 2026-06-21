package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wb1 extends androidx.datastore.preferences.protobuf.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11742c;

    public wb1(byte[] bArr, int i, int i10) throws InvalidKeyException {
        this.f11742c = i10;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f1433b = vb1.c(bArr);
        this.f1432a = i;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int[] A(int i, int[] iArr) {
        switch (this.f11742c) {
            case 0:
                int length = iArr.length;
                if (length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f1433b;
                int[] iArr4 = vb1.f11351a;
                int length2 = iArr4.length;
                System.arraycopy(iArr4, 0, iArr2, 0, length2);
                System.arraycopy(iArr3, 0, iArr2, length2, 8);
                iArr2[12] = i;
                System.arraycopy(iArr, 0, iArr2, 13, 3);
                return iArr2;
            default:
                int length3 = iArr.length;
                if (length3 != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length3 * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArrD = vb1.d((int[]) this.f1433b, iArr);
                int[] iArr6 = vb1.f11351a;
                int length4 = iArr6.length;
                System.arraycopy(iArr6, 0, iArr5, 0, length4);
                System.arraycopy(iArrD, 0, iArr5, length4, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int B() {
        switch (this.f11742c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
