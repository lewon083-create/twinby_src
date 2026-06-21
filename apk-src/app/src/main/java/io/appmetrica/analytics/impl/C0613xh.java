package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0613xh extends AbstractC0161fh {
    public C0613xh(F6 f62) {
        super(f62);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0161fh, io.appmetrica.analytics.impl.InterfaceC0187gh
    public final boolean a(Boolean bool) {
        return !this.f23883a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
