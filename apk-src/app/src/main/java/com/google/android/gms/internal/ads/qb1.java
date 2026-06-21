package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qb1 implements e91 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f9433d = vv.q("7a806c");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f9434e = vv.q("46bb91c3c5");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f9435f = vv.q("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f9436g = vv.q("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f9437h = vv.q("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cc1 f9438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f9439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9440c;

    public qb1(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        cc1 cc1Var = cc1.f4165g;
        this.f9440c = bArr2;
        gr.t(bArr.length);
        this.f9439b = new SecretKeySpec(bArr, "AES");
        this.f9438a = cc1Var;
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = f9436g;
            cipher.init(2, new SecretKeySpec(f9435f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f9434e);
            byte[] bArr2 = f9437h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f9433d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f9440c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ge1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        this.f9438a.getClass();
        try {
            Cipher cipher = (Cipher) ec1.f4919a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            cipher.init(2, this.f9439b, new GCMParameterSpec(128, bArr, length2, 12));
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
        } catch (IllegalStateException e3) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e3);
        }
    }
}
