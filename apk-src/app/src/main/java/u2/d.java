package u2;

import com.google.android.gms.internal.ads.pf;
import com.google.firebase.messaging.y;
import java.util.ArrayList;
import ti.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ya.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oa.k f34027c;

    public d(oa.k kVar) {
        this.f34027c = kVar;
    }

    @Override // ya.e
    public final void v(Throwable th2) {
        ((h) this.f34027c.f29858a).d(th2);
    }

    @Override // ya.e
    public final void w(y yVar) {
        oa.k kVar = this.f34027c;
        kVar.f29860c = yVar;
        kVar.f29859b = new r3.b((y) kVar.f29860c, new t(1), ((h) kVar.f29858a).f34036h);
        h hVar = (h) kVar.f29858a;
        hVar.getClass();
        ArrayList arrayList = new ArrayList();
        hVar.f34029a.writeLock().lock();
        try {
            hVar.f34031c = 1;
            arrayList.addAll(hVar.f34030b);
            hVar.f34030b.clear();
            hVar.f34029a.writeLock().unlock();
            hVar.f34032d.post(new pf(arrayList, hVar.f34031c, (Throwable) null));
        } catch (Throwable th2) {
            hVar.f34029a.writeLock().unlock();
            throw th2;
        }
    }
}
