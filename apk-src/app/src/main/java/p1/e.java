package p1;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f30815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f30822h;

    public e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f30822h = constraintLayout;
        this.f30815a = constraintLayout2;
    }

    public static boolean a(int i, int i10, int i11) {
        if (i == i10) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i11 == size;
        }
        return false;
    }

    public final void b(m1.d dVar, n1.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z5;
        int measuredWidth;
        int baseline;
        int i;
        if (dVar == null) {
            return;
        }
        m1.c cVar = dVar.K;
        m1.c cVar2 = dVar.I;
        if (dVar.f28463g0 == 8) {
            bVar.f28969e = 0;
            bVar.f28970f = 0;
            bVar.f28971g = 0;
            return;
        }
        if (dVar.T == null) {
            return;
        }
        r rVar = ConstraintLayout.f1276q;
        int i10 = bVar.f28965a;
        int i11 = bVar.f28966b;
        int i12 = bVar.f28967c;
        int i13 = bVar.f28968d;
        int i14 = this.f30816b + this.f30817c;
        int i15 = this.f30818d;
        View view = dVar.f28461f0;
        int iM = z.m(i10);
        if (iM == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else if (iM == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f30820f, i15, -2);
        } else if (iM == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f30820f, i15, -2);
            boolean z10 = dVar.f28480r == 1;
            int i16 = bVar.f28973j;
            if (i16 == 1 || i16 == 2) {
                boolean z11 = view.getMeasuredHeight() == dVar.k();
                if (bVar.f28973j == 2 || !z10 || ((z10 && z11) || dVar.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (iM != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i17 = this.f30820f;
            int i18 = cVar2 != null ? cVar2.f28448g : 0;
            if (cVar != null) {
                i18 += cVar.f28448g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i17, i15 + i18, -1);
        }
        int iM2 = z.m(i11);
        if (iM2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else if (iM2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f30821g, i14, -2);
        } else if (iM2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f30821g, i14, -2);
            boolean z12 = dVar.f28481s == 1;
            int i19 = bVar.f28973j;
            if (i19 == 1 || i19 == 2) {
                boolean z13 = view.getMeasuredWidth() == dVar.q();
                if (bVar.f28973j == 2 || !z12 || ((z12 && z13) || dVar.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (iM2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i20 = this.f30821g;
            int i21 = cVar2 != null ? dVar.J.f28448g : 0;
            if (cVar != null) {
                i21 += dVar.L.f28448g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i20, i14 + i21, -1);
        }
        m1.e eVar = (m1.e) dVar.T;
        ConstraintLayout constraintLayout = this.f30822h;
        if (eVar != null && m1.j.c(constraintLayout.f1284j, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f28451a0 && !dVar.z() && a(dVar.G, iMakeMeasureSpec, dVar.q()) && a(dVar.H, iMakeMeasureSpec2, dVar.k())) {
            bVar.f28969e = dVar.q();
            bVar.f28970f = dVar.k();
            bVar.f28971g = dVar.f28451a0;
            return;
        }
        boolean z14 = i10 == 3;
        boolean z15 = i11 == 3;
        boolean z16 = i11 == 4 || i11 == 1;
        boolean z17 = i10 == 4 || i10 == 1;
        boolean z18 = z14 && dVar.W > 0.0f;
        boolean z19 = z15 && dVar.W > 0.0f;
        if (view == null) {
            return;
        }
        d dVar2 = (d) view.getLayoutParams();
        int i22 = bVar.f28973j;
        if (i22 != 1 && i22 != 2 && z14 && dVar.f28480r == 0 && z15 && dVar.f28481s == 0) {
            z5 = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            iMax = 0;
        } else {
            if ((view instanceof s) && (dVar instanceof m1.g)) {
                ((s) view).j((m1.g) dVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            dVar.G = iMakeMeasureSpec;
            dVar.H = iMakeMeasureSpec2;
            dVar.f28462g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i23 = dVar.f28483u;
            int iMax2 = i23 > 0 ? Math.max(i23, measuredWidth2) : measuredWidth2;
            int i24 = dVar.f28484v;
            if (i24 > 0) {
                iMax2 = Math.min(i24, iMax2);
            }
            int i25 = dVar.f28486x;
            iMax = i25 > 0 ? Math.max(i25, measuredHeight) : measuredHeight;
            int i26 = iMakeMeasureSpec2;
            int i27 = dVar.f28487y;
            if (i27 > 0) {
                iMax = Math.min(i27, iMax);
            }
            if (!m1.j.c(constraintLayout.f1284j, 1)) {
                if (z18 && z16) {
                    iMax2 = (int) ((iMax * dVar.W) + 0.5f);
                } else if (z19 && z17) {
                    iMax = (int) ((iMax2 / dVar.W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z5 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i26;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                dVar.G = iMakeMeasureSpec;
                dVar.H = iMakeMeasureSpec3;
                z5 = false;
                dVar.f28462g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i = -1;
        }
        boolean z20 = baseline != i ? true : z5;
        bVar.i = (measuredWidth == bVar.f28967c && iMax == bVar.f28968d) ? z5 : true;
        boolean z21 = dVar2.f30781c0 ? true : z20;
        if (z21 && baseline != -1 && dVar.f28451a0 != baseline) {
            bVar.i = true;
        }
        bVar.f28969e = measuredWidth;
        bVar.f28970f = iMax;
        bVar.f28972h = z21;
        bVar.f28971g = baseline;
    }
}
