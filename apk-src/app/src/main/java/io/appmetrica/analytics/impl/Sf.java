package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Sf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f22960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f22961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Consumer f22962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Consumer f22963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0025aa f22964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Zk f22965f;

    public Sf(File file, Function function, Consumer consumer, Consumer consumer2, C0025aa c0025aa, Zk zk2) {
        this.f22960a = file;
        this.f22961b = function;
        this.f22962c = consumer;
        this.f22963d = consumer2;
        this.f22964e = c0025aa;
        this.f22965f = zk2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f22960a.exists()) {
            C0630y9 c0630y9B = this.f22964e.b(this.f22960a.getName());
            Consumer epVar = this.f22962c;
            try {
                c0630y9B.f25091a.lock();
                c0630y9B.f25092b.a();
                if (!this.f22960a.exists()) {
                    epVar.consume(this.f22960a);
                    c0630y9B.c();
                    C0025aa c0025aa = this.f22964e;
                    String name = this.f22960a.getName();
                    synchronized (c0025aa) {
                        c0025aa.f23426b.remove(name);
                    }
                    return;
                }
                Object objApply = this.f22961b.apply(this.f22960a);
                if (objApply != null) {
                    if (this.f22965f.a(objApply)) {
                        this.f22963d.consume(objApply);
                    } else {
                        epVar = new ep();
                    }
                }
            } catch (Throwable unused) {
            }
            epVar.consume(this.f22960a);
            c0630y9B.c();
            this.f22964e.a(this.f22960a.getName());
        }
    }

    public static final void a(File file) {
    }
}
