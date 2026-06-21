package u0;

import a0.g0;
import a0.i0;
import a0.q2;
import a1.m;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import com.google.android.gms.internal.measurement.b4;
import g0.a3;
import g0.d0;
import g0.d2;
import g0.e2;
import g0.f0;
import g0.h1;
import g0.h2;
import g0.i1;
import g0.k2;
import g0.n;
import g0.p;
import g0.q1;
import g0.r0;
import g0.s0;
import g0.u1;
import g0.v0;
import g0.w2;
import g0.x2;
import io.appmetrica.analytics.impl.lp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m.h3;
import s3.q;
import t.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends q2 {
    public d2 A;
    public d2 B;
    public e2 C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f33997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f33998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g0 f33999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g0 f34000t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public bb.e f34001u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f34002v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q0.m f34003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q0.m f34004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q0.m f34005y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public q0.m f34006z;

    public d(f0 f0Var, f0 f0Var2, g0 g0Var, g0 g0Var2, HashSet hashSet, a3 a3Var) {
        super(L(hashSet));
        this.f33997q = L(hashSet);
        this.f33999s = g0Var;
        this.f34000t = g0Var2;
        this.f33998r = new g(f0Var, f0Var2, hashSet, a3Var, new q(14, this));
        HashSet hashSet2 = ((q2) hashSet.iterator().next()).f208g;
        this.f208g = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    public static ArrayList K(q2 q2Var) {
        ArrayList arrayList = new ArrayList();
        if (!(q2Var instanceof d)) {
            arrayList.add(q2Var.f209h.n());
            return arrayList;
        }
        Iterator it = ((d) q2Var).f33998r.f34010b.iterator();
        while (it.hasNext()) {
            arrayList.add(((q2) it.next()).f209h.n());
        }
        return arrayList;
    }

    public static e L(HashSet hashSet) {
        q1 q1VarV = q1.v();
        new s.a(q1VarV);
        q1VarV.y(h1.f19579f, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            q2 q2Var = (q2) it.next();
            if (q2Var.f209h.h(x2.C)) {
                arrayList.add(q2Var.f209h.n());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        q1VarV.y(e.M, arrayList);
        q1VarV.y(i1.f19607l, 2);
        q1VarV.y(x2.G, k2.f19638g);
        return new e(u1.u(q1VarV));
    }

    @Override // a0.q2
    public final void A() {
        G();
        g gVar = this.f33998r;
        for (q2 q2Var : gVar.f34010b) {
            f fVar = (f) gVar.f34012d.get(q2Var);
            Objects.requireNonNull(fVar);
            q2Var.E(fVar);
        }
    }

    public final void G() {
        e2 e2Var = this.C;
        if (e2Var != null) {
            e2Var.b();
            this.C = null;
        }
        q0.m mVar = this.f34003w;
        if (mVar != null) {
            mVar.c();
            this.f34003w = null;
        }
        q0.m mVar2 = this.f34004x;
        if (mVar2 != null) {
            mVar2.c();
            this.f34004x = null;
        }
        q0.m mVar3 = this.f34005y;
        if (mVar3 != null) {
            mVar3.c();
            this.f34005y = null;
        }
        q0.m mVar4 = this.f34006z;
        if (mVar4 != null) {
            mVar4.c();
            this.f34006z = null;
        }
        bb.e eVar = this.f34001u;
        if (eVar != null) {
            eVar.B();
            this.f34001u = null;
        }
        m mVar5 = this.f34002v;
        if (mVar5 != null) {
            ((r0.d) mVar5.f362b).d();
            b4.G(new lp(25, mVar5));
            this.f34002v = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List H(String str, String str2, x2 x2Var, n nVar, n nVar2) {
        i0 i0Var = nVar.f19679c;
        b4.e();
        g gVar = this.f33998r;
        if (nVar2 == null) {
            q0.m mVarI = I(str, str2, x2Var, nVar, null);
            f0 f0VarE = e();
            Objects.requireNonNull(f0VarE);
            bb.e eVar = new bb.e(f0VarE, new q0.f(i0Var));
            this.f34001u = eVar;
            boolean z5 = this.f211k != null;
            int iS = ((i1) this.f209h).s(0);
            gVar.getClass();
            HashMap map = new HashMap();
            for (q2 q2Var : gVar.f34010b) {
                b bVar = gVar.f34019l;
                f0 f0Var = gVar.f34015g;
                g gVar2 = gVar;
                boolean z10 = z5;
                s0.b bVarR = gVar2.r(q2Var, bVar, f0Var, mVarI, iS, z10);
                int iN = gVar2.f34015g.b().n(((i1) q2Var.f209h).s(0));
                f fVar = (f) gVar2.f34012d.get(q2Var);
                Objects.requireNonNull(fVar);
                fVar.f34008c.f34022c = iN;
                map.put(q2Var, bVarR);
                z5 = z10;
                gVar = gVar2;
            }
            g gVar3 = gVar;
            boolean z11 = z5;
            ki.a aVarI = eVar.I(new q0.c(mVarI, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((q2) entry.getKey(), (q0.m) aVarI.get(entry.getValue()));
            }
            gVar3.x(map2, gVar3.u(mVarI, z11));
            Object[] objArr = {this.A.c()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        g gVar4 = gVar;
        q0.m mVarI2 = I(str, str2, x2Var, nVar, nVar2);
        Matrix matrix = this.f212l;
        f0 f0VarK = k();
        Objects.requireNonNull(f0VarK);
        boolean zN = f0VarK.n();
        Size size = nVar2.f19677a;
        Rect rect = this.f211k;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        f0 f0VarK2 = k();
        Objects.requireNonNull(f0VarK2);
        int iJ = j(f0VarK2, false);
        f0 f0VarK3 = k();
        Objects.requireNonNull(f0VarK3);
        q0.m mVar = new q0.m(3, 34, nVar2, matrix, zN, rect2, iJ, -1, o(f0VarK3));
        this.f34004x = mVar;
        Objects.requireNonNull(k());
        this.f34006z = mVar;
        d2 d2VarJ = J(this.f34004x, x2Var, nVar2);
        this.B = d2VarJ;
        e2 e2Var = this.C;
        if (e2Var != null) {
            e2Var.b();
        }
        e2 e2Var2 = new e2(new c(this, str, str2, x2Var, nVar, nVar2));
        this.C = e2Var2;
        d2VarJ.f19531f = e2Var2;
        q0.m mVar2 = this.f34006z;
        f0 f0VarE2 = e();
        f0 f0VarK4 = k();
        r0.d dVar = new r0.d(i0Var, this.f33999s, this.f34000t);
        m mVar3 = new m();
        mVar3.f363c = f0VarE2;
        mVar3.f364d = f0VarK4;
        mVar3.f362b = dVar;
        this.f34002v = mVar3;
        boolean z12 = this.f211k != null;
        int iS2 = ((i1) this.f209h).s(0);
        gVar4.getClass();
        HashMap map3 = new HashMap();
        for (q2 q2Var2 : gVar4.f34010b) {
            g gVar5 = gVar4;
            q0.m mVar4 = mVarI2;
            s0.b bVarR2 = gVar5.r(q2Var2, gVar4.f34019l, gVar4.f34015g, mVar4, iS2, z12);
            b bVar2 = gVar5.f34020m;
            Objects.requireNonNull(bVar2);
            f0 f0Var2 = gVar5.f34016h;
            Objects.requireNonNull(f0Var2);
            q0.m mVar5 = mVar2;
            s0.b bVarR3 = gVar5.r(q2Var2, bVar2, f0Var2, mVar5, iS2, z12);
            int iN2 = gVar5.f34015g.b().n(((i1) q2Var2.f209h).s(0));
            f fVar2 = (f) gVar5.f34012d.get(q2Var2);
            Objects.requireNonNull(fVar2);
            fVar2.f34008c.f34022c = iN2;
            map3.put(q2Var2, new r0.a(bVarR2, bVarR3));
            mVar2 = mVar5;
            mVarI2 = mVar4;
            gVar4 = gVar5;
        }
        q0.m mVar6 = mVar2;
        g gVar6 = gVar4;
        q0.m mVar7 = mVarI2;
        m mVar8 = this.f34002v;
        ArrayList arrayList2 = new ArrayList(map3.values());
        r0.b bVar3 = new r0.b(mVar7, mVar6, arrayList2);
        mVar8.getClass();
        b4.e();
        StringBuilder sb2 = new StringBuilder("DualSurfaceProcessorNode Transform Processor = ");
        r0.d dVar2 = (r0.d) mVar8.f362b;
        sb2.append(dVar2);
        sb2.append("\n   primary input = ");
        sb2.append(mVar7);
        sb2.append("\n   secondary input = ");
        sb2.append(mVar6);
        com.google.android.gms.internal.auth.g.e("DualSurfaceProcessorNode", sb2.toString());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.auth.g.e("SurfaceProcessorNode", "   outputConfig = " + ((r0.a) it.next()));
        }
        mVar8.f366f = bVar3;
        mVar8.f365e = new ki.a();
        r0.b bVar4 = (r0.b) mVar8.f366f;
        q0.m mVar9 = bVar4.f32139a;
        q0.m mVar10 = bVar4.f32140b;
        Iterator it2 = bVar4.f32141c.iterator();
        while (it2.hasNext()) {
            r0.a aVar = (r0.a) it2.next();
            ki.a aVar2 = (ki.a) mVar8.f365e;
            s0.b bVar5 = aVar.f32137a;
            Rect rect3 = bVar5.f32387d;
            int i = bVar5.f32389f;
            boolean z13 = bVar5.f32390g;
            Iterator it3 = it2;
            HashMap map4 = map3;
            Matrix matrix2 = new Matrix(mVar9.f31595b);
            RectF rectF = new RectF(rect3);
            Size size2 = bVar5.f32388e;
            matrix2.postConcat(i0.q.a(rectF, i0.q.j(size2), i, z13));
            f2.g.b(i0.q.e(i0.q.i(i0.q.g(rect3), i), size2));
            Rect rect4 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
            h3 h3VarB = mVar9.f31600g.b();
            h3VarB.f28250b = size2;
            aVar2.put(aVar, new q0.m(bVar5.f32385b, bVar5.f32386c, h3VarB.d(), matrix2, false, rect4, mVar9.i - i, -1, mVar9.f31598e != z13));
            it2 = it3;
            map3 = map4;
        }
        HashMap map5 = map3;
        dVar2.c(mVar9.d((f0) mVar8.f363c, true));
        dVar2.c(mVar10.d((f0) mVar8.f364d, false));
        f0 f0Var3 = (f0) mVar8.f363c;
        f0 f0Var4 = (f0) mVar8.f364d;
        for (Map.Entry entry2 : ((ki.a) mVar8.f365e).entrySet()) {
            q0.m mVar11 = mVar9;
            q0.m mVar12 = mVar10;
            mVar8.g(f0Var3, f0Var4, mVar11, mVar12, entry2);
            q0.m mVar13 = (q0.m) entry2.getValue();
            f0 f0Var5 = f0Var4;
            f0 f0Var6 = f0Var3;
            m mVar14 = mVar8;
            r rVar = new r(mVar14, f0Var6, f0Var5, mVar11, mVar12, entry2, 3);
            mVar8 = mVar14;
            f0Var3 = f0Var6;
            f0Var4 = f0Var5;
            mVar13.a(rVar);
            mVar9 = mVar11;
            mVar10 = mVar12;
        }
        ki.a aVar3 = (ki.a) mVar8.f365e;
        HashMap map6 = new HashMap();
        for (Map.Entry entry3 : map5.entrySet()) {
            map6.put((q2) entry3.getKey(), (q0.m) aVar3.get(entry3.getValue()));
        }
        gVar6.x(map6, gVar6.u(mVar7, z12));
        Object[] objArr2 = {this.A.c(), this.B.c()};
        ArrayList arrayList3 = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            Object obj2 = objArr2[i10];
            Objects.requireNonNull(obj2);
            arrayList3.add(obj2);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final q0.m I(String str, String str2, x2 x2Var, n nVar, n nVar2) {
        Matrix matrix = this.f212l;
        f0 f0VarE = e();
        Objects.requireNonNull(f0VarE);
        boolean zN = f0VarE.n();
        Size size = nVar.f19677a;
        Rect rect = this.f211k;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        f0 f0VarE2 = e();
        Objects.requireNonNull(f0VarE2);
        int iJ = j(f0VarE2, false);
        f0 f0VarE3 = e();
        Objects.requireNonNull(f0VarE3);
        q0.m mVar = new q0.m(3, 34, nVar, matrix, zN, rect, iJ, -1, o(f0VarE3));
        this.f34003w = mVar;
        Objects.requireNonNull(e());
        this.f34005y = mVar;
        d2 d2VarJ = J(this.f34003w, x2Var, nVar);
        this.A = d2VarJ;
        e2 e2Var = this.C;
        if (e2Var != null) {
            e2Var.b();
        }
        e2 e2Var2 = new e2(new c(this, str, str2, x2Var, nVar, nVar2));
        this.C = e2Var2;
        d2VarJ.f19531f = e2Var2;
        return this.f34005y;
    }

    public final d2 J(q0.m mVar, x2 x2Var, n nVar) {
        d2 d2VarD = d2.d(x2Var, nVar.f19677a);
        r0 r0Var = d2VarD.f19527b;
        g gVar = this.f33998r;
        Iterator it = gVar.f34010b.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i10 = ((h2) ((q2) it.next()).f209h.a(x2.f19797s)).f19589g.f19747c;
            List list = h2.f19582j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i10))) {
                i = i10;
            }
        }
        if (i != -1) {
            r0Var.f19728c = i;
        }
        Size size = nVar.f19677a;
        Iterator it2 = gVar.f34010b.iterator();
        while (it2.hasNext()) {
            h2 h2VarC = d2.d(((q2) it2.next()).f209h, size).c();
            s0 s0Var = h2VarC.f19589g;
            r0Var.a(s0Var.f19749e);
            List<p> list2 = h2VarC.f19587e;
            ArrayList arrayList = d2VarD.f19530e;
            for (p pVar : list2) {
                r0Var.b(pVar);
                if (!arrayList.contains(pVar)) {
                    arrayList.add(pVar);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : h2VarC.f19586d) {
                ArrayList arrayList2 = d2VarD.f19529d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : h2VarC.f19585c) {
                ArrayList arrayList3 = d2VarD.f19528c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            r0Var.c(s0Var.f19746b);
        }
        mVar.getClass();
        b4.e();
        mVar.b();
        f2.g.h("Consumer can only be linked once.", !mVar.f31602j);
        mVar.f31602j = true;
        d2VarD.b(mVar.f31604l, nVar.f19679c, -1);
        r0Var.b(gVar.i);
        v0 v0Var = nVar.f19682f;
        if (v0Var != null) {
            r0Var.c(v0Var);
        }
        d2VarD.f19533h = nVar.f19680d;
        a(d2VarD, nVar);
        return d2VarD;
    }

    @Override // a0.q2
    public final x2 h(boolean z5, a3 a3Var) {
        e eVar = this.f33997q;
        v0 v0VarA = a3Var.a(eVar.n(), 1);
        if (z5) {
            v0VarA = v0.l(v0VarA, eVar.L);
        }
        if (v0VarA == null) {
            return null;
        }
        return ((s.a) n(v0VarA)).b();
    }

    @Override // a0.q2
    public final Set l(d0 d0Var) {
        HashSet hashSet = this.f33998r.f34010b;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set setL = ((q2) it.next()).l(d0Var);
            if (setL != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(setL);
                } else {
                    hashSet2.retainAll(setL);
                }
            }
        }
        return hashSet2;
    }

    @Override // a0.q2
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // a0.q2
    public final w2 n(v0 v0Var) {
        return new s.a(q1.w(v0Var));
    }

    @Override // a0.q2
    public final void t() {
        g gVar = this.f33998r;
        for (q2 q2Var : gVar.f34010b) {
            f fVar = (f) gVar.f34012d.get(q2Var);
            Objects.requireNonNull(fVar);
            q2Var.b(fVar, null, null, q2Var.h(true, gVar.f34014f));
        }
    }

    @Override // a0.q2
    public final void u() {
        Iterator it = this.f33998r.f34010b.iterator();
        while (it.hasNext()) {
            ((q2) it.next()).u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010e, code lost:
    
        if (r15 != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d4  */
    @Override // a0.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g0.x2 v(g0.d0 r19, g0.w2 r20) {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.d.v(g0.d0, g0.w2):g0.x2");
    }

    @Override // a0.q2
    public final void w() {
        this.f202a = true;
        Iterator it = this.f33998r.f34010b.iterator();
        while (it.hasNext()) {
            ((q2) it.next()).w();
        }
    }

    @Override // a0.q2
    public final void x() {
        this.f202a = false;
        Iterator it = this.f33998r.f34010b.iterator();
        while (it.hasNext()) {
            ((q2) it.next()).x();
        }
    }

    @Override // a0.q2
    public final n y(v0 v0Var) {
        this.A.a(v0Var);
        Object[] objArr = {this.A.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        F(Collections.unmodifiableList(arrayList));
        h3 h3VarB = this.i.b();
        h3VarB.f28255g = v0Var;
        return h3VarB.d();
    }

    @Override // a0.q2
    public final n z(n nVar, n nVar2) {
        com.google.android.gms.internal.auth.g.e("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + nVar + ", secondaryStreamSpec " + nVar2);
        F(H(g(), k() == null ? null : k().p().e(), this.f209h, nVar, nVar2));
        q();
        return nVar;
    }
}
