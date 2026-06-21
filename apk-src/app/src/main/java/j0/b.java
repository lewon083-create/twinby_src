package j0;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f26121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b f26122d = new b(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b f26123e = new b(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26124b;

    public /* synthetic */ b(int i) {
        this.f26124b = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f26124b) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
