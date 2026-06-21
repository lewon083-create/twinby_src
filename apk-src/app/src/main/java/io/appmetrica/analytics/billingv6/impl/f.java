package io.appmetrica.analytics.billingv6.impl;

import d8.p;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d8.d f21616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f21617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f21618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f21619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f21620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f21621g;

    public f(String str, d8.d dVar, UtilsProvider utilsProvider, h hVar, List list, d dVar2, n nVar) {
        this.f21615a = str;
        this.f21616b = dVar;
        this.f21617c = utilsProvider;
        this.f21618d = hVar;
        this.f21619e = list;
        this.f21620f = dVar2;
        this.f21621g = nVar;
    }

    @Override // d8.p
    public final void onProductDetailsResponse(d8.j jVar, List list) {
        this.f21617c.getWorkerExecutor().execute(new e(this, jVar, list));
    }
}
