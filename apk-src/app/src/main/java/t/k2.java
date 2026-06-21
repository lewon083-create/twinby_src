package t;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r3.b f33141c;

    public /* synthetic */ k2(r3.b bVar, int i) {
        this.f33140b = i;
        this.f33141c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33140b) {
            case 0:
                int iDecrementAndGet = ((AtomicInteger) this.f33141c.f32189d).decrementAndGet();
                if (iDecrementAndGet >= 0) {
                    com.google.android.gms.internal.auth.g.e("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
                } else {
                    com.google.android.gms.internal.auth.g.O("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
                }
                break;
            default:
                com.google.android.gms.internal.auth.g.e("VideoUsageControl", "incrementUsage: mVideoUsage = " + ((AtomicInteger) this.f33141c.f32189d).incrementAndGet());
                break;
        }
    }
}
