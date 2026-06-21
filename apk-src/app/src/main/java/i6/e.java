package i6;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f21180c;

    public /* synthetic */ e(Context context, int i) {
        this.f21179b = i;
        this.f21180c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21179b) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.f21180c, 1));
                break;
            default:
                c.t(this.f21180c, new com.yandex.div.core.dagger.b(1), c.f21169a, false);
                break;
        }
    }
}
