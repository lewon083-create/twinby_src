package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0060bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f23512d;

    public C0060bj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f23509a + "', categoriesPath=" + this.f23510b + ", searchQuery='" + this.f23511c + "', payload=" + this.f23512d + '}';
    }

    public C0060bj(String str, String str2, List list, Map map) {
        this.f23509a = str;
        this.f23510b = list;
        this.f23511c = str2;
        this.f23512d = map;
    }
}
