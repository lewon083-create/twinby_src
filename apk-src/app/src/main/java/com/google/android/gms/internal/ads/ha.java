package com.google.android.gms.internal.ads;

import android.os.Process;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ha extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f6075h = xa.f12090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f6076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue f6077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cb f6078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f6079e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cw f6080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ox0 f6081g;

    public ha(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, cb cbVar, ox0 ox0Var) {
        this.f6076b = priorityBlockingQueue;
        this.f6077c = priorityBlockingQueue2;
        this.f6078d = cbVar;
        this.f6081g = ox0Var;
        this.f6080f = new cw(this, priorityBlockingQueue2, ox0Var);
    }

    public final void a() {
        qa qaVar = (qa) this.f6076b.take();
        qaVar.a("cache-queue-take");
        qaVar.c();
        try {
            synchronized (qaVar.f9376f) {
            }
            cb cbVar = this.f6078d;
            ga gaVarA = cbVar.a(qaVar.d());
            if (gaVarA == null) {
                qaVar.a("cache-miss");
                if (!this.f6080f.t(qaVar)) {
                    this.f6077c.put(qaVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (gaVarA.f5723e < jCurrentTimeMillis) {
                    qaVar.a("cache-hit-expired");
                    qaVar.f9380k = gaVarA;
                    if (!this.f6080f.t(qaVar)) {
                        this.f6077c.put(qaVar);
                    }
                } else {
                    qaVar.a("cache-hit");
                    byte[] bArr = gaVarA.f5719a;
                    Map map = gaVarA.f5725g;
                    b7 b7VarH = qaVar.h(new oa(VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, bArr, map, oa.a(map), false));
                    qaVar.a("cache-hit-parsed");
                    if (!(((ua) b7VarH.f3660e) == null)) {
                        qaVar.a("cache-parsing-failed");
                        String strD = qaVar.d();
                        synchronized (cbVar) {
                            ga gaVarA2 = cbVar.a(strD);
                            if (gaVarA2 != null) {
                                gaVarA2.f5724f = 0L;
                                gaVarA2.f5723e = 0L;
                                cbVar.b(strD, gaVarA2);
                            }
                        }
                        qaVar.f9380k = null;
                        if (!this.f6080f.t(qaVar)) {
                            this.f6077c.put(qaVar);
                        }
                    } else if (gaVarA.f5724f < jCurrentTimeMillis) {
                        qaVar.a("cache-hit-refresh-needed");
                        qaVar.f9380k = gaVarA;
                        b7VarH.f3657b = true;
                        if (this.f6080f.t(qaVar)) {
                            this.f6081g.g(qaVar, b7VarH, null);
                        } else {
                            this.f6081g.g(qaVar, b7VarH, new l81(3, this, qaVar, false));
                        }
                    } else {
                        this.f6081g.g(qaVar, b7VarH, null);
                    }
                }
            }
            qaVar.c();
        } catch (Throwable th2) {
            qaVar.c();
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f6075h) {
            xa.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f6078d.c();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f6079e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                xa.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
