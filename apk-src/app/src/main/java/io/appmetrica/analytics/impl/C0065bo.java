package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0065bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23525a = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.14.2", "50157683");

    public final String a() {
        return this.f23525a;
    }
}
