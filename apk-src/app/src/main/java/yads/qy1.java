package yads;

import android.content.Context;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Feedback;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qy1 extends r32 implements y02 {
    public final hy1 P;
    public final u02 Q;
    public final oi2 R;
    public final k22 S;

    public qy1(Context context, hy1 hy1Var, u02 u02Var, oi2 oi2Var, up upVar, hz1 hz1Var) {
        super(context, upVar, hz1Var);
        this.P = hy1Var;
        this.Q = u02Var;
        this.R = oi2Var;
        d4 d4Var = upVar.f43748a.f43488c;
        eq2 eq2Var = hy1Var.f39363a;
        k22 k22Var = new k22(d4Var, eq2Var.f38240b, this.i, this.f42466j, new rz2(hy1Var, new cq2(), new n9(), new wy()));
        this.S = k22Var;
        a(k22Var);
    }

    @Override // yads.y02
    public final void a(t12 t12Var) throws l02 {
        this.S.f40056f = t12Var.f43162e;
        a(t12Var.f43160c, this.R, new b22(t12Var));
    }

    @Override // yads.y02
    public final y00 getAdAssets() {
        h10 h10Var;
        fw fwVar;
        n10 n10Var;
        h10 h10Var2;
        List list;
        u02 u02Var = this.Q;
        oy1 oy1Var = u02Var.f43513f;
        hy1 hy1Var = u02Var.f43508a;
        oy1Var.getClass();
        List<oi> list2 = hy1Var.f39364b;
        int iB = kotlin.collections.i0.b(kotlin.collections.t.j(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (oi oiVar : list2) {
            linkedHashMap.put(oiVar.f41540a, oiVar.f41542c);
        }
        Object obj = linkedHashMap.get("media");
        o10 o10Var = null;
        qn1 qn1Var = obj instanceof qn1 ? (qn1) obj : null;
        Object obj2 = linkedHashMap.get("favicon");
        w41 w41Var = obj2 instanceof w41 ? (w41) obj2 : null;
        Object obj3 = linkedHashMap.get("icon");
        w41 w41Var2 = obj3 instanceof w41 ? (w41) obj3 : null;
        Object obj4 = linkedHashMap.get("close_button");
        gw gwVar = obj4 instanceof gw ? (gw) obj4 : null;
        Object obj5 = linkedHashMap.get("age");
        String str = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = linkedHashMap.get(SentryLogEvent.JsonKeys.BODY);
        String str2 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = linkedHashMap.get("call_to_action");
        String str3 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = linkedHashMap.get("domain");
        String str4 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = linkedHashMap.get("price");
        String str5 = obj9 instanceof String ? (String) obj9 : null;
        Object obj10 = linkedHashMap.get("rating");
        String str6 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = linkedHashMap.get("review_count");
        String str7 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = linkedHashMap.get("sponsored");
        String str8 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = linkedHashMap.get("title");
        String str9 = obj13 instanceof String ? (String) obj13 : null;
        Object obj14 = linkedHashMap.get("warning");
        String str10 = obj14 instanceof String ? (String) obj14 : null;
        boolean z5 = linkedHashMap.get(Feedback.TYPE) != null;
        w41 w41Var3 = (qn1Var == null || (list = qn1Var.f42352c) == null) ? null : (w41) CollectionsKt.firstOrNull(list);
        i02 i02Var = oy1Var.f41771b;
        oi2 oi2Var = oy1Var.f41770a;
        i02Var.getClass();
        a10 a10VarA = i02.a(oi2Var, w41Var3);
        i02 i02Var2 = oy1Var.f41771b;
        oi2 oi2Var2 = oy1Var.f41770a;
        i02Var2.getClass();
        a10 a10VarA2 = i02.a(oi2Var2, w41Var);
        i02 i02Var3 = oy1Var.f41771b;
        oi2 oi2Var3 = oy1Var.f41770a;
        i02Var3.getClass();
        a10 a10VarA3 = i02.a(oi2Var3, w41Var2);
        v02 v02Var = oy1Var.f41772c;
        v02Var.getClass();
        if (qn1Var != null) {
            vd3 vd3Var = qn1Var.f42351b;
            List list3 = qn1Var.f42352c;
            qj1 qj1Var = qn1Var.f42350a;
            if (vd3Var != null) {
                bh3 bh3Var = v02Var.f43816a;
                me3 me3Var = (me3) CollectionsKt.D(vd3Var.f44002a);
                bh3Var.getClass();
                int i = ((q62) me3Var.f40902d).f42197c;
                h10Var2 = new h10(i != 0 ? r1.f42196b / i : 1.7777778f);
            } else if (list3 == null || list3.size() <= 1) {
                if (qj1Var != null) {
                    h10Var2 = new h10(qj1Var.f42324b);
                }
                h10Var = null;
            } else {
                v02Var.f43817b.getClass();
                h10Var2 = new h10((float) ix1.a(list3));
            }
            h10Var = h10Var2;
        } else {
            h10Var = null;
        }
        oy1Var.f41774e.getClass();
        if (gwVar != null && (fwVar = gwVar.f38900a) != null) {
            int iOrdinal = fwVar.ordinal();
            if (iOrdinal == 0) {
                n10Var = n10.f41130b;
            } else {
                if (iOrdinal != 1) {
                    throw new ij.j();
                }
                n10Var = n10.f41131c;
            }
            o10Var = new o10(n10Var, gwVar.f38901b);
        }
        oy1Var.f41773d.getClass();
        return new y00(h10Var, a10VarA2, a10VarA3, a10VarA, o10Var, str, str2, str3, str4, str5, l22.a(str6), str7, str8, str9, str10, z5);
    }

    @Override // yads.r32, yads.y02
    public final void loadImages() {
        u02 u02Var = this.Q;
        List listC = kotlin.collections.r.c(u02Var.f43508a);
        d51 d51Var = u02Var.f43512e;
        d51Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            kotlin.collections.x.m(linkedHashSet, d51Var.a(((hy1) it.next()).f39364b));
        }
        u02Var.f43511d.a(linkedHashSet, new t02(u02Var));
    }
}
