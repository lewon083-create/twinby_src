package i3;

import aa.w;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.i;
import ka.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Handler f20819g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f20824f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f20821c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f20822d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f20823e = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f20820b = new b(this, new w(2, this));

    public a(d dVar) {
        this.f20824f = dVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f20819g == null) {
                    f20819g = new Handler(Looper.getMainLooper());
                }
                handler = f20819g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new i(11, this, obj, false));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20824f.b();
    }
}
