package ob;

import com.google.android.gms.internal.measurement.y7;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.o3 f30194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f30195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f30196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1.e f30197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1.e f30198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f30199h;

    public i4(c cVar, String str, com.google.android.gms.internal.measurement.o3 o3Var, BitSet bitSet, BitSet bitSet2, h1.e eVar, h1.e eVar2) {
        this.f30199h = cVar;
        this.f30192a = str;
        this.f30195d = bitSet;
        this.f30196e = bitSet2;
        this.f30197f = eVar;
        this.f30198g = new h1.e(0);
        for (Integer num : (h1.b) eVar2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f30198g.put(num, arrayList);
        }
        this.f30193b = false;
        this.f30194c = o3Var;
    }

    public final void a(b bVar) {
        int iQ;
        boolean z5;
        boolean zV;
        switch (bVar.f29951g) {
            case 0:
                iQ = ((com.google.android.gms.internal.measurement.q1) bVar.i).q();
                break;
            default:
                iQ = ((com.google.android.gms.internal.measurement.x1) bVar.i).q();
                break;
        }
        if (bVar.f29947c != null) {
            this.f30196e.set(iQ, true);
        }
        Boolean bool = bVar.f29948d;
        if (bool != null) {
            this.f30195d.set(iQ, bool.booleanValue());
        }
        if (bVar.f29949e != null) {
            Integer numValueOf = Integer.valueOf(iQ);
            h1.e eVar = this.f30197f;
            Long l10 = (Long) eVar.get(numValueOf);
            long jLongValue = bVar.f29949e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                eVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (bVar.f29950f != null) {
            Integer numValueOf2 = Integer.valueOf(iQ);
            h1.e eVar2 = this.f30198g;
            List arrayList = (List) eVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                eVar2.put(numValueOf2, arrayList);
            }
            switch (bVar.f29951g) {
                case 0:
                    z5 = false;
                    break;
                default:
                    z5 = true;
                    break;
            }
            if (z5) {
                arrayList.clear();
            }
            y7.a();
            l1 l1Var = (l1) this.f30199h.f15951b;
            g gVar = l1Var.f30263e;
            c0 c0Var = d0.F0;
            String str = this.f30192a;
            if (gVar.M(str, c0Var)) {
                switch (bVar.f29951g) {
                    case 0:
                        zV = ((com.google.android.gms.internal.measurement.q1) bVar.i).v();
                        break;
                    default:
                        zV = false;
                        break;
                }
                if (zV) {
                    arrayList.clear();
                }
            }
            y7.a();
            if (!l1Var.f30263e.M(str, c0Var)) {
                arrayList.add(Long.valueOf(bVar.f29950f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(bVar.f29950f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final com.google.android.gms.internal.measurement.v2 b(int i) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.u2 u2VarW = com.google.android.gms.internal.measurement.v2.w();
        u2VarW.b();
        ((com.google.android.gms.internal.measurement.v2) u2VarW.f13840c).x(i);
        u2VarW.b();
        ((com.google.android.gms.internal.measurement.v2) u2VarW.f13840c).A(this.f30193b);
        com.google.android.gms.internal.measurement.o3 o3Var = this.f30194c;
        if (o3Var != null) {
            u2VarW.b();
            ((com.google.android.gms.internal.measurement.v2) u2VarW.f13840c).z(o3Var);
        }
        com.google.android.gms.internal.measurement.n3 n3VarX = com.google.android.gms.internal.measurement.o3.x();
        ArrayList arrayListK0 = v0.k0(this.f30195d);
        n3VarX.b();
        ((com.google.android.gms.internal.measurement.o3) n3VarX.f13840c).B(arrayListK0);
        ArrayList arrayListK02 = v0.k0(this.f30196e);
        n3VarX.b();
        ((com.google.android.gms.internal.measurement.o3) n3VarX.f13840c).z(arrayListK02);
        h1.e eVar = this.f30197f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f20340d);
            for (Integer num : (h1.b) eVar.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) eVar.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.a3 a3VarT = com.google.android.gms.internal.measurement.b3.t();
                    a3VarT.b();
                    ((com.google.android.gms.internal.measurement.b3) a3VarT.f13840c).u(iIntValue);
                    long jLongValue = l10.longValue();
                    a3VarT.b();
                    ((com.google.android.gms.internal.measurement.b3) a3VarT.f13840c).v(jLongValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.b3) a3VarT.e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            n3VarX.b();
            ((com.google.android.gms.internal.measurement.o3) n3VarX.f13840c).D(arrayList);
        }
        h1.e eVar2 = this.f30198g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f20340d);
            for (Integer num2 : (h1.b) eVar2.keySet()) {
                com.google.android.gms.internal.measurement.p3 p3VarU = com.google.android.gms.internal.measurement.q3.u();
                int iIntValue2 = num2.intValue();
                p3VarU.b();
                ((com.google.android.gms.internal.measurement.q3) p3VarU.f13840c).v(iIntValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    p3VarU.b();
                    ((com.google.android.gms.internal.measurement.q3) p3VarU.f13840c).w(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.q3) p3VarU.e());
            }
            list = arrayList3;
        }
        n3VarX.b();
        ((com.google.android.gms.internal.measurement.o3) n3VarX.f13840c).F(list);
        u2VarW.b();
        ((com.google.android.gms.internal.measurement.v2) u2VarW.f13840c).y((com.google.android.gms.internal.measurement.o3) n3VarX.e());
        return (com.google.android.gms.internal.measurement.v2) u2VarW.e();
    }

    public i4(c cVar, String str) {
        this.f30199h = cVar;
        this.f30192a = str;
        this.f30193b = true;
        this.f30195d = new BitSet();
        this.f30196e = new BitSet();
        this.f30197f = new h1.e(0);
        this.f30198g = new h1.e(0);
    }
}
