package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends t5 {
    private static final s2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;
    private int zzh;

    static {
        s2 s2Var = new s2();
        zzb = s2Var;
        t5.l(s2.class, s2Var);
    }

    public static r2 m() {
        return (r2) zzb.g();
    }

    public static /* synthetic */ void n(s2 s2Var, e2 e2Var) {
        s2Var.zzf = e2Var;
        s2Var.zze = 38;
    }

    public static /* synthetic */ void o(s2 s2Var, long j10) {
        s2Var.zzd |= 1;
        s2Var.zzg = j10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0019\u0001\u0001\b&\u0019\u0000\u0000\u0000\b<\u0000\tဂ\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001dင\u0001\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000", new Object[]{"zzf", "zze", "zzd", u3.class, "zzg", g4.class, y2.class, d1.class, j3.class, j1.class, q2.class, g1.class, q1.class, b3.class, d3.class, v4.class, b4.class, c5.class, "zzh", b5.class, j4.class, t1.class, r4.class, q4.class, k1.class, e5.class, w4.class, e2.class});
        }
        if (i10 == 3) {
            return new s2();
        }
        if (i10 == 4) {
            return new r2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
