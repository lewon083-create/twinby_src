package u2;

import com.google.firebase.messaging.y;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ya.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ya.e f34038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f34039d;

    public j(ya.e eVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f34038c = eVar;
        this.f34039d = threadPoolExecutor;
    }

    @Override // ya.e
    public final void v(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f34039d;
        try {
            this.f34038c.v(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // ya.e
    public final void w(y yVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f34039d;
        try {
            this.f34038c.w(yVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
