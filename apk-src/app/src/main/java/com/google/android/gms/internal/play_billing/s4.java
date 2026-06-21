package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.um1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s4 extends g3 {
    private static final s4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private w4 zzh;

    static {
        s4 s4Var = new s4();
        zzb = s4Var;
        g3.k(s4.class, s4Var);
    }

    public static s4 n(byte[] bArr, z2 z2Var) throws n3 {
        g3 g3Var = zzb;
        int length = bArr.length;
        if (length != 0) {
            g3 g3Var2 = (g3) g3Var.d(4);
            try {
                f4 f4VarA = c4.f14151c.a(g3Var2.getClass());
                um1 um1Var = new um1();
                z2Var.getClass();
                f4VarA.e(g3Var2, bArr, 0, length, um1Var);
                f4VarA.b(g3Var2);
                g3Var = g3Var2;
            } catch (i4 e3) {
                throw new n3(e3.getMessage());
            } catch (n3 e7) {
                throw e7;
            } catch (IOException e10) {
                if (e10.getCause() instanceof n3) {
                    throw ((n3) e10.getCause());
                }
                throw new n3(e10.getMessage(), e10);
            } catch (IndexOutOfBoundsException unused) {
                throw new n3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (g3Var == null || g3.m(g3Var, true)) {
            return (s4) g3Var;
        }
        throw new n3(new i4().getMessage());
    }

    public static /* synthetic */ void o(s4 s4Var, w4 w4Var) {
        s4Var.zzh = w4Var;
        s4Var.zzd |= 2;
    }

    public static /* synthetic */ void p(s4 s4Var, g5 g5Var) {
        s4Var.zzf = g5Var;
        s4Var.zze = 4;
    }

    public static /* synthetic */ void q(s4 s4Var, int i) {
        s4Var.zzg = i - 1;
        s4Var.zzd |= 1;
    }

    public static r4 r() {
        return (r4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", p2.f14280c, "zzh", g5.class});
        }
        if (i10 == 3) {
            return new s4();
        }
        if (i10 == 4) {
            return new r4(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
