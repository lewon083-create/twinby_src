package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k4 extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13851d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13852e;

    public k4(bb.e eVar) {
        super("internal.eventLogger");
        this.f13852e = eVar;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n b(com.google.firebase.messaging.y yVar, List list) {
        TreeMap treeMap;
        switch (this.f13851d) {
            case 0:
                rl.b.z(this.f13768b, 3, list);
                String strL = ((t) yVar.f14900c).c(yVar, (n) list.get(0)).l();
                n nVar = (n) list.get(1);
                t tVar = (t) yVar.f14900c;
                long jG = (long) rl.b.G(tVar.c(yVar, nVar).g().doubleValue());
                n nVarC = tVar.c(yVar, (n) list.get(2));
                HashMap mapI = nVarC instanceof k ? rl.b.I((k) nVarC) : new HashMap();
                bb.e eVar = (bb.e) this.f13852e;
                eVar.getClass();
                HashMap map = new HashMap();
                for (String str : mapI.keySet()) {
                    HashMap map2 = ((b) eVar.f2019c).f13667c;
                    map.put(str, b.b(map2.containsKey(str) ? map2.get(str) : null, str, mapI.get(str)));
                }
                ((ArrayList) eVar.f2021e).add(new b(strL, jG, map));
                return n.B1;
            case 1:
                rl.b.z("getValue", 2, list);
                n nVarC2 = ((t) yVar.f14900c).c(yVar, (n) list.get(0));
                n nVarC3 = ((t) yVar.f14900c).c(yVar, (n) list.get(1));
                String strL2 = nVarC2.l();
                l6.i iVar = (l6.i) this.f13852e;
                Map map3 = (Map) ((ob.e1) iVar.f27979d).f30083e.get((String) iVar.f27978c);
                String str2 = (map3 == null || !map3.containsKey(strL2)) ? null : (String) map3.get(strL2);
                return str2 != null ? new q(str2) : nVarC3;
            case 2:
                return n.B1;
            case 3:
                try {
                    return wa.a.A(((ob.d1) this.f13852e).call());
                } catch (Exception unused) {
                    return n.B1;
                }
            default:
                rl.b.z(this.f13768b, 3, list);
                ((t) yVar.f14900c).c(yVar, (n) list.get(0)).l();
                n nVar2 = (n) list.get(1);
                t tVar2 = (t) yVar.f14900c;
                n nVarC4 = tVar2.c(yVar, nVar2);
                if (!(nVarC4 instanceof m)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                n nVarC5 = tVar2.c(yVar, (n) list.get(2));
                if (!(nVarC5 instanceof k)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                k kVar = (k) nVarC5;
                HashMap map4 = kVar.f13847b;
                if (!map4.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strL3 = kVar.f("type").l();
                int iF = map4.containsKey("priority") ? rl.b.F(kVar.f("priority").g().doubleValue()) : 1000;
                t tVar3 = (t) this.f13852e;
                m mVar = (m) nVarC4;
                tVar3.getClass();
                if ("create".equals(strL3)) {
                    treeMap = (TreeMap) tVar3.f13968b;
                } else {
                    if (!"edit".equals(strL3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strL3)));
                    }
                    treeMap = (TreeMap) tVar3.f13967a;
                }
                if (treeMap.containsKey(Integer.valueOf(iF))) {
                    iF = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iF), mVar);
                return n.B1;
        }
    }

    public k4(t tVar) {
        super("internal.registerCallback");
        this.f13852e = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(x5 x5Var, l6.i iVar) {
        super("getValue");
        this.f13852e = iVar;
    }

    public k4(ni.i iVar) {
        super("internal.logger");
        this.f13852e = iVar;
        this.f13769c.put("log", new x9(this, false, true));
        this.f13769c.put("silent", new x5("silent", 1));
        ((h) this.f13769c.get("silent")).a("log", new x9(this, true, true));
        this.f13769c.put("unmonitored", new x5("unmonitored", 2));
        ((h) this.f13769c.get("unmonitored")).a("log", new x9(this, false, false));
    }

    public k4(ob.d1 d1Var) {
        super("internal.appMetadata");
        this.f13852e = d1Var;
    }
}
