package yads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class yu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f45152a = new AtomicBoolean(false);

    public static final void a() {
        if (f45152a.compareAndSet(false, true)) {
            nc1.b("Yandex Mobile Ads 7.18.4 initialized successfully", new Object[0]);
        }
    }
}
