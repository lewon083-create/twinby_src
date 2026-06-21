package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wd extends sn1 {
    private static final wd zzbl;
    private static volatile qo1 zzbm;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private xd zzO;
    private int zza;
    private int zzaA;
    private String zzaB;
    private zn1 zzaC;
    private int zzaD;
    private zn1 zzaE;
    private rd zzaF;
    private pd zzaG;
    private String zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private long zzaL;
    private long zzaM;
    private long zzaN;
    private long zzaO;
    private String zzaP;
    private long zzaQ;
    private md zzaR;
    private nd zzaS;
    private long zzaT;
    private long zzaU;
    private int zzaV;
    private String zzaW;
    private String zzaX;
    private long zzaY;
    private long zzaZ;
    private td zzag;
    private zn1 zzah;
    private vd zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private long zzaq;
    private String zzar;
    private long zzas;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private ee zzax;
    private long zzay;
    private int zzaz;
    private int zzb;
    private int zzba;
    private ld zzbb;
    private long zzbc;
    private String zzbd;
    private int zzbe;
    private boolean zzbf;
    private String zzbg;
    private long zzbh;
    private de zzbi;
    private long zzbj;
    private String zzbk;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = "";
    private String zzf = "";
    private String zzu = "";
    private String zzE = "";
    private String zzF = "D";
    private String zzG = "";
    private String zzK = "";
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = "D";
    private String zzW = "D";
    private long zzX = -1;
    private int zzY = 1000;
    private int zzZ = 1000;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = 1000;

    static {
        wd wdVar = new wd();
        zzbl = wdVar;
        sn1.t(wd.class, wdVar);
    }

    public wd() {
        to1 to1Var = to1.f10681f;
        this.zzah = to1Var;
        this.zzaj = -1L;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = -1L;
        this.zzar = "D";
        this.zzas = -1L;
        this.zzay = -1L;
        this.zzaz = 1000;
        this.zzaA = 1000;
        this.zzaB = "D";
        this.zzaC = to1Var;
        this.zzaD = 1000;
        this.zzaE = to1Var;
        this.zzaH = "";
        this.zzaI = -1L;
        this.zzaJ = -1L;
        this.zzaK = -1L;
        this.zzaL = -1L;
        this.zzaO = -1L;
        this.zzaP = "";
        this.zzaT = -1L;
        this.zzaU = -1L;
        this.zzaW = "";
        this.zzaX = "";
        this.zzaY = -1L;
        this.zzaZ = -1L;
        this.zzbd = "";
        this.zzbe = 2;
        this.zzbg = "";
        this.zzbj = -1L;
        this.zzbk = "";
    }

    public static wd A0(byte[] bArr, kn1 kn1Var) {
        return (wd) sn1.n(zzbl, bArr, kn1Var);
    }

    public static jd B0() {
        return (jd) zzbl.q();
    }

    public static wd C0() {
        return zzbl;
    }

    public final /* synthetic */ void A(long j10) {
        this.zza |= 33554432;
        this.zzH = j10;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 67108864;
        this.zzI = j10;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 134217728;
        this.zzJ = j10;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    public final /* synthetic */ void D0(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void E(long j10) {
        this.zza |= 536870912;
        this.zzL = j10;
    }

    public final /* synthetic */ void E0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void F(long j10) {
        this.zza |= 1073741824;
        this.zzM = j10;
    }

    public final /* synthetic */ void F0(long j10) {
        this.zza |= 4;
        this.zzg = j10;
    }

    public final /* synthetic */ void G(long j10) {
        this.zza |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.zzN = j10;
    }

    public final /* synthetic */ void G0(long j10) {
        this.zza |= 16;
        this.zzi = j10;
    }

    public final /* synthetic */ void H(long j10) {
        this.zzb |= 2;
        this.zzP = j10;
    }

    public final /* synthetic */ void H0(long j10) {
        this.zza |= 32;
        this.zzj = j10;
    }

    public final /* synthetic */ void I(long j10) {
        this.zzb |= 4;
        this.zzQ = j10;
    }

    public final /* synthetic */ void I0(long j10) {
        this.zza |= 1024;
        this.zzo = j10;
    }

    public final /* synthetic */ void J(long j10) {
        this.zzb |= 8;
        this.zzR = j10;
    }

    public final /* synthetic */ void J0(long j10) {
        this.zza |= 2048;
        this.zzp = j10;
    }

    public final /* synthetic */ void K(long j10) {
        this.zzb |= 16;
        this.zzS = j10;
    }

    public final /* synthetic */ void K0(long j10) {
        this.zza |= 8192;
        this.zzv = j10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zzb |= 32;
        this.zzT = j10;
    }

    public final /* synthetic */ void L0(long j10) {
        this.zza |= 16384;
        this.zzw = j10;
    }

    public final /* synthetic */ void M(long j10) {
        this.zzb |= 64;
        this.zzU = j10;
    }

    public final /* synthetic */ void M0(long j10) {
        this.zza |= 32768;
        this.zzx = j10;
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    public final /* synthetic */ void N0(long j10) {
        this.zza |= 65536;
        this.zzy = j10;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzW = str;
    }

    public final /* synthetic */ void O0(long j10) {
        this.zza |= 524288;
        this.zzB = j10;
    }

    public final /* synthetic */ void P(long j10) {
        this.zzb |= 4096;
        this.zzaa = j10;
    }

    public final /* synthetic */ void P0(long j10) {
        this.zza |= 1048576;
        this.zzC = j10;
    }

    public final /* synthetic */ void Q(long j10) {
        this.zzb |= 8192;
        this.zzab = j10;
    }

    public final /* synthetic */ void Q0(long j10) {
        this.zza |= 2097152;
        this.zzD = j10;
    }

    public final /* synthetic */ void R(long j10) {
        this.zzb |= 16384;
        this.zzac = j10;
    }

    public final /* synthetic */ void R0(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }

    public final /* synthetic */ void S(td tdVar) {
        this.zzag = tdVar;
        this.zzb |= 262144;
    }

    public final void T(td tdVar) {
        zn1 zn1Var = this.zzah;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzah = zn1Var.b(size + size);
        }
        this.zzah.add(tdVar);
    }

    public final void U() {
        this.zzah = to1.f10681f;
    }

    public final /* synthetic */ void V(vd vdVar) {
        this.zzai = vdVar;
        this.zzb |= 524288;
    }

    public final /* synthetic */ void W(long j10) {
        this.zzb |= 1048576;
        this.zzaj = j10;
    }

    public final /* synthetic */ void X(long j10) {
        this.zzb |= 2097152;
        this.zzak = j10;
    }

    public final /* synthetic */ void Y(long j10) {
        this.zzb |= 4194304;
        this.zzal = j10;
    }

    public final boolean Z() {
        return (this.zza & 4194304) != 0;
    }

    public final /* synthetic */ void a0(long j10) {
        this.zzb |= 8388608;
        this.zzam = j10;
    }

    public final /* synthetic */ void b0(long j10) {
        this.zzb |= 16777216;
        this.zzan = j10;
    }

    public final /* synthetic */ void c0(long j10) {
        this.zzb |= 67108864;
        this.zzap = j10;
    }

    public final /* synthetic */ void d0(long j10) {
        this.zzb |= 134217728;
        this.zzaq = j10;
    }

    public final /* synthetic */ void e0(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    public final /* synthetic */ void f0(String str) {
        str.getClass();
        this.zzc |= 1024;
        this.zzaH = str;
    }

    public final /* synthetic */ void g0(long j10) {
        this.zzc |= 2048;
        this.zzaI = j10;
    }

    public final /* synthetic */ void h0(long j10) {
        this.zzc |= 4096;
        this.zzaJ = j10;
    }

    public final /* synthetic */ void i0(long j10) {
        this.zzc |= 8192;
        this.zzaK = j10;
    }

    public final /* synthetic */ void j0(long j10) {
        this.zzc |= 16384;
        this.zzaL = j10;
    }

    public final /* synthetic */ void k0(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    public final /* synthetic */ void l0(long j10) {
        this.zzc |= 8388608;
        this.zzaU = j10;
    }

    public final /* synthetic */ void m0(long j10) {
        this.zzd |= 16;
        this.zzbh = j10;
    }

    public final /* synthetic */ void n0(de deVar) {
        deVar.getClass();
        this.zzbi = deVar;
        this.zzd |= 32;
    }

    public final /* synthetic */ void o0(int i) {
        this.zzY = i - 1;
        this.zzb |= 1024;
    }

    public final /* synthetic */ void p0(int i) {
        this.zzZ = i - 1;
        this.zzb |= 2048;
    }

    public final /* synthetic */ void q0(int i) {
        this.zzaf = i - 1;
        this.zzb |= 131072;
    }

    public final /* synthetic */ void r0(int i) {
        this.zzaz = i - 1;
        this.zzc |= 16;
    }

    public final /* synthetic */ void s0(int i) {
        this.zzaA = i - 1;
        this.zzc |= 32;
    }

    public final /* synthetic */ void t0(int i) {
        this.zzaV = i - 1;
        this.zzc |= 16777216;
    }

    public final String u0() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            ad adVar = ad.f2851g;
            ad adVar2 = ad.f2856m;
            return new uo1(zzbl, "\u0001k\u0000\u0004\u0001Įk\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ_\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈ`\u0019ဂd\u001a᠌a\u001bဈ\u0016\u001cဇb\u001dဈ\u0018\u001eဈc\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^ÉဉeĭဂfĮဈg", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzbc", "zzC", "zzD", "zzbd", "zzbh", "zzbe", adVar, "zzE", "zzbf", "zzG", "zzbg", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", td.class, "zzT", "zzU", "zzV", "zzW", "zzY", adVar2, "zzZ", adVar2, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", adVar2, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", ad.f2855l, "zzau", ad.f2857n, "zzar", "zzaw", ad.f2850f, "zzax", "zzay", "zzan", "zzao", "zzaz", adVar2, "zzX", "zzF", "zzaA", adVar2, "zzaB", "zzaC", od.class, "zzaD", adVar2, "zzaE", kd.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", ad.f2853j, "zzav", ad.f2852h, "zzaG", "zzaN", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", ad.f2854k, "zzaQ", "zzbb", "zzbi", "zzbj", "zzbk"});
        }
        if (iM == 3) {
            return new wd();
        }
        if (iM == 4) {
            return new jd(zzbl);
        }
        if (iM == 5) {
            return zzbl;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzbm;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (wd.class) {
            try {
                rn1Var = zzbm;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzbl);
                    zzbm = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final boolean v0() {
        return (this.zzb & 1048576) != 0;
    }

    public final long w0() {
        return this.zzaj;
    }

    public final long x0() {
        return this.zzan;
    }

    public final boolean y0() {
        return (this.zzd & 32) != 0;
    }

    public final /* synthetic */ void z(String str) {
        str.getClass();
        this.zza |= 16777216;
        this.zzG = str;
    }

    public final de z0() {
        de deVar = this.zzbi;
        return deVar == null ? de.D() : deVar;
    }
}
