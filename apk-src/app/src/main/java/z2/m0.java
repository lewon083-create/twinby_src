package z2;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.twinby.R;
import io.sentry.protocol.SentryThread;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.v f45903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.g f45904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f45905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45906d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45907e = -1;

    public m0(x0.v vVar, s7.g gVar, t tVar) {
        this.f45903a = vVar;
        this.f45904b = gVar;
        this.f45905c = tVar;
    }

    public final void a() {
        boolean zK = h0.K(3);
        t tVar = this.f45905c;
        if (zK) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + tVar);
        }
        Bundle bundle = tVar.f45969c;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        tVar.f45987v.Q();
        tVar.f45968b = 3;
        tVar.E = false;
        tVar.s();
        if (!tVar.E) {
            throw new u0("Fragment " + tVar + " did not call through to super.onActivityCreated()");
        }
        if (h0.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + tVar);
        }
        if (tVar.G != null) {
            Bundle bundle2 = tVar.f45969c;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = tVar.f45970d;
            if (sparseArray != null) {
                tVar.G.restoreHierarchyState(sparseArray);
                tVar.f45970d = null;
            }
            tVar.E = false;
            tVar.J(bundle3);
            if (!tVar.E) {
                throw new u0("Fragment " + tVar + " did not call through to super.onViewStateRestored()");
            }
            if (tVar.G != null) {
                tVar.P.a(androidx.lifecycle.n.ON_CREATE);
            }
        }
        tVar.f45969c = null;
        h0 h0Var = tVar.f45987v;
        h0Var.G = false;
        h0Var.H = false;
        h0Var.N.f45883g = false;
        h0Var.u(4);
        this.f45903a.i(tVar, false);
    }

    public final void b() {
        t expectedParentFragment;
        View view;
        View view2;
        t fragment = this.f45905c;
        View view3 = fragment.F;
        while (true) {
            expectedParentFragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            t tVar = tag instanceof t ? (t) tag : null;
            if (tVar != null) {
                expectedParentFragment = tVar;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        t tVar2 = fragment.f45988w;
        if (expectedParentFragment != null && !expectedParentFragment.equals(tVar2)) {
            int i = fragment.f45990y;
            a3.c cVar = a3.d.f416a;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(fragment);
            sb2.append(" within the view of parent fragment ");
            sb2.append(expectedParentFragment);
            sb2.append(" via container with ID ");
            a3.h hVar = new a3.h(fragment, t.z.d(i, " without using parent's childFragmentManager", sb2));
            a3.d.c(hVar);
            a3.c cVarA = a3.d.a(fragment);
            if (cVarA.f414a.contains(a3.b.f410f) && a3.d.e(cVarA, fragment.getClass(), a3.h.class)) {
                a3.d.b(cVarA, hVar);
            }
        }
        ArrayList arrayList = (ArrayList) this.f45904b.f32795b;
        ViewGroup viewGroup = fragment.F;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fragment);
            int i10 = iIndexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        t tVar3 = (t) arrayList.get(iIndexOf);
                        if (tVar3.F == viewGroup && (view = tVar3.G) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    t tVar4 = (t) arrayList.get(i10);
                    if (tVar4.F == viewGroup && (view2 = tVar4.G) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
        }
        fragment.F.addView(fragment.G, iIndexOfChild);
    }

    public final void c() {
        m0 m0Var;
        boolean zK = h0.K(3);
        t tVar = this.f45905c;
        if (zK) {
            Log.d("FragmentManager", "moveto ATTACHED: " + tVar);
        }
        t tVar2 = tVar.f45974h;
        s7.g gVar = this.f45904b;
        if (tVar2 != null) {
            m0Var = (m0) ((HashMap) gVar.f32796c).get(tVar2.f45972f);
            if (m0Var == null) {
                throw new IllegalStateException("Fragment " + tVar + " declared target fragment " + tVar.f45974h + " that does not belong to this FragmentManager!");
            }
            tVar.i = tVar.f45974h.f45972f;
            tVar.f45974h = null;
        } else {
            String str = tVar.i;
            if (str != null) {
                m0Var = (m0) ((HashMap) gVar.f32796c).get(str);
                if (m0Var == null) {
                    StringBuilder sb2 = new StringBuilder("Fragment ");
                    sb2.append(tVar);
                    sb2.append(" declared target fragment ");
                    throw new IllegalStateException(a0.u.o(sb2, tVar.i, " that does not belong to this FragmentManager!"));
                }
            } else {
                m0Var = null;
            }
        }
        if (m0Var != null) {
            m0Var.k();
        }
        h0 h0Var = tVar.f45985t;
        tVar.f45986u = h0Var.f45862v;
        tVar.f45988w = h0Var.f45864x;
        x0.v vVar = this.f45903a;
        vVar.o(tVar, false);
        ArrayList arrayList = tVar.S;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t tVar3 = ((q) it.next()).f45936a;
            tVar3.R.f29783a.a();
            androidx.lifecycle.p0.d(tVar3);
            Bundle bundle = tVar3.f45969c;
            tVar3.R.a(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        tVar.f45987v.b(tVar.f45986u, tVar.g(), tVar);
        tVar.f45968b = 0;
        tVar.E = false;
        tVar.v(tVar.f45986u.f45996d);
        if (!tVar.E) {
            throw new u0("Fragment " + tVar + " did not call through to super.onAttach()");
        }
        Iterator it2 = tVar.f45985t.f45855o.iterator();
        while (it2.hasNext()) {
            ((k0) it2.next()).a();
        }
        h0 h0Var2 = tVar.f45987v;
        h0Var2.G = false;
        h0Var2.H = false;
        h0Var2.N.f45883g = false;
        h0Var2.u(0);
        vVar.j(tVar, false);
    }

    public final int d() {
        t tVar = this.f45905c;
        if (tVar.f45985t == null) {
            return tVar.f45968b;
        }
        int iMin = this.f45907e;
        int iOrdinal = tVar.N.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (tVar.f45980o) {
            if (tVar.f45981p) {
                iMin = Math.max(this.f45907e, 2);
                View view = tVar.G;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f45907e < 4 ? Math.min(iMin, tVar.f45968b) : Math.min(iMin, 1);
            }
        }
        if (!tVar.f45977l) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = tVar.F;
        if (viewGroup != null) {
            m mVarJ = m.j(viewGroup, tVar.n());
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(tVar, "fragmentStateManager.fragment");
            q0 q0VarG = mVarJ.g(tVar);
            r0 r0Var = q0VarG != null ? q0VarG.f45938b : null;
            q0 q0VarH = mVarJ.h(tVar);
            r0Var = q0VarH != null ? q0VarH.f45938b : null;
            int i = r0Var == null ? -1 : t0.f45992a[r0Var.ordinal()];
            if (i != -1 && i != 1) {
                r0Var = r0Var;
            }
        }
        if (r0Var == r0.f45950c) {
            iMin = Math.min(iMin, 6);
        } else if (r0Var == r0.f45951d) {
            iMin = Math.max(iMin, 3);
        } else if (tVar.f45978m) {
            iMin = tVar.r() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (tVar.H && tVar.f45968b < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (tVar.f45979n && tVar.F != null) {
            iMin = Math.max(iMin, 3);
        }
        if (h0.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + tVar);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        boolean zK = h0.K(3);
        t tVar = this.f45905c;
        if (zK) {
            Log.d("FragmentManager", "moveto CREATED: " + tVar);
        }
        Bundle bundle2 = tVar.f45969c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (tVar.L) {
            tVar.f45968b = 1;
            Bundle bundle4 = tVar.f45969c;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            tVar.f45987v.W(bundle);
            h0 h0Var = tVar.f45987v;
            h0Var.G = false;
            h0Var.H = false;
            h0Var.N.f45883g = false;
            h0Var.u(1);
            return;
        }
        x0.v vVar = this.f45903a;
        vVar.p(tVar, false);
        tVar.f45987v.Q();
        tVar.f45968b = 1;
        tVar.E = false;
        tVar.O.a(new o6.b(5, tVar));
        tVar.w(bundle3);
        tVar.L = true;
        if (tVar.E) {
            tVar.O.e(androidx.lifecycle.n.ON_CREATE);
            vVar.k(tVar, false);
        } else {
            throw new u0("Fragment " + tVar + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String resourceName;
        t fragment = this.f45905c;
        if (fragment.f45980o) {
            return;
        }
        int i = 3;
        if (h0.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.f45969c;
        ViewGroup container = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterB = fragment.B(bundle2);
        ViewGroup viewGroup = fragment.F;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i10 = fragment.f45990y;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + fragment + " for a container view with no id");
                }
                container = (ViewGroup) fragment.f45985t.f45863w.o(i10);
                if (container == null) {
                    if (!fragment.f45982q) {
                        try {
                            resourceName = fragment.M().getResources().getResourceName(fragment.f45990y);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.f45990y) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(container instanceof FragmentContainerView)) {
                    a3.c cVar = a3.d.f416a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    a3.g gVar = new a3.g(fragment, container);
                    a3.d.c(gVar);
                    a3.c cVarA = a3.d.a(fragment);
                    if (cVarA.f414a.contains(a3.b.f411g) && a3.d.e(cVarA, fragment.getClass(), a3.g.class)) {
                        a3.d.b(cVarA, gVar);
                    }
                }
            }
        }
        fragment.F = container;
        fragment.K(layoutInflaterB, container, bundle2);
        if (fragment.G != null) {
            if (h0.K(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.G.setSaveFromParentEnabled(false);
            fragment.G.setTag(R.id.fragment_container_view_tag, fragment);
            if (container != null) {
                b();
            }
            if (fragment.A) {
                fragment.G.setVisibility(8);
            }
            if (fragment.G.isAttachedToWindow()) {
                View view = fragment.G;
                Field field = g2.n0.f19900a;
                view.requestApplyInsets();
            } else {
                View view2 = fragment.G;
                view2.addOnAttachStateChangeListener(new l.d(i, view2));
            }
            Bundle bundle3 = fragment.f45969c;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            fragment.I(fragment.G);
            fragment.f45987v.u(2);
            this.f45903a.u(fragment, fragment.G, false);
            int visibility = fragment.G.getVisibility();
            fragment.i().f45961j = fragment.G.getAlpha();
            if (fragment.F != null && visibility == 0) {
                View viewFindFocus = fragment.G.findFocus();
                if (viewFindFocus != null) {
                    fragment.i().f45962k = viewFindFocus;
                    if (h0.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.G.setAlpha(0.0f);
            }
        }
        fragment.f45968b = 2;
    }

    public final void g() throws Exception {
        t tVarV;
        boolean zK = h0.K(3);
        t tVar = this.f45905c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATED: " + tVar);
        }
        boolean zIsChangingConfigurations = true;
        boolean z5 = tVar.f45978m && !tVar.r();
        s7.g gVar = this.f45904b;
        if (z5) {
            gVar.M(null, tVar.f45972f);
        }
        if (!z5) {
            j0 j0Var = (j0) gVar.f32798e;
            if (!((j0Var.f45878b.containsKey(tVar.f45972f) && j0Var.f45881e) ? j0Var.f45882f : true)) {
                String str = tVar.i;
                if (str != null && (tVarV = gVar.v(str)) != null && tVarV.C) {
                    tVar.f45974h = tVarV;
                }
                tVar.f45968b = 0;
                return;
            }
        }
        v vVar = tVar.f45986u;
        if (vVar != null) {
            zIsChangingConfigurations = ((j0) gVar.f32798e).f45882f;
        } else {
            w wVar = vVar.f45996d;
            if (wVar != null) {
                zIsChangingConfigurations = true ^ wVar.isChangingConfigurations();
            }
        }
        if (z5 || zIsChangingConfigurations) {
            ((j0) gVar.f32798e).d(tVar, false);
        }
        tVar.f45987v.l();
        tVar.O.e(androidx.lifecycle.n.ON_DESTROY);
        tVar.f45968b = 0;
        tVar.E = false;
        tVar.L = false;
        tVar.y();
        if (!tVar.E) {
            throw new u0("Fragment " + tVar + " did not call through to super.onDestroy()");
        }
        this.f45903a.l(tVar, false);
        for (m0 m0Var : gVar.x()) {
            if (m0Var != null) {
                t tVar2 = m0Var.f45905c;
                if (tVar.f45972f.equals(tVar2.i)) {
                    tVar2.f45974h = tVar;
                    tVar2.i = null;
                }
            }
        }
        String str2 = tVar.i;
        if (str2 != null) {
            tVar.f45974h = gVar.v(str2);
        }
        gVar.F(this);
    }

    public final void h() {
        View view;
        boolean zK = h0.K(3);
        t tVar = this.f45905c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + tVar);
        }
        ViewGroup viewGroup = tVar.F;
        if (viewGroup != null && (view = tVar.G) != null) {
            viewGroup.removeView(view);
        }
        tVar.f45987v.u(1);
        if (tVar.G != null) {
            o0 o0Var = tVar.P;
            o0Var.b();
            if (o0Var.f45922e.f1606c.a(androidx.lifecycle.o.f1575d)) {
                tVar.P.a(androidx.lifecycle.n.ON_DESTROY);
            }
        }
        tVar.f45968b = 1;
        tVar.E = false;
        tVar.z();
        if (!tVar.E) {
            throw new u0("Fragment " + tVar + " did not call through to super.onDestroyView()");
        }
        h1.j jVar = ((h3.d) new h3.e(tVar, tVar.getViewModelStore()).f20376d).f20371b;
        int i = jVar.f20343d;
        for (int i10 = 0; i10 < i; i10++) {
            ((h3.a) jVar.f20342c[i10]).l();
        }
        tVar.f45983r = false;
        this.f45903a.v(tVar, false);
        tVar.F = null;
        tVar.G = null;
        tVar.P = null;
        tVar.Q.k(null);
        tVar.f45981p = false;
    }

    public final void i() throws Exception {
        boolean zK = h0.K(3);
        t tVar = this.f45905c;
        if (zK) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + tVar);
        }
        tVar.f45968b = -1;
        tVar.E = false;
        tVar.A();
        if (!tVar.E) {
            throw new u0("Fragment " + tVar + " did not call through to super.onDetach()");
        }
        h0 h0Var = tVar.f45987v;
        if (!h0Var.I) {
            h0Var.l();
            tVar.f45987v = new h0();
        }
        this.f45903a.m(tVar, false);
        tVar.f45968b = -1;
        tVar.f45986u = null;
        tVar.f45988w = null;
        tVar.f45985t = null;
        if (!tVar.f45978m || tVar.r()) {
            j0 j0Var = (j0) this.f45904b.f32798e;
            if (!((j0Var.f45878b.containsKey(tVar.f45972f) && j0Var.f45881e) ? j0Var.f45882f : true)) {
                return;
            }
        }
        if (h0.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + tVar);
        }
        tVar.p();
    }

    public final void j() {
        t tVar = this.f45905c;
        if (tVar.f45980o && tVar.f45981p && !tVar.f45983r) {
            if (h0.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + tVar);
            }
            Bundle bundle = tVar.f45969c;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            tVar.K(tVar.B(bundle2), null, bundle2);
            View view = tVar.G;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                tVar.G.setTag(R.id.fragment_container_view_tag, tVar);
                if (tVar.A) {
                    tVar.G.setVisibility(8);
                }
                Bundle bundle3 = tVar.f45969c;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                tVar.I(tVar.G);
                tVar.f45987v.u(2);
                this.f45903a.u(tVar, tVar.G, false);
                tVar.f45968b = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0127, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.m0.k():void");
    }

    public final void l() {
        boolean zK = h0.K(3);
        t tVar = this.f45905c;
        if (zK) {
            Log.d("FragmentManager", "movefrom RESUMED: " + tVar);
        }
        tVar.f45987v.u(5);
        if (tVar.G != null) {
            tVar.P.a(androidx.lifecycle.n.ON_PAUSE);
        }
        tVar.O.e(androidx.lifecycle.n.ON_PAUSE);
        tVar.f45968b = 6;
        tVar.E = false;
        tVar.C();
        if (tVar.E) {
            this.f45903a.n(tVar, false);
            return;
        }
        throw new u0("Fragment " + tVar + " did not call through to super.onPause()");
    }

    public final void m(ClassLoader classLoader) {
        t tVar = this.f45905c;
        Bundle bundle = tVar.f45969c;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (tVar.f45969c.getBundle("savedInstanceState") == null) {
            tVar.f45969c.putBundle("savedInstanceState", new Bundle());
        }
        try {
            tVar.f45970d = tVar.f45969c.getSparseParcelableArray("viewState");
            tVar.f45971e = tVar.f45969c.getBundle("viewRegistryState");
            l0 l0Var = (l0) tVar.f45969c.getParcelable(SentryThread.JsonKeys.STATE);
            if (l0Var != null) {
                tVar.i = l0Var.f45895m;
                tVar.f45975j = l0Var.f45896n;
                tVar.I = l0Var.f45897o;
            }
            if (tVar.I) {
                return;
            }
            tVar.H = true;
        } catch (BadParcelableException e3) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + tVar, e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.m0.n():void");
    }

    public final void o() {
        t tVar = this.f45905c;
        if (tVar.G == null) {
            return;
        }
        if (h0.K(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + tVar + " with view " + tVar.G);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        tVar.G.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            tVar.f45970d = sparseArray;
        }
        Bundle bundle = new Bundle();
        tVar.P.f45923f.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        tVar.f45971e = bundle;
    }

    public final void p() {
        boolean zK = h0.K(3);
        t tVar = this.f45905c;
        if (zK) {
            Log.d("FragmentManager", "moveto STARTED: " + tVar);
        }
        tVar.f45987v.Q();
        tVar.f45987v.A(true);
        tVar.f45968b = 5;
        tVar.E = false;
        tVar.G();
        if (!tVar.E) {
            throw new u0("Fragment " + tVar + " did not call through to super.onStart()");
        }
        androidx.lifecycle.w wVar = tVar.O;
        androidx.lifecycle.n nVar = androidx.lifecycle.n.ON_START;
        wVar.e(nVar);
        if (tVar.G != null) {
            tVar.P.f45922e.e(nVar);
        }
        h0 h0Var = tVar.f45987v;
        h0Var.G = false;
        h0Var.H = false;
        h0Var.N.f45883g = false;
        h0Var.u(5);
        this.f45903a.s(tVar, false);
    }

    public final void q() {
        boolean zK = h0.K(3);
        t tVar = this.f45905c;
        if (zK) {
            Log.d("FragmentManager", "movefrom STARTED: " + tVar);
        }
        h0 h0Var = tVar.f45987v;
        h0Var.H = true;
        h0Var.N.f45883g = true;
        h0Var.u(4);
        if (tVar.G != null) {
            tVar.P.a(androidx.lifecycle.n.ON_STOP);
        }
        tVar.O.e(androidx.lifecycle.n.ON_STOP);
        tVar.f45968b = 4;
        tVar.E = false;
        tVar.H();
        if (tVar.E) {
            this.f45903a.t(tVar, false);
            return;
        }
        throw new u0("Fragment " + tVar + " did not call through to super.onStop()");
    }

    public m0(x0.v vVar, s7.g gVar, ClassLoader classLoader, b0 b0Var, Bundle bundle) {
        this.f45903a = vVar;
        this.f45904b = gVar;
        l0 l0Var = (l0) bundle.getParcelable(SentryThread.JsonKeys.STATE);
        t tVarA = b0Var.a(l0Var.f45885b);
        tVarA.f45972f = l0Var.f45886c;
        tVarA.f45980o = l0Var.f45887d;
        tVarA.f45982q = true;
        tVarA.f45989x = l0Var.f45888e;
        tVarA.f45990y = l0Var.f45889f;
        tVarA.f45991z = l0Var.f45890g;
        tVarA.C = l0Var.f45891h;
        tVarA.f45978m = l0Var.i;
        tVarA.B = l0Var.f45892j;
        tVarA.A = l0Var.f45893k;
        tVarA.N = androidx.lifecycle.o.values()[l0Var.f45894l];
        tVarA.i = l0Var.f45895m;
        tVarA.f45975j = l0Var.f45896n;
        tVarA.I = l0Var.f45897o;
        this.f45905c = tVarA;
        tVarA.f45969c = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        tVarA.P(bundle2);
        if (h0.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + tVarA);
        }
    }

    public m0(x0.v vVar, s7.g gVar, t tVar, Bundle bundle) {
        this.f45903a = vVar;
        this.f45904b = gVar;
        this.f45905c = tVar;
        tVar.f45970d = null;
        tVar.f45971e = null;
        tVar.f45984s = 0;
        tVar.f45981p = false;
        tVar.f45977l = false;
        t tVar2 = tVar.f45974h;
        tVar.i = tVar2 != null ? tVar2.f45972f : null;
        tVar.f45974h = null;
        tVar.f45969c = bundle;
        tVar.f45973g = bundle.getBundle("arguments");
    }
}
