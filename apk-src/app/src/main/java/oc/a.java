package oc;

import a0.u;
import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.i0;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d.l;
import ed.d;
import g0.r0;
import g2.n0;
import h2.q;
import j1.h;
import j1.i;
import j3.h0;
import j3.o0;
import j3.x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import m3.k;
import s3.u0;
import t.m0;
import t.z;
import yads.hm1;
import yads.oe2;
import yads.of1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements q, k, k0.a, i, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30631d;

    public /* synthetic */ a(Object obj, int i, int i10) {
        this.f30629b = i10;
        this.f30631d = obj;
        this.f30630c = i;
    }

    @Override // k0.a
    public d apply(Object obj) {
        m0 m0Var = (m0) this.f30631d;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        m0Var.f33158d.getClass();
        if (r0.i(this.f30630c, totalCaptureResult)) {
            m0Var.f33161g = m0.f33154k;
        }
        return m0Var.i.a(totalCaptureResult);
    }

    @Override // h2.q
    public boolean c(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f30631d;
        int i = this.f30630c;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(u.o(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.f14657o;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.r(i);
            return true;
        }
        View view2 = (View) sideSheetBehavior.f14657o.get();
        a1.q qVar = new a1.q(sideSheetBehavior, i, 4);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            Field field = n0.f19900a;
            if (view2.isAttachedToWindow()) {
                view2.post(qVar);
                return true;
            }
        }
        qVar.run();
        return true;
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        switch (this.f30629b) {
            case 1:
                o0 o0Var = ((u0) this.f30631d).f32657a;
                ((h0) obj).j(this.f30630c);
                break;
            case 2:
                ((h0) obj).h((x) this.f30631d, this.f30630c);
                break;
            default:
                ((oe2) obj).a((hm1) this.f30631d, this.f30630c);
                break;
        }
    }

    @Override // j1.i
    public Object m(h hVar) {
        i0 i0Var = (i0) this.f30631d;
        j0.i iVar = (j0.i) i0Var.f6315e;
        int i = this.f30630c;
        iVar.execute(new l(i0Var, hVar, i, 7));
        return z.d(i, "]", new StringBuilder("setExposureCompensationIndex["));
    }
}
