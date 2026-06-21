package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0569vn f23109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23111c;

    public V(C0569vn c0569vn, ArrayList arrayList, String str) {
        this.f23109a = c0569vn;
        this.f23110b = arrayList == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f23111c = str;
    }
}
