package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0323m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f24327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f24328b;

    public RunnableC0323m1(C0522u1 c0522u1, List list) {
        this.f24328b = c0522u1;
        this.f24327a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0522u1.a(this.f24328b).reportAnr(CollectionUtils.getMapFromList(this.f24327a));
    }
}
