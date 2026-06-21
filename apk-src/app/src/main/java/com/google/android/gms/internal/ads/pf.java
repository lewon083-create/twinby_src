package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pf implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9040d;

    public /* synthetic */ pf(ut1 ut1Var, int i, boolean z5) {
        this.f9038b = 6;
        this.f9040d = ut1Var;
        this.f9039c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wd wdVarO;
        int i = 4;
        switch (this.f9038b) {
            case 0:
                int i10 = this.f9039c;
                qf qfVar = (qf) this.f9040d;
                if (i10 > 0) {
                    try {
                        Thread.sleep(i10 * 1000);
                        break;
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = qfVar.f9475a;
                    wdVarO = gr.o(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    wdVarO = null;
                }
                qf qfVar2 = (qf) this.f9040d;
                qfVar2.f9482h = wdVarO;
                int i11 = this.f9039c;
                if (i11 < 4) {
                    if (wdVarO == null || !wdVarO.Z() || wdVarO.u0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !wdVarO.y0() || !wdVarO.z0().z() || wdVarO.z0().A() == -2) {
                        int i12 = i11 + 1;
                        if (qfVar2.f9485l) {
                            Future<?> futureSubmit = qfVar2.f9476b.submit(new pf(qfVar2, i12, z ? 1 : 0));
                            if (i12 == 0) {
                                qfVar2.i = futureSubmit;
                            }
                            break;
                        }
                    }
                }
                break;
            case 1:
                il ilVar = (il) this.f9040d;
                int i13 = this.f9039c;
                sd0 sd0Var = ilVar.f6528e;
                if (sd0Var != null) {
                    zd1 zd1VarA = sd0Var.a();
                    zd1VarA.v("action", "cct_nav");
                    zd1VarA.v("cct_navs", String.valueOf(i13));
                    zd1VarA.w();
                }
                break;
            case 2:
                ((yx) this.f9040d).f12789b.onAudioFocusChange(this.f9039c);
                break;
            case 3:
                qx qxVar = (qx) this.f9040d;
                int i14 = this.f9039c;
                vx vxVar = qxVar.f9633r;
                if (vxVar != null) {
                    vxVar.onWindowVisibilityChanged(i14);
                }
                break;
            case 4:
                jy jyVar = (jy) this.f9040d;
                int i15 = this.f9039c;
                vx vxVar2 = jyVar.f6993h;
                if (vxVar2 != null) {
                    vxVar2.onWindowVisibilityChanged(i15);
                }
                break;
            case 5:
                ((x01) this.f9040d).b(this.f9039c + 1);
                break;
            case 6:
                ut1 ut1Var = (ut1) this.f9040d;
                int i16 = ((gx1) ut1Var.f11072b[this.f9039c].f10399e).f5933c;
                bv1 bv1Var = ut1Var.f11095w;
                bv1Var.r(bv1Var.y(), 1033, new zu1(i));
                break;
            case 7:
                g1 g1Var = (g1) this.f9040d;
                int i17 = this.f9039c;
                g1Var.getClass();
                String str = cq0.f4293a;
                ht1 ht1Var = g1Var.f5591b;
                gt1 gt1Var = new gt1(i17);
                yd1 yd1Var = ht1Var.f6261b.C;
                ix.k0(Looper.myLooper() == ((lo0) yd1Var.f12601d).f7588a.getLooper());
                yd1Var.f12599b++;
                l81 l81Var = new l81(22, yd1Var, gt1Var);
                lo0 lo0Var = (lo0) yd1Var.f12600c;
                if (lo0Var.f7588a.getLooper().getThread().isAlive()) {
                    lo0Var.e(l81Var);
                }
                yd1Var.j(Integer.valueOf(i17));
                break;
            case 8:
                ((com.google.android.material.datepicker.m) this.f9040d).f14590c0.smoothScrollToPosition(this.f9039c);
                break;
            case 9:
                m4.d dVar = (m4.d) this.f9040d;
                int i18 = this.f9039c;
                w1.b bVar = (w1.b) dVar.f28630b;
                if (bVar != null) {
                    bVar.e(i18);
                }
                break;
            case 10:
                ((oa.p) this.f9040d).b(this.f9039c);
                break;
            case 11:
                ((SystemForegroundService) this.f9040d).f1788f.cancel(this.f9039c);
                break;
            case 12:
                ArrayList arrayList = (ArrayList) this.f9040d;
                int size = arrayList.size();
                if (this.f9039c != 1) {
                    for (int i19 = 0; i19 < size; i19++) {
                        ((u2.f) arrayList.get(i19)).a();
                    }
                } else {
                    for (int i20 = 0; i20 < size; i20++) {
                        ((u2.f) arrayList.get(i20)).b();
                    }
                }
                break;
            default:
                ((RecyclerView) this.f9040d).smoothScrollToPosition(this.f9039c);
                break;
        }
    }

    public /* synthetic */ pf(Object obj, int i, int i10) {
        this.f9038b = i10;
        this.f9039c = i;
        this.f9040d = obj;
    }

    public pf(int i, y6.k kVar) {
        this.f9038b = 13;
        this.f9039c = i;
        this.f9040d = kVar;
    }

    public pf(List list, int i, Throwable th2) {
        this.f9038b = 12;
        f2.g.g(list, "initCallbacks cannot be null");
        this.f9040d = new ArrayList(list);
        this.f9039c = i;
    }
}
