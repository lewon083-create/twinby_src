package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cl1 implements e91 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final gb f4248e = new gb(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df1 f4250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f4251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4252d;

    public cl1(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f4252d = i;
        int length = bArr.length;
        gr.t(length);
        this.f4251c = new SecretKeySpec(bArr, "AES");
        this.f4250b = fs1.v(bf1.h0(cf1.b(length), new xo0(9, sl1.a(bArr))));
        this.f4249a = bArr2;
    }

    public static cl1 b(ha1 ha1Var) throws GeneralSecurityException {
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        ha1Var.getClass();
        return new cl1(ha1Var.f6083d.f7167b, ((sl1) ha1Var.f6084e.f12221c).b(), ha1Var.f6085f.b());
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f4249a;
        int length2 = bArr3.length;
        int i = this.f4252d;
        int i10 = ((length - length2) - i) - 16;
        if (i10 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ge1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrC = c(0, length2, i, bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrC2 = c(1, 0, bArr2.length, bArr2);
        byte[] bArrC3 = c(2, length2 + i, i10, bArr);
        int i11 = length - 16;
        byte b2 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            b2 = (byte) (b2 | (((bArr[i11 + i12] ^ bArrC2[i12]) ^ bArrC[i12]) ^ bArrC3[i12]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f4248e.get();
        cipher.init(1, this.f4251c, new IvParameterSpec(bArrC));
        return cipher.doFinal(bArr, bArr3.length + i, i10);
    }

    public final byte[] c(int i, int i10, int i11, byte[] bArr) {
        byte[] bArr2 = new byte[i11 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i10, bArr2, 16, i11);
        return this.f4250b.b(16, bArr2);
    }
}
