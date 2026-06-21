package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f41018a = new w5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc2 f41019b = new oc2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5 f41020c = v5.A;

    public final Long a() {
        List listR;
        Object next;
        w5 w5Var = this.f41018a;
        synchronized (w5Var.f44281a) {
            listR = CollectionsKt.R(w5Var.f44284d);
        }
        Iterator it = listR.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((u5) next).f43558a == this.f41020c) {
                break;
            }
        }
        u5 u5Var = (u5) next;
        if (u5Var == null) {
            return null;
        }
        Object obj = u5Var.f43559b.get("duration");
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }
}
