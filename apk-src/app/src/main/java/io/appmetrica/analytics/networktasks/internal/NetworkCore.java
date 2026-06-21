package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f25325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f25326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f25327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile d f25328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f25329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IExecutionPolicy f25330f;

    public NetworkCore(@NonNull IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f25327c) {
                }
                this.f25328d = (d) this.f25325a.take();
                networkTask = this.f25328d.f25296a;
                Executor executor = networkTask.getExecutor();
                this.f25329e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f25327c) {
                    this.f25328d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f25327c) {
                        this.f25328d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th2) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f25327c) {
                        this.f25328d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th2;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f25330f.canBeExecuted()) {
            synchronized (this.f25326b) {
                try {
                    d dVar = new d(networkTask);
                    if (isRunning() && !this.f25325a.contains(dVar) && !dVar.equals(this.f25328d) && networkTask.onTaskAdded()) {
                        this.f25325a.offer(dVar);
                    }
                } finally {
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f25327c) {
            try {
                ArrayList arrayList = new ArrayList(this.f25325a.size());
                this.f25325a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f25296a.onTaskRemoved();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f25325a = new LinkedBlockingQueue();
        this.f25326b = new Object();
        this.f25327c = new Object();
        this.f25330f = iExecutionPolicy;
        this.f25329e = gVar;
    }
}
