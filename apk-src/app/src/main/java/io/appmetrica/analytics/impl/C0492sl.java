package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0492sl implements PermissionExtractor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24742b = "[SimplePermissionExtractor]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionStrategy f24743a;

    public C0492sl(@NonNull PermissionStrategy permissionStrategy) {
        this.f24743a = permissionStrategy;
    }

    @NonNull
    public final PermissionStrategy a() {
        return this.f24743a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(@NonNull Context context, @NonNull String str) {
        if (this.f24743a.forbidUsePermission(str)) {
            return false;
        }
        return ContextPermissionChecker.hasPermission(context, str);
    }
}
