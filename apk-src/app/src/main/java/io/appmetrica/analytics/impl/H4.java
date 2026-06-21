package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H4 extends AbstractC0402p5 {
    public H4(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, M5> componentLoader, @NonNull C0140em c0140em, @NonNull BaseRequestConfig.BaseRequestArguments<C0401p4, Object> baseRequestArguments) {
        super(componentLoader, c0140em, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0402p5
    public final void a(@NonNull Object obj) {
        C0401p4 c0401p4 = (C0401p4) obj;
        synchronized (this) {
            super.a((Object) c0401p4);
        }
    }

    public final synchronized void a(@NonNull C0401p4 c0401p4) {
        super.a((Object) c0401p4);
    }
}
