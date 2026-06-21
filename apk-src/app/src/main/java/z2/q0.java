package z2;

import android.util.Log;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s0 f45937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f45938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f45939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f45940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45944h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f45945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f45946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m0 f45947l;

    public q0(s0 finalState, r0 lifecycleImpact, m0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        t fragment = fragmentStateManager.f45905c;
        Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f45937a = finalState;
        this.f45938b = lifecycleImpact;
        this.f45939c = fragment;
        this.f45940d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.f45945j = arrayList;
        this.f45946k = arrayList;
        this.f45947l = fragmentStateManager;
    }

    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f45944h = false;
        if (this.f45941e) {
            return;
        }
        this.f45941e = true;
        if (this.f45945j.isEmpty()) {
            b();
            return;
        }
        for (p0 p0Var : CollectionsKt.R(this.f45946k)) {
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            if (!p0Var.f45935b) {
                p0Var.a(container);
            }
            p0Var.f45935b = true;
        }
    }

    public final void b() {
        this.f45944h = false;
        if (!this.f45942f) {
            if (h0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f45942f = true;
            Iterator it = this.f45940d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f45939c.f45979n = false;
        this.f45947l.k();
    }

    public final void c(p0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        ArrayList arrayList = this.f45945j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(s0 finalState, r0 lifecycleImpact) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        int iOrdinal = lifecycleImpact.ordinal();
        t tVar = this.f45939c;
        s0 s0Var = s0.f45963b;
        if (iOrdinal == 0) {
            if (this.f45937a != s0Var) {
                if (h0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + tVar + " mFinalState = " + this.f45937a + " -> " + finalState + '.');
                }
                this.f45937a = finalState;
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (this.f45937a == s0Var) {
                if (h0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + tVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f45938b + " to ADDING.");
                }
                this.f45937a = s0.f45964c;
                this.f45938b = r0.f45950c;
                this.i = true;
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        if (h0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + tVar + " mFinalState = " + this.f45937a + " -> REMOVED. mLifecycleImpact  = " + this.f45938b + " to REMOVING.");
        }
        this.f45937a = s0Var;
        this.f45938b = r0.f45951d;
        this.i = true;
    }

    public final String toString() {
        StringBuilder sbP = om1.p("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbP.append(this.f45937a);
        sbP.append(" lifecycleImpact = ");
        sbP.append(this.f45938b);
        sbP.append(" fragment = ");
        sbP.append(this.f45939c);
        sbP.append('}');
        return sbP.toString();
    }
}
