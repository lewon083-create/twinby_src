package k9;

import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.jf0;
import com.google.android.gms.internal.ads.zl;
import java.util.concurrent.atomic.AtomicLong;
import pa.c0;
import q9.g2;
import q9.g3;
import q9.l0;
import q9.w2;
import q9.y1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f27273b;

    public l(Context context) {
        super(context);
        this.f27273b = new g2(this);
    }

    public final void a() {
        al.a(getContext());
        if (((Boolean) zl.f13029e.r()).booleanValue()) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3171qc)).booleanValue()) {
                u9.b.f34371b.execute(new w(this, 2));
                return;
            }
        }
        g2 g2Var = this.f27273b;
        g2Var.getClass();
        try {
            l0 l0Var = g2Var.i;
            if (l0Var != null) {
                l0Var.h();
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    public final void b(g gVar) {
        c0.e("#008 Must be called on the main UI thread.");
        al.a(getContext());
        if (((Boolean) zl.f13030f.r()).booleanValue()) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3216tc)).booleanValue()) {
                u9.b.f34371b.execute(new k0.i(13, this, gVar));
                return;
            }
        }
        this.f27273b.b(gVar.f27259a);
    }

    public c getAdListener() {
        return this.f27273b.f31866f;
    }

    public h getAdSize() {
        g3 g3VarQ;
        g2 g2Var = this.f27273b;
        g2Var.getClass();
        try {
            l0 l0Var = g2Var.i;
            if (l0Var != null && (g3VarQ = l0Var.q()) != null) {
                return new h(g3VarQ.f31879f, g3VarQ.f31876c, g3VarQ.f31875b);
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
        h[] hVarArr = g2Var.f31867g;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        l0 l0Var;
        g2 g2Var = this.f27273b;
        if (g2Var.f31870k == null && (l0Var = g2Var.i) != null) {
            try {
                g2Var.f31870k = l0Var.A();
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            }
        }
        return g2Var.f31870k;
    }

    public o getOnPaidEventListener() {
        return this.f27273b.f31873n;
    }

    public long getPlacementId() {
        g2 g2Var = this.f27273b;
        AtomicLong atomicLong = g2Var.f31874o;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            l0 l0Var = g2Var.i;
            if (l0Var == null) {
                return 0L;
            }
            atomicLong.set(l0Var.g0());
            return atomicLong.get();
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
            return 0L;
        }
    }

    public r getResponseInfo() {
        l0 l0Var;
        g2 g2Var = this.f27273b;
        g2Var.getClass();
        try {
            l0Var = g2Var.i;
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
        y1 y1VarB = l0Var != null ? l0Var.B() : null;
        if (y1VarB != null) {
            return new r(y1VarB);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i13 = ((i11 - i) - measuredWidth) / 2;
        int i14 = ((i12 - i10) - measuredHeight) / 2;
        childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        h adSize;
        int measuredHeight;
        int iB;
        int iB2;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e3) {
                u9.i.f("Unable to retrieve ad size.", e3);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i11 = adSize.f27263a;
                if (i11 == -3) {
                    iB = -1;
                } else if (i11 != -1) {
                    u9.d dVar = q9.r.f31959g.f31960a;
                    iB = u9.d.b(context, i11);
                } else {
                    iB = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i12 = adSize.f27264b;
                if (i12 == -4 || i12 == -3) {
                    iB2 = -1;
                } else if (i12 != -2) {
                    u9.d dVar2 = q9.r.f31959g.f31960a;
                    iB2 = u9.d.b(context, i12);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f10 = displayMetrics.heightPixels;
                    float f11 = displayMetrics.density;
                    int i13 = (int) (f10 / f11);
                    iB2 = (int) ((i13 <= 400 ? 32 : i13 <= 720 ? 50 : 90) * f11);
                }
                measuredHeight = iB2;
                measuredWidth = iB;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i, i10);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(c cVar) {
        g2 g2Var = this.f27273b;
        g2Var.f31866f = cVar;
        jf0 jf0Var = g2Var.f31864d;
        synchronized (jf0Var.f6840c) {
            jf0Var.f6841d = cVar;
        }
        if (cVar == 0) {
            g2Var.c(null);
            return;
        }
        if (cVar instanceof q9.a) {
            g2Var.c((q9.a) cVar);
        }
        if (cVar instanceof l9.d) {
            g2Var.e((l9.d) cVar);
        }
    }

    public void setAdSize(h hVar) {
        h[] hVarArr = {hVar};
        g2 g2Var = this.f27273b;
        if (g2Var.f31867g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        g2Var.d(hVarArr);
    }

    public void setAdUnitId(String str) {
        g2 g2Var = this.f27273b;
        if (g2Var.f31870k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        g2Var.f31870k = str;
    }

    public void setOnPaidEventListener(o oVar) {
        g2 g2Var = this.f27273b;
        g2Var.getClass();
        try {
            g2Var.f31873n = oVar;
            l0 l0Var = g2Var.i;
            if (l0Var != null) {
                l0Var.B2(new w2(oVar));
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    public void setPlacementId(long j10) {
        g2 g2Var = this.f27273b;
        g2Var.f31874o.set(j10);
        try {
            l0 l0Var = g2Var.i;
            if (l0Var != null) {
                l0Var.e1(j10);
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }
}
