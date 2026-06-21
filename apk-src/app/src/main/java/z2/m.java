package z2;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.twinby.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f45898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f45899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f45900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45902e;

    public m(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f45898a = container;
        this.f45899b = new ArrayList();
        this.f45900c = new ArrayList();
    }

    public static final m j(ViewGroup container, h0 fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        t.t0 factory = fragmentManager.I();
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof m) {
            return (m) tag;
        }
        factory.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        m mVar = new m(container);
        Intrinsics.checkNotNullExpressionValue(mVar, "factory.createController(container)");
        container.setTag(R.id.special_effects_controller_view_tag, mVar);
        return mVar;
    }

    public final void a(q0 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.i) {
            s0 s0Var = operation.f45937a;
            View viewN = operation.f45939c.N();
            Intrinsics.checkNotNullExpressionValue(viewN, "operation.fragment.requireView()");
            s0Var.a(viewN, this.f45898a);
            operation.i = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.m.b(java.util.ArrayList, boolean):void");
    }

    public final void c(List operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            kotlin.collections.x.m(arrayList, ((q0) it.next()).f45946k);
        }
        List listR = CollectionsKt.R(CollectionsKt.V(arrayList));
        int size = listR.size();
        for (int i = 0; i < size; i++) {
            ((p0) listR.get(i)).b(this.f45898a);
        }
        int size2 = operations.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a((q0) operations.get(i10));
        }
        List listR2 = CollectionsKt.R(operations);
        int size3 = listR2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            q0 q0Var = (q0) listR2.get(i11);
            if (q0Var.f45946k.isEmpty()) {
                q0Var.b();
            }
        }
    }

    public final void d(s0 s0Var, r0 r0Var, m0 m0Var) {
        synchronized (this.f45899b) {
            try {
                t tVar = m0Var.f45905c;
                Intrinsics.checkNotNullExpressionValue(tVar, "fragmentStateManager.fragment");
                q0 q0VarG = g(tVar);
                if (q0VarG == null) {
                    t tVar2 = m0Var.f45905c;
                    if (tVar2.f45979n) {
                        Intrinsics.checkNotNullExpressionValue(tVar2, "fragmentStateManager.fragment");
                        q0VarG = h(tVar2);
                    } else {
                        q0VarG = null;
                    }
                }
                if (q0VarG != null) {
                    q0VarG.d(s0Var, r0Var);
                    return;
                }
                q0 q0Var = new q0(s0Var, r0Var, m0Var);
                this.f45899b.add(q0Var);
                d listener = new d(this, q0Var, 1);
                Intrinsics.checkNotNullParameter(listener, "listener");
                q0Var.f45940d.add(listener);
                d listener2 = new d(this, q0Var, 2);
                Intrinsics.checkNotNullParameter(listener2, "listener");
                q0Var.f45940d.add(listener2);
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(s0 finalState, m0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (h0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.f45905c);
        }
        d(finalState, r0.f45950c, fragmentStateManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.m.f():void");
    }

    public final q0 g(t tVar) {
        Object next;
        Iterator it = this.f45899b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            q0 q0Var = (q0) next;
            if (Intrinsics.a(q0Var.f45939c, tVar) && !q0Var.f45941e) {
                break;
            }
        }
        return (q0) next;
    }

    public final q0 h(t tVar) {
        Object next;
        Iterator it = this.f45900c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            q0 q0Var = (q0) next;
            if (Intrinsics.a(q0Var.f45939c, tVar) && !q0Var.f45941e) {
                break;
            }
        }
        return (q0) next;
    }

    public final void i() {
        if (h0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f45898a.isAttachedToWindow();
        synchronized (this.f45899b) {
            try {
                l();
                k(this.f45899b);
                for (q0 q0Var : CollectionsKt.T(this.f45900c)) {
                    if (h0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f45898a + " is not attached to window. ") + "Cancelling running operation " + q0Var);
                    }
                    q0Var.a(this.f45898a);
                }
                for (q0 q0Var2 : CollectionsKt.T(this.f45899b)) {
                    if (h0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f45898a + " is not attached to window. ") + "Cancelling pending operation " + q0Var2);
                    }
                    q0Var2.a(this.f45898a);
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            q0 q0Var = (q0) list.get(i);
            m0 m0Var = q0Var.f45947l;
            if (!q0Var.f45944h) {
                q0Var.f45944h = true;
                r0 r0Var = q0Var.f45938b;
                if (r0Var == r0.f45950c) {
                    t tVar = m0Var.f45905c;
                    Intrinsics.checkNotNullExpressionValue(tVar, "fragmentStateManager.fragment");
                    View viewFindFocus = tVar.G.findFocus();
                    if (viewFindFocus != null) {
                        tVar.i().f45962k = viewFindFocus;
                        if (h0.K(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + tVar);
                        }
                    }
                    View viewN = q0Var.f45939c.N();
                    Intrinsics.checkNotNullExpressionValue(viewN, "this.fragment.requireView()");
                    if (viewN.getParent() == null) {
                        m0Var.b();
                        viewN.setAlpha(0.0f);
                    }
                    if (viewN.getAlpha() == 0.0f && viewN.getVisibility() == 0) {
                        viewN.setVisibility(4);
                    }
                    s sVar = tVar.J;
                    viewN.setAlpha(sVar == null ? 1.0f : sVar.f45961j);
                } else if (r0Var == r0.f45951d) {
                    t tVar2 = m0Var.f45905c;
                    Intrinsics.checkNotNullExpressionValue(tVar2, "fragmentStateManager.fragment");
                    View viewN2 = tVar2.N();
                    Intrinsics.checkNotNullExpressionValue(viewN2, "fragment.requireView()");
                    if (h0.K(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewN2.findFocus() + " on view " + viewN2 + " for Fragment " + tVar2);
                    }
                    viewN2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.x.m(arrayList, ((q0) it.next()).f45946k);
        }
        List listR = CollectionsKt.R(CollectionsKt.V(arrayList));
        int size2 = listR.size();
        for (int i10 = 0; i10 < size2; i10++) {
            p0 p0Var = (p0) listR.get(i10);
            p0Var.getClass();
            ViewGroup container = this.f45898a;
            Intrinsics.checkNotNullParameter(container, "container");
            if (!p0Var.f45934a) {
                p0Var.d(container);
            }
            p0Var.f45934a = true;
        }
    }

    public final void l() {
        s0 s0Var;
        for (q0 q0Var : this.f45899b) {
            if (q0Var.f45938b == r0.f45950c) {
                View viewN = q0Var.f45939c.N();
                Intrinsics.checkNotNullExpressionValue(viewN, "fragment.requireView()");
                int visibility = viewN.getVisibility();
                if (visibility == 0) {
                    s0Var = s0.f45964c;
                } else if (visibility == 4) {
                    s0Var = s0.f45966e;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(l7.o.i(visibility, "Unknown visibility "));
                    }
                    s0Var = s0.f45965d;
                }
                q0Var.d(s0Var, r0.f45949b);
            }
        }
    }
}
