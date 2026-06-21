package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0569vn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f24948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f24949f;

    public C0569vn(String str, int i, long j10, String str2, Integer num, List list) {
        this.f24944a = str;
        this.f24945b = i;
        this.f24946c = j10;
        this.f24947d = str2;
        this.f24948e = num;
        this.f24949f = list == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(list);
    }
}
