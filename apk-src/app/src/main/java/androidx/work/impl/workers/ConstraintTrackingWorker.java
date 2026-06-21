package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import ed.d;
import java.util.ArrayList;
import java.util.List;
import l7.n;
import m7.l;
import ob.h4;
import q7.b;
import w7.j;
import x7.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1790l = n.i("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WorkerParameters f1791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f1792h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f1793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ListenableWorker f1794k;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1791g = workerParameters;
        this.f1792h = new Object();
        this.i = false;
        this.f1793j = new j();
    }

    @Override // q7.b
    public final void e(ArrayList arrayList) {
        n.g().e(f1790l, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f1792h) {
            this.i = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final a getTaskExecutor() {
        return l.O(getApplicationContext()).f28733e;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f1794k;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f1794k;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f1794k.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final d startWork() {
        getBackgroundExecutor().execute(new h4(14, this));
        return this.f1793j;
    }

    @Override // q7.b
    public final void f(List list) {
    }
}
