package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tk1 implements q91 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f10644f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10645a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f10647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublicKey f10648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f10649e;

    public /* synthetic */ tk1(RSAPublicKey rSAPublicKey, ll1 ll1Var, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (gc1.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        gr.F(ll1Var);
        gr.K(rSAPublicKey.getModulus().bitLength());
        gr.Q(rSAPublicKey.getPublicExponent());
        this.f10648d = rSAPublicKey;
        this.f10649e = ll1Var;
        this.f10646b = bArr;
        this.f10647c = bArr2;
    }

    public static tk1 b(pj1 pj1Var) throws GeneralSecurityException {
        Provider providerE = c80.e();
        if (providerE == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (gr.x(1)) {
            return new tk1(pj1Var.f9077e.b(), pj1Var.f9078f.b(), pj1Var.f9076d.f7900a.equals(lj1.f7548d) ? new byte[]{0} : new byte[0], providerE);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.q91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f10645a) {
            case 0:
                byte[] bArr3 = this.f10646b;
                int length = bArr3.length;
                if (bArr.length != length + 64) {
                    throw new GeneralSecurityException("Invalid signature length: 64");
                }
                if (!ge1.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                Signature signature = Signature.getInstance("Ed25519", (Provider) this.f10649e);
                signature.initVerify(this.f10648d);
                signature.update(bArr2);
                signature.update(this.f10647c);
                try {
                    if (signature.verify(bArr, length, 64)) {
                        return;
                    }
                } catch (RuntimeException unused) {
                }
                throw new GeneralSecurityException("Signature check failed.");
            default:
                byte[] bArr4 = this.f10646b;
                int length2 = bArr4.length;
                if (length2 == 0) {
                    c(bArr, bArr2);
                    return;
                } else {
                    if (!ge1.c(bArr4, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    public void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrQ;
        int i;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f10648d;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrC = fs1.C(bigInteger.modPow(publicExponent, modulus), iBitLength);
        ll1 ll1Var = (ll1) this.f10649e;
        gr.F(ll1Var);
        MessageDigest messageDigest = (MessageDigest) il1.f6537e.f6540a.b(ix.v(ll1Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f10647c;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = ll1Var.ordinal();
        int i10 = 2;
        if (iOrdinal == 2) {
            bArrQ = vv.q("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrQ = vv.q("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(ll1Var.toString()));
            }
            bArrQ = vv.q("3051300d060960864801650304020305000440");
        }
        if (iBitLength < bArrQ.length + bArrDigest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i11 = 0;
        while (true) {
            i = i10 + 1;
            if (i11 >= (iBitLength - r5) - 3) {
                break;
            }
            bArr4[i10] = -1;
            i11++;
            i10 = i;
        }
        bArr4[i10] = 0;
        int length = bArrQ.length;
        System.arraycopy(bArrQ, 0, bArr4, i, length);
        System.arraycopy(bArrDigest, 0, bArr4, i + length, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrC, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    public tk1(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (gr.x(1)) {
            if (bArr.length == 32) {
                this.f10648d = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(ix.s(f10644f, bArr)));
                this.f10646b = bArr2;
                this.f10647c = bArr3;
                this.f10649e = provider;
                return;
            }
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }
}
