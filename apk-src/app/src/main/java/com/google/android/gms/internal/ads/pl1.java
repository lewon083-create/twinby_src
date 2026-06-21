package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pl1 implements q91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f9098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ll1 f9099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ll1 f9100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f9102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f9103f;

    public /* synthetic */ pl1(RSAPublicKey rSAPublicKey, ll1 ll1Var, ll1 ll1Var2, int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (gc1.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        gr.F(ll1Var);
        if (!ll1Var.equals(ll1Var2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        gr.K(rSAPublicKey.getModulus().bitLength());
        gr.Q(rSAPublicKey.getPublicExponent());
        this.f9098a = rSAPublicKey;
        this.f9099b = ll1Var;
        this.f9100c = ll1Var2;
        this.f9101d = i;
        this.f9102e = bArr;
        this.f9103f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.q91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f9102e;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!ge1.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.f9098a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrC = fs1.C(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        ll1 ll1Var = this.f9099b;
        gr.F(ll1Var);
        il1 il1Var = il1.f6537e;
        MessageDigest messageDigest = (MessageDigest) il1Var.f6540a.b(ix.v(ll1Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f9103f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrC.length;
        int i = this.f9101d;
        if (length < digestLength + i + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrC[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i10 = length - digestLength;
        int i11 = i10 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrC, i11);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrC, length2, length2 + digestLength);
        int i12 = 0;
        while (true) {
            long j10 = (((long) length) * 8) - ((long) iBitLength3);
            if (i12 < j10) {
                if (((bArrCopyOf[i12 / 8] >> (7 - (i12 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i12++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) il1Var.f6540a.b(ix.v(this.f9100c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i11];
                int i13 = 0;
                int i14 = 0;
                while (i13 <= (i10 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    int i15 = i;
                    messageDigest2.update(fs1.C(BigInteger.valueOf(i13), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i14, Math.min(length3, i11 - i14));
                    i14 += length3;
                    i13++;
                    i = i15;
                    messageDigest2 = messageDigest2;
                }
                int i16 = i;
                byte[] bArr5 = new byte[i11];
                for (int i17 = 0; i17 < i11; i17++) {
                    bArr5[i17] = (byte) (bArr4[i17] ^ bArrCopyOf[i17]);
                }
                for (int i18 = 0; i18 <= j10; i18++) {
                    int i19 = i18 / 8;
                    bArr5[i19] = (byte) ((~(1 << (7 - (i18 % 8)))) & bArr5[i19]);
                }
                int i20 = 0;
                while (true) {
                    int i21 = (i10 - i16) - 2;
                    if (i20 >= i21) {
                        if (bArr5[i21] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i11 - i16, i11);
                        int i22 = digestLength + 8;
                        byte[] bArr6 = new byte[i22 + i16];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i22, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i20] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i20++;
                }
            }
        }
    }
}
