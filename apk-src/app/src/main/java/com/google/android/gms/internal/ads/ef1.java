package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ef1 implements df1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final gb f4935e = new gb(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f4936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4938d;

    public ef1(byte[] bArr) throws GeneralSecurityException {
        gr.t(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f4936b = secretKeySpec;
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f4935e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrP = fs1.p(cipher.doFinal(new byte[16]));
        this.f4937c = bArrP;
        this.f4938d = fs1.p(bArrP);
    }

    @Override // com.google.android.gms.internal.ads.df1
    public final byte[] b(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrF;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f4935e.get();
        cipher.init(1, this.f4936b);
        int length = bArr.length;
        int i10 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i11 = i10 - 1;
        int i12 = i11 * 16;
        if (i10 * 16 == length) {
            bArrF = ix.F(i12, bArr, this.f4937c);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrF = ix.F(0, bArrCopyOf, this.f4938d);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i13 * 16;
            for (int i15 = 0; i15 < 16; i15++) {
                bArr3[i15] = (byte) (bArr2[i15] ^ bArr[i15 + i14]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i16 = 0; i16 < 16; i16++) {
            bArr3[i16] = (byte) (bArr2[i16] ^ bArrF[i16]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
