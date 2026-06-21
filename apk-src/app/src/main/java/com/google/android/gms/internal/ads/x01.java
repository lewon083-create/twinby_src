package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w11 f11959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j11 f11960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m11 f11961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j21 f11962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fy0 f11963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11966h;

    public x01(w11 w11Var, j11 j11Var, m11 m11Var, j21 j21Var, fy0 fy0Var, boolean z5, long j10, long j11) {
        this.f11959a = w11Var;
        this.f11960b = j11Var;
        this.f11961c = m11Var;
        this.f11962d = j21Var;
        this.f11963e = fy0Var;
        this.f11964f = z5;
        this.f11965g = j10;
        this.f11966h = j11;
    }

    public final i81 a() {
        i81 i81VarS = i81.s(this.f11961c.j());
        u5 u5Var = u5.f10837x;
        f81 f81Var = f81.f5272b;
        y61 y61VarG = vv.G(i81VarS, Throwable.class, u5Var, f81Var);
        w11 w11Var = this.f11959a;
        Objects.requireNonNull(w11Var);
        return vv.J(vv.K(y61VarG, new ju(10, w11Var), f81Var), new u01(this, 0), f81Var);
    }

    public final i81 b(final int i) {
        y61 y61VarG;
        int i10;
        final j11 j11Var = this.f11960b;
        int i11 = j11Var.f6676a;
        final int i12 = 0;
        final int i13 = 1;
        f81 f81Var = f81.f5272b;
        switch (i11) {
            case 0:
                js1 js1Var = (js1) j11Var.f6680e;
                Objects.requireNonNull(js1Var);
                do0 do0Var = new do0(6, js1Var);
                ExecutorService executorService = j11Var.f6678c;
                y61 y61VarG2 = vv.G(vv.K(vv.J(vv.K(i81.s(vv.B(do0Var, executorService)), new c31() { // from class: com.google.android.gms.internal.ads.i11
                    /* JADX WARN: Finally extract failed */
                    @Override // com.google.android.gms.internal.ads.c31
                    public final Object apply(Object obj) {
                        boolean zA;
                        switch (i13) {
                            case 0:
                                bz0 bz0Var = (bz0) obj;
                                j11 j11Var2 = j11Var;
                                js1 js1Var2 = (js1) j11Var2.f6680e;
                                String strZ = bz0Var.z().z();
                                String strA = bz0Var.z().A();
                                j21 j21Var = j11Var2.f6679d;
                                i21 i21VarA = j21Var.a(15203);
                                try {
                                    i21VarA.a();
                                    xv0 xv0VarB = vv.b(j11Var2.f6677b, (ng) js1Var2.j(), strZ, strA, (dv0) j11Var2.f6683h);
                                    int i14 = xv0VarB.f12347d;
                                    i21VarA.c();
                                    int i15 = 2;
                                    if (i14 == 2) {
                                        j21Var.b(15208);
                                        return j11.b(4);
                                    }
                                    byte[] bArr = xv0VarB.f12346c;
                                    if (bArr == null || bArr.length == 0) {
                                        j21Var.b(5010);
                                        return j11.b(8);
                                    }
                                    try {
                                        og ogVarD = og.D(bArr, kn1.a());
                                        if (ogVarD.z().z().isEmpty() || ogVarD.z().A().isEmpty() || ogVarD.B().D().length == 0) {
                                            j21Var.b(15207);
                                        } else {
                                            if (bz0Var.equals(bz0.E()) || !TextUtils.equals(bz0Var.z().z(), ogVarD.z().z()) || !TextUtils.equals(bz0Var.z().A(), ogVarD.z().A())) {
                                                if (i14 == 4) {
                                                    b11 b11Var = (b11) j11Var2.f6682g;
                                                    byte[] bArrD = ogVarD.A().D();
                                                    File file = b11Var.f3556a;
                                                    try {
                                                        ix.z(file);
                                                        ix.n(file, bArrD);
                                                        b11Var.f3557b.getClass();
                                                        zA = cv0.a(file);
                                                    } catch (IOException | GeneralSecurityException e3) {
                                                        b11Var.f3558c.d(e3, 2027);
                                                        zA = false;
                                                    }
                                                    try {
                                                        file.delete();
                                                        break;
                                                    } catch (SecurityException unused) {
                                                    }
                                                    if (!zA) {
                                                        j21Var.b(15206);
                                                        return j11.b(12);
                                                    }
                                                    i14 = 4;
                                                    break;
                                                }
                                                yy0 yy0VarC = zy0.C();
                                                if (i14 == 2) {
                                                    i15 = 4;
                                                } else if (i14 != 3) {
                                                    i15 = i14 != 4 ? i14 != 6 ? 1 : 5 : 3;
                                                }
                                                yy0VarC.b();
                                                ((zy0) yy0VarC.f9560c).H(i15);
                                                az0 az0VarD = bz0.D();
                                                sg sgVarZ = ogVarD.z();
                                                az0VarD.b();
                                                ((bz0) az0VarD.f9560c).F(sgVarZ);
                                                ng ngVar = (ng) js1Var2.j();
                                                az0VarD.b();
                                                ((bz0) az0VarD.f9560c).H(ngVar);
                                                bz0 bz0Var2 = (bz0) az0VarD.d();
                                                yy0VarC.b();
                                                ((zy0) yy0VarC.f9560c).D(bz0Var2);
                                                bn1 bn1VarA = ogVarD.A();
                                                yy0VarC.b();
                                                ((zy0) yy0VarC.f9560c).F(bn1VarA);
                                                bn1 bn1VarB = ogVarD.B();
                                                yy0VarC.b();
                                                ((zy0) yy0VarC.f9560c).E(bn1VarB);
                                                return (zy0) yy0VarC.d();
                                            }
                                            j21Var.b(15209);
                                        }
                                        return j11.b(11);
                                    } catch (co1 e7) {
                                        j21Var.d(e7, 15205);
                                        return j11.b(9);
                                    } catch (NullPointerException unused2) {
                                        j21Var.b(15210);
                                        return j11.b(10);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        i21VarA.b(th2);
                                        throw th2;
                                    } catch (Throwable th3) {
                                        i21VarA.c();
                                        throw th3;
                                    }
                                }
                            default:
                                ng ngVar2 = (ng) obj;
                                j11 j11Var3 = j11Var;
                                j11Var3.getClass();
                                if (fs1.m(ngVar2)) {
                                    return new Integer(0);
                                }
                                j11Var3.f6679d.c(15204, ngVar2.name());
                                throw new h11();
                        }
                    }
                }, f81Var), new np(18, j11Var), f81Var), new c31() { // from class: com.google.android.gms.internal.ads.i11
                    /* JADX WARN: Finally extract failed */
                    @Override // com.google.android.gms.internal.ads.c31
                    public final Object apply(Object obj) {
                        boolean zA;
                        switch (i12) {
                            case 0:
                                bz0 bz0Var = (bz0) obj;
                                j11 j11Var2 = j11Var;
                                js1 js1Var2 = (js1) j11Var2.f6680e;
                                String strZ = bz0Var.z().z();
                                String strA = bz0Var.z().A();
                                j21 j21Var = j11Var2.f6679d;
                                i21 i21VarA = j21Var.a(15203);
                                try {
                                    i21VarA.a();
                                    xv0 xv0VarB = vv.b(j11Var2.f6677b, (ng) js1Var2.j(), strZ, strA, (dv0) j11Var2.f6683h);
                                    int i14 = xv0VarB.f12347d;
                                    i21VarA.c();
                                    int i15 = 2;
                                    if (i14 == 2) {
                                        j21Var.b(15208);
                                        return j11.b(4);
                                    }
                                    byte[] bArr = xv0VarB.f12346c;
                                    if (bArr == null || bArr.length == 0) {
                                        j21Var.b(5010);
                                        return j11.b(8);
                                    }
                                    try {
                                        og ogVarD = og.D(bArr, kn1.a());
                                        if (ogVarD.z().z().isEmpty() || ogVarD.z().A().isEmpty() || ogVarD.B().D().length == 0) {
                                            j21Var.b(15207);
                                        } else {
                                            if (bz0Var.equals(bz0.E()) || !TextUtils.equals(bz0Var.z().z(), ogVarD.z().z()) || !TextUtils.equals(bz0Var.z().A(), ogVarD.z().A())) {
                                                if (i14 == 4) {
                                                    b11 b11Var = (b11) j11Var2.f6682g;
                                                    byte[] bArrD = ogVarD.A().D();
                                                    File file = b11Var.f3556a;
                                                    try {
                                                        ix.z(file);
                                                        ix.n(file, bArrD);
                                                        b11Var.f3557b.getClass();
                                                        zA = cv0.a(file);
                                                    } catch (IOException | GeneralSecurityException e3) {
                                                        b11Var.f3558c.d(e3, 2027);
                                                        zA = false;
                                                    }
                                                    try {
                                                        file.delete();
                                                        break;
                                                    } catch (SecurityException unused) {
                                                    }
                                                    if (!zA) {
                                                        j21Var.b(15206);
                                                        return j11.b(12);
                                                    }
                                                    i14 = 4;
                                                    break;
                                                }
                                                yy0 yy0VarC = zy0.C();
                                                if (i14 == 2) {
                                                    i15 = 4;
                                                } else if (i14 != 3) {
                                                    i15 = i14 != 4 ? i14 != 6 ? 1 : 5 : 3;
                                                }
                                                yy0VarC.b();
                                                ((zy0) yy0VarC.f9560c).H(i15);
                                                az0 az0VarD = bz0.D();
                                                sg sgVarZ = ogVarD.z();
                                                az0VarD.b();
                                                ((bz0) az0VarD.f9560c).F(sgVarZ);
                                                ng ngVar = (ng) js1Var2.j();
                                                az0VarD.b();
                                                ((bz0) az0VarD.f9560c).H(ngVar);
                                                bz0 bz0Var2 = (bz0) az0VarD.d();
                                                yy0VarC.b();
                                                ((zy0) yy0VarC.f9560c).D(bz0Var2);
                                                bn1 bn1VarA = ogVarD.A();
                                                yy0VarC.b();
                                                ((zy0) yy0VarC.f9560c).F(bn1VarA);
                                                bn1 bn1VarB = ogVarD.B();
                                                yy0VarC.b();
                                                ((zy0) yy0VarC.f9560c).E(bn1VarB);
                                                return (zy0) yy0VarC.d();
                                            }
                                            j21Var.b(15209);
                                        }
                                        return j11.b(11);
                                    } catch (co1 e7) {
                                        j21Var.d(e7, 15205);
                                        return j11.b(9);
                                    } catch (NullPointerException unused2) {
                                        j21Var.b(15210);
                                        return j11.b(10);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        i21VarA.b(th2);
                                        throw th2;
                                    } catch (Throwable th3) {
                                        i21VarA.c();
                                        throw th3;
                                    }
                                }
                            default:
                                ng ngVar2 = (ng) obj;
                                j11 j11Var3 = j11Var;
                                j11Var3.getClass();
                                if (fs1.m(ngVar2)) {
                                    return new Integer(0);
                                }
                                j11Var3.f6679d.c(15204, ngVar2.name());
                                throw new h11();
                        }
                    }
                }, executorService), h11.class, f11.f5173c, f81Var);
                j11Var.f6679d.e(15202, y61VarG2);
                y61VarG = y61VarG2;
                break;
            default:
                kg kgVarZ = lg.z();
                byte[] bArrJ = nz.j();
                zm1 zm1Var = bn1.f3837c;
                boolean z5 = false;
                zm1 zm1VarA = bn1.A(bArrJ, 0, bArrJ.length);
                kgVarZ.b();
                ((lg) kgVarZ.f9560c).A(zm1VarA);
                long j10 = Build.VERSION.SDK_INT;
                kgVarZ.b();
                ((lg) kgVarZ.f9560c).B(j10);
                String str = Build.MODEL;
                kgVarZ.b();
                ((lg) kgVarZ.f9560c).C(str);
                Context context = j11Var.f6677b;
                String packageName = context.getPackageName();
                kgVarZ.b();
                ((lg) kgVarZ.f9560c).D(packageName);
                try {
                    i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i10 = -1;
                }
                ey0 ey0Var = (ey0) j11Var.f6680e;
                j21 j21Var = j11Var.f6679d;
                kgVarZ.b();
                ((lg) kgVarZ.f9560c).E(i10);
                String str2 = (String) j11Var.f6681f;
                kgVarZ.b();
                ((lg) kgVarZ.f9560c).F(str2);
                byte[] bArrB = ((lg) kgVarZ.d()).b();
                g61 g61Var = i61.f6400e;
                if (g61Var.f6403b != null) {
                    g61Var = new g61(g61Var.f6402a, (Character) null);
                }
                String strG = g61Var.g(bArrB.length, bArrB);
                ey0Var.getClass();
                final int i14 = 2;
                y61VarG = vv.G(vv.G(vv.K(i81.s(i0.o.w(new yv0(ey0Var, Uri.parse((String) j11Var.f6682g).buildUpon().appendQueryParameter("aspq", strG).build().toString(), z5, (String) null, new byte[0]))), new c31() { // from class: com.google.android.gms.internal.ads.k11
                    @Override // com.google.android.gms.internal.ads.c31
                    public final Object apply(Object obj) {
                        zy0 zy0VarA;
                        switch (i14) {
                            case 0:
                                j11Var.f6679d.b(20007);
                                return j11.a(13);
                            case 1:
                                j11Var.f6679d.b(20008);
                                return j11.a(13);
                            default:
                                dy0 dy0Var = (dy0) obj;
                                j11 j11Var2 = j11Var;
                                j21 j21Var2 = j11Var2.f6679d;
                                if (dy0Var.f4740a != 200) {
                                    j21Var2.c(20003, new String(nz.j(), StandardCharsets.UTF_8));
                                    return j11.a(7);
                                }
                                try {
                                    String str3 = new String(dy0Var.f4741b);
                                    if (TextUtils.isEmpty(str3)) {
                                        j21Var2.b(20004);
                                        zy0VarA = j11.a(8);
                                    } else {
                                        mg mgVarA = mg.A(vv.x(str3, true), kn1.a());
                                        if (!mgVarA.z().B() || !mgVarA.z().z()) {
                                            j21Var2.b(20004);
                                            zy0VarA = j11.a(8);
                                        } else if (((l11) j11Var2.f6683h).a(mgVarA)) {
                                            yy0 yy0VarC = zy0.C();
                                            az0 az0VarD = bz0.D();
                                            qg qgVarA = mgVarA.z().A();
                                            az0VarD.b();
                                            ((bz0) az0VarD.f9560c).G(qgVarA);
                                            yy0VarC.b();
                                            ((zy0) yy0VarC.f9560c).D((bz0) az0VarD.d());
                                            bn1 bn1VarC = mgVarA.z().C();
                                            yy0VarC.b();
                                            ((zy0) yy0VarC.f9560c).E(bn1VarC);
                                            yy0VarC.b();
                                            ((zy0) yy0VarC.f9560c).H(2);
                                            zy0VarA = (zy0) yy0VarC.d();
                                        } else {
                                            j21Var2.b(20006);
                                            zy0VarA = j11.a(12);
                                        }
                                    }
                                    return zy0VarA;
                                } catch (Throwable th2) {
                                    j21Var2.d(th2, 20005);
                                    return j11.a(6);
                                }
                        }
                    }
                }, j11Var.f6678c), UnknownHostException.class, new c31() { // from class: com.google.android.gms.internal.ads.k11
                    @Override // com.google.android.gms.internal.ads.c31
                    public final Object apply(Object obj) {
                        zy0 zy0VarA;
                        switch (i12) {
                            case 0:
                                j11Var.f6679d.b(20007);
                                return j11.a(13);
                            case 1:
                                j11Var.f6679d.b(20008);
                                return j11.a(13);
                            default:
                                dy0 dy0Var = (dy0) obj;
                                j11 j11Var2 = j11Var;
                                j21 j21Var2 = j11Var2.f6679d;
                                if (dy0Var.f4740a != 200) {
                                    j21Var2.c(20003, new String(nz.j(), StandardCharsets.UTF_8));
                                    return j11.a(7);
                                }
                                try {
                                    String str3 = new String(dy0Var.f4741b);
                                    if (TextUtils.isEmpty(str3)) {
                                        j21Var2.b(20004);
                                        zy0VarA = j11.a(8);
                                    } else {
                                        mg mgVarA = mg.A(vv.x(str3, true), kn1.a());
                                        if (!mgVarA.z().B() || !mgVarA.z().z()) {
                                            j21Var2.b(20004);
                                            zy0VarA = j11.a(8);
                                        } else if (((l11) j11Var2.f6683h).a(mgVarA)) {
                                            yy0 yy0VarC = zy0.C();
                                            az0 az0VarD = bz0.D();
                                            qg qgVarA = mgVarA.z().A();
                                            az0VarD.b();
                                            ((bz0) az0VarD.f9560c).G(qgVarA);
                                            yy0VarC.b();
                                            ((zy0) yy0VarC.f9560c).D((bz0) az0VarD.d());
                                            bn1 bn1VarC = mgVarA.z().C();
                                            yy0VarC.b();
                                            ((zy0) yy0VarC.f9560c).E(bn1VarC);
                                            yy0VarC.b();
                                            ((zy0) yy0VarC.f9560c).H(2);
                                            zy0VarA = (zy0) yy0VarC.d();
                                        } else {
                                            j21Var2.b(20006);
                                            zy0VarA = j11.a(12);
                                        }
                                    }
                                    return zy0VarA;
                                } catch (Throwable th2) {
                                    j21Var2.d(th2, 20005);
                                    return j11.a(6);
                                }
                        }
                    }
                }, f81Var), SocketException.class, new c31() { // from class: com.google.android.gms.internal.ads.k11
                    @Override // com.google.android.gms.internal.ads.c31
                    public final Object apply(Object obj) {
                        zy0 zy0VarA;
                        switch (i13) {
                            case 0:
                                j11Var.f6679d.b(20007);
                                return j11.a(13);
                            case 1:
                                j11Var.f6679d.b(20008);
                                return j11.a(13);
                            default:
                                dy0 dy0Var = (dy0) obj;
                                j11 j11Var2 = j11Var;
                                j21 j21Var2 = j11Var2.f6679d;
                                if (dy0Var.f4740a != 200) {
                                    j21Var2.c(20003, new String(nz.j(), StandardCharsets.UTF_8));
                                    return j11.a(7);
                                }
                                try {
                                    String str3 = new String(dy0Var.f4741b);
                                    if (TextUtils.isEmpty(str3)) {
                                        j21Var2.b(20004);
                                        zy0VarA = j11.a(8);
                                    } else {
                                        mg mgVarA = mg.A(vv.x(str3, true), kn1.a());
                                        if (!mgVarA.z().B() || !mgVarA.z().z()) {
                                            j21Var2.b(20004);
                                            zy0VarA = j11.a(8);
                                        } else if (((l11) j11Var2.f6683h).a(mgVarA)) {
                                            yy0 yy0VarC = zy0.C();
                                            az0 az0VarD = bz0.D();
                                            qg qgVarA = mgVarA.z().A();
                                            az0VarD.b();
                                            ((bz0) az0VarD.f9560c).G(qgVarA);
                                            yy0VarC.b();
                                            ((zy0) yy0VarC.f9560c).D((bz0) az0VarD.d());
                                            bn1 bn1VarC = mgVarA.z().C();
                                            yy0VarC.b();
                                            ((zy0) yy0VarC.f9560c).E(bn1VarC);
                                            yy0VarC.b();
                                            ((zy0) yy0VarC.f9560c).H(2);
                                            zy0VarA = (zy0) yy0VarC.d();
                                        } else {
                                            j21Var2.b(20006);
                                            zy0VarA = j11.a(12);
                                        }
                                    }
                                    return zy0VarA;
                                } catch (Throwable th2) {
                                    j21Var2.d(th2, 20005);
                                    return j11.a(6);
                                }
                        }
                    }
                }, f81Var);
                j21Var.e(20002, y61VarG);
                break;
        }
        y61 y61VarG3 = vv.G(vv.G(vv.G(vv.K(vv.J(vv.K(i81.s(y61VarG), new ju(11, this), f81Var), new u01(this, i13), f81Var), u5.f10838y, f81Var), s01.class, u5.f10839z, f81Var), t01.class, u5.A, f81Var), r01.class, new c31() { // from class: com.google.android.gms.internal.ads.v01
            @Override // com.google.android.gms.internal.ads.c31
            public final /* synthetic */ Object apply(Object obj) {
                x01 x01Var = this.f11174a;
                if (x01Var.f11964f) {
                    int i15 = i;
                    if (i15 < x01Var.f11965g) {
                        x01Var.f11963e.a(new pf(x01Var, i15, 5), x01Var.f11966h * ((long) Math.pow(2.0d, i15)));
                    }
                }
                return w01.f11569g;
            }
        }, f81Var);
        this.f11962d.e(1002, y61VarG3);
        return y61VarG3;
    }
}
