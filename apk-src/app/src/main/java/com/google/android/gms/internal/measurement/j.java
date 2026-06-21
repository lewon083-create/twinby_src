package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface j {
    static n n(j jVar, q qVar, com.google.firebase.messaging.y yVar, ArrayList arrayList) {
        String str = qVar.f13924b;
        if (jVar.o(str)) {
            n nVarF = jVar.f(str);
            if (nVarF instanceof h) {
                return ((h) nVarF).b(yVar, arrayList);
            }
            throw new IllegalArgumentException(om1.x(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(om1.k("Object has no function ", str));
        }
        rl.b.z("hasOwnProperty", 1, arrayList);
        return jVar.o(((t) yVar.f14900c).c(yVar, (n) arrayList.get(0)).l()) ? n.G1 : n.H1;
    }

    void a(String str, n nVar);

    n f(String str);

    boolean o(String str);
}
