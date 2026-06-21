package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0587wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0060bj f24981c;

    public C0587wg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C0060bj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f24979a + "', identifier='" + this.f24980b + "', screen=" + this.f24981c + '}';
    }

    public C0587wg(String str, String str2, C0060bj c0060bj) {
        this.f24979a = str;
        this.f24980b = str2;
        this.f24981c = c0060bj;
    }
}
