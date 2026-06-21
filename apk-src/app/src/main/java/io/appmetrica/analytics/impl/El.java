package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class El {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gl f22306a;

    public El(Gl gl2) {
        this.f22306a = gl2;
    }

    public final void a(String str, Il il2, C0140em c0140em) {
        ArrayList arrayList;
        synchronized (this.f22306a.f22400b) {
            try {
                Collection collection = (Collection) this.f22306a.f22399a.f24625a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Pl) it.next()).a(il2, c0140em);
        }
    }
}
