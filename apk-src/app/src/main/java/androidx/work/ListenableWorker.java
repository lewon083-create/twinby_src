package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import com.google.android.gms.internal.consent_sdk.j7;
import ed.d;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import l7.f;
import l7.g;
import l7.v;
import v7.m;
import v7.n;
import w7.j;
import x7.a;
import x7.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkerParameters f1750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f1751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1753f;

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f1749b = context;
        this.f1750c = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f1749b;
    }

    public Executor getBackgroundExecutor() {
        return this.f1750c.f1761f;
    }

    public d getForegroundInfoAsync() {
        j jVar = new j();
        jVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    public final UUID getId() {
        return this.f1750c.f1756a;
    }

    public final f getInputData() {
        return this.f1750c.f1757b;
    }

    public final Network getNetwork() {
        return (Network) this.f1750c.f1759d.f2021e;
    }

    public final int getRunAttemptCount() {
        return this.f1750c.f1760e;
    }

    public final Set<String> getTags() {
        return this.f1750c.f1758c;
    }

    public a getTaskExecutor() {
        return this.f1750c.f1762g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.f1750c.f1759d.f2019c;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.f1750c.f1759d.f2020d;
    }

    public v getWorkerFactory() {
        return this.f1750c.f1763h;
    }

    public boolean isRunInForeground() {
        return this.f1753f;
    }

    public final boolean isStopped() {
        return this.f1751d;
    }

    public final boolean isUsed() {
        return this.f1752e;
    }

    public final d setForegroundAsync(g gVar) {
        this.f1753f = true;
        m mVar = this.f1750c.f1764j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        mVar.getClass();
        j jVar = new j();
        ((b) mVar.f34787a).b(new j7(mVar, jVar, id2, gVar, applicationContext, 4, false));
        return jVar;
    }

    public d setProgressAsync(f fVar) {
        n nVar = this.f1750c.i;
        getApplicationContext();
        UUID id2 = getId();
        nVar.getClass();
        j jVar = new j();
        ((b) nVar.f34792b).b(new aa.b(nVar, id2, fVar, jVar, 19, false));
        return jVar;
    }

    public void setRunInForeground(boolean z5) {
        this.f1753f = z5;
    }

    public final void setUsed() {
        this.f1752e = true;
    }

    public abstract d startWork();

    public final void stop() {
        this.f1751d = true;
        onStopped();
    }

    public void onStopped() {
    }
}
