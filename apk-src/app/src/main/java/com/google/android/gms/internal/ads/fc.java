package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fc implements df1, mb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5322e;

    public fc(ac acVar, int i, ub ubVar) {
        this.f5320c = acVar;
        this.f5319b = i;
        this.f5321d = ubVar;
    }

    public static final void j(long j10) throws dc {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        if (j10 % (((((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new dc();
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0, com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo0a(Object obj) {
        ((ny1) obj).q(0, (hy1) ((n90) this.f5320c).f8248c, (zx1) this.f5321d, (ey1) this.f5322e, this.f5319b);
    }

    @Override // com.google.android.gms.internal.ads.df1
    public byte[] b(int i, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i > this.f5319b) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ml1 ml1Var = (ml1) this.f5320c;
        ((Mac) ml1Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) ml1Var.get()).doFinal(), i);
    }

    public void c(long j10) throws dc, ec {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        j(j10);
        long j19 = j10 / (((((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + j17) ^ (j18 % 899334107));
        if (j19 < 0 || j19 > ((ac) this.f5320c).f2838a.length) {
            throw new ec();
        }
        this.f5319b = (int) j19;
    }

    public long d() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        return ((long) this.f5319b) * (((((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public void e() {
        HandlerThread handlerThread;
        synchronized (this.f5320c) {
            try {
                ix.k0(this.f5319b > 0);
                int i = this.f5319b - 1;
                this.f5319b = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f5322e) != null) {
                    handlerThread.quit();
                    this.f5322e = null;
                    this.f5321d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long f() throws ec {
        try {
            ub ubVar = (ub) this.f5321d;
            ac acVar = (ac) this.f5320c;
            this.f5319b = this.f5319b + 1;
            return ubVar.e(acVar, r2);
        } catch (IndexOutOfBoundsException e3) {
            throw new ec(e3);
        }
    }

    public int g() throws ec {
        try {
            ub ubVar = (ub) this.f5321d;
            ac acVar = (ac) this.f5320c;
            int i = this.f5319b;
            this.f5319b = i + 1;
            int iE = ubVar.e(acVar, i) & 255;
            ub ubVar2 = (ub) this.f5321d;
            ac acVar2 = (ac) this.f5320c;
            int i10 = this.f5319b;
            this.f5319b = i10 + 1;
            int iE2 = iE | ((ubVar2.e(acVar2, i10) & 255) << 8);
            ub ubVar3 = (ub) this.f5321d;
            ac acVar3 = (ac) this.f5320c;
            int i11 = this.f5319b;
            this.f5319b = i11 + 1;
            int iE3 = iE2 | ((ubVar3.e(acVar3, i11) & 255) << 16);
            ub ubVar4 = (ub) this.f5321d;
            ac acVar4 = (ac) this.f5320c;
            int i12 = this.f5319b;
            this.f5319b = i12 + 1;
            return iE3 | (ubVar4.e(acVar4, i12) << 24);
        } catch (IndexOutOfBoundsException e3) {
            throw new ec(e3);
        }
    }

    public long h() throws cc, ec {
        int i = 0;
        long j10 = 0;
        while (i < 64) {
            try {
                ub ubVar = (ub) this.f5321d;
                ac acVar = (ac) this.f5320c;
                int i10 = this.f5319b;
                this.f5319b = i10 + 1;
                byte bE = ubVar.e(acVar, i10);
                j10 |= ((long) (bE & 127)) << i;
                if (i == 63) {
                    if (bE > 1) {
                        throw new cc();
                    }
                    i = 63;
                }
                if ((bE & 128) == 0) {
                    return (-(j10 & 1)) ^ (j10 >>> 1);
                }
                i += 7;
            } catch (IndexOutOfBoundsException e3) {
                throw new ec(e3);
            }
        }
        throw new cc();
    }

    public ac i(long j10) throws dc, ec {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        j(d() + j10);
        int i17 = this.f5319b;
        long j11 = i17;
        ac acVar = (ac) this.f5320c;
        long j12 = (j10 >> ((i16 % 774318984) ^ iH)) + j11;
        if (j12 > acVar.f2838a.length || j12 < j11) {
            throw new ec();
        }
        try {
            int i18 = (int) j12;
            ac acVarI = ((ub) this.f5321d).i(acVar, i17, i18);
            this.f5319b = i18;
            return acVarI;
        } catch (IndexOutOfBoundsException e3) {
            throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e3);
        }
    }

    public /* synthetic */ fc(n90 n90Var, zx1 zx1Var, ey1 ey1Var, int i) {
        this.f5320c = n90Var;
        this.f5321d = zx1Var;
        this.f5322e = ey1Var;
        this.f5319b = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public fc(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        int i;
        ml1 ml1Var = new ml1(this);
        this.f5320c = ml1Var;
        if (gr.x(2)) {
            this.f5321d = str;
            this.f5322e = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            i = 20;
                            this.f5319b = i;
                            ml1Var.get();
                            return;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            i = 28;
                            this.f5319b = i;
                            ml1Var.get();
                            return;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            i = 32;
                            this.f5319b = i;
                            ml1Var.get();
                            return;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            i = 48;
                            this.f5319b = i;
                            ml1Var.get();
                            return;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            i = 64;
                            this.f5319b = i;
                            ml1Var.get();
                            return;
                        }
                        break;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
