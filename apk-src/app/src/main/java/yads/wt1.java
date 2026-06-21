package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wt1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f44466f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile wt1 f44467g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pt1 f44468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tt1 f44469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wu2 f44470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nu2 f44471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public vt1 f44472e;

    public wt1(pt1 pt1Var, tt1 tt1Var, wu2 wu2Var, nu2 nu2Var, vt1 vt1Var) {
        this.f44468a = pt1Var;
        this.f44469b = tt1Var;
        this.f44470c = wu2Var;
        this.f44471d = nu2Var;
        this.f44472e = vt1Var;
    }

    public static final void a(wt1 wt1Var) {
        ArrayList<u61> arrayList;
        tt1 tt1Var = wt1Var.f44469b;
        synchronized (tt1Var.f43428a) {
            arrayList = new ArrayList(tt1Var.f43429b);
            tt1Var.f43429b.clear();
            Unit unit = Unit.f27471a;
        }
        for (u61 u61Var : arrayList) {
            if (u61Var != null) {
                u61Var.a();
            }
        }
    }

    public final void b(Context context, l00 l00Var) {
        boolean z5;
        boolean z10;
        synchronized (f44466f) {
            try {
                u61 u61Var = new u61(this.f44468a, l00Var);
                z5 = true;
                z10 = false;
                if (this.f44472e != vt1.f44121d) {
                    this.f44469b.a(u61Var);
                    if (this.f44472e == vt1.f44119b) {
                        this.f44472e = vt1.f44120c;
                        z10 = true;
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            this.f44468a.f42017a.f42383a.execute(new zl.a1(3, l00Var));
        }
        if (z10) {
            wu2 wu2Var = this.f44470c;
            nu2 nu2Var = this.f44471d;
            wu2Var.getClass();
            lu3 lu3Var = (lu3) nu2Var;
            y10 y10Var = new y10(lu3Var.a());
            hk.s1 s1Var = new hk.s1();
            ok.e eVar = hk.k0.f20682a;
            this.f44468a.f42017a.f42384b.execute(new vu2(context, lu3Var, hk.c0.a(kotlin.coroutines.e.d(s1Var, ok.d.f30722d).plus(y10Var)), ut1.a(lu3Var)));
        }
    }

    public final void a(tu2 tu2Var) {
        if (tu2Var instanceof su2) {
            synchronized (f44466f) {
                this.f44472e = vt1.f44121d;
                Unit unit = Unit.f27471a;
            }
        } else if (tu2Var instanceof ru2) {
            synchronized (f44466f) {
                this.f44472e = vt1.f44119b;
                Unit unit2 = Unit.f27471a;
            }
        }
        pt1 pt1Var = this.f44468a;
        pt1Var.f42017a.f42383a.execute(new zl.a1(4, this));
    }

    public final void a(Context context, l00 l00Var) {
        j1.a(context);
        pt1 pt1Var = this.f44468a;
        pt1Var.f42017a.f42384b.execute(new q0.o(this, context, l00Var, 23));
    }

    public static final void a(wt1 wt1Var, Context context, l00 l00Var) {
        wt1Var.b(context, l00Var);
    }

    public static final void a(l00 l00Var) {
        l00Var.onInitializationCompleted();
    }
}
