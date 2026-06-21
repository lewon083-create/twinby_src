package nd;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import m3.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f29295e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f29296a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f29299d;

    public a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f29297b = str;
        this.f29298c = i;
        this.f29299d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f29295e.newThread(new c0(4, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f29297b + " Thread #" + this.f29296a.getAndIncrement());
        return threadNewThread;
    }
}
