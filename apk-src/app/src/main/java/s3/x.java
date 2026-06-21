package s3;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32680c;

    public /* synthetic */ x(int i, Object obj) {
        this.f32679b = i;
        this.f32680c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f32679b) {
            case 0:
                ((m3.v) this.f32680c).c(runnable);
                break;
            default:
                ((Handler) this.f32680c).post(runnable);
                break;
        }
    }
}
