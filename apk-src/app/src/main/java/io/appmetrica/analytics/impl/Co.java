package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Co extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f22240a;

    public Co() {
        super(false, "[WakelocksToggle]");
        this.f22240a = new WeakHashMap();
    }

    public final synchronized void a(@NotNull Object obj) {
        this.f22240a.put(obj, null);
        if (this.f22240a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(@NotNull Object obj) {
        this.f22240a.remove(obj);
        if (this.f22240a.isEmpty()) {
            updateState(false);
        }
    }
}
