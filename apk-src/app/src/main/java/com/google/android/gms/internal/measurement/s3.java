package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends k5 {
    private static final s3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        s3 s3Var = new s3();
        zzg = s3Var;
        k5.m(s3.class, s3Var);
    }

    public static r3 q() {
        return (r3) zzg.h();
    }

    public static s3 r() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", u1.f13991n, "zze", u1.f13989l, "zzf", u1.f13990m});
        }
        if (i10 == 3) {
            return new s3();
        }
        if (i10 == 4) {
            return new r3(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int p() {
        int iC = om1.c(this.zze);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    public final void s(int i) {
        this.zze = om1.d(i);
        this.zzb |= 2;
    }

    public final int t() {
        int i;
        int i10 = this.zzd;
        if (i10 != 0) {
            i = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i = 4;
                    if (i10 != 3) {
                        i = i10 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[PHI: r3
      0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u() {
        /*
            r4 = this;
            int r0 = r4.zzf
            r1 = 1
            if (r0 == 0) goto L19
            r2 = 2
            if (r0 == r1) goto L1a
            r3 = 3
            if (r0 == r2) goto L17
            r2 = 4
            if (r0 == r3) goto L1a
            r3 = 5
            if (r0 == r2) goto L17
            if (r0 == r3) goto L15
            r2 = 0
            goto L1a
        L15:
            r2 = 6
            goto L1a
        L17:
            r2 = r3
            goto L1a
        L19:
            r2 = r1
        L1a:
            if (r2 != 0) goto L1d
            return r1
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s3.u():int");
    }

    public final /* synthetic */ void v(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void w(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }
}
