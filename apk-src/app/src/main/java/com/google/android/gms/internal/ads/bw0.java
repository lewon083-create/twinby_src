package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bw0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f3925h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cw0 f3927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dv0 f3928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cv0 f3929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public yv0 f3931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3932g = new Object();

    public bw0(Context context, cw0 cw0Var, dv0 dv0Var, cv0 cv0Var, boolean z5) {
        this.f3926a = context;
        this.f3927b = cw0Var;
        this.f3928c = dv0Var;
        this.f3929d = cv0Var;
        this.f3930e = z5;
    }

    public final boolean a(vv0 vv0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                yv0 yv0Var = new yv0(c(vv0Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f3926a, "msa-r", vv0Var.a(), null, new Bundle(), 2), vv0Var, this.f3927b, this.f3928c, this.f3930e);
                if (!yv0Var.j()) {
                    throw new zv0(4000, "init failed");
                }
                int iL = yv0Var.l();
                if (iL != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iL).length() + 4);
                    sb2.append("ci: ");
                    sb2.append(iL);
                    throw new zv0(4001, sb2.toString());
                }
                synchronized (this.f3932g) {
                    yv0 yv0Var2 = this.f3931f;
                    if (yv0Var2 != null) {
                        try {
                            yv0Var2.k();
                        } catch (zv0 e3) {
                            this.f3928c.c(e3.f13129b, -1L, e3);
                        }
                        this.f3931f = yv0Var;
                    } else {
                        this.f3931f = yv0Var;
                    }
                }
                this.f3928c.b(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e7) {
                throw new zv0(2004, e7);
            }
        } catch (zv0 e10) {
            this.f3928c.c(e10.f13129b, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return false;
        } catch (Exception e11) {
            this.f3928c.c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e11);
            return false;
        }
    }

    public final yv0 b() {
        yv0 yv0Var;
        synchronized (this.f3932g) {
            yv0Var = this.f3931f;
        }
        return yv0Var;
    }

    public final synchronized Class c(vv0 vv0Var) {
        try {
            sg sgVar = vv0Var.f11494a;
            if (sgVar == null) {
                throw new zv0(4010, "mc");
            }
            String strZ = sgVar.z();
            HashMap map = f3925h;
            Class cls = (Class) map.get(strZ);
            if (cls != null) {
                return cls;
            }
            try {
                cv0 cv0Var = this.f3929d;
                File file = vv0Var.f11495b;
                cv0Var.getClass();
                if (!cv0.a(file)) {
                    throw new zv0(2026, "VM did not pass signature verification");
                }
                try {
                    File file2 = vv0Var.f11496c;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(vv0Var.f11495b.getAbsolutePath(), file2.getAbsolutePath(), null, this.f3926a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZ, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e3) {
                    e = e3;
                    throw new zv0(2008, e);
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    throw new zv0(2008, e);
                } catch (SecurityException e10) {
                    e = e10;
                    throw new zv0(2008, e);
                }
            } catch (GeneralSecurityException e11) {
                throw new zv0(2026, e11);
            }
        } finally {
        }
    }
}
