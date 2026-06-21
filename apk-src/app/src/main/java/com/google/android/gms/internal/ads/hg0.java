package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hg0 implements pa.b, pa.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jx f6133b = new jx();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6134c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6135d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6136e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ku f6137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ki f6138g;

    public static void b(Context context, jx jxVar, Executor executor) {
        if (((Boolean) ul.f10975j.r()).booleanValue() || ((Boolean) ul.f10974h.r()).booleanValue()) {
            jxVar.a(new l81(0, jxVar, new ku0(context, 3)), executor);
        }
    }

    public final void a() {
        synchronized (this.f6134c) {
            try {
                this.f6136e = true;
                if (this.f6138g.r() || this.f6138g.s()) {
                    this.f6138g.f();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c0(ma.b bVar) {
        u9.i.c("Disconnected from remote ad request service.");
        this.f6133b.d(new og0(1));
    }

    @Override // pa.b
    public void l0(int i) {
        u9.i.c("Cannot connect to remote service, fallback to local instance.");
    }
}
