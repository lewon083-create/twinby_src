package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class U implements Ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f23040b;
    public FutureTask i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final J f23047j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23050m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23041c = "advertising identifiers collecting is forbidden by client configuration";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23042d = "advertising identifiers collecting is forbidden by startup";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23043e = "advertising identifiers collecting is forbidden by unknown reason";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N f23044f = new N(new C0637yg("google"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final N f23045g = new N(new C0637yg("huawei"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N f23046h = new N(new C0637yg("yandex"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f23048k = new AdvertisingIdsHolder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public G f23049l = new G(4, 4, 4);

    public U(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor, @NotNull C0140em c0140em) {
        this.f23039a = context;
        this.f23040b = iCommonExecutor;
        this.f23047j = new J(c0140em);
    }

    public static final Void e(U u4) {
        u4.f23048k = new AdvertisingIdsHolder(u4.a(u4.f23049l.f22360a, new Q(u4)), u4.a(u4.f23049l.f22361b, new S(u4)), u4.a(u4.f23049l.f22362c, new T(u4, new Xd())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers(@NotNull Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized void init() {
        if (this.i == null) {
            this.f23049l = this.f23047j.a();
            FutureTask futureTask = new FutureTask(new a7.h(4, this));
            this.i = futureTask;
            this.f23040b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ba, io.appmetrica.analytics.impl.InterfaceC0269jm
    public final synchronized void a(@NotNull C0140em c0140em) {
        this.f23047j.a(c0140em);
        a((Fi) new Xd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized void b(boolean z5) {
        this.f23050m = true;
        this.f23047j.f22470b.update(z5);
        a((Fi) new Xd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized void c(boolean z5) {
        if (!this.f23050m) {
            b(z5);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.i;
        if (futureTask == null) {
            Intrinsics.g("refresh");
            throw null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f23048k;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NotNull
    public final synchronized AdvertisingIdsHolder a() {
        return a(new Xd());
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NotNull
    public final synchronized AdvertisingIdsHolder a(@NotNull Fi fi2) {
        try {
            a(fi2, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f23048k;
    }

    public final FutureTask a(final Fi fi2, final boolean z5) {
        final G gA = this.f23047j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.gp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U.a(z5, gA, this, fi2);
            }
        });
        this.i = futureTask;
        this.f23040b.execute(futureTask);
        FutureTask futureTask2 = this.i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        Intrinsics.g("refresh");
        throw null;
    }

    public static final Void a(boolean z5, G g10, U u4, Fi fi2) {
        if (!z5 && Intrinsics.a(g10, u4.f23049l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = u4.f23048k;
        AdTrackingInfoResult adTrackingInfoResultA = u4.a(g10.f22360a, new Q(u4));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = adTrackingInfoResultA.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            adTrackingInfoResultA = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, adTrackingInfoResultA.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA2 = u4.a(g10.f22361b, new S(u4));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = adTrackingInfoResultA2.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            adTrackingInfoResultA2 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, adTrackingInfoResultA2.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA3 = u4.a(g10.f22362c, new T(u4, fi2));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = adTrackingInfoResultA3.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            adTrackingInfoResultA3 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, adTrackingInfoResultA3.mErrorExplanation);
        }
        u4.f23048k = new AdvertisingIdsHolder(adTrackingInfoResultA, adTrackingInfoResultA2, adTrackingInfoResultA3);
        return null;
    }

    public final AdTrackingInfoResult a(int i, Function0 function0) {
        if (i == 0) {
            throw null;
        }
        int i10 = i - 1;
        if (i10 == 0) {
            return (AdTrackingInfoResult) function0.invoke();
        }
        if (i10 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f23041c);
        }
        if (i10 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f23042d);
        }
        if (i10 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f23043e);
        }
        throw new ij.j();
    }
}
