package z2;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.z0;
import com.google.android.gms.internal.ads.jm1;
import com.google.android.gms.internal.ads.om1;
import com.twinby.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.protocol.SentryThread;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import ob.h4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final t.t0 A;
    public f.g B;
    public f.g C;
    public f.g D;
    public ArrayDeque E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public j0 N;
    public final h4 O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45843b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f45846e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d.w f45848g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f45853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x0.v f45854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f45855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f45856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f45857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f45858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z f45859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a0 f45860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45861u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v f45862v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.google.android.gms.internal.auth.m f45863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t f45864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public t f45865y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b0 f45866z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45842a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.g f45844c = new s7.g(22);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f45845d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f45847f = new y(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f45849h = null;
    public final xh.h i = new xh.h(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f45850j = new AtomicInteger();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f45851k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f45852l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v15, types: [z2.z] */
    /* JADX WARN: Type inference failed for: r0v16, types: [z2.z] */
    /* JADX WARN: Type inference failed for: r0v17, types: [z2.z] */
    /* JADX WARN: Type inference failed for: r0v18, types: [z2.z] */
    public h0() {
        Collections.synchronizedMap(new HashMap());
        this.f45853m = new ArrayList();
        this.f45854n = new x0.v(this);
        this.f45855o = new CopyOnWriteArrayList();
        final int i = 0;
        this.f45856p = new f2.a(this) { // from class: z2.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f46012b;

            {
                this.f46012b = this;
            }

            @Override // f2.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        h0 h0Var = this.f46012b;
                        if (h0Var.M()) {
                            h0Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        h0 h0Var2 = this.f46012b;
                        if (h0Var2.M() && num.intValue() == 80) {
                            h0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        t1.g gVar = (t1.g) obj;
                        h0 h0Var3 = this.f46012b;
                        if (h0Var3.M()) {
                            boolean z5 = gVar.f33343a;
                            h0Var3.n(false);
                        }
                        break;
                    default:
                        t1.v vVar = (t1.v) obj;
                        h0 h0Var4 = this.f46012b;
                        if (h0Var4.M()) {
                            boolean z10 = vVar.f33394a;
                            h0Var4.s(false);
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f45857q = new f2.a(this) { // from class: z2.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f46012b;

            {
                this.f46012b = this;
            }

            @Override // f2.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        h0 h0Var = this.f46012b;
                        if (h0Var.M()) {
                            h0Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        h0 h0Var2 = this.f46012b;
                        if (h0Var2.M() && num.intValue() == 80) {
                            h0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        t1.g gVar = (t1.g) obj;
                        h0 h0Var3 = this.f46012b;
                        if (h0Var3.M()) {
                            boolean z5 = gVar.f33343a;
                            h0Var3.n(false);
                        }
                        break;
                    default:
                        t1.v vVar = (t1.v) obj;
                        h0 h0Var4 = this.f46012b;
                        if (h0Var4.M()) {
                            boolean z10 = vVar.f33394a;
                            h0Var4.s(false);
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f45858r = new f2.a(this) { // from class: z2.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f46012b;

            {
                this.f46012b = this;
            }

            @Override // f2.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        h0 h0Var = this.f46012b;
                        if (h0Var.M()) {
                            h0Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        h0 h0Var2 = this.f46012b;
                        if (h0Var2.M() && num.intValue() == 80) {
                            h0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        t1.g gVar = (t1.g) obj;
                        h0 h0Var3 = this.f46012b;
                        if (h0Var3.M()) {
                            boolean z5 = gVar.f33343a;
                            h0Var3.n(false);
                        }
                        break;
                    default:
                        t1.v vVar = (t1.v) obj;
                        h0 h0Var4 = this.f46012b;
                        if (h0Var4.M()) {
                            boolean z10 = vVar.f33394a;
                            h0Var4.s(false);
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f45859s = new f2.a(this) { // from class: z2.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f46012b;

            {
                this.f46012b = this;
            }

            @Override // f2.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        h0 h0Var = this.f46012b;
                        if (h0Var.M()) {
                            h0Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        h0 h0Var2 = this.f46012b;
                        if (h0Var2.M() && num.intValue() == 80) {
                            h0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        t1.g gVar = (t1.g) obj;
                        h0 h0Var3 = this.f46012b;
                        if (h0Var3.M()) {
                            boolean z5 = gVar.f33343a;
                            h0Var3.n(false);
                        }
                        break;
                    default:
                        t1.v vVar = (t1.v) obj;
                        h0 h0Var4 = this.f46012b;
                        if (h0Var4.M()) {
                            boolean z10 = vVar.f33394a;
                            h0Var4.s(false);
                        }
                        break;
                }
            }
        };
        this.f45860t = new a0(this);
        this.f45861u = -1;
        this.f45866z = new b0(this);
        this.A = new t.t0(11);
        this.E = new ArrayDeque();
        this.O = new h4(17, this);
    }

    public static HashSet F(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < aVar.f45785a.size(); i++) {
            t tVar = ((n0) aVar.f45785a.get(i)).f45910b;
            if (tVar != null && aVar.f45791g) {
                hashSet.add(tVar);
            }
        }
        return hashSet;
    }

    public static boolean K(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean L(t tVar) {
        tVar.getClass();
        boolean zL = false;
        for (t tVar2 : tVar.f45987v.f45844c.y()) {
            if (tVar2 != null) {
                zL = L(tVar2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(t tVar) {
        if (tVar == null) {
            return true;
        }
        if (tVar.D) {
            return tVar.f45985t == null || N(tVar.f45988w);
        }
        return false;
    }

    public static boolean O(t tVar) {
        if (tVar == null) {
            return true;
        }
        h0 h0Var = tVar.f45985t;
        return tVar.equals(h0Var.f45865y) && O(h0Var.f45864x);
    }

    public static void d0(t tVar) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + tVar);
        }
        if (tVar.A) {
            tVar.A = false;
            tVar.K = !tVar.K;
        }
    }

    public final boolean A(boolean z5) {
        boolean zA;
        z(z5);
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.K;
            ArrayList arrayList2 = this.L;
            synchronized (this.f45842a) {
                if (this.f45842a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f45842a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((e0) this.f45842a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                g0();
                v();
                ((HashMap) this.f45844c.f32796c).values().removeAll(Collections.singleton(null));
                return z10;
            }
            z10 = true;
            this.f45843b = true;
            try {
                V(this.K, this.L);
            } finally {
                d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0233 A[PHI: r15
      0x0233: PHI (r15v23 int) = (r15v22 int), (r15v25 int) binds: [B:106:0x0220, B:110:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.util.ArrayList r29, java.util.ArrayList r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 1472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.h0.B(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final t C(int i) {
        s7.g gVar = this.f45844c;
        ArrayList arrayList = (ArrayList) gVar.f32795b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t tVar = (t) arrayList.get(size);
            if (tVar != null && tVar.f45989x == i) {
                return tVar;
            }
        }
        for (m0 m0Var : ((HashMap) gVar.f32796c).values()) {
            if (m0Var != null) {
                t tVar2 = m0Var.f45905c;
                if (tVar2.f45989x == i) {
                    return tVar2;
                }
            }
        }
        return null;
    }

    public final t D(String str) {
        s7.g gVar = this.f45844c;
        ArrayList arrayList = (ArrayList) gVar.f32795b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t tVar = (t) arrayList.get(size);
            if (tVar != null && str.equals(tVar.f45991z)) {
                return tVar;
            }
        }
        for (m0 m0Var : ((HashMap) gVar.f32796c).values()) {
            if (m0Var != null) {
                t tVar2 = m0Var.f45905c;
                if (str.equals(tVar2.f45991z)) {
                    return tVar2;
                }
            }
        }
        return null;
    }

    public final void E() {
        for (m mVar : e()) {
            if (mVar.f45902e) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                mVar.f45902e = false;
                mVar.f();
            }
        }
    }

    public final ViewGroup G(t tVar) {
        ViewGroup viewGroup = tVar.F;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (tVar.f45990y <= 0 || !this.f45863w.p()) {
            return null;
        }
        View viewO = this.f45863w.o(tVar.f45990y);
        if (viewO instanceof ViewGroup) {
            return (ViewGroup) viewO;
        }
        return null;
    }

    public final b0 H() {
        t tVar = this.f45864x;
        return tVar != null ? tVar.f45985t.H() : this.f45866z;
    }

    public final t.t0 I() {
        t tVar = this.f45864x;
        return tVar != null ? tVar.f45985t.I() : this.A;
    }

    public final void J(t tVar) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + tVar);
        }
        if (tVar.A) {
            return;
        }
        tVar.A = true;
        tVar.K = true ^ tVar.K;
        c0(tVar);
    }

    public final boolean M() {
        t tVar = this.f45864x;
        if (tVar == null) {
            return true;
        }
        return tVar.f45986u != null && tVar.f45977l && tVar.n().M();
    }

    public final void P(int i, boolean z5) {
        v vVar;
        if (this.f45862v == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z5 || i != this.f45861u) {
            this.f45861u = i;
            s7.g gVar = this.f45844c;
            HashMap map = (HashMap) gVar.f32796c;
            Iterator it = ((ArrayList) gVar.f32795b).iterator();
            while (it.hasNext()) {
                m0 m0Var = (m0) map.get(((t) it.next()).f45972f);
                if (m0Var != null) {
                    m0Var.k();
                }
            }
            for (m0 m0Var2 : map.values()) {
                if (m0Var2 != null) {
                    m0Var2.k();
                    t tVar = m0Var2.f45905c;
                    if (tVar.f45978m && !tVar.r()) {
                        gVar.F(m0Var2);
                    }
                }
            }
            e0();
            if (this.F && (vVar = this.f45862v) != null && this.f45861u == 7) {
                vVar.f45999g.invalidateMenu();
                this.F = false;
            }
        }
    }

    public final void Q() {
        if (this.f45862v == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.f45883g = false;
        for (t tVar : this.f45844c.A()) {
            if (tVar != null) {
                tVar.f45987v.Q();
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i, int i10) {
        A(false);
        z(true);
        t tVar = this.f45865y;
        if (tVar != null && i < 0 && tVar.k().R()) {
            return true;
        }
        boolean zT = T(this.K, this.L, i, i10);
        if (zT) {
            this.f45843b = true;
            try {
                V(this.K, this.L);
            } finally {
                d();
            }
        }
        g0();
        v();
        ((HashMap) this.f45844c.f32796c).values().removeAll(Collections.singleton(null));
        return zT;
    }

    public final boolean T(ArrayList arrayList, ArrayList arrayList2, int i, int i10) {
        boolean z5 = (i10 & 1) != 0;
        int size = -1;
        if (!this.f45845d.isEmpty()) {
            if (i < 0) {
                size = z5 ? 0 : this.f45845d.size() - 1;
            } else {
                int size2 = this.f45845d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f45845d.get(size2);
                    if (i >= 0 && i == aVar.f45801r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z5) {
                    size = size2;
                    while (size > 0) {
                        a aVar2 = (a) this.f45845d.get(size - 1);
                        if (i < 0 || i != aVar2.f45801r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f45845d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f45845d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.f45845d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(t tVar) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + tVar + " nesting=" + tVar.f45984s);
        }
        boolean zR = tVar.r();
        if (tVar.B && zR) {
            return;
        }
        s7.g gVar = this.f45844c;
        synchronized (((ArrayList) gVar.f32795b)) {
            ((ArrayList) gVar.f32795b).remove(tVar);
        }
        tVar.f45977l = false;
        if (L(tVar)) {
            this.F = true;
        }
        tVar.f45978m = true;
        c0(tVar);
    }

    public final void V(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i < size) {
            if (!((a) arrayList.get(i)).f45798o) {
                if (i10 != i) {
                    B(arrayList, arrayList2, i10, i);
                }
                i10 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((a) arrayList.get(i10)).f45798o) {
                        i10++;
                    }
                }
                B(arrayList, arrayList2, i, i10);
                i = i10 - 1;
            }
            i++;
        }
        if (i10 != size) {
            B(arrayList, arrayList2, i10, size);
        }
    }

    public final void W(Bundle bundle) {
        x0.v vVar;
        int i;
        boolean z5;
        int i10;
        m0 m0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f45862v.f45996d.getClassLoader());
                this.f45852l.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f45862v.f45996d.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        s7.g gVar = this.f45844c;
        HashMap map2 = (HashMap) gVar.f32797d;
        HashMap map3 = (HashMap) gVar.f32796c;
        map2.clear();
        map2.putAll(map);
        i0 i0Var = (i0) bundle.getParcelable(SentryThread.JsonKeys.STATE);
        if (i0Var == null) {
            return;
        }
        map3.clear();
        Iterator it = i0Var.f45869b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            vVar = this.f45854n;
            i = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM = gVar.M(null, (String) it.next());
            if (bundleM != null) {
                t tVar = (t) this.N.f45878b.get(((l0) bundleM.getParcelable(SentryThread.JsonKeys.STATE)).f45886c);
                if (tVar != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + tVar);
                    }
                    m0Var = new m0(vVar, gVar, tVar, bundleM);
                } else {
                    m0Var = new m0(this.f45854n, this.f45844c, this.f45862v.f45996d.getClassLoader(), H(), bundleM);
                }
                t tVar2 = m0Var.f45905c;
                tVar2.f45969c = bundleM;
                tVar2.f45985t = this;
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + tVar2.f45972f + "): " + tVar2);
                }
                m0Var.m(this.f45862v.f45996d.getClassLoader());
                gVar.D(m0Var);
                m0Var.f45907e = this.f45861u;
            }
        }
        j0 j0Var = this.N;
        j0Var.getClass();
        Iterator it2 = new ArrayList(j0Var.f45878b.values()).iterator();
        while (true) {
            z5 = true;
            if (!it2.hasNext()) {
                break;
            }
            t tVar3 = (t) it2.next();
            if (map3.get(tVar3.f45972f) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + tVar3 + " that was not found in the set of active Fragments " + i0Var.f45869b);
                }
                this.N.f(tVar3);
                tVar3.f45985t = this;
                m0 m0Var2 = new m0(vVar, gVar, tVar3);
                m0Var2.f45907e = 1;
                m0Var2.k();
                tVar3.f45978m = true;
                m0Var2.k();
            }
        }
        ArrayList<String> arrayList = i0Var.f45870c;
        ((ArrayList) gVar.f32795b).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                t tVarV = gVar.v(str3);
                if (tVarV == null) {
                    throw new IllegalStateException(pe.a.f("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + tVarV);
                }
                gVar.r(tVarV);
            }
        }
        if (i0Var.f45871d != null) {
            this.f45845d = new ArrayList(i0Var.f45871d.length);
            int i11 = 0;
            while (true) {
                b[] bVarArr = i0Var.f45871d;
                if (i11 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i11];
                ArrayList arrayList2 = bVar.f45804c;
                a aVar = new a(this);
                int[] iArr = bVar.f45803b;
                int i12 = 0;
                int i13 = 0;
                while (i12 < iArr.length) {
                    n0 n0Var = new n0();
                    int i14 = i12 + 1;
                    int i15 = i;
                    n0Var.f45909a = iArr[i12];
                    if (K(i15)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i13 + " base fragment #" + iArr[i14]);
                    }
                    n0Var.f45916h = androidx.lifecycle.o.values()[bVar.f45805d[i13]];
                    n0Var.i = androidx.lifecycle.o.values()[bVar.f45806e[i13]];
                    int i16 = i12 + 2;
                    n0Var.f45911c = iArr[i14] != 0 ? z5 : false;
                    int i17 = iArr[i16];
                    n0Var.f45912d = i17;
                    int i18 = iArr[i12 + 3];
                    n0Var.f45913e = i18;
                    int i19 = i12 + 5;
                    int i20 = iArr[i12 + 4];
                    n0Var.f45914f = i20;
                    i12 += 6;
                    int[] iArr2 = iArr;
                    int i21 = iArr2[i19];
                    n0Var.f45915g = i21;
                    aVar.f45786b = i17;
                    aVar.f45787c = i18;
                    aVar.f45788d = i20;
                    aVar.f45789e = i21;
                    aVar.b(n0Var);
                    i13++;
                    i = i15;
                    iArr = iArr2;
                    z5 = true;
                }
                int i22 = i;
                aVar.f45790f = bVar.f45807f;
                aVar.f45792h = bVar.f45808g;
                aVar.f45791g = true;
                aVar.i = bVar.i;
                aVar.f45793j = bVar.f45810j;
                aVar.f45794k = bVar.f45811k;
                aVar.f45795l = bVar.f45812l;
                aVar.f45796m = bVar.f45813m;
                aVar.f45797n = bVar.f45814n;
                aVar.f45798o = bVar.f45815o;
                aVar.f45801r = bVar.f45809h;
                for (int i23 = 0; i23 < arrayList2.size(); i23++) {
                    String str4 = (String) arrayList2.get(i23);
                    if (str4 != null) {
                        ((n0) aVar.f45785a.get(i23)).f45910b = gVar.v(str4);
                    }
                }
                aVar.c(1);
                if (K(i22)) {
                    StringBuilder sbM = l7.o.m(i11, "restoreAllState: back stack #", " (index ");
                    sbM.append(aVar.f45801r);
                    sbM.append("): ");
                    sbM.append(aVar);
                    Log.v("FragmentManager", sbM.toString());
                    PrintWriter printWriter = new PrintWriter(new jm1());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f45845d.add(aVar);
                i11++;
                i = i22;
                z5 = true;
            }
            i10 = 0;
        } else {
            i10 = 0;
            this.f45845d = new ArrayList();
        }
        this.f45850j.set(i0Var.f45872e);
        String str5 = i0Var.f45873f;
        if (str5 != null) {
            t tVarV2 = gVar.v(str5);
            this.f45865y = tVarV2;
            r(tVarV2);
        }
        ArrayList arrayList3 = i0Var.f45874g;
        if (arrayList3 != null) {
            for (int i24 = i10; i24 < arrayList3.size(); i24++) {
                this.f45851k.put((String) arrayList3.get(i24), (c) i0Var.f45875h.get(i24));
            }
        }
        this.E = new ArrayDeque(i0Var.i);
    }

    public final Bundle X() {
        int i;
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.G = true;
        this.N.f45883g = true;
        s7.g gVar = this.f45844c;
        gVar.getClass();
        HashMap map = (HashMap) gVar.f32796c;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            m0 m0Var = (m0) it.next();
            if (m0Var != null) {
                t tVar = m0Var.f45905c;
                String str = tVar.f45972f;
                Bundle bundle3 = new Bundle();
                t tVar2 = m0Var.f45905c;
                if (tVar2.f45968b == -1 && (bundle = tVar2.f45969c) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable(SentryThread.JsonKeys.STATE, new l0(tVar2));
                if (tVar2.f45968b > -1) {
                    Bundle bundle4 = new Bundle();
                    tVar2.F(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    m0Var.f45903a.r(tVar2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    tVar2.R.b(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleX = tVar2.f45987v.X();
                    if (!bundleX.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleX);
                    }
                    if (tVar2.G != null) {
                        m0Var.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = tVar2.f45970d;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = tVar2.f45971e;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = tVar2.f45973g;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                gVar.M(bundle3, str);
                arrayList2.add(tVar.f45972f);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + tVar + ": " + tVar.f45969c);
                }
            }
        }
        HashMap map2 = (HashMap) this.f45844c.f32797d;
        if (!map2.isEmpty()) {
            s7.g gVar2 = this.f45844c;
            synchronized (((ArrayList) gVar2.f32795b)) {
                try {
                    if (((ArrayList) gVar2.f32795b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) gVar2.f32795b).size());
                        for (t tVar3 : (ArrayList) gVar2.f32795b) {
                            arrayList.add(tVar3.f45972f);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + tVar3.f45972f + "): " + tVar3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f45845d.size();
            if (size > 0) {
                bVarArr = new b[size];
                for (i = 0; i < size; i++) {
                    bVarArr[i] = new b((a) this.f45845d.get(i));
                    if (K(2)) {
                        StringBuilder sbM = l7.o.m(i, "saveAllState: adding back stack #", ": ");
                        sbM.append(this.f45845d.get(i));
                        Log.v("FragmentManager", sbM.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            i0 i0Var = new i0();
            i0Var.f45873f = null;
            ArrayList arrayList3 = new ArrayList();
            i0Var.f45874g = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            i0Var.f45875h = arrayList4;
            i0Var.f45869b = arrayList2;
            i0Var.f45870c = arrayList;
            i0Var.f45871d = bVarArr;
            i0Var.f45872e = this.f45850j.get();
            t tVar4 = this.f45865y;
            if (tVar4 != null) {
                i0Var.f45873f = tVar4.f45972f;
            }
            arrayList3.addAll(this.f45851k.keySet());
            arrayList4.addAll(this.f45851k.values());
            i0Var.i = new ArrayList(this.E);
            bundle2.putParcelable(SentryThread.JsonKeys.STATE, i0Var);
            for (String str2 : this.f45852l.keySet()) {
                bundle2.putBundle(om1.k("result_", str2), (Bundle) this.f45852l.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(om1.k("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void Y() {
        synchronized (this.f45842a) {
            try {
                if (this.f45842a.size() == 1) {
                    this.f45862v.f45997e.removeCallbacks(this.O);
                    this.f45862v.f45997e.post(this.O);
                    g0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void Z(t tVar, boolean z5) {
        ViewGroup viewGroupG = G(tVar);
        if (viewGroupG == null || !(viewGroupG instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupG).setDrawDisappearingViewsLast(!z5);
    }

    public final m0 a(t tVar) {
        String str = tVar.M;
        if (str != null) {
            a3.d.d(tVar, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + tVar);
        }
        m0 m0VarG = g(tVar);
        tVar.f45985t = this;
        s7.g gVar = this.f45844c;
        gVar.D(m0VarG);
        if (!tVar.B) {
            gVar.r(tVar);
            tVar.f45978m = false;
            if (tVar.G == null) {
                tVar.K = false;
            }
            if (L(tVar)) {
                this.F = true;
            }
        }
        return m0VarG;
    }

    public final void a0(t tVar, androidx.lifecycle.o oVar) {
        if (tVar.equals(this.f45844c.v(tVar.f45972f)) && (tVar.f45986u == null || tVar.f45985t == this)) {
            tVar.N = oVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + tVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void b(v vVar, com.google.android.gms.internal.auth.m mVar, t tVar) {
        if (this.f45862v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f45862v = vVar;
        this.f45863w = mVar;
        this.f45864x = tVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f45855o;
        if (tVar != null) {
            copyOnWriteArrayList.add(new c0(tVar));
        } else if (vVar != null) {
            copyOnWriteArrayList.add(vVar);
        }
        if (this.f45864x != null) {
            g0();
        }
        if (vVar != null) {
            d.w onBackPressedDispatcher = vVar.f45999g.getOnBackPressedDispatcher();
            this.f45848g = onBackPressedDispatcher;
            onBackPressedDispatcher.a(tVar != null ? tVar : vVar, this.i);
        }
        if (tVar != null) {
            j0 j0Var = tVar.f45985t.N;
            HashMap map = j0Var.f45879c;
            j0 j0Var2 = (j0) map.get(tVar.f45972f);
            if (j0Var2 == null) {
                j0Var2 = new j0(j0Var.f45881e);
                map.put(tVar.f45972f, j0Var2);
            }
            this.N = j0Var2;
        } else if (vVar != null) {
            z0 store = vVar.f45999g.getViewModelStore();
            Intrinsics.checkNotNullParameter(store, "store");
            h3.c factory = j0.f45877h;
            Intrinsics.checkNotNullParameter(factory, "factory");
            f3.a defaultCreationExtras = f3.a.f16575b;
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            s7.g gVar = new s7.g(store, factory, defaultCreationExtras);
            Intrinsics.checkNotNullParameter(j0.class, "modelClass");
            Intrinsics.checkNotNullParameter(j0.class, "<this>");
            kotlin.jvm.internal.i modelClass = kotlin.jvm.internal.g0.a(j0.class);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            String strB = modelClass.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.N = (j0) gVar.C(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        } else {
            this.N = new j0(false);
        }
        j0 j0Var3 = this.N;
        j0Var3.f45883g = this.G || this.H;
        this.f45844c.f32798e = j0Var3;
        v vVar2 = this.f45862v;
        if (vVar2 != null && tVar == null) {
            o6.e savedStateRegistry = vVar2.f45999g.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new d.f(3, this));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                W(bundleA);
            }
        }
        v vVar3 = this.f45862v;
        if (vVar3 != null) {
            f.h activityResultRegistry = vVar3.f45999g.getActivityResultRegistry();
            String strK = om1.k("FragmentManager:", tVar != null ? a0.u.o(new StringBuilder(), tVar.f45972f, StringUtils.PROCESS_POSTFIX_DELIMITER) : "");
            this.B = activityResultRegistry.c(om1.x(strK, "StartActivityForResult"), new g.i(2), new m4.d(this));
            this.C = activityResultRegistry.c(om1.x(strK, "StartIntentSenderForResult"), new g.i(4), new xi.d(this));
            this.D = activityResultRegistry.c(om1.x(strK, "RequestPermissions"), new g.i(1), new k6.t0(25, this));
        }
        v vVar4 = this.f45862v;
        if (vVar4 != null) {
            vVar4.addOnConfigurationChangedListener(this.f45856p);
        }
        v vVar5 = this.f45862v;
        if (vVar5 != null) {
            vVar5.f45999g.addOnTrimMemoryListener(this.f45857q);
        }
        v vVar6 = this.f45862v;
        if (vVar6 != null) {
            vVar6.f45999g.addOnMultiWindowModeChangedListener(this.f45858r);
        }
        v vVar7 = this.f45862v;
        if (vVar7 != null) {
            vVar7.f45999g.addOnPictureInPictureModeChangedListener(this.f45859s);
        }
        v vVar8 = this.f45862v;
        if (vVar8 == null || tVar != null) {
            return;
        }
        vVar8.f45999g.addMenuProvider(this.f45860t);
    }

    public final void b0(t tVar) {
        if (tVar != null) {
            if (!tVar.equals(this.f45844c.v(tVar.f45972f)) || (tVar.f45986u != null && tVar.f45985t != this)) {
                throw new IllegalArgumentException("Fragment " + tVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        t tVar2 = this.f45865y;
        this.f45865y = tVar;
        r(tVar2);
        r(this.f45865y);
    }

    public final void c(t tVar) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + tVar);
        }
        if (tVar.B) {
            tVar.B = false;
            if (tVar.f45977l) {
                return;
            }
            this.f45844c.r(tVar);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + tVar);
            }
            if (L(tVar)) {
                this.F = true;
            }
        }
    }

    public final void c0(t tVar) {
        ViewGroup viewGroupG = G(tVar);
        if (viewGroupG != null) {
            s sVar = tVar.J;
            if ((sVar == null ? 0 : sVar.f45957e) + (sVar == null ? 0 : sVar.f45956d) + (sVar == null ? 0 : sVar.f45955c) + (sVar == null ? 0 : sVar.f45954b) > 0) {
                if (viewGroupG.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupG.setTag(R.id.visible_removing_fragment_view_tag, tVar);
                }
                t tVar2 = (t) viewGroupG.getTag(R.id.visible_removing_fragment_view_tag);
                s sVar2 = tVar.J;
                boolean z5 = sVar2 != null ? sVar2.f45953a : false;
                if (tVar2.J == null) {
                    return;
                }
                tVar2.i().f45953a = z5;
            }
        }
    }

    public final void d() {
        this.f45843b = false;
        this.L.clear();
        this.K.clear();
    }

    public final HashSet e() {
        m mVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f45844c.x().iterator();
        while (it.hasNext()) {
            ViewGroup container = ((m0) it.next()).f45905c.F;
            if (container != null) {
                t.t0 factory = I();
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object tag = container.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof m) {
                    mVar = (m) tag;
                } else {
                    factory.getClass();
                    Intrinsics.checkNotNullParameter(container, "container");
                    mVar = new m(container);
                    Intrinsics.checkNotNullExpressionValue(mVar, "factory.createController(container)");
                    container.setTag(R.id.special_effects_controller_view_tag, mVar);
                }
                hashSet.add(mVar);
            }
        }
        return hashSet;
    }

    public final void e0() {
        for (m0 m0Var : this.f45844c.x()) {
            t tVar = m0Var.f45905c;
            if (tVar.H) {
                if (this.f45843b) {
                    this.J = true;
                } else {
                    tVar.H = false;
                    m0Var.k();
                }
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i, int i10) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i10) {
            Iterator it = ((a) arrayList.get(i)).f45785a.iterator();
            while (it.hasNext()) {
                t tVar = ((n0) it.next()).f45910b;
                if (tVar != null && (viewGroup = tVar.F) != null) {
                    hashSet.add(m.j(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new jm1());
        v vVar = this.f45862v;
        if (vVar == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
                throw illegalStateException;
            }
        }
        try {
            vVar.f45999g.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e7) {
            Log.e("FragmentManager", "Failed dumping state", e7);
            throw illegalStateException;
        }
    }

    public final m0 g(t tVar) {
        String str = tVar.f45972f;
        s7.g gVar = this.f45844c;
        m0 m0Var = (m0) ((HashMap) gVar.f32796c).get(str);
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0(this.f45854n, gVar, tVar);
        m0Var2.m(this.f45862v.f45996d.getClassLoader());
        m0Var2.f45907e = this.f45861u;
        return m0Var2;
    }

    public final void g0() {
        synchronized (this.f45842a) {
            try {
                if (!this.f45842a.isEmpty()) {
                    this.i.setEnabled(true);
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z5 = this.f45845d.size() + (this.f45849h != null ? 1 : 0) > 0 && O(this.f45864x);
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z5);
                }
                this.i.setEnabled(z5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(t tVar) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + tVar);
        }
        if (tVar.B) {
            return;
        }
        tVar.B = true;
        if (tVar.f45977l) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + tVar);
            }
            s7.g gVar = this.f45844c;
            synchronized (((ArrayList) gVar.f32795b)) {
                ((ArrayList) gVar.f32795b).remove(tVar);
            }
            tVar.f45977l = false;
            if (L(tVar)) {
                this.F = true;
            }
            c0(tVar);
        }
    }

    public final void i(boolean z5) {
        if (z5 && this.f45862v != null) {
            f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (t tVar : this.f45844c.A()) {
            if (tVar != null) {
                tVar.E = true;
                if (z5) {
                    tVar.f45987v.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f45861u < 1) {
            return false;
        }
        for (t tVar : this.f45844c.A()) {
            if (tVar != null) {
                if (!tVar.A ? tVar.f45987v.j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f45861u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z5 = false;
        for (t tVar : this.f45844c.A()) {
            if (tVar != null && N(tVar)) {
                if (!tVar.A ? tVar.f45987v.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(tVar);
                    z5 = true;
                }
            }
        }
        if (this.f45846e != null) {
            for (int i = 0; i < this.f45846e.size(); i++) {
                t tVar2 = (t) this.f45846e.get(i);
                if (arrayList == null || !arrayList.contains(tVar2)) {
                    tVar2.getClass();
                }
            }
        }
        this.f45846e = arrayList;
        return z5;
    }

    public final void l() throws Exception {
        boolean zIsChangingConfigurations = true;
        this.I = true;
        A(true);
        x();
        v vVar = this.f45862v;
        s7.g gVar = this.f45844c;
        if (vVar != null) {
            zIsChangingConfigurations = ((j0) gVar.f32798e).f45882f;
        } else {
            w wVar = vVar.f45996d;
            if (wVar != null) {
                zIsChangingConfigurations = true ^ wVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f45851k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((c) it.next()).f45818b.iterator();
                while (it2.hasNext()) {
                    ((j0) gVar.f32798e).c((String) it2.next(), false);
                }
            }
        }
        u(-1);
        v vVar2 = this.f45862v;
        if (vVar2 != null) {
            vVar2.f45999g.removeOnTrimMemoryListener(this.f45857q);
        }
        v vVar3 = this.f45862v;
        if (vVar3 != null) {
            vVar3.removeOnConfigurationChangedListener(this.f45856p);
        }
        v vVar4 = this.f45862v;
        if (vVar4 != null) {
            vVar4.f45999g.removeOnMultiWindowModeChangedListener(this.f45858r);
        }
        v vVar5 = this.f45862v;
        if (vVar5 != null) {
            vVar5.f45999g.removeOnPictureInPictureModeChangedListener(this.f45859s);
        }
        v vVar6 = this.f45862v;
        if (vVar6 != null && this.f45864x == null) {
            vVar6.f45999g.removeMenuProvider(this.f45860t);
        }
        this.f45862v = null;
        this.f45863w = null;
        this.f45864x = null;
        if (this.f45848g != null) {
            this.i.remove();
            this.f45848g = null;
        }
        f.g gVar2 = this.B;
        if (gVar2 != null) {
            gVar2.f16458b.e(gVar2.f16459c);
            f.g gVar3 = this.C;
            gVar3.f16458b.e(gVar3.f16459c);
            f.g gVar4 = this.D;
            gVar4.f16458b.e(gVar4.f16459c);
        }
    }

    public final void m(boolean z5) {
        if (z5 && this.f45862v != null) {
            f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (t tVar : this.f45844c.A()) {
            if (tVar != null) {
                tVar.E = true;
                if (z5) {
                    tVar.f45987v.m(true);
                }
            }
        }
    }

    public final void n(boolean z5) {
        if (z5 && this.f45862v != null) {
            f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (t tVar : this.f45844c.A()) {
            if (tVar != null && z5) {
                tVar.f45987v.n(true);
            }
        }
    }

    public final void o() {
        for (t tVar : this.f45844c.y()) {
            if (tVar != null) {
                tVar.q();
                tVar.f45987v.o();
            }
        }
    }

    public final boolean p() {
        if (this.f45861u >= 1) {
            for (t tVar : this.f45844c.A()) {
                if (tVar != null) {
                    if (!tVar.A ? tVar.f45987v.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f45861u < 1) {
            return;
        }
        for (t tVar : this.f45844c.A()) {
            if (tVar != null && !tVar.A) {
                tVar.f45987v.q();
            }
        }
    }

    public final void r(t tVar) {
        if (tVar != null) {
            if (tVar.equals(this.f45844c.v(tVar.f45972f))) {
                tVar.f45985t.getClass();
                boolean zO = O(tVar);
                Boolean bool = tVar.f45976k;
                if (bool == null || bool.booleanValue() != zO) {
                    tVar.f45976k = Boolean.valueOf(zO);
                    h0 h0Var = tVar.f45987v;
                    h0Var.g0();
                    h0Var.r(h0Var.f45865y);
                }
            }
        }
    }

    public final void s(boolean z5) {
        if (z5 && this.f45862v != null) {
            f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (t tVar : this.f45844c.A()) {
            if (tVar != null && z5) {
                tVar.f45987v.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.f45861u < 1) {
            return false;
        }
        boolean z5 = false;
        for (t tVar : this.f45844c.A()) {
            if (tVar != null && N(tVar)) {
                if (!tVar.A ? tVar.f45987v.t() : false) {
                    z5 = true;
                }
            }
        }
        return z5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        t tVar = this.f45864x;
        if (tVar != null) {
            sb2.append(tVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f45864x)));
            sb2.append("}");
        } else {
            v vVar = this.f45862v;
            if (vVar != null) {
                sb2.append(vVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f45862v)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i) {
        try {
            this.f45843b = true;
            for (m0 m0Var : ((HashMap) this.f45844c.f32796c).values()) {
                if (m0Var != null) {
                    m0Var.f45907e = i;
                }
            }
            P(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((m) it.next()).i();
            }
            this.f45843b = false;
            A(true);
        } catch (Throwable th2) {
            this.f45843b = false;
            throw th2;
        }
    }

    public final void v() {
        if (this.J) {
            this.J = false;
            e0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strX = om1.x(str, "    ");
        s7.g gVar = this.f45844c;
        ArrayList arrayList = (ArrayList) gVar.f32795b;
        String strX2 = om1.x(str, "    ");
        HashMap map = (HashMap) gVar.f32796c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (m0 m0Var : map.values()) {
                printWriter.print(str);
                if (m0Var != null) {
                    t tVar = m0Var.f45905c;
                    printWriter.println(tVar);
                    tVar.h(strX2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                t tVar2 = (t) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(tVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f45846e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                t tVar3 = (t) this.f45846e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(tVar3.toString());
            }
        }
        int size3 = this.f45845d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size3; i11++) {
                a aVar = (a) this.f45845d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(strX, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f45850j.get());
        synchronized (this.f45842a) {
            try {
                int size4 = this.f45842a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (e0) this.f45842a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f45862v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f45863w);
        if (this.f45864x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f45864x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f45861u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((m) it.next()).i();
        }
    }

    public final void y(e0 e0Var, boolean z5) {
        if (!z5) {
            if (this.f45862v == null) {
                if (!this.I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.G || this.H) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f45842a) {
            try {
                if (this.f45862v == null) {
                    if (!z5) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f45842a.add(e0Var);
                    Y();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(boolean z5) {
        if (this.f45843b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f45862v == null) {
            if (!this.I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f45862v.f45997e.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z5 && (this.G || this.H)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.K == null) {
            this.K = new ArrayList();
            this.L = new ArrayList();
        }
    }
}
