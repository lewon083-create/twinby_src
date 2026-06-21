package a0;

import com.appsflyer.internal.AFc1bSDK;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements RejectedExecutionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193a;

    public /* synthetic */ p(int i) {
        this.f193a = i;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        switch (this.f193a) {
            case 0:
                com.google.android.gms.internal.auth.g.k("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
                break;
            default:
                AFc1bSDK.getCurrencyIso4217Code(runnable, threadPoolExecutor);
                break;
        }
    }
}
