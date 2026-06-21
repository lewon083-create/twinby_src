package ti;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f33810d;

    public e0(int i, ka.k kVar, l lVar) {
        super(i, kVar);
        this.f33810d = new WeakReference(lVar);
    }

    @Override // k9.c
    public final void g() {
        WeakReference weakReference = this.f33810d;
        if (weakReference.get() != null) {
            ((l) weakReference.get()).a();
        }
    }
}
