package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import kotlin.collections.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements PermissionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f25404a = d0.f27478b;

    public final synchronized void a(@NotNull Set<String> set) {
        this.f25404a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(@NotNull String str) {
        return !this.f25404a.contains(str);
    }
}
