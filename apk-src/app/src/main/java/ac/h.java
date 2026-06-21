package ac;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import g2.n0;
import io.appmetrica.analytics.impl.lp;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import oa.m;
import oa.y;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f754e;

    public /* synthetic */ h() {
        this.f750a = 1;
    }

    public y a() {
        c0.a("execute parameter required", ((m) this.f753d) != null);
        return new y(this, (ma.d[]) this.f754e, this.f751b, this.f752c);
    }

    public void b(int i) {
        switch (this.f750a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f754e;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f752c = i;
                    if (!this.f751b) {
                        View view = (View) bottomSheetBehavior.U.get();
                        g gVar = (g) this.f753d;
                        Field field = n0.f19900a;
                        view.postOnAnimation(gVar);
                        this.f751b = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f754e;
                WeakReference weakReference2 = sideSheetBehavior.f14657o;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f752c = i;
                    if (!this.f751b) {
                        View view2 = (View) sideSheetBehavior.f14657o.get();
                        lp lpVar = (lp) this.f753d;
                        Field field2 = n0.f19900a;
                        view2.postOnAnimation(lpVar);
                        this.f751b = true;
                    }
                    break;
                }
                break;
        }
    }

    public h(u7.f fVar, KeyEvent keyEvent) {
        this.f750a = 3;
        this.f754e = fVar;
        this.f752c = ((xh.y[]) fVar.f34322c).length;
        this.f751b = false;
        this.f753d = keyEvent;
    }

    public h(SideSheetBehavior sideSheetBehavior) {
        this.f750a = 2;
        this.f754e = sideSheetBehavior;
        this.f753d = new lp(18, this);
    }

    public h(BottomSheetBehavior bottomSheetBehavior) {
        this.f750a = 0;
        this.f754e = bottomSheetBehavior;
        this.f753d = new g(0, this);
    }
}
