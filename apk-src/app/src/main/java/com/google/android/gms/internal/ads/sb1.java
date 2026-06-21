package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sb1 implements e91 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f10236d = vv.q("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f10237e = vv.q("070000004041424344454647");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f10238f = vv.q("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f10239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f10241c;

    public sb1(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f10239a = new SecretKeySpec(bArr, "ChaCha20");
        this.f10240b = bArr2;
        this.f10241c = provider;
    }

    public static Cipher b() {
        Cipher cipher = (Cipher) il1.f6534b.f6540a.b("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f10237e);
            byte[] bArr = f10236d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f10238f;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f10240b;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ge1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, length2, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f10241c);
        cipher.init(2, this.f10239a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
