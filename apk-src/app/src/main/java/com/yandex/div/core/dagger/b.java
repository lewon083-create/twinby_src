package com.yandex.div.core.dagger;

import java.util.concurrent.Executor;
import yads.qt1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15265b;

    public /* synthetic */ b(int i) {
        this.f15265b = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15265b) {
            case 0:
                DivKitHistogramsModule.provideCalculateSizeExecutor$lambda$1$lambda$0(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                n.a.B().f28960a.f28962b.execute(runnable);
                break;
            case 3:
                break;
            default:
                qt1.a(runnable);
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
