package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class th1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f43327b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g63 f43326a = new g63();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f43328c = new AtomicBoolean();

    public th1(Context context) {
        this.f43327b = context.getApplicationContext();
    }

    public final void a() {
        if (ub.a(this.f43327b)) {
            this.f43326a.getClass();
            if (g63.a() || this.f43328c.getAndSet(true)) {
                return;
            }
            nc1.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }
}
