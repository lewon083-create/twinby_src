package a1;

import android.os.Looper;
import android.view.View;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.yd1;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e1.a0;
import e1.c0;
import fj.o0;
import g0.a1;
import io.appmetrica.analytics.impl.cp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledFuture;
import o4.v;
import s3.e0;
import t.h2;
import t.z;
import x0.b0;
import yads.sp2;
import yads.wk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f379d;

    public /* synthetic */ q(Object obj, int i, int i10) {
        this.f377b = i10;
        this.f379d = obj;
        this.f378c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        c0 c0Var;
        int i = 3;
        switch (this.f377b) {
            case 0:
                s sVar = (s) this.f379d;
                int i10 = this.f378c;
                int i11 = sVar.f394l;
                if (i11 == i10) {
                    return;
                }
                int i12 = sVar.f391h;
                sVar.f394l = (i10 / i12) * i12;
                StringBuilder sbM = l7.o.m(i11, "Update buffer size from ", " to ");
                sbM.append(sVar.f394l);
                com.google.android.gms.internal.auth.g.e("BufferedAudioStream", sbM.toString());
                return;
            case 1:
                a0 a0Var = (a0) this.f379d;
                int i13 = this.f378c;
                c0 c0Var2 = a0Var.f15894l;
                if (a0Var.f15892j) {
                    com.google.android.gms.internal.auth.g.O(c0Var2.f15917a, "Receives input frame after codec is reset.");
                    return;
                }
                switch (z.m(c0Var2.G)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c0Var2.f15927l.offer(Integer.valueOf(i13));
                        c0Var2.d();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(om1.E(c0Var2.G)));
                }
            case 2:
                io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f379d;
                int i14 = this.f378c;
                h3.e eVar2 = (h3.e) eVar.f25691b.f15509e;
                if ((4 & i14) == 0) {
                    ((ii.q) eVar2.f20375c).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                } else {
                    ((ii.q) eVar2.f20375c).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                    return;
                }
            case 3:
                ((k3.d) this.f379d).f26847b.onAudioFocusChange(this.f378c);
                return;
            case 4:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f379d;
                int i15 = this.f378c;
                View view = (View) sideSheetBehavior.f14657o.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i15, false);
                    return;
                }
                return;
            case 5:
                e0 e0Var = (e0) this.f379d;
                int i16 = this.f378c;
                t3.d dVar = e0Var.f32522x;
                int i17 = ((s3.a) e0Var.f32495b[i16].f10399e).f32431c;
                dVar.z(dVar.y(), 1033, new t3.b(12));
                return;
            case 6:
                ((g0.p) this.f379d).a(this.f378c);
                return;
            case 7:
                LinkedHashSet<h2> linkedHashSet = (LinkedHashSet) this.f379d;
                int i18 = this.f378c;
                for (h2 h2Var : linkedHashSet) {
                    if (i18 == 5) {
                        synchronized (h2Var.f33095p) {
                            try {
                                if (h2Var.l() && h2Var.f33096q != null) {
                                    h2Var.k("Close DeferrableSurfaces for CameraDevice error.");
                                    Iterator it = h2Var.f33096q.iterator();
                                    while (it.hasNext()) {
                                        ((a1) it.next()).a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        h2Var.getClass();
                    }
                }
                return;
            case 8:
                v vVar = (v) this.f379d;
                int i19 = this.f378c;
                s3.t tVar = vVar.f29701b;
                String str = m3.z.f28608a;
                yd1 yd1Var = tVar.f32648b.D;
                o0 o0Var = new o0(i19, i);
                yd1Var.getClass();
                h5.r(Looper.myLooper() == ((m3.v) yd1Var.f12601d).f28601a.getLooper());
                yd1Var.f12599b++;
                yd1Var.c(new cp(26, yd1Var, o0Var));
                yd1Var.e(Integer.valueOf(i19));
                return;
            case 9:
                ((w1.b) this.f379d).e(this.f378c);
                return;
            case 10:
                b0 b0Var = (b0) this.f379d;
                int i20 = this.f378c;
                int i21 = b0Var.f35548l0;
                b0Var.f35548l0 = i20;
                if (i21 == i20) {
                    com.google.android.gms.internal.auth.g.e("Recorder", "Video source transitions to the same state: ".concat(pe.a.z(i20)));
                    return;
                }
                com.google.android.gms.internal.auth.g.e("Recorder", "Video source has transitioned to state: ".concat(pe.a.z(i20)));
                if (i20 != 3) {
                    if (i20 != 2 || (scheduledFuture = b0Var.Z) == null || !scheduledFuture.cancel(false) || (c0Var = b0Var.G) == null) {
                        return;
                    }
                    b0.r(c0Var);
                    return;
                }
                if (b0Var.C != null) {
                    b0Var.f35528a0 = true;
                    x0.h hVar = b0Var.f35554r;
                    if (hVar == null || hVar.f35610m) {
                        return;
                    }
                    b0Var.s(hVar, 4, null);
                    return;
                }
                k6.o oVar = b0Var.f35540g0;
                if (oVar != null) {
                    if (!oVar.f27141b) {
                        oVar.f27141b = true;
                        ScheduledFuture scheduledFuture2 = (ScheduledFuture) oVar.f27145f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            oVar.f27145f = null;
                        }
                    }
                    b0Var.f35540g0 = null;
                }
                b0Var.v(false);
                return;
            case 11:
                ((sp2) this.f379d).a(this.f378c);
                return;
            default:
                ((wk) this.f379d).a(this.f378c);
                return;
        }
    }

    public /* synthetic */ q(e0 e0Var, int i, boolean z5) {
        this.f377b = 5;
        this.f379d = e0Var;
        this.f378c = i;
    }
}
