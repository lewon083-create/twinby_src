package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f12844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d21 f12845b;

    public z11(d21 d21Var, Set set) {
        this.f12844a = set;
        this.f12845b = d21Var;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        Iterator it = this.f12844a.iterator();
        while (it.hasNext()) {
            ((a21) it.next()).b(map);
        }
        return map;
    }

    public final HashMap b(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.f12844a.iterator();
        while (it.hasNext()) {
            ((a21) it.next()).c(map, context, view);
        }
        return map;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        Iterator it = this.f12844a.iterator();
        while (it.hasNext()) {
            ((a21) it.next()).a(map);
        }
        return map;
    }
}
