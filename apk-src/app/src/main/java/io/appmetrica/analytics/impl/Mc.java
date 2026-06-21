package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Mc implements InterfaceC0445qn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f22678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f22679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f22680d;

    public Mc(@NotNull Context context) {
        this.f22677a = context;
        this.f22678b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C0382oa.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f22679c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f22680d = new CachedDataProvider.CachedData(millis, millis * ((long) 2), "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0445qn
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Lc a() {
        Lc lc2;
        try {
            lc2 = (Lc) this.f22680d.getData();
            if (lc2 == null || this.f22680d.shouldUpdateData()) {
                lc2 = new Lc(this.f22678b.hasNecessaryPermissions(this.f22677a) ? this.f22679c.getNetworkType() : "unknown");
                this.f22680d.setData(lc2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lc2;
    }
}
