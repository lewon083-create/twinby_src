package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0043b2 implements AppSetIdProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f23473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AppSetId f23474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CountDownLatch f23475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0017a2 f23477f;

    public C0043b2(@NotNull Context context, @NotNull IAppSetIdRetriever iAppSetIdRetriever) {
        this.f23472a = context;
        this.f23473b = iAppSetIdRetriever;
        this.f23475d = new CountDownLatch(1);
        this.f23476e = 20L;
        this.f23477f = new C0017a2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    @NotNull
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f23474c == null) {
            try {
                this.f23475d = new CountDownLatch(1);
                this.f23473b.retrieveAppSetId(this.f23472a, this.f23477f);
                this.f23475d.await(this.f23476e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f23474c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f23474c = appSetId;
        }
        return appSetId;
    }

    public C0043b2(@NotNull Context context) {
        this(context, AbstractC0069c2.a());
    }
}
