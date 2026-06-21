package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0545v implements InterfaceC0570w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24860a;

    public C0545v(@NotNull Context context) {
        this.f24860a = context;
    }

    @Nullable
    public final String a() {
        C0071c4 c0071c4L = C0071c4.l();
        Context context = this.f24860a;
        N9 n92 = c0071c4L.f23553t;
        if (n92 == null) {
            synchronized (c0071c4L) {
                try {
                    n92 = c0071c4L.f23553t;
                    if (n92 == null) {
                        n92 = new N9(context);
                        c0071c4L.f23553t = n92;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = n92.f22730d.getApplicationMetaData(n92.f22727a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
