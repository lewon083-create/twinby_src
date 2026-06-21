package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P2 f22375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0198h2 f22376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22377c;

    public Gb(P2 p22, C0198h2 c0198h2) {
        ArrayList arrayList = new ArrayList();
        this.f22377c = arrayList;
        this.f22375a = p22;
        arrayList.add(p22);
        this.f22376b = c0198h2;
        arrayList.add(c0198h2);
    }

    public final synchronized void a() {
        Iterator it = this.f22377c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0292kk) it.next()).onCreate();
        }
    }

    public final synchronized void a(C0357na c0357na) {
        this.f22377c.add(c0357na);
    }
}
