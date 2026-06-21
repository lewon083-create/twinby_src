package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.idsync.impl.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0012f extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f21972a;

    public C0012f(h hVar) {
        this.f21972a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.f21972a.f21979f && (idSyncConfig = this.f21972a.f21978e) != null) {
            this.f21972a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.f21972a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.f21977d.a((RequestConfig) it.next());
                }
                h hVar2 = this.f21972a;
                IHandlerExecutor iHandlerExecutor = hVar2.f21976c;
                C0012f c0012f = hVar2.f21980g;
                if (c0012f != null) {
                    iHandlerExecutor.executeDelayed(c0012f, hVar2.f21975b);
                } else {
                    Intrinsics.g("syncRunnable");
                    throw null;
                }
            }
        }
    }
}
