package bf;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f2112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f2113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0.d f2114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f2115f;

    public g(String str, int i) {
        this.f2110a = str;
        this.f2111b = i;
    }

    public final synchronized void a(a0.d dVar) {
        HandlerThread handlerThread = new HandlerThread(this.f2110a, this.f2111b);
        this.f2112c = handlerThread;
        handlerThread.start();
        this.f2113d = new Handler(this.f2112c.getLooper());
        this.f2114e = dVar;
    }
}
