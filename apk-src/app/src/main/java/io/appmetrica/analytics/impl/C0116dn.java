package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0116dn extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0141en f23709a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0116dn(C0141en c0141en) {
        super(0);
        this.f23709a = c0141en;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashMap map = new HashMap();
        C0141en c0141en = this.f23709a;
        String strA = c0141en.f23810a.a();
        if (strA != null) {
        }
        String strA2 = c0141en.f23811b.a();
        if (strA2 != null) {
            map.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, strA2);
        }
        return map;
    }
}
