package n;

import a0.r;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c2.f;
import hl.l;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28961a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f28962b = Executors.newFixedThreadPool(4, new r(3));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Handler f28963c;

    public static Handler B(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
