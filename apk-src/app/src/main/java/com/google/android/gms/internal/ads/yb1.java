package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yb1 implements e91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f12579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12580c;

    public yb1(int i, byte[] bArr, byte[] bArr2) {
        this.f12578a = i;
        switch (i) {
            case 3:
                this.f12580c = new xb1(1, bArr);
                this.f12579b = bArr2;
                break;
            default:
                this.f12580c = new xb1(0, bArr);
                this.f12579b = bArr2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.f12578a;
        Object obj = this.f12580c;
        byte[] bArr3 = this.f12579b;
        switch (i) {
            case 0:
                e91 e91Var = (e91) obj;
                if (bArr3.length == 0) {
                    return e91Var.a(bArr, bArr2);
                }
                if (ge1.c(bArr3, bArr)) {
                    return e91Var.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            case 1:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                int length = bArr.length;
                int length2 = bArr3.length;
                if (length < length2 + 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!ge1.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                gb gbVar = ob1.f8663a;
                Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
                Cipher cipher = (Cipher) ob1.f8663a.get();
                cipher.init(2, (SecretKeySpec) obj, gCMParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
            case 2:
                int length3 = bArr3.length;
                if (length3 == 0) {
                    return b(bArr, bArr2);
                }
                if (ge1.c(bArr3, bArr)) {
                    return b(Arrays.copyOfRange(bArr, length3, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            default:
                int length4 = bArr3.length;
                if (length4 == 0) {
                    return c(bArr, bArr2);
                }
                if (ge1.c(bArr3, bArr)) {
                    return c(Arrays.copyOfRange(bArr, length4, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((xb1) this.f12580c).d(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((xb1) this.f12580c).d(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public yb1(e91 e91Var, byte[] bArr) {
        this.f12578a = 0;
        this.f12580c = e91Var;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f12579b = bArr;
    }

    public yb1(byte[] bArr, sl1 sl1Var) throws GeneralSecurityException {
        this.f12578a = 1;
        if (gr.x(2)) {
            gb gbVar = ob1.f8663a;
            gr.t(bArr.length);
            this.f12580c = new SecretKeySpec(bArr, "AES");
            this.f12579b = sl1Var.b();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
