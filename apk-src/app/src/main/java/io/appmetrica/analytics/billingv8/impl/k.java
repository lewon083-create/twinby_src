package io.appmetrica.analytics.billingv8.impl;

import d8.r;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilsProvider f21690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f21691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f21692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f21693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f21694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f21695f;

    public k(UtilsProvider utilsProvider, Function0 function0, List list, List list2, d dVar, n nVar) {
        this.f21690a = utilsProvider;
        this.f21691b = function0;
        this.f21692c = list;
        this.f21693d = list2;
        this.f21694e = dVar;
        this.f21695f = nVar;
    }

    @Override // d8.r
    public final void onQueryPurchasesResponse(d8.j jVar, List list) {
        this.f21690a.getWorkerExecutor().execute(new j(this, jVar, list));
    }
}
