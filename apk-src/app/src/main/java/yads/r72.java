package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r72 implements la2, xu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f42507a = new CopyOnWriteArrayList();

    @Override // yads.xu1
    public final void a() {
        Iterator it = this.f42507a.iterator();
        if (it.hasNext()) {
            throw com.google.android.gms.internal.ads.om1.i(it);
        }
    }

    @Override // yads.la2
    public final void a(boolean z5) {
        Iterator it = this.f42507a.iterator();
        if (it.hasNext()) {
            throw com.google.android.gms.internal.ads.om1.i(it);
        }
    }

    @Override // yads.la2
    public final void c() {
    }
}
