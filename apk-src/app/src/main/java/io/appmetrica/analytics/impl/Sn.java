package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Sn {
    public static final Pn a(Throwable th2, V v5, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        Fn fnA = th2 != null ? Gn.a(th2, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Cl((StackTraceElement) it.next()));
            }
        }
        return new Pn(fnA, v5, arrayList, null, null, null, str, bool);
    }
}
