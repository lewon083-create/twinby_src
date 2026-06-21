package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.util.Log;
import android.webkit.WebView;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kr0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7290c;

    public /* synthetic */ kr0() {
        this.f7289b = 13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ed.d dVar;
        byte b2 = 0;
        switch (this.f7289b) {
            case 0:
                mr0 mr0Var = (mr0) this.f7290c;
                synchronized (mr0Var) {
                    HashMap map = mr0Var.f8003d;
                    ArrayList arrayList = new ArrayList(map.keySet());
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
                        lr0 lr0Var = (lr0) map.get(scheduledFuture);
                        if (lr0Var != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                            scheduledFuture.cancel(false);
                            map.remove(scheduledFuture);
                            p9.k.C.f31304k.getClass();
                            long jCurrentTimeMillis = lr0Var.f7599b - System.currentTimeMillis();
                            Runnable runnable = lr0Var.f7598a;
                            long jMax = Math.max(0L, jCurrentTimeMillis);
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            mr0Var.a(runnable, jMax);
                        }
                    }
                }
                return;
            case 1:
                cu0 cu0Var = (cu0) this.f7290c;
                AtomicBoolean atomicBoolean = cu0Var.f4317e;
                AudioManager audioManager = cu0Var.f4315c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f10 = 0.0f;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f10 = streamVolume / streamMaxVolume;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) cu0Var.f4316d.getAndSet(Float.valueOf(f10))).floatValue() != f10) {
                    cu0Var.f4313a.post(new bu0(this, f10));
                    return;
                }
                return;
            case 2:
                ((WebView) this.f7290c).destroy();
                return;
            case 3:
                ut utVar = ((vu0) this.f7290c).f11489e;
                utVar.getClass();
                xu0 xu0Var = new xu0(utVar);
                oq0 oq0Var = (oq0) utVar.f11062d;
                xu0Var.f11898a = oq0Var;
                ArrayDeque arrayDeque = (ArrayDeque) oq0Var.f8763d;
                arrayDeque.add(xu0Var);
                if (((wu0) oq0Var.f8764e) == null) {
                    wu0 wu0Var = (wu0) arrayDeque.poll();
                    oq0Var.f8764e = wu0Var;
                    if (wu0Var != null) {
                        wu0Var.executeOnExecutor((ThreadPoolExecutor) oq0Var.f8762c, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                sb.g gVar = (sb.g) this.f7290c;
                gw0 gw0Var = new gw0();
                Log.d("GASS", "Clearcut logging disabled");
                gVar.b(new dw0(gw0Var));
                return;
            case 5:
                ((HttpURLConnection) this.f7290c).disconnect();
                return;
            case 6:
                q01 q01Var = (q01) this.f7290c;
                x01 x01Var = (x01) q01Var.f9253a.j();
                long j10 = q01Var.f9257e;
                if (j10 > 0) {
                    x01Var.f11963e.a(new kr0(7, x01Var), j10);
                    return;
                } else {
                    x01Var.a();
                    return;
                }
            case 7:
                ((x01) this.f7290c).a();
                return;
            case 8:
                b21 b21Var = (b21) this.f7290c;
                ed.d dVarB = ((gx) b21Var.f3563e).b(new do0(9, b21Var));
                b21Var.f3562d.e(53, dVarB);
                b21Var.f3566h = dVarB;
                return;
            case 9:
                c21 c21Var = (c21) this.f7290c;
                bf bfVar = new bf(4, c21Var);
                try {
                    Object systemService = c21Var.f4002b.getSystemService("connectivity");
                    if (systemService == null) {
                        throw null;
                    }
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(bfVar);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 10:
                h21 h21Var = (h21) this.f7290c;
                vf vfVar = new vf(1, h21Var);
                try {
                    Object systemService2 = h21Var.f6005b.getSystemService("appops");
                    if (systemService2 == null) {
                        throw null;
                    }
                    ((AppOpsManager) systemService2).startWatchingActive(h21.f6004h, h21Var.f6006c, vfVar);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 11:
                yi0 yi0Var = ((w21) this.f7290c).f11603b;
                ((fa1) yi0Var.f12625e).a("unlinkToDeath", new Object[0]);
                n21 n21Var = (n21) yi0Var.f12630k;
                n21Var.getClass();
                ((cb.a) n21Var).f2256c.unlinkToDeath((x21) yi0Var.i, 0);
                yi0Var.f12630k = null;
                yi0Var.f12622b = false;
                return;
            case 12:
                yi0 yi0Var2 = (yi0) this.f7290c;
                if (((n21) yi0Var2.f12630k) != null) {
                    ((fa1) yi0Var2.f12625e).a("Unbind from service.", new Object[0]);
                    Context context = (Context) yi0Var2.f12623c;
                    w21 w21Var = (w21) yi0Var2.f12629j;
                    w21Var.getClass();
                    context.unbindService(w21Var);
                    yi0Var2.f12622b = false;
                    yi0Var2.f12630k = null;
                    yi0Var2.f12629j = null;
                    ArrayList arrayList2 = (ArrayList) yi0Var2.f12627g;
                    synchronized (arrayList2) {
                        arrayList2.clear();
                        break;
                    }
                    return;
                }
                return;
            case 13:
                a91 a91Var = (a91) this.f7290c;
                if (a91Var == null || (dVar = a91Var.i) == null) {
                    return;
                }
                this.f7290c = null;
                if (dVar.isDone()) {
                    a91Var.n(dVar);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture2 = a91Var.f2819j;
                    a91Var.f2819j = null;
                    String string = "Timed out";
                    if (scheduledFuture2 != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture2.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(jAbs).length() + 55);
                                sb2.append("Timed out (timeout delayed by ");
                                sb2.append(jAbs);
                                sb2.append(" ms after scheduled time)");
                                string = sb2.toString();
                            }
                        } catch (Throwable th2) {
                            a91Var.f(new z81(string, 0));
                            throw th2;
                        }
                    }
                    String string2 = dVar.toString();
                    StringBuilder sb3 = new StringBuilder(string.length() + 2 + string2.length());
                    sb3.append(string);
                    sb3.append(": ");
                    sb3.append(string2);
                    a91Var.f(new z81(sb3.toString(), 0));
                    return;
                } finally {
                    dVar.cancel(true);
                }
            case 14:
                ot1 ot1Var = (ot1) this.f7290c;
                String str = cq0.f4293a;
                int iGenerateAudioSessionId = nz.c(ot1Var.f8780g).generateAudioSessionId();
                int i10 = iGenerateAudioSessionId != -1 ? iGenerateAudioSessionId : 0;
                yd1 yd1Var = ot1Var.C;
                Integer numValueOf = Integer.valueOf(i10);
                yd1Var.f12604g = numValueOf;
                l81 l81Var = new l81(20, yd1Var, numValueOf);
                lo0 lo0Var = (lo0) yd1Var.f12601d;
                if (lo0Var.f7588a.getLooper().getThread().isAlive()) {
                    lo0Var.e(l81Var);
                    return;
                }
                return;
            case 15:
                bv1 bv1Var = ((ut1) this.f7290c).f11095w;
                bv1Var.r(bv1Var.t(), 1034, new jl1(29, b2 == true ? 1 : 0));
                return;
            case 16:
                ou1 ou1Var = (ou1) this.f7290c;
                try {
                    synchronized (ou1Var) {
                    }
                    try {
                        ou1Var.f8806a.c(ou1Var.f8808c, ou1Var.f8809d);
                        return;
                    } finally {
                        ou1Var.b(true);
                    }
                } catch (bt1 e3) {
                    rs.H("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e3);
                    throw new RuntimeException(e3);
                }
            case 17:
                bv1 bv1Var2 = (bv1) this.f7290c;
                bv1Var2.r(bv1Var2.t(), 1028, new zu1(21));
                bv1Var2.f3919f.k();
                return;
            case 18:
                nw1 nw1Var = (nw1) this.f7290c;
                if (nw1Var.U >= 300000) {
                    ((pw1) nw1Var.f8472l.f9149c).O0 = true;
                    nw1Var.U = 0L;
                    return;
                }
                return;
            default:
                b4.h hVar = (b4.h) this.f7290c;
                Object obj = hVar.f1886b;
                synchronized (obj) {
                    try {
                        if (hVar.f1897n) {
                            return;
                        }
                        long j11 = hVar.f1896m - 1;
                        hVar.f1896m = j11;
                        if (j11 > 0) {
                            return;
                        }
                        if (j11 >= 0) {
                            hVar.c();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (obj) {
                            hVar.f1898o = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ kr0(int i, Object obj) {
        this.f7289b = i;
        this.f7290c = obj;
    }

    public /* synthetic */ kr0(ut1 ut1Var, int i) {
        this.f7289b = 15;
        this.f7290c = ut1Var;
    }

    public kr0(ru0 ru0Var) {
        this.f7289b = 2;
        this.f7290c = ru0Var.f10067e;
    }

    public kr0(vu0 vu0Var) {
        this.f7289b = 3;
        Objects.requireNonNull(vu0Var);
        this.f7290c = vu0Var;
    }
}
