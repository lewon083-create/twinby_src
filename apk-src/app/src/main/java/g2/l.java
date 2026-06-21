package g2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f19887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f19888b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f19889c = new HashMap();

    public l(Runnable runnable) {
        this.f19887a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f19888b.iterator();
        while (it.hasNext()) {
            if (((z2.a0) ((m) it.next())).f45802a.p()) {
                return true;
            }
        }
        return false;
    }
}
