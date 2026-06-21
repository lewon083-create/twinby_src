package k8;

import android.os.Handler;
import android.os.Looper;
import hi.g;
import io.appmetrica.analytics.impl.cp;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Handler f27244c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExecutorService f27245d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f27246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27247b;

    static {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(8);
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        f27245d = executorServiceNewFixedThreadPool;
    }

    public d(g gVar) {
        this.f27246a = gVar;
    }

    public final void a(Serializable serializable) {
        if (this.f27247b) {
            return;
        }
        this.f27247b = true;
        g gVar = this.f27246a;
        this.f27246a = null;
        f27244c.post(new cp(24, gVar, serializable));
    }
}
