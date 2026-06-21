package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class we implements ve {
    public static boolean A = false;
    public static long B;
    public static cf C;
    public static wf D;
    public static p1 E;
    public static oq0 F;
    public static gk0 G;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static volatile qf f11757y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object f11758z = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MotionEvent f11759b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f11767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f11768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f11769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f11770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f11771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f11772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f11773q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DisplayMetrics f11776t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q8 f11777u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.i4 f11778v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public uf f11779w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f11780x;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f11760c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11761d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11762e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11763f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11764g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11765h = 0;
    public long i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f11766j = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11774r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11775s = false;

    public we(Context context, com.google.android.gms.internal.measurement.i4 i4Var) {
        try {
            le.a();
            this.f11776t = context.getResources().getDisplayMetrics();
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3192s3)).booleanValue()) {
                this.f11777u = new q8();
            }
        } catch (Throwable unused) {
        }
        this.f11780x = new HashMap();
        this.f11778v = i4Var;
    }

    public static qf p(Context context, boolean z5) {
        if (f11757y == null) {
            synchronized (f11758z) {
                try {
                    if (f11757y == null) {
                        qf qfVarA = qf.a(context, z5, G);
                        if (qfVarA.f9487n) {
                            try {
                                if (((Boolean) q9.s.f31967e.f31970c.a(al.W3)).booleanValue()) {
                                    qfVarA.c("EG2NhqmkZH3IzxVQRUhlLPeSdGNOmVVMlZvdVRoPMeBX1YRu4M6S9HAWzARuGlrt", "rJ+3epX9GIWpiD23zEqB2nJ57HosctKKCexIQaNPOnU=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            qfVarA.c("mKTuB4d9zL2gk2O79XsYpNB+aKHwN1U9hkAKPABelEWUf6fdcG0P932Axqt06R0v", "IhWvFwVDz7+S2dgPUyZdbvNgcZm/v4DQbcD3M8nxqCg=", Context.class);
                            wk wkVar = al.f2983e4;
                            q9.s sVar = q9.s.f31967e;
                            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                                qfVarA.c("r3bKg5w0nz7IjZtWNMiPOsvB0VlHAYkN7VnU6Stu7HeDf3C1E2T8lLdAdxjkOACh", "v3VfjQtThhKzeCR8emHmzxqnaN2SnNbSp/OAufPeGKA=", new Class[0]);
                            }
                            qfVarA.c("BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", Context.class);
                            qfVarA.c("t0O1yTkaf8U85RYVI/Iw764S7xVo2UnzoC6xqdKHezEduB25T+k9NlupfapwCNk2", "NAFu5DHVi3o3yaFx1OCpv/KBsMCIhscKWxn1MzThPRk=", Context.class);
                            qfVarA.c("1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", Context.class);
                            qfVarA.c("KMUeaeNiUI6XsUYhfNNPM5hdqwDfiAVXu+jtj2XrbalwiO+unml0DNmATqQtDmlU", "B4oRQazYGo5C2idQuGW+PTqNOD34GvbDXi8fMMTvLXo=", Context.class);
                            Class cls = Boolean.TYPE;
                            qfVarA.c("Vt16THtmezzLb1zgD4XzuhSMrHLGIQcDJNqtzF8G+1UgPRnrYaZemyLPsebqTPQi", "+oRdA7B1eJk1uXzj6xFlex4QQoiHLhoEiFmCoqVQP54=", Context.class, cls);
                            qfVarA.c("WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", Context.class);
                            qfVarA.c("YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", Context.class);
                            qfVarA.c("VBBl/RSrrbh4NuoCpwv4Ff9uwlR+nIgvPASME/UcMSWtAZ4zziFv8sIkhiXD3JGh", "adtakVLQMMHz1yZrv+u5ZZiabjtFTP38FJEsPLAtvHE=", MotionEvent.class, DisplayMetrics.class);
                            qfVarA.c("cyl6+Nm7z/4AUMU9zZ2TYBK+lMXXrSwSgLNSZTdnB4C/ax/Gmzarui2kcSD53JXu", "gJiy+5nUzzsm5alaQ5ciO1Z43m3zAJgcxxPvmvUS+Vo=", MotionEvent.class, DisplayMetrics.class);
                            qfVarA.c("KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", new Class[0]);
                            qfVarA.c("R0KTYl+9Bi7RshEQmYhK/YeVyfjIkHliDPJVeC+XBbAz0q1EMlAcoZ8JeP0fdmTX", "AARE3CI7+7Fq5atzy8wcVAJTjdNJGGNM3rGztRoG23E=", new Class[0]);
                            qfVarA.c("yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", new Class[0]);
                            qfVarA.c("FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", new Class[0]);
                            qfVarA.c("iVzH00FGTIijHIZ0HS5SItMsN9AyuHOn1xXwzbhHf6Eq/l9FiFSlfrw2j7G806j4", "RyZVSwEZZgeTR1V/DRrjgM5Yqk49vWkiFPpVljbz9Uo=", new Class[0]);
                            qfVarA.c("WpK2JUF8iJ/BvX1YbpvZEg/OwGEi7DqWo1w6qvQxAhqdLxv0KDJfeHynFcOHsF/r", "eAfiSXYP9RekAEzlsFTPbe7e0Y1hgLoRWRhxsNjDqkg=", new Class[0]);
                            qfVarA.c("ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", Context.class, cls, String.class);
                            qfVarA.c("TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=", StackTraceElement[].class);
                            qfVarA.c("FW20C8Ai9koIlsaxQSE6ztByFAH2b9HaWXnzViOGstPwi5iqItbLmay/ubT2VSsg", "WvzwBqCGqiupQVgrtkQ81CPfk2zDbRT3OzniCOJeuxU=", View.class, DisplayMetrics.class, cls, cls);
                            qfVarA.c("bor0O3H3y0qG5UIppgg8bI1z9WuHvZ9oSRl8MpYl5RU5HMZyWKOlyAU+eSAgxME2", "IUDkN9+rDzK4GSONwoR6w/25ruQD7QnRgetY7oPkg7w=", Context.class, cls);
                            qfVarA.c("v55I7GonHWsamYbBtyIFKaZFQR/sofAKKTQsUzMKV1C6iCJ1v6Vqzq9x9meUl2ez", "Z7zWno+0eCAtcsPK71T7clKp8ZTgICQrdpeo5cTQYQo=", View.class, Activity.class, cls);
                            qfVarA.c("X3d3ekEggpPfZcTTuZPSKX+MUCnQGNsbyccHnkW7iVTfczCTjKoxcgVjpAE8Uhyz", "I4rncSeVGoKv0gEJ8Xd0rq9G0kL2Ky2ley3iuTG83Dg=", Long.TYPE);
                            qfVarA.c("x/S3A4n6lbyzTdn/kz8tPqUf3a1YB5vAd5r7wQYCBb3DYPiGQZB67fbWL/+XFcZ5", "kB0lJ6HHV2i/5ncg76cGz3oLPH/Yq3P6CviApgv8Ipc=", new Class[0]);
                            try {
                                if (((Boolean) sVar.f31970c.a(al.Z3)).booleanValue()) {
                                    qfVarA.c("EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            qfVarA.c("9zQJNYPRQu7M2PxsR2X5pUd2hUmUxo++JOxzNqkh3zn646wyxpHEbvjQqLWoAge2", "vZPGoOEoDBpprn4Bn8baCi1LGHgj6zo4y/AsLq2W9n8=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) q9.s.f31967e.f31970c.a(al.f2920a4)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        qfVarA.c("MHYgRB9ZLJ711MlDBgDgyPDdkDVVlHwuqDeF/1i1ByNixJnhURH1lj12DYAv6vPJ", "+dsC4zlVzClLb/gffysp/RM/1OAwcqKcuzzXTv3qmQk=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3192s3)).booleanValue()) {
                                    qfVarA.c("mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            try {
                            } catch (IllegalStateException unused5) {
                            }
                            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3058j3)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                qfVarA.c("uAqKAtpzCVdzsQfO3VsjAegcR1bzJIPV7WnBpdLTTlepVA45FMcx2CHHUDw9JuIC", "/PvocKqER/fglRgbozHO01MU+uyxr0WG8/b5JQrvhOY=", cls3, cls3, cls3, cls3);
                            } else {
                                try {
                                    if (((Boolean) q9.s.f31967e.f31970c.a(al.f3044i3)).booleanValue()) {
                                        qfVarA.c("mWKvHkCTlhia7UFG1tX8rmkp9AizD6H5C2Y+fxk0U+Y2fZze528QNyV6FTMftwOj", "NhSpQvE4PaXaFqOsSIcuQESqMAyvT+VdhFhpwrR61iU=", long[].class, Context.class, View.class);
                                    }
                                } catch (IllegalStateException unused6) {
                                }
                            }
                        }
                        f11757y = qfVarA;
                    }
                } finally {
                }
            }
        }
        return f11757y;
    }

    public static rf r(qf qfVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws jf {
        Method methodD = qfVar.d("VBBl/RSrrbh4NuoCpwv4Ff9uwlR+nIgvPASME/UcMSWtAZ4zziFv8sIkhiXD3JGh", "adtakVLQMMHz1yZrv+u5ZZiabjtFTP38FJEsPLAtvHE=");
        if (methodD == null || motionEvent == null) {
            throw new jf();
        }
        try {
            return new rf((String) methodD.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new jf(e3);
        }
    }

    public static final void t(List list) {
        ExecutorService executorService;
        if (f11757y == null || (executorService = f11757y.f9476b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) q9.s.f31967e.f31970c.a(al.e3)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            char[] cArr = sf.f10283a;
            StringWriter stringWriter = new StringWriter();
            e3.printStackTrace(new PrintWriter(stringWriter));
            Log.d("we", "class methods got exception: " + stringWriter.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final synchronized void a(int i, int i10, int i11) {
        try {
            if (this.f11759b != null) {
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f2935b3)).booleanValue()) {
                    o();
                } else {
                    this.f11759b.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f11776t;
            if (displayMetrics != null) {
                float f10 = displayMetrics.density;
                this.f11759b = MotionEvent.obtain(0L, i11, 1, i * f10, i10 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f11759b = null;
            }
            this.f11775s = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final synchronized void b(MotionEvent motionEvent) {
        Long l10;
        try {
            if (this.f11774r) {
                o();
                this.f11774r = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f11767k = ConfigValue.DOUBLE_DEFAULT_VALUE;
                this.f11768l = motionEvent.getRawX();
                this.f11769m = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.f11768l;
                double d11 = rawY - this.f11769m;
                this.f11767k += Math.sqrt((d11 * d11) + (d10 * d10));
                this.f11768l = rawX;
                this.f11769m = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f11759b = motionEventObtain;
                        LinkedList linkedList = this.f11760c;
                        linkedList.add(motionEventObtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.f11763f++;
                        this.f11765h = n(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f11762e += (long) (motionEvent.getHistorySize() + 1);
                        rf rfVarM = m(motionEvent);
                        Long l11 = rfVarM.K;
                        if (l11 != null && rfVarM.N != null) {
                            this.i = l11.longValue() + rfVarM.N.longValue() + this.i;
                        }
                        if (this.f11776t != null && (l10 = rfVarM.L) != null && rfVarM.O != null) {
                            this.f11766j = l10.longValue() + rfVarM.O.longValue() + this.f11766j;
                        }
                    } else if (action2 == 3) {
                        this.f11764g++;
                    }
                } catch (jf unused) {
                }
            } else {
                this.f11770n = motionEvent.getX();
                this.f11771o = motionEvent.getY();
                this.f11772p = motionEvent.getRawX();
                this.f11773q = motionEvent.getRawY();
                this.f11761d++;
            }
            this.f11775s = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String c(Context context, String str, View view, Activity activity) {
        return q(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void e(StackTraceElement[] stackTraceElementArr) {
        q8 q8Var;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3192s3)).booleanValue() || (q8Var = this.f11777u) == null) {
            return;
        }
        q8Var.f9364a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String f(Context context) {
        char[] cArr = sf.f10283a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return q(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void g(View view) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3028h3)).booleanValue()) {
            if (this.f11779w == null) {
                qf qfVar = f11757y;
                this.f11779w = new uf(qfVar.f9475a, qfVar.f9488o);
            }
            this.f11779w.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String h(Context context, String str, View view) {
        return q(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String i(Context context, View view, Activity activity) {
        return q(context, null, 2, view, activity);
    }

    public final jd j(Context context) {
        long j10;
        wf wfVar = D;
        if (wfVar != null && wfVar.f11801d) {
            wfVar.f11799b = System.currentTimeMillis();
        }
        wk wkVar = al.f3058j3;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            p1 p1Var = E;
            p1Var.f8870b = p1Var.f8869a;
            p1Var.f8869a = SystemClock.uptimeMillis();
        }
        jd jdVarB0 = wd.B0();
        com.google.android.gms.internal.measurement.i4 i4Var = this.f11778v;
        String str = (String) i4Var.f13782c;
        if (!TextUtils.isEmpty(str)) {
            jdVarB0.b();
            ((wd) jdVarB0.f9560c).E0(str);
        }
        qf qfVarP = p(context, i4Var.f13781b);
        if (qfVarP.f9476b == null) {
            return jdVarB0;
        }
        int iE = qfVarP.e();
        ArrayList arrayList = new ArrayList();
        if (qfVarP.f9487n) {
            zf zfVar = new zf(qfVarP, jdVarB0, iE, context, (fd) i4Var.f13783d, F);
            int i = iE;
            arrayList.add(zfVar);
            arrayList.add(new bg(qfVarP, jdVarB0, B, i));
            arrayList.add(new ag(qfVarP, jdVarB0, i, 3));
            arrayList.add(new xf(qfVarP, jdVarB0, i, context));
            arrayList.add(new ag(qfVarP, jdVarB0, i, 4));
            arrayList.add(new yf(qfVarP, jdVarB0, i, context));
            arrayList.add(new ag(qfVarP, jdVarB0, i, 7));
            arrayList.add(new ag(qfVarP, jdVarB0, i, 9));
            arrayList.add(new ag(qfVarP, jdVarB0, i, 10));
            arrayList.add(new ag(qfVarP, jdVarB0, i, 0));
            arrayList.add(new ag(qfVarP, jdVarB0, i, 2));
            arrayList.add(new ag(qfVarP, jdVarB0, i, 13));
            arrayList.add(new ag(qfVarP, jdVarB0, i, 6));
            arrayList.add(new ag(qfVarP, jdVarB0, i, 12));
            arrayList.add(new fg(qfVarP, jdVarB0, i));
            if (((Boolean) ykVar2.a(al.f2920a4)).booleanValue()) {
                wf wfVar2 = D;
                long j11 = -1;
                if (wfVar2 != null) {
                    long j12 = wfVar2.f11801d ? wfVar2.f11799b - wfVar2.f11798a : -1L;
                    long j13 = wfVar2.f11800c;
                    wfVar2.f11800c = -1L;
                    j11 = j12;
                    j10 = j13;
                } else {
                    j10 = -1;
                }
                eg egVar = new eg(qfVarP, jdVarB0, i, C, j11, j10);
                i = i;
                arrayList.add(egVar);
            }
            if (((Boolean) ykVar2.a(al.Z3)).booleanValue()) {
                arrayList.add(new ag(qfVarP, jdVarB0, i, 11));
            }
            ag agVar = new ag(qfVarP, "9zQJNYPRQu7M2PxsR2X5pUd2hUmUxo++JOxzNqkh3zn646wyxpHEbvjQqLWoAge2", "vZPGoOEoDBpprn4Bn8baCi1LGHgj6zo4y/AsLq2W9n8=", jdVarB0, i, 76, 8);
            jdVarB0 = jdVarB0;
            arrayList.add(agVar);
            if (((Boolean) ykVar2.a(al.f2967d4)).booleanValue()) {
                arrayList.add(new ag(qfVarP, jdVarB0, i, 5));
            }
            if (((Boolean) ykVar2.a(al.f2983e4)).booleanValue()) {
                ag agVar2 = new ag(qfVarP, "r3bKg5w0nz7IjZtWNMiPOsvB0VlHAYkN7VnU6Stu7HeDf3C1E2T8lLdAdxjkOACh", "v3VfjQtThhKzeCR8emHmzxqnaN2SnNbSp/OAufPeGKA=", jdVarB0, i, 82, 1);
                jdVarB0 = jdVarB0;
                arrayList.add(agVar2);
            }
        } else {
            jdVarB0.h(16384L);
        }
        t(arrayList);
        return jdVarB0;
    }

    public final jd k(Context context, View view, Activity activity) {
        wf wfVar = D;
        if (wfVar != null && wfVar.f11801d) {
            wfVar.f11799b = System.currentTimeMillis();
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3058j3)).booleanValue()) {
            p1 p1Var = E;
            p1Var.f8876h = p1Var.f8875g;
            p1Var.f8875g = SystemClock.uptimeMillis();
        }
        jd jdVarB0 = wd.B0();
        com.google.android.gms.internal.measurement.i4 i4Var = this.f11778v;
        String str = (String) i4Var.f13782c;
        if (!TextUtils.isEmpty(str)) {
            jdVarB0.b();
            ((wd) jdVarB0.f9560c).E0(str);
        }
        s(p(context, i4Var.f13781b), jdVarB0, view, activity, true, context);
        return jdVarB0;
    }

    public final jd l(Context context, View view, Activity activity) {
        wf wfVar = D;
        if (wfVar != null && wfVar.f11801d) {
            wfVar.f11799b = System.currentTimeMillis();
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3058j3)).booleanValue()) {
            E.c(context, view);
        }
        jd jdVarB0 = wd.B0();
        com.google.android.gms.internal.measurement.i4 i4Var = this.f11778v;
        String str = (String) i4Var.f13782c;
        jdVarB0.b();
        ((wd) jdVarB0.f9560c).E0(str);
        s(p(context, i4Var.f13781b), jdVarB0, view, activity, false, context);
        return jdVarB0;
    }

    public final rf m(MotionEvent motionEvent) throws jf {
        Method methodD = f11757y.d("cyl6+Nm7z/4AUMU9zZ2TYBK+lMXXrSwSgLNSZTdnB4C/ax/Gmzarui2kcSD53JXu", "gJiy+5nUzzsm5alaQ5ciO1Z43m3zAJgcxxPvmvUS+Vo=");
        if (methodD == null || motionEvent == null) {
            throw new jf();
        }
        try {
            return new rf((String) methodD.invoke(null, motionEvent, this.f11776t));
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new jf(e3);
        }
    }

    public final long n(StackTraceElement[] stackTraceElementArr) throws jf {
        Method methodD = f11757y.d("TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=");
        if (methodD == null || stackTraceElementArr == null) {
            throw new jf();
        }
        try {
            return new af((String) methodD.invoke(null, stackTraceElementArr)).I.longValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new jf(e3);
        }
    }

    public final void o() {
        this.f11765h = 0L;
        this.f11761d = 0L;
        this.f11762e = 0L;
        this.f11763f = 0L;
        this.f11764g = 0L;
        this.i = 0L;
        this.f11766j = 0L;
        LinkedList linkedList = this.f11760c;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f11759b;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f11759b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String q(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.we.q(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity):java.lang.String");
    }

    public final void s(qf qfVar, jd jdVar, View view, Activity activity, boolean z5, Context context) {
        Context context2;
        q9.s sVar;
        long j10;
        long j11;
        long j12;
        MotionEvent motionEvent;
        List listAsList;
        int i = 1;
        if (qfVar.f9487n) {
            synchronized (this) {
                try {
                    try {
                        rf rfVarR = r(qfVar, this.f11759b, this.f11776t);
                        Long l10 = rfVarR.H;
                        if (l10 != null) {
                            long jLongValue = l10.longValue();
                            jdVar.b();
                            ((wd) jdVar.f9560c).K0(jLongValue);
                        }
                        Long l11 = rfVarR.I;
                        if (l11 != null) {
                            long jLongValue2 = l11.longValue();
                            jdVar.b();
                            ((wd) jdVar.f9560c).L0(jLongValue2);
                        }
                        Long l12 = rfVarR.J;
                        if (l12 != null) {
                            long jLongValue3 = l12.longValue();
                            jdVar.b();
                            ((wd) jdVar.f9560c).M0(jLongValue3);
                        }
                        if (this.f11775s) {
                            Long l13 = rfVarR.K;
                            if (l13 != null) {
                                long jLongValue4 = l13.longValue();
                                jdVar.b();
                                ((wd) jdVar.f9560c).F(jLongValue4);
                            }
                            Long l14 = rfVarR.L;
                            if (l14 != null) {
                                long jLongValue5 = l14.longValue();
                                jdVar.b();
                                ((wd) jdVar.f9560c).G(jLongValue5);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (jf unused) {
                }
                sd sdVarZ = td.z();
                if (this.f11761d > 0) {
                    DisplayMetrics displayMetrics = this.f11776t;
                    char[] cArr = sf.f10283a;
                    if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                        long jB = sf.b(this.f11767k, displayMetrics);
                        sdVarZ.b();
                        ((td) sdVarZ.f9560c).L(jB);
                        long jB2 = sf.b(this.f11772p - this.f11770n, this.f11776t);
                        sdVarZ.b();
                        ((td) sdVarZ.f9560c).M(jB2);
                        long jB3 = sf.b(this.f11773q - this.f11771o, this.f11776t);
                        sdVarZ.b();
                        ((td) sdVarZ.f9560c).N(jB3);
                        long jB4 = sf.b(this.f11770n, this.f11776t);
                        sdVarZ.b();
                        ((td) sdVarZ.f9560c).Q(jB4);
                        long jB5 = sf.b(this.f11771o, this.f11776t);
                        sdVarZ.b();
                        ((td) sdVarZ.f9560c).R(jB5);
                        if (this.f11775s && (motionEvent = this.f11759b) != null) {
                            long jB6 = sf.b(((this.f11770n - this.f11772p) + motionEvent.getRawX()) - this.f11759b.getX(), this.f11776t);
                            if (jB6 != 0) {
                                sdVarZ.b();
                                ((td) sdVarZ.f9560c).O(jB6);
                            }
                            long jB7 = sf.b(((this.f11771o - this.f11773q) + this.f11759b.getRawY()) - this.f11759b.getY(), this.f11776t);
                            if (jB7 != 0) {
                                sdVarZ.b();
                                ((td) sdVarZ.f9560c).P(jB7);
                            }
                        }
                    }
                }
                try {
                    rf rfVarM = m(this.f11759b);
                    Long l15 = rfVarM.H;
                    if (l15 != null) {
                        long jLongValue6 = l15.longValue();
                        sdVarZ.b();
                        ((td) sdVarZ.f9560c).A(jLongValue6);
                    }
                    Long l16 = rfVarM.I;
                    if (l16 != null) {
                        long jLongValue7 = l16.longValue();
                        sdVarZ.b();
                        ((td) sdVarZ.f9560c).B(jLongValue7);
                    }
                    long jLongValue8 = rfVarM.J.longValue();
                    sdVarZ.b();
                    ((td) sdVarZ.f9560c).H(jLongValue8);
                    if (this.f11775s) {
                        Long l17 = rfVarM.L;
                        if (l17 != null) {
                            long jLongValue9 = l17.longValue();
                            sdVarZ.b();
                            ((td) sdVarZ.f9560c).C(jLongValue9);
                        }
                        Long l18 = rfVarM.K;
                        if (l18 != null) {
                            long jLongValue10 = l18.longValue();
                            sdVarZ.b();
                            ((td) sdVarZ.f9560c).F(jLongValue10);
                        }
                        Long l19 = rfVarM.M;
                        if (l19 != null) {
                            int i10 = l19.longValue() != 0 ? 2 : 1;
                            sdVarZ.b();
                            ((td) sdVarZ.f9560c).S(i10);
                        }
                        long j13 = this.f11762e;
                        if (j13 > 0) {
                            DisplayMetrics displayMetrics2 = this.f11776t;
                            char[] cArr2 = sf.f10283a;
                            Long lValueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.f11766j / j13)) : null;
                            if (lValueOf != null) {
                                long jLongValue11 = lValueOf.longValue();
                                sdVarZ.b();
                                ((td) sdVarZ.f9560c).D(jLongValue11);
                            } else {
                                sdVarZ.b();
                                ((td) sdVarZ.f9560c).E();
                            }
                            long jRound = Math.round(this.i / this.f11762e);
                            sdVarZ.b();
                            ((td) sdVarZ.f9560c).G(jRound);
                        }
                        Long l20 = rfVarM.P;
                        if (l20 != null) {
                            long jLongValue12 = l20.longValue();
                            sdVarZ.b();
                            ((td) sdVarZ.f9560c).J(jLongValue12);
                        }
                        Long l21 = rfVarM.Q;
                        if (l21 != null) {
                            long jLongValue13 = l21.longValue();
                            sdVarZ.b();
                            ((td) sdVarZ.f9560c).I(jLongValue13);
                        }
                        Long l22 = rfVarM.R;
                        if (l22 != null) {
                            int i11 = l22.longValue() != 0 ? 2 : 1;
                            sdVarZ.b();
                            ((td) sdVarZ.f9560c).T(i11);
                        }
                    }
                } catch (jf unused2) {
                }
                long j14 = this.f11765h;
                if (j14 > 0) {
                    sdVarZ.b();
                    ((td) sdVarZ.f9560c).K(j14);
                }
                td tdVar = (td) sdVarZ.d();
                jdVar.b();
                ((wd) jdVar.f9560c).S(tdVar);
                long j15 = this.f11761d;
                if (j15 > 0) {
                    jdVar.b();
                    ((wd) jdVar.f9560c).J(j15);
                }
                long j16 = this.f11762e;
                if (j16 > 0) {
                    jdVar.b();
                    ((wd) jdVar.f9560c).I(j16);
                }
                long j17 = this.f11763f;
                if (j17 > 0) {
                    jdVar.b();
                    ((wd) jdVar.f9560c).H(j17);
                }
                long j18 = this.f11764g;
                if (j18 > 0) {
                    jdVar.b();
                    ((wd) jdVar.f9560c).K(j18);
                }
                try {
                    LinkedList linkedList = this.f11760c;
                    int size = linkedList.size() - 1;
                    if (size > 0) {
                        jdVar.b();
                        ((wd) jdVar.f9560c).U();
                        for (int i12 = 0; i12 < size; i12++) {
                            rf rfVarR2 = r(f11757y, (MotionEvent) linkedList.get(i12), this.f11776t);
                            sd sdVarZ2 = td.z();
                            long jLongValue14 = rfVarR2.H.longValue();
                            sdVarZ2.b();
                            ((td) sdVarZ2.f9560c).A(jLongValue14);
                            long jLongValue15 = rfVarR2.I.longValue();
                            sdVarZ2.b();
                            ((td) sdVarZ2.f9560c).B(jLongValue15);
                            td tdVar2 = (td) sdVarZ2.d();
                            jdVar.b();
                            ((wd) jdVar.f9560c).T(tdVar2);
                        }
                    }
                } catch (jf unused3) {
                    jdVar.b();
                    ((wd) jdVar.f9560c).U();
                }
            }
            ArrayList arrayList = new ArrayList();
            listAsList = arrayList;
            if (qfVar.f9476b != null) {
                int iE = qfVar.e();
                wk wkVar = al.f3177r3;
                q9.s sVar2 = q9.s.f31967e;
                if (((Boolean) sVar2.f31970c.a(wkVar)).booleanValue()) {
                    context2 = context;
                    arrayList.add(new zf(qfVar, jdVar, iE, context, (fd) this.f11778v.f13783d, F));
                    arrayList.add(new yf(qfVar, jdVar, iE, context2));
                    arrayList.add(new xf(qfVar, jdVar, iE, context2));
                    arrayList.add(new ag(qfVar, jdVar, iE, 4));
                    wf wfVar = D;
                    if (wfVar != null) {
                        if (wfVar.f11801d) {
                            sVar = sVar2;
                            j12 = wfVar.f11799b - wfVar.f11798a;
                        } else {
                            sVar = sVar2;
                            j12 = -1;
                        }
                        long j19 = wfVar.f11800c;
                        wfVar.f11800c = -1L;
                        j11 = j12;
                        j10 = j19;
                    } else {
                        sVar = sVar2;
                        j10 = -1;
                        j11 = -1;
                    }
                    arrayList.add(new eg(qfVar, jdVar, iE, C, j11, j10));
                    arrayList.add(new ag(qfVar, jdVar, iE, 11));
                } else {
                    context2 = context;
                    sVar = sVar2;
                }
                arrayList.add(new je(i, qfVar, jdVar));
                arrayList.add(new ag(qfVar, jdVar, iE, 3));
                arrayList.add(new bg(qfVar, jdVar, B, iE));
                arrayList.add(new ag(qfVar, jdVar, iE, 0));
                arrayList.add(new ag(qfVar, jdVar, iE, 9));
                arrayList.add(new ag(qfVar, jdVar, iE, 10));
                arrayList.add(new ag(qfVar, jdVar, iE, 2));
                arrayList.add(new ag(qfVar, jdVar, iE, 7));
                arrayList.add(new ag(qfVar, jdVar, iE, 13));
                arrayList.add(new ag(qfVar, jdVar, iE, 6));
                arrayList.add(new ag(qfVar, jdVar, iE, 12));
                arrayList.add(new cg(qfVar, jdVar, iE, new Throwable().getStackTrace()));
                arrayList.add(new cg(qfVar, jdVar, iE, view));
                arrayList.add(new fg(qfVar, jdVar, iE));
                q9.s sVar3 = sVar;
                if (((Boolean) sVar3.f31970c.a(al.f2997f3)).booleanValue()) {
                    arrayList.add(new xf(qfVar, jdVar, iE, view, activity));
                }
                if (((Boolean) sVar3.f31970c.a(al.f2967d4)).booleanValue()) {
                    arrayList.add(new ag(qfVar, jdVar, iE, 5));
                }
                if (z5) {
                    listAsList = arrayList;
                    if (((Boolean) sVar3.f31970c.a(al.f3028h3)).booleanValue()) {
                        arrayList.add(new gg(qfVar, jdVar, iE, this.f11779w));
                        listAsList = arrayList;
                    }
                } else {
                    try {
                        if (((Boolean) sVar3.f31970c.a(al.f3044i3)).booleanValue()) {
                            arrayList.add(new dg(qfVar, jdVar, iE, this.f11780x, view, context2));
                        }
                    } catch (IllegalStateException unused4) {
                    }
                    try {
                        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3058j3)).booleanValue()) {
                            arrayList.add(new cg(qfVar, jdVar, iE, E));
                        }
                    } catch (IllegalStateException unused5) {
                    }
                    listAsList = arrayList;
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.f3192s3)).booleanValue()) {
                        arrayList.add(new cg(qfVar, jdVar, iE, this.f11777u));
                        listAsList = arrayList;
                    }
                }
            }
        } else {
            jdVar.h(16384L);
            listAsList = Arrays.asList(new je(i, qfVar, jdVar));
        }
        t(listAsList);
    }
}
