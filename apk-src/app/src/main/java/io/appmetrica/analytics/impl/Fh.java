package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Fh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f22339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0162fi f22340c;

    public Fh(C0162fi c0162fi, String str, List list) {
        this.f22340c = c0162fi;
        this.f22338a = str;
        this.f22339b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162fi c0162fi = this.f22340c;
        C0162fi.a(c0162fi.f23884a, c0162fi.f23887d, c0162fi.f23888e).reportEvent(this.f22338a, CollectionUtils.getMapFromList(this.f22339b));
    }
}
