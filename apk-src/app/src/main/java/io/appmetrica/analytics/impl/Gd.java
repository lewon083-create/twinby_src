package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Gd implements Zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22379a;

    public Gd(int i) {
        this.f22379a = i;
    }

    @Override // io.appmetrica.analytics.impl.Zk
    public final boolean a(@NotNull String str) {
        return this.f22379a != Process.myPid();
    }
}
