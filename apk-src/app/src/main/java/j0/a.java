package j0;

import a0.r;
import android.os.Looper;
import com.google.android.gms.internal.ads.kw0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f26118d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26120c;

    public a(Looper looper) {
        this.f26119b = 1;
        this.f26120c = new kw0(looper, 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f26119b) {
            case 0:
                ((ExecutorService) this.f26120c).execute(runnable);
                break;
            default:
                ((kw0) this.f26120c).post(runnable);
                break;
        }
    }

    public a() {
        this.f26119b = 0;
        this.f26120c = Executors.newFixedThreadPool(2, new r(1));
    }
}
