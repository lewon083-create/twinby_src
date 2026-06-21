package xh;

import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import z2.g0;
import z2.h0;
import z2.n0;
import z2.p0;
import z2.q0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends d.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36125a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h0 h0Var) {
        super(false);
        this.f36126b = h0Var;
    }

    @Override // d.s
    public final void a() {
        switch (this.f36125a) {
            case 0:
                ((k) this.f36126b).R();
                return;
            default:
                h0 h0Var = (h0) this.f36126b;
                if (h0.K(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + h0Var);
                }
                h hVar = h0Var.i;
                ArrayList arrayList = h0Var.f45853m;
                h0Var.A(true);
                if (h0Var.f45849h == null) {
                    if (hVar.isEnabled()) {
                        if (h0.K(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        h0Var.R();
                        return;
                    } else {
                        if (h0.K(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        h0Var.f45848g.b().a();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(h0.F(h0Var.f45849h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = h0Var.f45849h.f45785a.iterator();
                while (it3.hasNext()) {
                    z2.t tVar = ((n0) it3.next()).f45910b;
                    if (tVar != null) {
                        tVar.f45979n = false;
                    }
                }
                for (z2.m mVar : h0Var.f(new ArrayList(Collections.singletonList(h0Var.f45849h)), 0, 1)) {
                    ArrayList arrayList2 = mVar.f45900c;
                    if (h0.K(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    mVar.k(arrayList2);
                    mVar.c(arrayList2);
                }
                h0Var.f45849h = null;
                h0Var.g0();
                if (h0.K(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + hVar.isEnabled() + " for  FragmentManager " + h0Var);
                    return;
                }
                return;
        }
    }

    @Override // d.s
    public void handleOnBackCancelled() {
        switch (this.f36125a) {
            case 1:
                h0 h0Var = (h0) this.f36126b;
                if (h0.K(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + h0Var);
                }
                z2.a aVar = h0Var.f45849h;
                if (aVar != null) {
                    aVar.f45800q = false;
                    aVar.d(false);
                    h0Var.A(true);
                    h0Var.E();
                    Iterator it = h0Var.f45853m.iterator();
                    if (it.hasNext()) {
                        throw om1.i(it);
                    }
                }
                h0Var.f45849h = null;
                return;
            default:
                super.handleOnBackCancelled();
                return;
        }
    }

    @Override // d.s
    public void handleOnBackProgressed(d.a backEvent) {
        switch (this.f36125a) {
            case 1:
                h0 h0Var = (h0) this.f36126b;
                if (h0.K(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + h0Var);
                }
                if (h0Var.f45849h != null) {
                    for (z2.m mVar : h0Var.f(new ArrayList(Collections.singletonList(h0Var.f45849h)), 0, 1)) {
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                        if (h0.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f15433c);
                        }
                        ArrayList arrayList = mVar.f45900c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            kotlin.collections.x.m(arrayList2, ((q0) it.next()).f45946k);
                        }
                        List listR = CollectionsKt.R(CollectionsKt.V(arrayList2));
                        int size = listR.size();
                        for (int i = 0; i < size; i++) {
                            ((p0) listR.get(i)).c(backEvent, mVar.f45898a);
                        }
                    }
                    Iterator it2 = h0Var.f45853m.iterator();
                    if (it2.hasNext()) {
                        throw om1.i(it2);
                    }
                    return;
                }
                return;
            default:
                super.handleOnBackProgressed(backEvent);
                return;
        }
    }

    @Override // d.s
    public void handleOnBackStarted(d.a aVar) {
        switch (this.f36125a) {
            case 1:
                h0 h0Var = (h0) this.f36126b;
                if (h0.K(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + h0Var);
                }
                h0Var.x();
                h0Var.y(new g0(h0Var), false);
                break;
            default:
                super.handleOnBackStarted(aVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar) {
        super(true);
        this.f36126b = kVar;
    }
}
