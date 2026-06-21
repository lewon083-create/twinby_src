package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class iw2 implements d83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h92 f39658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kn2 f39659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n61 f39660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yc2 f39661d;

    public iw2(vw1 vw1Var, kn2 kn2Var, n61 n61Var, yc2 yc2Var) {
        this.f39658a = vw1Var;
        this.f39659b = kn2Var;
        this.f39660c = n61Var;
        this.f39661d = yc2Var;
    }

    @Override // yads.d83
    public final void a(n12 n12Var) {
        n61 n61Var = this.f39660c;
        n61Var.f41179b.removeCallbacksAndMessages(null);
        View viewA = n12Var.f41135c.a();
        if (viewA instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewA;
            p61 p61Var = n61Var.f41178a.f41471a;
            WeakReference weakReference = (WeakReference) p61Var.f41827d.get(frameLayout);
            mq mqVar = weakReference != null ? (mq) weakReference.get() : null;
            if (mqVar != null) {
                p61Var.f41827d.remove(frameLayout);
                frameLayout.removeView(mqVar);
            }
            WeakReference weakReference2 = (WeakReference) p61Var.f41828e.get(frameLayout);
            r61 r61Var = weakReference2 != null ? (r61) weakReference2.get() : null;
            if (r61Var != null) {
                p61Var.f41828e.remove(frameLayout);
                frameLayout.removeView(r61Var);
            }
        }
    }

    @Override // yads.d83
    public final void a(f61 f61Var) {
        ((vw1) this.f39658a).f44206j = f61Var;
    }

    @Override // yads.d83
    public final void a(o42 o42Var) {
        this.f39659b.f40293d.f39920c.f39595g = o42Var;
    }

    @Override // yads.d83
    public final void a(Context context, o32 o32Var, n12 n12Var) {
        boolean z5;
        kn2 kn2Var = this.f39659b;
        if (!kn2Var.f40295f) {
            kn2Var.f40295f = true;
            hn2 hn2Var = kn2Var.f40294e;
            hn2Var.f39256c.post(new gn2(hn2Var, hn2Var.f39254a));
        }
        ((vw1) this.f39658a).a();
        this.f39661d.a(o32Var);
        if (n12Var != null) {
            n61 n61Var = this.f39660c;
            n61Var.f41180c.getClass();
            gw2 gw2VarA = fw2.a();
            pt2 pt2VarA = gw2VarA.a(context);
            Boolean bool = pt2VarA != null ? pt2VarA.N : null;
            synchronized (gw2.f38918j) {
                z5 = gw2VarA.f38923d;
            }
            boolean zC = gw2VarA.c();
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return;
                }
            } else if ((!z5 || !ub.a(context)) && !zC) {
                return;
            }
            n61Var.f41179b.post(new m61(n61Var, n12Var));
        }
    }

    @Override // yads.d83
    public final void a(o32 o32Var) {
        kn2 kn2Var = this.f39659b;
        kn2Var.f40295f = false;
        kn2Var.f40294e.f39256c.removeCallbacksAndMessages(null);
        ((vw1) this.f39658a).b();
        this.f39661d.b(o32Var);
        this.f39660c.f41179b.removeCallbacksAndMessages(null);
    }

    @Override // yads.d83
    public final void a(v9 v9Var, List list) {
        ((vw1) this.f39658a).a(v9Var, list);
    }
}
