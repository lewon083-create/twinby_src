package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0358nb implements Zk {
    @Override // io.appmetrica.analytics.impl.Zk
    public final boolean a(@NotNull C0283kb c0283kb) {
        Integer num = c0283kb.f24225f;
        return num == null || num.intValue() != Process.myPid();
    }
}
