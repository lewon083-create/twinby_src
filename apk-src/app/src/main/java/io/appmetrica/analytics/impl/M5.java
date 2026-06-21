package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class M5 extends BaseRequestConfig.DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C0140em f22651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final SdkEnvironmentProvider f22652b;

    public M5(@NonNull C0140em c0140em, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c0140em.c(), c0140em.a(), c0140em.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f22651a = c0140em;
        this.f22652b = sdkEnvironmentProvider;
    }
}
