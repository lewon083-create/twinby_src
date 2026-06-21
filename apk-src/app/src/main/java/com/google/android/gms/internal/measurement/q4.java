package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1.e f13925a = new h1.e(0);

    public static synchronized void a() {
        h1.e eVar = f13925a;
        Iterator it = ((h1.d) eVar.values()).iterator();
        if (it.hasNext()) {
            ((q4) it.next()).getClass();
            throw null;
        }
        eVar.clear();
    }
}
