package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f40847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv f40848b;

    public /* synthetic */ m83(za zaVar) {
        this(zaVar, new bv());
    }

    public final void a(List list, yu yuVar) {
        this.f40848b.f37150a.getClass();
        Map mapC = kotlin.collections.i0.c(new Pair("{CLICK_DEST}", av.a(yuVar)));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                za zaVar = this.f40847a;
                fd2 fd2Var = new fd2(zaVar.f45301c, zaVar.f45299a, zaVar.f45300b, n83.f41192d);
                if (str.length() > 0) {
                    za.f45298d.execute(new ya(str, fd2Var, mapC));
                }
            }
        }
    }

    public m83(za zaVar, bv bvVar) {
        this.f40847a = zaVar;
        this.f40848b = bvVar;
    }
}
