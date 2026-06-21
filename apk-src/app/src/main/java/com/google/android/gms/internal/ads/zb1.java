package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zb1 implements e91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df1 f12947c;

    public zb1(byte[] bArr, sl1 sl1Var, int i) {
        this.f12947c = fs1.v(bf1.h0(cf1.b(bArr.length), new xo0(9, sl1.a(bArr))));
        this.f12945a = sl1Var.b();
        this.f12946b = i;
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f12945a;
        int length2 = bArr3.length;
        int i = this.f12946b + length2;
        int i10 = i + 28;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ge1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        byte[] bArr6 = new byte[32];
        df1 df1Var = this.f12947c;
        System.arraycopy(df1Var.b(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(df1Var.b(16, bArr5), 0, bArr6, 16, 16);
        if (!gr.x(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        gb gbVar = ob1.f8663a;
        gr.t(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i11 = i + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i, i11);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrCopyOfRange2, 0, 12);
        Cipher cipher = (Cipher) ob1.f8663a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i11, length - i11);
    }
}
