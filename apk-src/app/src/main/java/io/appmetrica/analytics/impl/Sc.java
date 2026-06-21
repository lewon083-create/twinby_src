package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22956a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = this.f22956a;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.t.j(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C0451r5) it.next()).f24678a);
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList3) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return CollectionsKt.y(arrayList);
    }
}
