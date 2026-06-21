package oa;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.i0;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements na.g, na.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na.c f29871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f29872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l6.i f29873e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f29876h;
    public final x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29877j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f29881n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList f29870b = new LinkedList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f29874f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f29875g = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f29878k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ma.b f29879l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29880m = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public p(e eVar, na.f fVar) {
        this.f29881n = eVar;
        Looper looper = eVar.f29849o.getLooper();
        ka.k kVarA = fVar.a();
        q9.o oVar = new q9.o((String) kVarA.f27325d, (String) kVarA.f27326e, (h1.f) kVarA.f27324c);
        rl.b bVar = (rl.b) fVar.f29193e.f27978c;
        pa.c0.i(bVar);
        na.c cVarA = bVar.a(fVar.f29190b, looper, oVar, fVar.f29194f, this, this);
        ni.i iVar = fVar.f29192d;
        if (iVar == null || !(cVarA instanceof pa.e)) {
            String str = fVar.f29191c;
            if (str != null && (cVarA instanceof pa.e)) {
                ((pa.e) cVarA).f31344s = str;
            }
        } else {
            ((pa.e) cVarA).f31345t = iVar;
        }
        this.f29871c = cVarA;
        this.f29872d = fVar.f29195g;
        this.f29873e = new l6.i(10);
        this.f29876h = fVar.i;
        if (!cVarA.c()) {
            this.i = null;
            return;
        }
        Context context = eVar.f29841f;
        kw0 kw0Var = eVar.f29849o;
        ka.k kVarA2 = fVar.a();
        this.i = new x(context, kw0Var, new q9.o((String) kVarA2.f27325d, (String) kVarA2.f27326e, (h1.f) kVarA2.f27324c));
    }

    public final void a() {
        na.c cVar = this.f29871c;
        e eVar = this.f29881n;
        pa.c0.d(eVar.f29849o);
        this.f29879l = null;
        i(ma.b.f28759g);
        if (this.f29877j) {
            kw0 kw0Var = eVar.f29849o;
            a aVar = this.f29872d;
            kw0Var.removeMessages(11, aVar);
            eVar.f29849o.removeMessages(9, aVar);
            this.f29877j = false;
        }
        Iterator it = this.f29875g.values().iterator();
        while (it.hasNext()) {
            i4 i4Var = ((v) it.next()).f29892a;
            try {
                ((a1.e) ((la.m) i4Var.f13783d).f28099d).accept(cVar, new sb.g());
            } catch (DeadObjectException unused) {
                l0(3);
                cVar.a("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException e3) {
                e = e3;
                Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            } catch (RuntimeException e7) {
                e = e7;
                Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            }
        }
        d();
        h();
    }

    public final void b(int i) {
        pa.c0.d(this.f29881n.f29849o);
        this.f29879l = null;
        this.f29877j = true;
        String str = ((pa.e) this.f29871c).f31327a;
        l6.i iVar = this.f29873e;
        iVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        iVar.n(new Status(20, sb2.toString(), null, null), true);
        a aVar = this.f29872d;
        e eVar = this.f29881n;
        kw0 kw0Var = eVar.f29849o;
        kw0Var.sendMessageDelayed(Message.obtain(kw0Var, 9, aVar), 5000L);
        kw0 kw0Var2 = eVar.f29849o;
        kw0Var2.sendMessageDelayed(Message.obtain(kw0Var2, 11, aVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) eVar.f29843h.f27978c;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f29875g.values().iterator();
        while (it.hasNext()) {
            ((v) it.next()).getClass();
        }
    }

    public final boolean c(ma.b bVar) {
        synchronized (e.f29835s) {
            try {
                e eVar = this.f29881n;
                if (eVar.f29846l == null || !eVar.f29847m.contains(this.f29872d)) {
                    return false;
                }
                n nVar = eVar.f29846l;
                int i = this.f29876h;
                nVar.getClass();
                d0 d0Var = new d0(bVar, i);
                AtomicReference atomicReference = nVar.f29864d;
                while (true) {
                    if (atomicReference.compareAndSet(null, d0Var)) {
                        nVar.f29865e.post(new ed.c(nVar, d0Var));
                        break;
                    }
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // na.h
    public final void c0(ma.b bVar) {
        k(bVar, null);
    }

    public final void d() {
        LinkedList linkedList = this.f29870b;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c0 c0Var = (c0) arrayList.get(i);
            if (!((pa.e) this.f29871c).r()) {
                return;
            }
            if (e(c0Var)) {
                linkedList.remove(c0Var);
            }
        }
    }

    public final boolean e(c0 c0Var) {
        if (!(c0Var instanceof t)) {
            l6.i iVar = this.f29873e;
            na.c cVar = this.f29871c;
            c0Var.c(iVar, cVar.c());
            try {
                c0Var.d(this);
                return true;
            } catch (DeadObjectException unused) {
                l0(1);
                cVar.a("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        t tVar = (t) c0Var;
        ma.d[] dVarArrF = tVar.f(this);
        ma.d dVar = null;
        if (dVarArrF != null && dVarArrF.length != 0) {
            ma.d[] dVarArrI = ((pa.e) this.f29871c).i();
            if (dVarArrI == null) {
                dVarArrI = new ma.d[0];
            }
            h1.e eVar = new h1.e(dVarArrI.length);
            for (ma.d dVar2 : dVarArrI) {
                eVar.put(dVar2.f28768b, Long.valueOf(dVar2.c()));
            }
            for (ma.d dVar3 : dVarArrF) {
                Long l10 = (Long) eVar.get(dVar3.f28768b);
                if (l10 == null || l10.longValue() < dVar3.c()) {
                    dVar = dVar3;
                    break;
                }
            }
        }
        if (dVar == null) {
            l6.i iVar2 = this.f29873e;
            na.c cVar2 = this.f29871c;
            c0Var.c(iVar2, cVar2.c());
            try {
                c0Var.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                l0(1);
                cVar2.a("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f29871c.getClass().getName();
        String str = dVar.f28768b;
        long jC = dVar.c();
        StringBuilder sb2 = new StringBuilder(name.length() + 53 + String.valueOf(str).length() + 2 + String.valueOf(jC).length() + 2);
        l7.o.t(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(jC);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        e eVar2 = this.f29881n;
        if (!eVar2.f29850p || !tVar.g(this)) {
            tVar.b(new na.m(dVar));
            return true;
        }
        q qVar = new q(this.f29872d, dVar);
        ArrayList arrayList = this.f29878k;
        int iIndexOf = arrayList.indexOf(qVar);
        if (iIndexOf >= 0) {
            q qVar2 = (q) arrayList.get(iIndexOf);
            eVar2.f29849o.removeMessages(15, qVar2);
            eVar2.f29849o.sendMessageDelayed(Message.obtain(eVar2.f29849o, 15, qVar2), 5000L);
            return false;
        }
        arrayList.add(qVar);
        eVar2.f29849o.sendMessageDelayed(Message.obtain(eVar2.f29849o, 15, qVar), 5000L);
        eVar2.f29849o.sendMessageDelayed(Message.obtain(eVar2.f29849o, 16, qVar), 120000L);
        ma.b bVar = new ma.b(2, null, null);
        if (c(bVar)) {
            String str2 = dVar.f28768b;
            long jC2 = dVar.c();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jC2).length());
            sb3.append("A dialog should be displayed for missing feature: ");
            sb3.append(str2);
            sb3.append(", version: ");
            sb3.append(jC2);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        if (!eVar2.g(bVar, this.f29876h)) {
            return false;
        }
        String str3 = dVar.f28768b;
        long jC3 = dVar.c();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jC3).length());
        sb4.append("Notification displayed for missing feature: ");
        sb4.append(str3);
        sb4.append(", version: ");
        sb4.append(jC3);
        Log.w("GoogleApiManager", sb4.toString());
        return false;
    }

    public final void f(Status status, Exception exc, boolean z5) {
        pa.c0.d(this.f29881n.f29849o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f29870b.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (!z5 || c0Var.f29830a == 2) {
                if (status != null) {
                    c0Var.a(status);
                } else {
                    c0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g(Status status) {
        pa.c0.d(this.f29881n.f29849o);
        f(status, null, false);
    }

    public final void h() {
        e eVar = this.f29881n;
        kw0 kw0Var = eVar.f29849o;
        a aVar = this.f29872d;
        kw0Var.removeMessages(12, aVar);
        kw0 kw0Var2 = eVar.f29849o;
        kw0Var2.sendMessageDelayed(kw0Var2.obtainMessage(12, aVar), eVar.f29837b);
    }

    public final void i(ma.b bVar) {
        HashSet hashSet = this.f29874f;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        if (pa.c0.m(bVar, ma.b.f28759g)) {
            pa.e eVar = (pa.e) this.f29871c;
            if (!eVar.r() || eVar.f31328b == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    public final void j(ma.b bVar) {
        pa.c0.d(this.f29881n.f29849o);
        na.c cVar = this.f29871c;
        String name = cVar.getClass().getName();
        String strValueOf = String.valueOf(bVar);
        cVar.a(om1.n(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        k(bVar, null);
    }

    public final void k(ma.b bVar, RuntimeException runtimeException) {
        qb.a aVar;
        e eVar = this.f29881n;
        pa.c0.d(eVar.f29849o);
        x xVar = this.i;
        if (xVar != null && (aVar = xVar.f29903h) != null) {
            aVar.f();
        }
        pa.c0.d(this.f29881n.f29849o);
        this.f29879l = null;
        SparseIntArray sparseIntArray = (SparseIntArray) eVar.f29843h.f27978c;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        i(bVar);
        if ((this.f29871c instanceof ra.c) && bVar.f28761c != 24) {
            eVar.f29838c = true;
            kw0 kw0Var = eVar.f29849o;
            kw0Var.sendMessageDelayed(kw0Var.obtainMessage(19), 300000L);
        }
        int i = bVar.f28761c;
        if (i == 4) {
            g(e.f29834r);
            return;
        }
        if (i == 25) {
            g(e.c(this.f29872d, bVar));
            return;
        }
        LinkedList linkedList = this.f29870b;
        if (linkedList.isEmpty()) {
            this.f29879l = bVar;
            return;
        }
        if (runtimeException != null) {
            pa.c0.d(eVar.f29849o);
            f(null, runtimeException, false);
            return;
        }
        if (!eVar.f29850p) {
            g(e.c(this.f29872d, bVar));
            return;
        }
        a aVar2 = this.f29872d;
        f(e.c(aVar2, bVar), null, true);
        if (linkedList.isEmpty() || c(bVar) || eVar.g(bVar, this.f29876h)) {
            return;
        }
        if (bVar.f28761c == 18) {
            this.f29877j = true;
        }
        if (!this.f29877j) {
            g(e.c(aVar2, bVar));
        } else {
            kw0 kw0Var2 = eVar.f29849o;
            kw0Var2.sendMessageDelayed(Message.obtain(kw0Var2, 9, aVar2), 5000L);
        }
    }

    public final void l(c0 c0Var) {
        pa.c0.d(this.f29881n.f29849o);
        boolean zR = ((pa.e) this.f29871c).r();
        LinkedList linkedList = this.f29870b;
        if (zR) {
            if (e(c0Var)) {
                h();
                return;
            } else {
                linkedList.add(c0Var);
                return;
            }
        }
        linkedList.add(c0Var);
        ma.b bVar = this.f29879l;
        if (bVar == null || bVar.f28761c == 0 || bVar.f28762d == null) {
            n();
        } else {
            k(bVar, null);
        }
    }

    @Override // na.g
    public final void l0(int i) {
        e eVar = this.f29881n;
        if (Looper.myLooper() == eVar.f29849o.getLooper()) {
            b(i);
        } else {
            eVar.f29849o.post(new pf(this, i, 10));
        }
    }

    public final void m() {
        e eVar = this.f29881n;
        pa.c0.d(eVar.f29849o);
        Status status = e.f29833q;
        g(status);
        this.f29873e.n(status, false);
        for (i iVar : (i[]) this.f29875g.keySet().toArray(new i[0])) {
            l(new a0(iVar, new sb.g()));
        }
        i(new ma.b(4, null, null));
        if (((pa.e) this.f29871c).r()) {
            eVar.f29849o.post(new ac.g(23, new m4.d(this)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n() {
        e eVar = this.f29881n;
        pa.c0.d(eVar.f29849o);
        na.c cVar = this.f29871c;
        pa.e eVar2 = (pa.e) cVar;
        if (eVar2.r() || eVar2.s()) {
            return;
        }
        try {
            int iM = eVar.f29843h.m(eVar.f29841f, cVar);
            if (iM != 0) {
                ma.b bVar = new ma.b(iM, null, null);
                String name = cVar.getClass().getName();
                String string = bVar.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + string.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(string);
                Log.w("GoogleApiManager", sb2.toString());
                k(bVar, null);
                return;
            }
            i0 i0Var = new i0();
            Objects.requireNonNull(eVar);
            i0Var.f6317g = eVar;
            i0Var.f6315e = null;
            i0Var.f6316f = null;
            i0Var.f6312b = false;
            i0Var.f6313c = cVar;
            i0Var.f6314d = this.f29872d;
            if (cVar.c()) {
                x xVar = this.i;
                pa.c0.i(xVar);
                qb.a aVar = xVar.f29903h;
                if (aVar != null) {
                    aVar.f();
                }
                q9.o oVar = xVar.f29902g;
                oVar.f31951f = Integer.valueOf(System.identityHashCode(xVar));
                bb.f fVar = xVar.f29900e;
                Context context = xVar.f29898c;
                Handler handler = xVar.f29899d;
                xVar.f29903h = (qb.a) fVar.a(context, handler.getLooper(), oVar, (pb.a) oVar.f31950e, xVar, xVar);
                xVar.i = i0Var;
                Set set = xVar.f29901f;
                if (set == null || set.isEmpty()) {
                    handler.post(new ac.g(xVar));
                } else {
                    qb.a aVar2 = xVar.f29903h;
                    aVar2.getClass();
                    aVar2.f31335j = new pa.m((pa.e) aVar2);
                    aVar2.w(2, null);
                }
            }
            try {
                eVar2.f31335j = i0Var;
                eVar2.w(2, null);
            } catch (SecurityException e3) {
                k(new ma.b(10, null, null), e3);
            }
        } catch (IllegalStateException e7) {
            k(new ma.b(10, null, null), e7);
        }
    }

    @Override // na.g
    public final void n0() {
        e eVar = this.f29881n;
        if (Looper.myLooper() == eVar.f29849o.getLooper()) {
            a();
        } else {
            eVar.f29849o.post(new ac.g(22, this));
        }
    }
}
