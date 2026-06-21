package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wy0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xy0 f11924c;

    public /* synthetic */ wy0(xy0 xy0Var, int i) {
        this.f11923b = i;
        this.f11924c = xy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        yc ycVar;
        x41 x41VarV;
        String string;
        switch (this.f11923b) {
            case 0:
                xy0 xy0Var = this.f11924c;
                if (!xy0Var.f12379f || xy0Var.f12385m.getAndSet(true)) {
                    return;
                }
                Context context = xy0Var.f12375b;
                String str = xy0Var.f12383k;
                double d10 = xy0Var.f12382j;
                long j10 = xy0Var.f12384l;
                Locale locale = Locale.getDefault();
                yc ycVarZ = zc.z();
                long j11 = Build.VERSION.SDK_INT;
                ycVarZ.b();
                ((zc) ycVarZ.f9560c).C(j11);
                String str2 = Build.MODEL;
                ycVarZ.b();
                ((zc) ycVarZ.f9560c).D(str2);
                String language = locale.getLanguage();
                ycVarZ.b();
                ((zc) ycVarZ.f9560c).E(language);
                String country = locale.getCountry();
                ycVarZ.b();
                ((zc) ycVarZ.f9560c).F(country);
                ycVarZ.b();
                ((zc) ycVarZ.f9560c).I(str);
                String packageName = context.getPackageName();
                ycVarZ.b();
                ((zc) ycVarZ.f9560c).G(packageName);
                ycVarZ.b();
                ((zc) ycVarZ.f9560c).L(j10);
                if (d10 > ConfigValue.DOUBLE_DEFAULT_VALUE) {
                    ycVarZ.b();
                    ((zc) ycVarZ.f9560c).K((int) (1.0d / d10));
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    long j12 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    ycVarZ.b();
                    ((zc) ycVarZ.f9560c).H(j12);
                    break;
                } catch (Exception unused) {
                }
                try {
                    if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                        i = 5;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                        i = 4;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                        i = 7;
                    } else {
                        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                        i = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
                    }
                    ycVarZ.b();
                    ((zc) ycVarZ.f9560c).M(i);
                    break;
                } catch (RuntimeException unused2) {
                }
                zc zcVar = (zc) ycVarZ.d();
                synchronized (xy0Var.f12386n) {
                    xy0Var.f12389q.e(zcVar);
                    break;
                }
                return;
            default:
                xy0 xy0Var2 = this.f11924c;
                synchronized (xy0Var2.f12386n) {
                    yc ycVar2 = xy0Var2.f12389q;
                    qn1 qn1Var = (qn1) ycVar2.f9559b.v(5, null);
                    qn1Var.f9560c = ycVar2.c();
                    ycVar = (yc) qn1Var;
                    break;
                }
                synchronized (xy0Var2.f12387o) {
                    ArrayList arrayList = xy0Var2.f12390r;
                    x41VarV = x41.v(arrayList);
                    arrayList.clear();
                    xy0Var2.f12391s = false;
                    break;
                }
                int size = x41VarV.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    vy0 vy0Var = (vy0) x41VarV.get(i10);
                    if (i11 >= xy0Var2.f12381h) {
                        xy0Var2.b((zc) ycVar.d());
                        ycVar.b();
                        ((zc) ycVar.f9560c).B();
                        i11 = 0;
                    }
                    gd gdVarZ = hd.z();
                    long j13 = vy0Var.f11531a;
                    gdVarZ.b();
                    ((hd) gdVarZ.f9560c).A(j13);
                    long j14 = vy0Var.f11532b;
                    gdVarZ.b();
                    ((hd) gdVarZ.f9560c).B(j14);
                    long j15 = vy0Var.f11535e;
                    gdVarZ.b();
                    ((hd) gdVarZ.f9560c).E(j15);
                    String str3 = vy0Var.f11534d;
                    if (str3 != null) {
                        gdVarZ.b();
                        ((hd) gdVarZ.f9560c).F(str3);
                    }
                    Throwable th2 = vy0Var.f11533c;
                    int i12 = th2 == null ? 2 : 3;
                    gdVarZ.b();
                    ((hd) gdVarZ.f9560c).G(i12);
                    if (th2 != null) {
                        String name = th2.getClass().getName();
                        gdVarZ.b();
                        ((hd) gdVarZ.f9560c).C(name);
                        try {
                            StringWriter stringWriter = new StringWriter();
                            try {
                                PrintWriter printWriter = new PrintWriter(stringWriter);
                                try {
                                    th2.printStackTrace(printWriter);
                                    string = stringWriter.toString();
                                    printWriter.close();
                                    stringWriter.close();
                                } catch (Throwable th3) {
                                    try {
                                        printWriter.close();
                                        break;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } finally {
                            }
                        } catch (IOException unused3) {
                            string = "";
                        }
                        gdVarZ.b();
                        ((hd) gdVarZ.f9560c).D(string);
                    }
                    hd hdVar = (hd) gdVarZ.d();
                    ycVar.b();
                    ((zc) ycVar.f9560c).A(hdVar);
                    i10++;
                    i11++;
                }
                if (i11 > 0) {
                    xy0Var2.b((zc) ycVar.d());
                    ycVar.b();
                    ((zc) ycVar.f9560c).B();
                    return;
                }
                return;
        }
    }
}
