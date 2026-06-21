package androidx.work;

import ac.g;
import android.content.Context;
import ed.d;
import l7.m;
import w7.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f1755g;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract m doWork();

    @Override // androidx.work.ListenableWorker
    public final d startWork() {
        this.f1755g = new j();
        getBackgroundExecutor().execute(new g(18, this));
        return this.f1755g;
    }
}
