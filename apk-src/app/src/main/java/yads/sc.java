package yads;

import android.view.View;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sc implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final id f42892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final za f42893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f42894c;

    public sc(id idVar, za zaVar, lv lvVar) {
        this.f42892a = idVar;
        this.f42893b = zaVar;
        this.f42894c = lvVar;
    }

    @Override // yads.o0
    public final Object a(View view, m0 m0Var, u0 u0Var) {
        rc rcVar = (rc) m0Var;
        Iterator it = rcVar.f42541d.iterator();
        while (it.hasNext()) {
            za.a(this.f42893b, (String) it.next(), n83.f41190b);
        }
        this.f42892a.a(view, rcVar);
        lv lvVar = this.f42894c;
        eo2 eo2Var = eo2.f38200j;
        lvVar.getClass();
        lvVar.f40692d.a(lvVar.a(eo2Var, new HashMap()));
        return new p01(false, null);
    }
}
