package m3;

import java.util.concurrent.ThreadFactory;
import yads.lb3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28607b;

    public /* synthetic */ x(String str, int i) {
        this.f28606a = i;
        this.f28607b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f28606a) {
            case 0:
                return new Thread(runnable, this.f28607b);
            case 1:
                Thread thread = new Thread(runnable, this.f28607b);
                thread.setPriority(10);
                return thread;
            default:
                return lb3.a(this.f28607b, runnable);
        }
    }
}
