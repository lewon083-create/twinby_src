package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0433qb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f24627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f24628b;

    public RunnableC0433qb(Handler handler, J2 j22) {
        this.f24627a = new WeakReference(handler);
        this.f24628b = new WeakReference(j22);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f24627a.get();
        J2 j22 = (J2) this.f24628b.get();
        if (handler == null || j22 == null) {
            return;
        }
        boolean zF = j22.f22480b.f();
        if (!zF) {
            PublicLogger publicLogger = j22.f22481c;
            Set set = AbstractC0605x9.f25010a;
            EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
            N3 n32 = new N3("", "", 3, 0, publicLogger);
            C0564vi c0564vi = j22.f22486h;
            Eh eh2 = j22.f22480b;
            c0564vi.getClass();
            c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
        }
        if (zF) {
            return;
        }
        C0408pb.a(handler, j22, this);
    }
}
