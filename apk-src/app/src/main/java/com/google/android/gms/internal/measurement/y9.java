package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z5 f14108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f14109e;

    public y9(z5 z5Var) {
        super("require");
        this.f14109e = new HashMap();
        this.f14108d = z5Var;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n b(com.google.firebase.messaging.y yVar, List list) {
        n nVar;
        rl.b.z("require", 1, list);
        String strL = ((t) yVar.f14900c).c(yVar, (n) list.get(0)).l();
        HashMap map = this.f14109e;
        if (map.containsKey(strL)) {
            return (n) map.get(strL);
        }
        HashMap map2 = (HashMap) this.f14108d.f14118a;
        if (map2.containsKey(strL)) {
            try {
                nVar = (n) ((Callable) map2.get(strL)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strL)));
            }
        } else {
            nVar = n.B1;
        }
        if (nVar instanceof h) {
            map.put(strL, (h) nVar);
        }
        return nVar;
    }
}
