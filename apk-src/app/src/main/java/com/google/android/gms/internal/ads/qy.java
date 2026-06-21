package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qy implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9638b = new ArrayList();

    public final boolean a(sz szVar) {
        ArrayList arrayList = new ArrayList();
        for (py pyVar : this.f9638b) {
            if (pyVar.f9206c == szVar) {
                arrayList.add(pyVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((py) it.next()).f9207d.k();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f9638b.iterator();
    }
}
