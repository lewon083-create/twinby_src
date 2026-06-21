package yads;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uf3 implements tf3, vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f43641a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f43642b = new LinkedHashSet();

    @Override // yads.tf3
    public final void a(long j10, long j11) {
        Iterator it = this.f43641a.iterator();
        while (it.hasNext()) {
            ((tf3) it.next()).a(j10, j11);
        }
    }

    @Override // yads.vf3
    public final void b() {
        Iterator it = this.f43642b.iterator();
        while (it.hasNext()) {
            ((vf3) it.next()).b();
        }
    }

    @Override // yads.vf3
    public final void a() {
        Iterator it = this.f43642b.iterator();
        while (it.hasNext()) {
            ((vf3) it.next()).a();
        }
    }
}
