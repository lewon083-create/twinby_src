package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0668zm f23057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f23058b;

    public U3(C0668zm c0668zm, U u4) {
        this.f23057a = c0668zm;
        this.f23058b = u4;
    }

    public final T3 a(HashMap map) {
        AdvertisingIdsHolder advertisingIdsHolderA;
        C0140em c0140emE = this.f23057a.e();
        U u4 = this.f23058b;
        synchronized (u4) {
            advertisingIdsHolderA = u4.a(new Xd());
        }
        return new T3(T3.a(c0140emE.f23788d), T3.a(c0140emE.f23785a), T3.a(c0140emE.f23786b), T3.a(c0140emE.f23793j), T3.a(c0140emE.i), T3.a(AbstractC0207hb.a(Em.a(c0140emE.f23794k))), T3.a(AbstractC0207hb.a(map)), new IdentifiersResult(advertisingIdsHolderA.getGoogle().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getGoogle().mAdTrackingInfo.advId, advertisingIdsHolderA.getGoogle().mStatus, advertisingIdsHolderA.getGoogle().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getHuawei().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getHuawei().mAdTrackingInfo.advId, advertisingIdsHolderA.getHuawei().mStatus, advertisingIdsHolderA.getHuawei().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getYandex().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getYandex().mAdTrackingInfo.advId, advertisingIdsHolderA.getYandex().mStatus, advertisingIdsHolderA.getYandex().mErrorExplanation), T3.a(AbstractC0207hb.a(c0140emE.f23792h)), Hn.a(), c0140emE.f23798o + ((long) c0140emE.f23809z.f22162a), T3.a(c0140emE.f23797n.f24336f), new Bundle());
    }
}
