package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f42383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f42384b;

    public /* synthetic */ qt1() {
        this(new com.yandex.div.core.dagger.b(4), Executors.newFixedThreadPool(2));
    }

    public static final void a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public qt1(Executor executor, Executor executor2) {
        this.f42383a = executor;
        this.f42384b = executor2;
    }
}
