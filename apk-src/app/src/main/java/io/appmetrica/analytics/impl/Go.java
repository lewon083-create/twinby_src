package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Go {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22403a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PublicLogger f22404b;

    public final synchronized void a(Consumer consumer) {
        try {
            PublicLogger publicLogger = this.f22404b;
            if (publicLogger == null) {
                this.f22403a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
