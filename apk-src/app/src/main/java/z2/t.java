package z2;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.a1;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import com.google.android.gms.internal.ads.om1;
import com.twinby.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import ob.h4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class t implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.u, a1, androidx.lifecycle.j, o6.g {
    public static final Object U = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean E;
    public ViewGroup F;
    public View G;
    public boolean H;
    public s J;
    public boolean K;
    public boolean L;
    public String M;
    public androidx.lifecycle.o N;
    public androidx.lifecycle.w O;
    public o0 P;
    public final androidx.lifecycle.d0 Q;
    public o6.f R;
    public final ArrayList S;
    public final q T;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f45969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray f45970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f45971e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f45973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f45974h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45975j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f45978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f45982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f45983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f45984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h0 f45985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public v f45986u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t f45988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f45989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f45990y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f45991z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45968b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45972f = UUID.randomUUID().toString();
    public String i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f45976k = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h0 f45987v = new h0();
    public final boolean D = true;
    public boolean I = true;

    public t() {
        new h4(16, this);
        this.N = androidx.lifecycle.o.f1577f;
        this.Q = new androidx.lifecycle.d0();
        new AtomicInteger();
        this.S = new ArrayList();
        this.T = new q(this);
        o();
    }

    public void A() {
        this.E = true;
    }

    public LayoutInflater B(Bundle bundle) {
        v vVar = this.f45986u;
        if (vVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        w wVar = vVar.f45999g;
        LayoutInflater layoutInflaterCloneInContext = wVar.getLayoutInflater().cloneInContext(wVar);
        layoutInflaterCloneInContext.setFactory2(this.f45987v.f45847f);
        return layoutInflaterCloneInContext;
    }

    public void C() {
        this.E = true;
    }

    public void E() {
        this.E = true;
    }

    public void G() {
        this.E = true;
    }

    public void H() {
        this.E = true;
    }

    public void J(Bundle bundle) {
        this.E = true;
    }

    public void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f45987v.Q();
        this.f45983r = true;
        this.P = new o0(this, getViewModelStore(), new t.a0(17, this));
        View viewX = x(layoutInflater, viewGroup);
        this.G = viewX;
        if (viewX == null) {
            if (this.P.f45922e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.P = null;
            return;
        }
        this.P.b();
        if (h0.K(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.G + " for Fragment " + this);
        }
        View view = this.G;
        o0 o0Var = this.P;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, o0Var);
        View view2 = this.G;
        o0 o0Var2 = this.P;
        Intrinsics.checkNotNullParameter(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, o0Var2);
        View view3 = this.G;
        o0 o0Var3 = this.P;
        Intrinsics.checkNotNullParameter(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, o0Var3);
        this.Q.k(this.P);
    }

    public final w L() {
        w wVarJ = j();
        if (wVarJ != null) {
            return wVarJ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context M() {
        Context contextL = l();
        if (contextL != null) {
            return contextL;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View N() {
        View view = this.G;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void O(int i, int i10, int i11, int i12) {
        if (this.J == null && i == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        i().f45954b = i;
        i().f45955c = i10;
        i().f45956d = i11;
        i().f45957e = i12;
    }

    public final void P(Bundle bundle) {
        h0 h0Var = this.f45985t;
        if (h0Var != null && (h0Var.G || h0Var.H)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f45973g = bundle;
    }

    public Activity c() {
        return j();
    }

    public com.google.android.gms.internal.auth.m g() {
        return new r(this);
    }

    @Override // androidx.lifecycle.j
    public final f3.c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = M().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && h0.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + M().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        f3.d dVar = new f3.d(0);
        if (application != null) {
            dVar.b(x0.f1615f, application);
        }
        dVar.b(androidx.lifecycle.p0.f1579a, this);
        dVar.b(androidx.lifecycle.p0.f1580b, this);
        Bundle bundle = this.f45973g;
        if (bundle != null) {
            dVar.b(androidx.lifecycle.p0.f1581c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.p getLifecycle() {
        return this.O;
    }

    @Override // o6.g
    public final o6.e getSavedStateRegistry() {
        return this.R.f29784b;
    }

    @Override // androidx.lifecycle.a1
    public final z0 getViewModelStore() {
        if (this.f45985t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int iM = m();
        androidx.lifecycle.o oVar = androidx.lifecycle.o.f1573b;
        if (iM == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f45985t.N.f45880d;
        z0 z0Var = (z0) map.get(this.f45972f);
        if (z0Var != null) {
            return z0Var;
        }
        z0 z0Var2 = new z0();
        map.put(this.f45972f, z0Var2);
        return z0Var2;
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f45989x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f45990y));
        printWriter.print(" mTag=");
        printWriter.println(this.f45991z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f45968b);
        printWriter.print(" mWho=");
        printWriter.print(this.f45972f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f45984s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f45977l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f45978m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f45980o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f45981p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.D);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.I);
        if (this.f45985t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f45985t);
        }
        if (this.f45986u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f45986u);
        }
        if (this.f45988w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f45988w);
        }
        if (this.f45973g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f45973g);
        }
        if (this.f45969c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f45969c);
        }
        if (this.f45970d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f45970d);
        }
        if (this.f45971e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f45971e);
        }
        t tVarV = this.f45974h;
        if (tVarV == null) {
            h0 h0Var = this.f45985t;
            tVarV = (h0Var == null || (str2 = this.i) == null) ? null : h0Var.f45844c.v(str2);
        }
        if (tVarV != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(tVarV);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f45975j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        s sVar = this.J;
        printWriter.println(sVar == null ? false : sVar.f45953a);
        s sVar2 = this.J;
        if ((sVar2 == null ? 0 : sVar2.f45954b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            s sVar3 = this.J;
            printWriter.println(sVar3 == null ? 0 : sVar3.f45954b);
        }
        s sVar4 = this.J;
        if ((sVar4 == null ? 0 : sVar4.f45955c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            s sVar5 = this.J;
            printWriter.println(sVar5 == null ? 0 : sVar5.f45955c);
        }
        s sVar6 = this.J;
        if ((sVar6 == null ? 0 : sVar6.f45956d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            s sVar7 = this.J;
            printWriter.println(sVar7 == null ? 0 : sVar7.f45956d);
        }
        s sVar8 = this.J;
        if ((sVar8 == null ? 0 : sVar8.f45957e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            s sVar9 = this.J;
            printWriter.println(sVar9 != null ? sVar9.f45957e : 0);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.F);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.G);
        }
        if (l() != null) {
            new h3.e(this, getViewModelStore()).z(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f45987v + StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.f45987v.w(om1.x(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final s i() {
        if (this.J == null) {
            s sVar = new s();
            Object obj = U;
            sVar.f45959g = obj;
            sVar.f45960h = obj;
            sVar.i = obj;
            sVar.f45961j = 1.0f;
            sVar.f45962k = null;
            this.J = sVar;
        }
        return this.J;
    }

    public final w j() {
        v vVar = this.f45986u;
        if (vVar == null) {
            return null;
        }
        return vVar.f45995c;
    }

    public final h0 k() {
        if (this.f45986u != null) {
            return this.f45987v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context l() {
        v vVar = this.f45986u;
        if (vVar == null) {
            return null;
        }
        return vVar.f45996d;
    }

    public final int m() {
        androidx.lifecycle.o oVar = this.N;
        return (oVar == androidx.lifecycle.o.f1574c || this.f45988w == null) ? oVar.ordinal() : Math.min(oVar.ordinal(), this.f45988w.m());
    }

    public final h0 n() {
        h0 h0Var = this.f45985t;
        if (h0Var != null) {
            return h0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void o() {
        this.O = new androidx.lifecycle.w(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.R = new o6.f(new g8.c(this, new androidx.lifecycle.q0(6, this)));
        ArrayList arrayList = this.S;
        q qVar = this.T;
        if (arrayList.contains(qVar)) {
            return;
        }
        if (this.f45968b < 0) {
            arrayList.add(qVar);
            return;
        }
        t tVar = qVar.f45936a;
        tVar.R.f29783a.a();
        androidx.lifecycle.p0.d(tVar);
        Bundle bundle = tVar.f45969c;
        tVar.R.a(bundle != null ? bundle.getBundle("registryState") : null);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.E = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        L().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.E = true;
    }

    public final void p() {
        o();
        this.M = this.f45972f;
        this.f45972f = UUID.randomUUID().toString();
        this.f45977l = false;
        this.f45978m = false;
        this.f45980o = false;
        this.f45981p = false;
        this.f45982q = false;
        this.f45984s = 0;
        this.f45985t = null;
        this.f45987v = new h0();
        this.f45986u = null;
        this.f45989x = 0;
        this.f45990y = 0;
        this.f45991z = null;
        this.A = false;
        this.B = false;
    }

    public final boolean q() {
        if (this.A) {
            return true;
        }
        h0 h0Var = this.f45985t;
        if (h0Var != null) {
            t tVar = this.f45988w;
            h0Var.getClass();
            if (tVar == null ? false : tVar.q()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return this.f45984s > 0;
    }

    public void s() {
        this.E = true;
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.f45986u == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        h0 h0VarN = n();
        if (h0VarN.B != null) {
            String str = this.f45972f;
            d0 d0Var = new d0();
            d0Var.f45824b = str;
            d0Var.f45825c = i;
            h0VarN.E.addLast(d0Var);
            h0VarN.B.a(intent);
            return;
        }
        v vVar = h0VarN.f45862v;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        vVar.f45996d.startActivity(intent, null);
    }

    public void t(int i, int i10, Intent intent) {
        if (h0.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f45972f);
        if (this.f45989x != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f45989x));
        }
        if (this.f45991z != null) {
            sb2.append(" tag=");
            sb2.append(this.f45991z);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void u() {
        this.E = true;
    }

    public void v(Context context) {
        this.E = true;
        v vVar = this.f45986u;
        if ((vVar == null ? null : vVar.f45995c) != null) {
            this.E = false;
            u();
        }
    }

    public void w(Bundle bundle) {
        Bundle bundle2;
        this.E = true;
        Bundle bundle3 = this.f45969c;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f45987v.W(bundle2);
            h0 h0Var = this.f45987v;
            h0Var.G = false;
            h0Var.H = false;
            h0Var.N.f45883g = false;
            h0Var.u(1);
        }
        h0 h0Var2 = this.f45987v;
        if (h0Var2.f45861u >= 1) {
            return;
        }
        h0Var2.G = false;
        h0Var2.H = false;
        h0Var2.N.f45883g = false;
        h0Var2.u(1);
    }

    public View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void y() {
        this.E = true;
    }

    public void z() {
        this.E = true;
    }

    public void F(Bundle bundle) {
    }

    public void I(View view) {
    }

    public void D(int i, String[] strArr, int[] iArr) {
    }
}
