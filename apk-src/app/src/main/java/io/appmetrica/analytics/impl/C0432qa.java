package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0432qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f24625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24626b;

    public C0432qa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f24625a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f24625a.toString();
    }

    public C0432qa(boolean z5) {
        this.f24625a = new HashMap();
        this.f24626b = z5;
    }
}
