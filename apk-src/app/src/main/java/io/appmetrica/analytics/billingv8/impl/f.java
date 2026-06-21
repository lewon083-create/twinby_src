package io.appmetrica.analytics.billingv8.impl;

import androidx.annotation.NonNull;
import com.android.billingclient.api.QueryProductDetailsResult;
import d8.p;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d8.d f21669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f21670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f21671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f21672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f21673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f21674g;

    public f(String str, d8.d dVar, UtilsProvider utilsProvider, h hVar, List list, d dVar2, n nVar) {
        this.f21668a = str;
        this.f21669b = dVar;
        this.f21670c = utilsProvider;
        this.f21671d = hVar;
        this.f21672e = list;
        this.f21673f = dVar2;
        this.f21674g = nVar;
    }

    public final void onProductDetailsResponse(d8.j jVar, QueryProductDetailsResult queryProductDetailsResult) {
        this.f21670c.getWorkerExecutor().execute(new e(this, jVar, queryProductDetailsResult));
    }

    @Override // d8.p
    public abstract /* synthetic */ void onProductDetailsResponse(@NonNull d8.j jVar, @NonNull List list);
}
