package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.webkit.ProfileStore;
import dalvik.system.DexClassLoader;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10104c;

    public /* synthetic */ s(int i, Object obj) {
        this.f10103b = i;
        this.f10104c = obj;
    }

    private final void a() {
        ya yaVar = (ya) this.f10104c;
        synchronized (yaVar) {
            try {
                com.google.android.gms.internal.measurement.i4 i4Var = (com.google.android.gms.internal.measurement.i4) yaVar.f12557d;
                if (i4Var.f13781b) {
                    ch chVar = (ch) i4Var.f13782c;
                    byte[] bArr = (byte[]) yaVar.f12556c;
                    zg zgVar = (zg) chVar;
                    Parcel parcelD0 = zgVar.D0();
                    parcelD0.writeByteArray(bArr);
                    zgVar.L1(parcelD0, 5);
                    zg zgVar2 = (zg) ((ch) i4Var.f13782c);
                    Parcel parcelD02 = zgVar2.D0();
                    parcelD02.writeInt(0);
                    zgVar2.L1(parcelD02, 6);
                    ch chVar2 = (ch) i4Var.f13782c;
                    int i = yaVar.f12555b;
                    zg zgVar3 = (zg) chVar2;
                    Parcel parcelD03 = zgVar3.D0();
                    parcelD03.writeInt(i);
                    zgVar3.L1(parcelD03, 7);
                    zg zgVar4 = (zg) ((ch) i4Var.f13782c);
                    Parcel parcelD04 = zgVar4.D0();
                    parcelD04.writeIntArray(null);
                    zgVar4.L1(parcelD04, 4);
                    zg zgVar5 = (zg) ((ch) i4Var.f13782c);
                    zgVar5.L1(zgVar5.D0(), 3);
                }
            } catch (RemoteException e3) {
                u9.i.d("Clearcut log failed", e3);
            }
        }
    }

    private final void b() throws Throwable {
        LinkedHashMap linkedHashMap;
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f10104c;
        cVar.getClass();
        while (true) {
            try {
                el elVar = (el) ((ArrayBlockingQueue) cVar.f13337a).take();
                dl dlVarB = elVar.b();
                if (!TextUtils.isEmpty(dlVarB.f4597b)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.f13338b;
                    synchronized (elVar.f4994c) {
                        p9.k.C.f31302h.a();
                        linkedHashMap = elVar.f4993b;
                    }
                    cVar.x(cVar.t(linkedHashMap2, linkedHashMap), dlVarB);
                }
            } catch (InterruptedException e3) {
                u9.i.i("CsiReporter:reporter interrupted", e3);
                return;
            }
        }
    }

    private final void c() {
        q9.s sVar;
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        q9.s sVar2;
        long j10;
        long j11;
        long j12;
        long j13;
        bz bzVar = (bz) this.f10104c;
        String strO = bz.o(bzVar.f3969f);
        try {
            wk wkVar = al.Y;
            sVar = q9.s.f31967e;
            jLongValue = ((Long) sVar.f31970c.a(wkVar)).longValue() * 1000;
            jIntValue = ((Integer) sVar.f31970c.a(al.f3247w)).intValue();
            zBooleanValue = ((Boolean) sVar.f31970c.a(al.f3118n2)).booleanValue();
        } catch (Exception e3) {
            String str = bzVar.f3969f;
            String message = e3.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            u9.i.h(sb2.toString());
            p9.k.C.f31302h.e("VideoStreamExoPlayerCache.preload", e3);
            bzVar.a();
            bzVar.l(bzVar.f3969f, strO, "error", bz.p("error", e3));
        }
        synchronized (bzVar) {
            p9.k.C.f31304k.getClass();
            if (System.currentTimeMillis() - bzVar.f3972j > jLongValue) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                sb3.append("Timeout reached. Limit: ");
                sb3.append(jLongValue);
                sb3.append(" ms");
                throw new IOException(sb3.toString());
            }
            if (bzVar.f3970g) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!bzVar.f3971h) {
                vu1 vu1Var = bzVar.f3968e.f7016h;
                if (!(vu1Var != null)) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long jF1 = vu1Var.F1();
                if (jF1 > 0) {
                    long jG1 = bzVar.f3968e.f7016h.G1();
                    if (jG1 != bzVar.f3973k) {
                        boolean z5 = jG1 > 0;
                        String str2 = bzVar.f3969f;
                        if (zBooleanValue) {
                            jz jzVar = bzVar.f3968e;
                            j13 = (jzVar.f7027t == null || !jzVar.f7027t.f5516q) ? jzVar.f7019l : 0L;
                        } else {
                            j13 = -1;
                        }
                        long jP = zBooleanValue ? bzVar.f3968e.p() : -1L;
                        j10 = jIntValue;
                        sVar2 = sVar;
                        j12 = jG1;
                        j11 = jF1;
                        u9.d.f34372b.post(new sy(bzVar, str2, strO, jG1, jF1, j13, jP, zBooleanValue ? bzVar.f3968e.q() : -1L, z5, jz.f7008v.get(), jz.f7009w.get()));
                        bzVar.f3973k = j12;
                    } else {
                        sVar2 = sVar;
                        j10 = jIntValue;
                        j11 = jF1;
                        j12 = jG1;
                    }
                    if (j12 >= j11) {
                        u9.d.f34372b.post(new vy(bzVar, bzVar.f3969f, strO, j11));
                    } else if (bzVar.f3968e.f7019l >= j10 && j12 > 0) {
                    }
                } else {
                    sVar2 = sVar;
                }
                t9.g0.f33596l.postDelayed(new s(22, bzVar), ((Long) sVar2.f31970c.a(al.Z)).longValue());
                return;
            }
            p9.k.C.A.f9638b.remove(bzVar.i);
        }
    }

    private final void d() {
        boolean z5;
        sf0 sf0Var = (sf0) this.f10104c;
        sf0Var.getClass();
        try {
            t9.e0 e0Var = sf0Var.f10287d;
            e0Var.i();
            synchronized (e0Var.f33564a) {
                z5 = e0Var.E;
            }
            if (z5) {
                return;
            }
            rf0 rf0Var = sf0Var.f10285b;
            rf0Var.f9930b = new g(rf0Var.f9929a);
            rf0Var.a(new gk0(sf0Var));
        } catch (Exception e3) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.G5)).booleanValue()) {
                if (sf0Var.f10289f == null) {
                    sf0Var.f10289f = xt.e(sf0Var.f10284a);
                }
                sf0Var.f10289f.c("InstallReferrerUnsampled.initializeAndReport", e3);
            } else {
                if (sf0Var.f10288e == null) {
                    sf0Var.f10288e = xt.a(sf0Var.f10284a);
                }
                sf0Var.f10288e.c("InstallReferrer.initializeAndReport", e3);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean zBooleanValue;
        String strB;
        sd0 sd0Var;
        ActivityManager.MemoryInfo memoryInfoI;
        ProfileStore profileStore = null;
        boolean z5 = false;
        int i = 1;
        switch (this.f10103b) {
            case 0:
                az1 az1Var = (az1) ((r) this.f10104c);
                for (fz1 fz1Var : az1Var.f3513t) {
                    fz1Var.k(true);
                    if (fz1Var.f5533g != null) {
                        fz1Var.f5533g = null;
                        fz1Var.f5532f = null;
                    }
                }
                l91 l91Var = az1Var.f3505l;
                z1 z1Var = (z1) l91Var.f7466d;
                if (z1Var != null) {
                    z1Var.c();
                    l91Var.f7466d = null;
                }
                l91Var.f7467e = null;
                return;
            case 1:
                ((b0) this.f10104c).f3537h.h();
                return;
            case 2:
                s0 s0Var = (s0) this.f10104c;
                s0Var.f10116m--;
                return;
            case 3:
                z0 z0Var = (z0) this.f10104c;
                z0Var.f11953c.postVsyncCallback(z0Var);
                return;
            case 4:
                se seVar = (se) this.f10104c;
                synchronized (seVar.f10264p) {
                    if (seVar.f10265q) {
                        return;
                    }
                    seVar.f10265q = true;
                    try {
                        seVar.l();
                        break;
                    } catch (Exception e3) {
                        ((se) this.f10104c).f10256g.c(2023, -1L, e3);
                    }
                    se seVar2 = (se) this.f10104c;
                    synchronized (seVar2.f10264p) {
                        seVar2.f10265q = false;
                        break;
                    }
                    return;
                }
            case 5:
                ue ueVar = (ue) this.f10104c;
                if (ueVar.f10917b != null) {
                    return;
                }
                synchronized (ue.f10913c) {
                    if (ueVar.f10917b != null) {
                        return;
                    }
                    try {
                        zBooleanValue = ((Boolean) al.f2952c3.r()).booleanValue();
                        break;
                    } catch (IllegalStateException unused) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        try {
                            ue.f10914d = dw0.a(((ue) this.f10104c).f10916a.f9475a, "ADSHIELD");
                            z5 = zBooleanValue;
                        } catch (Throwable unused2) {
                        }
                    } else {
                        z5 = zBooleanValue;
                    }
                    ((ue) this.f10104c).f10917b = Boolean.valueOf(z5);
                    ue.f10913c.open();
                    return;
                }
            case 6:
                ((uf) this.f10104c).c();
                return;
            case 7:
                hg hgVar = (hg) this.f10104c;
                hgVar.getClass();
                try {
                    qf qfVar = hgVar.f6127a;
                    DexClassLoader dexClassLoader = qfVar.f9477c;
                    byte[] bArr = qfVar.f9479e;
                    String str = hgVar.f6128b;
                    qfVar.f9478d.getClass();
                    Class<?> clsLoadClass = dexClassLoader.loadClass(new String(c6.w(str, bArr), "UTF-8"));
                    if (clsLoadClass != null) {
                        byte[] bArr2 = qfVar.f9479e;
                        String str2 = hgVar.f6129c;
                        hgVar.f6127a.f9478d.getClass();
                        hgVar.f6130d = clsLoadClass.getMethod(new String(c6.w(str2, bArr2), "UTF-8"), hgVar.f6131e);
                    }
                    break;
                } catch (df | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused3) {
                } catch (Throwable th2) {
                    hgVar.f6132f.countDown();
                    throw th2;
                }
                hgVar.f6132f.countDown();
                return;
            case 8:
                ((gh) this.f10104c).d(3);
                return;
            case 9:
                lh lhVar = (lh) this.f10104c;
                synchronized (lhVar.f7513d) {
                    if (lhVar.f7514e.get() && lhVar.f7515f) {
                        lhVar.f7514e.set(false);
                        u9.i.c("App went background");
                        Iterator it = lhVar.f7516g.iterator();
                        while (it.hasNext()) {
                            try {
                                ((mh) it.next()).l0(false);
                            } catch (Exception e7) {
                                u9.i.f("", e7);
                            }
                        }
                    } else {
                        u9.i.c("App is still foreground");
                    }
                    break;
                }
                return;
            case 10:
                ((hi) this.f10104c).p();
                return;
            case 11:
                a();
                return;
            case 12:
                b();
                return;
            case 13:
                il ilVar = (il) this.f10104c;
                Context context = ilVar.f6527d;
                if (ilVar.f6530g != null || context == null || (strB = q.g.b(context, null)) == null || strB.equals(context.getPackageName())) {
                    return;
                }
                q.g.a(context, strB, ilVar);
                return;
            case 14:
                ((ll) this.f10104c).d();
                return;
            case 15:
                ma.k kVar = (ma.k) this.f10104c;
                if (((ki) kVar.f28784c) == null) {
                    return;
                }
                ((ki) kVar.f28784c).f();
                Binder.flushPendingCommands();
                return;
            case 16:
                ((AtomicBoolean) ((k7) this.f10104c).f7135g).set(false);
                return;
            case 17:
                ((AtomicBoolean) this.f10104c).getAndSet(true);
                return;
            case 18:
                ex exVar = (ex) this.f10104c;
                while (exVar.f5126e.get()) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    t9.g0.f33596l.post(new s(17, atomicBoolean));
                    try {
                        Thread.sleep(exVar.f5127f);
                        if (!atomicBoolean.get()) {
                            wk wkVar = al.f2947bf;
                            yk ykVar = q9.s.f31967e.f31970c;
                            if (((Boolean) ykVar.a(wkVar)).booleanValue() && (sd0Var = exVar.f5123b) != null) {
                                zd1 zd1VarA = sd0Var.a();
                                zd1VarA.v("action", "panr");
                                if (((Boolean) ykVar.a(al.Ef)).booleanValue() && (memoryInfoI = u9.d.i(exVar.f5124c)) != null) {
                                    zd1VarA.v("mem_avl", String.valueOf(memoryInfoI.availMem));
                                    zd1VarA.v("mem_tt", String.valueOf(memoryInfoI.totalMem));
                                    zd1VarA.v("low_m", true != memoryInfoI.lowMemory ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                                }
                                zd1VarA.y();
                            }
                            if (((Boolean) ykVar.a(al.f2961cf)).booleanValue()) {
                                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                                c7.k kVar2 = new c7.k("Potential ANR detected");
                                kVar2.setStackTrace(stackTrace);
                                if (((Boolean) ykVar.a(al.f2978df)).booleanValue()) {
                                    xt.e(exVar.f5124c).d(kVar2, "AnrWatchdog", ((Integer) ykVar.a(al.f2992ef)).intValue() / 100.0f);
                                } else {
                                    p9.k.C.f31302h.d("AnrWatchdog", kVar2);
                                }
                            }
                        }
                        do {
                            try {
                                Thread.sleep(exVar.f5128g);
                            } catch (InterruptedException unused4) {
                                Thread.currentThread().interrupt();
                            }
                        } while (!atomicBoolean.get());
                    } catch (InterruptedException unused5) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                return;
            case 19:
                ((sx) this.f10104c).g();
                return;
            case 20:
                vx vxVar = (vx) ((rx) this.f10104c);
                boolean z10 = vxVar.i;
                ImageView imageView = vxVar.f11520r;
                if (z10 && imageView.getParent() != null) {
                    vxVar.f11506c.removeView(imageView);
                }
                sx sxVar = vxVar.f11511h;
                if (sxVar == null || vxVar.f11519q == null) {
                    return;
                }
                p9.k kVar3 = p9.k.C;
                kVar3.f31304k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (sxVar.getBitmap(vxVar.f11519q) != null) {
                    vxVar.f11521s = true;
                }
                kVar3.f31304k.getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (t9.c0.o()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
                    sb2.append("Spinner frame grab took ");
                    sb2.append(jElapsedRealtime2);
                    sb2.append("ms");
                    t9.c0.m(sb2.toString());
                }
                if (jElapsedRealtime2 > vxVar.f11510g) {
                    u9.i.h("Spinner frame grab crossed jank threshold! Suspending spinner.");
                    vxVar.f11514l = false;
                    vxVar.f11519q = null;
                    el elVar = vxVar.f11508e;
                    if (elVar != null) {
                        elVar.c("spinner_jank", Long.toString(jElapsedRealtime2));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                p9.k.C.A.f9638b.remove((py) this.f10104c);
                return;
            case 22:
                c();
                return;
            case 23:
                d00 d00Var = ((k00) this.f10104c).f7056b;
                hi.h hVar = d00Var.f4408b.Q;
                hVar.f20599d = true;
                if (hVar.f20598c) {
                    hVar.c();
                }
                s9.d dVarG0 = d00Var.f4408b.G0();
                if (dVarG0 != null) {
                    dVarG0.f32817m.removeView(dVarG0.f32812g);
                    dVarG0.q4(true);
                    return;
                }
                return;
            case 24:
                int i10 = k00.J;
                com.google.android.gms.internal.consent_sdk.c cVarA = p9.k.C.f31302h.a();
                String str3 = (String) this.f10104c;
                if (((HashSet) cVarA.f13343g).contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) cVarA.f13342f);
                linkedHashMap.put("ue", str3);
                cVarA.x(cVarA.t((LinkedHashMap) cVarA.f13338b, linkedHashMap), null);
                return;
            case 25:
                l80 l80Var = p9.k.C.f31317x;
                ut0 ut0Var = ((wh0) this.f10104c).f11811a;
                l80Var.getClass();
                l80.s(new qh0(ut0Var, i));
                return;
            case 26:
                u00 u00Var = (u00) this.f10104c;
                sd0 sd0Var2 = u00Var.f10774b;
                p9.k.C.f31304k.getClass();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                q00 q00Var = u00Var.f10773a;
                q00Var.getClass();
                if (!com.google.android.gms.internal.measurement.d4.m("MULTI_PROFILE")) {
                    u9.i.c("WebViewFeature.MULTI_PROFILE is not supported");
                    return;
                }
                try {
                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e10) {
                    u9.i.c("Unable to get ProfileStore instance: ".concat(String.valueOf(e10.getMessage())));
                    try {
                        profileStore = (ProfileStore) Class.forName("androidx.webkit.ProfileStore$-CC").getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e11) {
                        u9.i.c("Unable to get ProfileStore instance: ".concat(String.valueOf(e11.getMessage())));
                    }
                }
                if (profileStore == null) {
                    u9.i.h("WebViewCompat failure: No instance");
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.lf)).booleanValue()) {
                        zd1 zd1VarA2 = sd0Var2.a();
                        zd1VarA2.v("action", "webview_p_f");
                        zd1VarA2.v("webview_p_f", "No instance");
                        zd1VarA2.w();
                        return;
                    }
                    return;
                }
                q00Var.f9252a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                if (((Boolean) q9.s.f31967e.f31970c.a(al.lf)).booleanValue()) {
                    p9.k.C.f31304k.getClass();
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                    zd1 zd1VarA3 = sd0Var2.a();
                    zd1VarA3.v("action", "webview_p_l");
                    zd1VarA3.v("webview_p_l", Long.toString(jElapsedRealtime4));
                    zd1VarA3.w();
                    return;
                }
                return;
            case 27:
                ((w00) this.f10104c).a();
                return;
            case 28:
                d();
                return;
            default:
                ((g30) this.f10104c).f5645c.f6354d.e();
                return;
        }
    }
}
