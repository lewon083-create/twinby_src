package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ECommerceReferrer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ECommerceScreen f21879c;

    public String getIdentifier() {
        return this.f21878b;
    }

    public ECommerceScreen getScreen() {
        return this.f21879c;
    }

    public String getType() {
        return this.f21877a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(String str) {
        this.f21878b = str;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f21879c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(String str) {
        this.f21877a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f21877a + "', identifier='" + this.f21878b + "', screen=" + this.f21879c + '}';
    }
}
