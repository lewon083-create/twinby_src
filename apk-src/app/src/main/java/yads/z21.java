package yads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f45234a = new AtomicLong();

    public static final long a() {
        return f45234a.getAndIncrement();
    }
}
