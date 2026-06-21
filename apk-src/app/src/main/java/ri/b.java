package ri;

import ii.p;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f32327a;

    public b(CountDownLatch countDownLatch) {
        this.f32327a = countDownLatch;
    }

    @Override // ii.p
    public final void a() {
        this.f32327a.countDown();
    }

    @Override // ii.p
    public final void b(String str, String str2, Object obj) {
        this.f32327a.countDown();
    }

    @Override // ii.p
    public final void success(Object obj) {
        this.f32327a.countDown();
    }
}
