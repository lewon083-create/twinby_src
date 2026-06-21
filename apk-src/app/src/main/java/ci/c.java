package ci;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f2286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f2287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Handler f2288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.sentry.android.replay.capture.a f2289f;

    public /* synthetic */ c(e eVar, Context context, Handler handler, io.sentry.android.replay.capture.a aVar, int i) {
        this.f2285b = i;
        this.f2286c = eVar;
        this.f2287d = context;
        this.f2288e = handler;
        this.f2289f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2285b) {
            case 0:
                e eVar = this.f2286c;
                try {
                    Looper mainLooper = Looper.getMainLooper();
                    (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper)).post(new c(eVar, this.f2287d, this.f2288e, this.f2289f, 1));
                    return;
                } catch (Exception e3) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e3);
                    throw new RuntimeException(e3);
                }
            default:
                this.f2286c.a(this.f2287d.getApplicationContext(), null);
                this.f2288e.post(this.f2289f);
                return;
        }
    }
}
