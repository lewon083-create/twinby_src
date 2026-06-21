package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pd1 implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f9022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f9023c;

    public pd1(rd1 rd1Var, List list, List list2) {
        this.f9022b = list;
        this.f9023c = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qd1(this.f9022b.iterator(), this.f9023c.iterator());
    }
}
