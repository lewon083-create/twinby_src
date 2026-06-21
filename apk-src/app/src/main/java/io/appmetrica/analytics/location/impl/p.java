package io.appmetrica.analytics.location.impl;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f25177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f25178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f25179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f25180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f25181e = new HashMap();

    public p(List list, i iVar) {
        this.f25180d = list;
        this.f25177a = iVar;
        m mVar = new m();
        this.f25178b = mVar;
        this.f25179c = new h(mVar);
    }

    public final m a() {
        return this.f25178b;
    }
}
