package j0;

import a0.r;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.kw0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile f f26133d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26135c;

    public f(ExecutorService executorService) {
        this.f26134b = 3;
        this.f26135c = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f26134b) {
            case 0:
                ((ExecutorService) this.f26135c).execute(runnable);
                break;
            case 1:
                ((Handler) this.f26135c).post(runnable);
                break;
            case 2:
                ((kw0) this.f26135c).post(runnable);
                break;
            default:
                ((Executor) this.f26135c).execute(new h(3, runnable));
                break;
        }
    }

    public f(int i) {
        this.f26134b = i;
        switch (i) {
            case 1:
                this.f26135c = new Handler(Looper.getMainLooper());
                break;
            case 2:
                kw0 kw0Var = new kw0(Looper.getMainLooper(), 5, false);
                Looper.getMainLooper();
                this.f26135c = kw0Var;
                break;
            default:
                this.f26135c = Executors.newFixedThreadPool(2, new r(2));
                break;
        }
    }
}
