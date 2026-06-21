package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dj extends sn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final dj zzv;
    private static volatile qo1 zzw;
    private int zzi;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzp;
    private int zzu;
    private zn1 zzj = to1.f10681f;
    private String zzn = "";
    private String zzo = "";

    static {
        dj djVar = new dj();
        zzv = djVar;
        sn1.t(dj.class, djVar);
    }

    public static bj z() {
        return (bj) zzv.q();
    }

    public final void A(ArrayList arrayList) {
        zn1 zn1Var = this.zzj;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzj = zn1Var.b(size + size);
        }
        pm1.e(arrayList, this.zzj);
    }

    public final void B(int i) {
        this.zzi |= 1;
        this.zzk = i;
    }

    public final void C(int i) {
        this.zzi |= 2;
        this.zzl = i;
    }

    public final void D(long j10) {
        this.zzi |= 4;
        this.zzm = j10;
    }

    public final void E(String str) {
        str.getClass();
        this.zzi |= 8;
        this.zzn = str;
    }

    public final void F() {
        String str = Build.MODEL;
        str.getClass();
        this.zzi |= 16;
        this.zzo = str;
    }

    public final void G(long j10) {
        this.zzi |= 32;
        this.zzp = j10;
    }

    public final void H(int i) {
        this.zzi |= 64;
        this.zzu = i;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", aj.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }
        if (iM == 3) {
            return new dj();
        }
        if (iM == 4) {
            return new bj(zzv);
        }
        if (iM == 5) {
            return zzv;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzw;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (dj.class) {
            try {
                rn1Var = zzw;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzv);
                    zzw = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
