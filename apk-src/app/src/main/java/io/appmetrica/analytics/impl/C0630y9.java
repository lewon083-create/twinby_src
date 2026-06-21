package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0630y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f25091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z9 f25092b;

    public C0630y9(Context context, String str) {
        this(new ReentrantLock(), new Z9(context, str));
    }

    public final void a() {
        this.f25091a.lock();
        this.f25092b.a();
    }

    public final void b() {
        this.f25092b.b();
        this.f25091a.unlock();
    }

    public final void c() {
        Z9 z92 = this.f25092b;
        synchronized (z92) {
            z92.b();
            z92.f23377a.delete();
        }
        this.f25091a.unlock();
    }

    public C0630y9(ReentrantLock reentrantLock, Z9 z92) {
        this.f25091a = reentrantLock;
        this.f25092b = z92;
    }
}
