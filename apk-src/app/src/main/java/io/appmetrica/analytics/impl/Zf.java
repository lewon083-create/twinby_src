package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Zf implements Vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0109dg f23386a;

    public Zf(C0109dg c0109dg) {
        this.f23386a = c0109dg;
    }

    @Override // io.appmetrica.analytics.impl.Vf
    public final void a() {
        C0109dg c0109dg = this.f23386a;
        ArrayList arrayList = c0109dg.f23696g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C0338mg c0338mg = (C0338mg) obj;
            c0109dg.f23692c.getClass();
            String str = c0338mg != null ? c0338mg.f24372a : null;
            if (str != null && str.length() != 0) {
                arrayList2.add(obj);
            }
        }
        c0109dg.a(c0109dg.f23692c.a(CollectionsKt.B(arrayList2)));
    }
}
