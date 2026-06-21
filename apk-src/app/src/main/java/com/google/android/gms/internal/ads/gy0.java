package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gy0 implements fy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f5980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue f5981b = new PriorityQueue();

    public gy0(Executor executor) {
        this.f5980a = executor;
    }

    @Override // com.google.android.gms.internal.ads.fy0
    public final void a(Runnable runnable, long j10) {
        if (j10 <= 0) {
            this.f5980a.execute(runnable);
            return;
        }
        hy0 hy0Var = new hy0(runnable, System.currentTimeMillis() + j10);
        PriorityQueue priorityQueue = this.f5981b;
        synchronized (priorityQueue) {
            priorityQueue.add(hy0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.fy0
    public final void j() {
        PriorityQueue priorityQueue = this.f5981b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (hy0 hy0Var = (hy0) priorityQueue.peek(); hy0Var != null && hy0Var.f6298c <= jCurrentTimeMillis; hy0Var = (hy0) priorityQueue.peek()) {
                    priorityQueue2.add(hy0Var);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.f5980a.execute(((hy0) it.next()).f6297b);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
