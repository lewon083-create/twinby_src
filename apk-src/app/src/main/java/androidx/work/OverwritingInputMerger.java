package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import l7.f;
import l7.h;
import yh.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // l7.h
    public final f a(ArrayList arrayList) throws Throwable {
        e eVar = new e(1);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((f) it.next()).f28024a));
        }
        eVar.a(map);
        f fVar = new f(eVar.f45625a);
        f.c(fVar);
        return fVar;
    }
}
