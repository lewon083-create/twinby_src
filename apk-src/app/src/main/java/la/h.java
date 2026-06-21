package la;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h f28077c = new h(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h f28078d = new h(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28079b;

    public /* synthetic */ h(int i) {
        this.f28079b = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f28079b) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
