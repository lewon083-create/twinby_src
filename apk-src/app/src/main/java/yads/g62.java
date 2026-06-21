package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g62 implements p62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f38666a = new CopyOnWriteArrayList();

    @Override // yads.p62
    public final void a(long j10, long j11) {
        Iterator it = this.f38666a.iterator();
        while (it.hasNext()) {
            ((p62) it.next()).a(j10, j11);
        }
    }

    @Override // yads.p62
    public final void b() {
        Iterator it = this.f38666a.iterator();
        while (it.hasNext()) {
            ((p62) it.next()).b();
        }
    }

    @Override // yads.p62
    public final void a() {
        Iterator it = this.f38666a.iterator();
        while (it.hasNext()) {
            ((p62) it.next()).a();
        }
    }
}
