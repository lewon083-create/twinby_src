package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j21 f8088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nz0 f8089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8090d;

    public n01(Context context, j21 j21Var, nz0 nz0Var, ux0 ux0Var) {
        this.f8087a = context;
        this.f8088b = j21Var;
        this.f8089c = nz0Var;
        this.f8090d = ux0Var.F();
    }

    public final String a(long j10) {
        String string;
        boolean z5;
        i21 i21VarA = this.f8088b.a(55);
        try {
            try {
                i21VarA.a();
                be beVarZ = ce.z();
                String str = this.f8090d;
                beVarZ.b();
                ((ce) beVarZ.f9560c).B(str);
                beVarZ.b();
                ((ce) beVarZ.f9560c).A("0.825731049");
                Context context = this.f8087a;
                String packageName = context.getPackageName();
                beVarZ.b();
                ((ce) beVarZ.f9560c).D(packageName);
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                beVarZ.b();
                ((ce) beVarZ.f9560c).C(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = (System.currentTimeMillis() - j10) / 1000;
                beVarZ.b();
                ((ce) beVarZ.f9560c).F(jCurrentTimeMillis2);
                try {
                    long j11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    beVarZ.b();
                    ((ce) beVarZ.f9560c).E(j11);
                } catch (PackageManager.NameNotFoundException unused) {
                    beVarZ.b();
                    ((ce) beVarZ.f9560c).E(-1L);
                }
                nz0 nz0Var = this.f8089c;
                synchronized (nz0Var) {
                    z5 = nz0Var.f8524d;
                }
                if (!z5) {
                    nz0Var.a();
                }
                fe feVarD = nz0Var.d(null, ((ce) beVarZ.d()).b());
                feVarD.b();
                ((ge) feVarD.f9560c).C(5);
                feVarD.b();
                ((ge) feVarD.f9560c).D(2);
                byte[] bArrB = ((ge) feVarD.d()).b();
                g61 g61Var = i61.f6400e;
                if (g61Var.f6403b != null) {
                    g61Var = new g61(g61Var.f6402a, (Character) null);
                }
                string = g61Var.g(bArrB.length, bArrB);
            } catch (UnsupportedEncodingException e3) {
                i21VarA.b(e3);
                string = Integer.toString(7);
            } catch (Throwable th2) {
                i21VarA.b(th2);
                throw th2;
            }
            i21VarA.c();
            return string;
        } catch (Throwable th3) {
            i21VarA.c();
            throw th3;
        }
    }
}
