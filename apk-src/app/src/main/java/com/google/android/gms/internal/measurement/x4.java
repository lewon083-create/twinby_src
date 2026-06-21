package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x4 extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bb.e f14082c;

    public x4(bb.e eVar) {
        this.f14082c = eVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.n
    public final n e(String str, com.google.firebase.messaging.y yVar, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        bb.e eVar = this.f14082c;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    rl.b.z("getEventName", 0, arrayList);
                    return new q(((b) eVar.f2020d).f13665a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    rl.b.z("getTimestamp", 0, arrayList);
                    return new g(Double.valueOf(((b) eVar.f2020d).f13666b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    rl.b.z("getParamValue", 1, arrayList);
                    String strL = ((t) yVar.f14900c).c(yVar, (n) arrayList.get(0)).l();
                    HashMap map = ((b) eVar.f2020d).f13667c;
                    return wa.a.A(map.containsKey(strL) ? map.get(strL) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    rl.b.z("getParams", 0, arrayList);
                    HashMap map2 = ((b) eVar.f2020d).f13667c;
                    k kVar = new k();
                    for (String str2 : map2.keySet()) {
                        kVar.a(str2, wa.a.A(map2.get(str2)));
                    }
                    return kVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    rl.b.z("setParamValue", 2, arrayList);
                    String strL2 = ((t) yVar.f14900c).c(yVar, (n) arrayList.get(0)).l();
                    n nVarC = ((t) yVar.f14900c).c(yVar, (n) arrayList.get(1));
                    b bVar = (b) eVar.f2020d;
                    Object objH = rl.b.H(nVarC);
                    HashMap map3 = bVar.f13667c;
                    if (objH == null) {
                        map3.remove(strL2);
                        return nVarC;
                    }
                    map3.put(strL2, b.b(map3.get(strL2), strL2, objH));
                    return nVarC;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    rl.b.z("setEventName", 1, arrayList);
                    n nVarC2 = ((t) yVar.f14900c).c(yVar, (n) arrayList.get(0));
                    if (n.B1.equals(nVarC2) || n.C1.equals(nVarC2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((b) eVar.f2020d).f13665a = nVarC2.l();
                    return new q(nVarC2.l());
                }
                break;
        }
        return super.e(str, yVar, arrayList);
    }
}
