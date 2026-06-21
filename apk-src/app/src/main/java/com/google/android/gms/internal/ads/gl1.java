package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gl1 implements e91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl1 f5850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nl1 f5851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f5853d;

    public gl1(bl1 bl1Var, nl1 nl1Var, int i, byte[] bArr) {
        this.f5850a = bl1Var;
        this.f5851b = nl1Var;
        this.f5852c = i;
        this.f5853d = bArr;
    }

    public static gl1 b(aa1 aa1Var) {
        byte[] bArrB = ((sl1) aa1Var.f2823e.f12221c).b();
        ga1 ga1Var = aa1Var.f2822d;
        bl1 bl1Var = new bl1(ga1Var.f5747c, bArrB);
        String strValueOf = String.valueOf(ga1Var.f5750f);
        fc fcVar = new fc("HMAC".concat(strValueOf), new SecretKeySpec(((sl1) aa1Var.f2824f.f12221c).b(), "HMAC"));
        int i = ga1Var.f5748d;
        return new gl1(bl1Var, new nl1(fcVar, i), i, aa1Var.f2825g.b());
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f5853d;
        int length2 = bArr3.length;
        int i = this.f5852c;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!ge1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i10 = length - i;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i10, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrS = ix.s(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8));
        nl1 nl1Var = this.f5851b;
        int i11 = nl1Var.f8362b;
        df1 df1Var = nl1Var.f8361a;
        byte[] bArr4 = nl1Var.f8363c;
        byte[] bArr5 = nl1Var.f8364d;
        if (!MessageDigest.isEqual(bArr5.length > 0 ? ix.s(bArr4, df1Var.b(i11, ix.s(bArrS, bArr5))) : ix.s(bArr4, df1Var.b(i11, bArrS)), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        bl1 bl1Var = this.f5850a;
        int i12 = bl1Var.f3815b;
        if (length3 < i12) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i12];
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 0, i12);
        int i13 = length3 - i12;
        byte[] bArr7 = new byte[i13];
        Cipher cipher = (Cipher) bl1.f3813d.get();
        byte[] bArr8 = new byte[bl1Var.f3816c];
        System.arraycopy(bArr6, 0, bArr8, 0, i12);
        cipher.init(2, bl1Var.f3814a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(bArrCopyOfRange, i12, i13, bArr7, 0) == i13) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
