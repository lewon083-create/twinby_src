package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jl1 implements kl1, lo1, o31, td0, be0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ jl1 f6878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ jl1 f6879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ jl1 f6880e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6881b;

    static {
        byte b2 = 0;
        f6878c = new jl1(7, b2);
        f6879d = new jl1(9, b2);
        f6880e = new jl1(14, b2);
    }

    public static final zn1 b(long j10, Object obj) {
        zn1 zn1Var = (zn1) jp1.k(j10, obj);
        if (((qm1) zn1Var).f9553b) {
            return zn1Var;
        }
        int size = zn1Var.size();
        zn1 zn1VarB = zn1Var.b(size == 0 ? 10 : size + size);
        jp1.l(j10, obj, zn1VarB);
        return zn1VarB;
    }

    public static final jo1 g(Object obj, Object obj2) {
        jo1 jo1VarA = (jo1) obj;
        jo1 jo1Var = (jo1) obj2;
        if (!jo1Var.isEmpty()) {
            if (!jo1VarA.f6910b) {
                jo1VarA = jo1VarA.a();
            }
            jo1VarA.c();
            if (!jo1Var.isEmpty()) {
                jo1VarA.putAll(jo1Var);
            }
        }
        return jo1VarA;
    }

    @Override // com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public void mo0a(Object obj) {
        switch (this.f6881b) {
            case 8:
                ((te) obj).v();
                break;
            case 9:
                break;
            case 10:
                int i = ot1.f8771f0;
                ((te) obj).i();
                break;
            case 11:
                ((te) obj).k();
                break;
            case 12:
                int i10 = ot1.f8771f0;
                ((te) obj).A();
                break;
            case 13:
                int i11 = ot1.f8771f0;
                ((te) obj).o();
                break;
            case 14:
                int i12 = ot1.f8771f0;
                ((te) obj).o0(new bt1(2, new oc("Player release timed out."), 1003));
                break;
            case 15:
                int i13 = ot1.f8771f0;
                ((te) obj).x();
                break;
            case 16:
                int i14 = ot1.f8771f0;
                ((te) obj).l();
                break;
            case 17:
            default:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public boolean c(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public uo1 d(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.kl1
    public /* bridge */ /* synthetic */ Object e(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.be0
    public /* synthetic */ void f(Object obj, cw1 cw1Var) {
        ((te) obj).h();
    }

    @Override // com.google.android.gms.internal.ads.o31
    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object mo8h() {
        return new zs1();
    }

    public /* synthetic */ jl1(int i) {
        this.f6881b = 13;
    }

    public /* synthetic */ jl1(int i, byte b2) {
        this.f6881b = i;
    }
}
