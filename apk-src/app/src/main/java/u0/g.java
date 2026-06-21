package u0;

import a0.a2;
import a0.k1;
import a0.p2;
import a0.q2;
import a0.v1;
import android.graphics.Rect;
import android.util.Size;
import com.google.android.gms.internal.measurement.b4;
import g0.a1;
import g0.a3;
import g0.f0;
import g0.f2;
import g0.h2;
import g0.i1;
import g0.x2;
import g0.z0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import m.h3;
import q0.l;
import q0.m;
import s3.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements p2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f34010b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a3 f34014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0 f34015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0 f34016h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashSet f34017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f34018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f34019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f34020m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f34011c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f34012d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f34013e = new HashMap();
    public final v1 i = new v1(this);

    public g(f0 f0Var, f0 f0Var2, HashSet hashSet, a3 a3Var, q qVar) {
        this.f34015g = f0Var;
        this.f34016h = f0Var2;
        this.f34014f = a3Var;
        this.f34010b = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            q2 q2Var = (q2) it.next();
            map.put(q2Var, q2Var.p(f0Var.p(), null, q2Var.h(true, a3Var)));
        }
        this.f34018k = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.f34017j = hashSet2;
        this.f34019l = new b(f0Var, hashSet2);
        if (this.f34016h != null) {
            this.f34020m = new b(this.f34016h, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            q2 q2Var2 = (q2) it2.next();
            this.f34013e.put(q2Var2, Boolean.FALSE);
            this.f34012d.put(q2Var2, new f(f0Var, this, qVar));
        }
    }

    public static void s(m mVar, a1 a1Var, h2 h2Var) {
        mVar.e();
        try {
            b4.e();
            mVar.b();
            l lVar = mVar.f31604l;
            Objects.requireNonNull(lVar);
            lVar.g(a1Var, new q0.g(lVar, 0));
        } catch (z0 unused) {
            f2 f2Var = h2Var.f19588f;
            if (f2Var != null) {
                f2Var.a(h2Var);
            }
        }
    }

    public static a1 t(q2 q2Var) {
        List listB = q2Var instanceof k1 ? q2Var.f215o.b() : Collections.unmodifiableList(q2Var.f215o.f19589g.f19745a);
        f2.g.h(null, listB.size() <= 1);
        if (listB.size() == 1) {
            return (a1) listB.get(0);
        }
        return null;
    }

    @Override // a0.p2
    public final void c(q2 q2Var) {
        b4.e();
        if (w(q2Var)) {
            m mVarV = v(q2Var);
            a1 a1VarT = t(q2Var);
            if (a1VarT != null) {
                s(mVarV, a1VarT, q2Var.f215o);
                return;
            }
            b4.e();
            mVarV.b();
            mVarV.f31604l.a();
        }
    }

    @Override // a0.p2
    public final void d(q2 q2Var) {
        b4.e();
        if (w(q2Var)) {
            this.f34013e.put(q2Var, Boolean.FALSE);
            m mVarV = v(q2Var);
            b4.e();
            mVarV.b();
            mVarV.f31604l.a();
        }
    }

    @Override // a0.p2
    public final void e(q2 q2Var) {
        a1 a1VarT;
        b4.e();
        m mVarV = v(q2Var);
        if (w(q2Var) && (a1VarT = t(q2Var)) != null) {
            s(mVarV, a1VarT, q2Var.f215o);
        }
    }

    @Override // a0.p2
    public final void h(q2 q2Var) {
        b4.e();
        if (w(q2Var)) {
            return;
        }
        this.f34013e.put(q2Var, Boolean.TRUE);
        a1 a1VarT = t(q2Var);
        if (a1VarT != null) {
            s(v(q2Var), a1VarT, q2Var.f215o);
        }
    }

    public final s0.b r(q2 q2Var, b bVar, f0 f0Var, m mVar, int i, boolean z5) {
        int iN = f0Var.b().n(i);
        boolean zF = i0.q.f(mVar.f31595b);
        x2 x2Var = (x2) this.f34018k.get(q2Var);
        Objects.requireNonNull(x2Var);
        a aVarB = bVar.b(x2Var, mVar.f31597d, i0.q.b(mVar.f31595b), z5);
        Rect rect = aVarB.f33980a;
        Size size = aVarB.f33981b;
        int iK = i0.q.k((mVar.i + f0Var.b().n(((i1) q2Var.f209h).s(0))) - iN);
        return new s0.b(UUID.randomUUID(), q2Var instanceof a2 ? 1 : q2Var instanceof k1 ? 4 : 2, q2Var instanceof k1 ? 256 : 34, rect, i0.q.i(size, iK), iK, q2Var.o(f0Var) ^ zF);
    }

    public final HashMap u(m mVar, boolean z5) {
        HashMap map = new HashMap();
        for (q2 q2Var : this.f34010b) {
            x2 x2Var = (x2) this.f34018k.get(q2Var);
            Objects.requireNonNull(x2Var);
            Size size = this.f34019l.b(x2Var, mVar.f31597d, i0.q.b(mVar.f31595b), z5).f33982c;
            map.put(q2Var, size);
            com.google.android.gms.internal.auth.g.e("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + q2Var);
        }
        return map;
    }

    public final m v(q2 q2Var) {
        m mVar = (m) this.f34011c.get(q2Var);
        Objects.requireNonNull(mVar);
        return mVar;
    }

    public final boolean w(q2 q2Var) {
        Boolean bool = (Boolean) this.f34013e.get(q2Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void x(HashMap map, HashMap map2) {
        HashMap map3 = this.f34011c;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            q2 q2Var = (q2) entry.getKey();
            m mVar = (m) entry.getValue();
            q2Var.D(mVar.f31597d);
            q2Var.B(mVar.f31595b);
            h3 h3VarB = mVar.f31600g.b();
            Size size = (Size) map2.get(q2Var);
            if (size != null) {
                h3VarB.f28251c = size;
            }
            q2Var.i = q2Var.z(h3VarB.d(), null);
            q2Var.s();
        }
    }
}
