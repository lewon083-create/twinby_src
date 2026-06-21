package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Yh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f23351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0162fi f23352b;

    public Yh(C0162fi c0162fi, List list) {
        this.f23352b = c0162fi;
        this.f23351a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162fi c0162fi = this.f23352b;
        C0162fi.a(c0162fi.f23884a, c0162fi.f23887d, c0162fi.f23888e).reportAnr(CollectionUtils.getMapFromList(this.f23351a));
    }
}
