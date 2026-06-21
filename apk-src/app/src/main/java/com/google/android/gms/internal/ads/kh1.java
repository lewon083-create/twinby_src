package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kh1 extends sn1 {
    private static final kh1 zzd;
    private static volatile qo1 zze;
    private String zza = "";
    private bn1 zzb = bn1.f3837c;
    private int zzc;

    static {
        kh1 kh1Var = new kh1();
        zzd = kh1Var;
        sn1.t(kh1.class, kh1Var);
    }

    public static jh1 C() {
        return (jh1) zzd.q();
    }

    public static kh1 D() {
        return zzd;
    }

    public final bn1 A() {
        return this.zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0014 A[PHI: r2
      0x0014: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:5:0x0006, B:9:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int B() {
        /*
            r3 = this;
            int r0 = r3.zzc
            r1 = 1
            if (r0 == 0) goto L15
            r2 = 2
            if (r0 == r1) goto L14
            r1 = 3
            if (r0 == r2) goto L15
            r2 = 4
            if (r0 == r1) goto L14
            if (r0 == r2) goto L12
            r1 = 0
            goto L15
        L12:
            r1 = 5
            goto L15
        L14:
            r1 = r2
        L15:
            if (r1 != 0) goto L19
            r0 = 6
            return r0
        L19:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kh1.B():int");
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void F(bn1 bn1Var) {
        bn1Var.getClass();
        this.zzb = bn1Var;
    }

    public final void G(int i) {
        int i10;
        if (i == 6) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        switch (i) {
            case 1:
                i10 = 0;
                break;
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 4;
                break;
            case 6:
                i10 = -1;
                break;
            default:
                throw null;
        }
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iM == 3) {
            return new kh1();
        }
        if (iM == 4) {
            return new jh1(zzd);
        }
        if (iM == 5) {
            return zzd;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zze;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (kh1.class) {
            try {
                rn1Var = zze;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzd);
                    zze = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final String z() {
        return this.zza;
    }
}
