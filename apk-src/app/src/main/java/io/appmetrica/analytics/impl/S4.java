package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class S4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f22943a = new CopyOnWriteArrayList();

    public final void a(@NonNull InterfaceC0174g4 interfaceC0174g4) {
        this.f22943a.add(interfaceC0174g4);
    }

    public final void b(@NonNull InterfaceC0174g4 interfaceC0174g4) {
        this.f22943a.remove(interfaceC0174g4);
    }

    public final List<InterfaceC0174g4> a() {
        return this.f22943a;
    }
}
