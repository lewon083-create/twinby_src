package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ml, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0343ml implements InterfaceC0445qn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f24379d = TimeUnit.SECONDS.toMillis(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f24381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f24382c;

    public C0343ml(Context context) {
        long j10 = f24379d;
        this.f24382c = new CachedDataProvider.CachedData(j10, j10, "sim-info");
        this.f24380a = context;
        this.f24381b = C0382oa.k().j();
    }

    public final C0217hl b() {
        return new C0217hl((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f24380a, "phone", "getting SimMcc", "TelephonyManager", new C0242il()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f24380a, "phone", "getting SimMnc", "TelephonyManager", new C0268jl()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f24380a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C0318ll(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f24380a, "phone", "getting SimOperatorName", "TelephonyManager", new C0293kl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC0445qn
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<io.appmetrica.analytics.impl.C0217hl> a() {
        /*
            r4 = this;
            monitor-enter(r4)
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r0 = r4.f24382c     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.getData()     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L66
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r1 = r4.f24382c     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.shouldUpdateData()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L66
            goto L1c
        L1a:
            r0 = move-exception
            goto L68
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.oa r1 = io.appmetrica.analytics.impl.C0382oa.I     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.gm r1 = r1.f24509u     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.em r1 = r1.b()     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.m4 r1 = r1.f23797n     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.f24334d     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L61
            r1 = 23
            boolean r1 = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(r1)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L5a
            io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor r1 = r4.f24381b     // Catch: java.lang.Throwable -> L1a
            android.content.Context r2 = r4.f24380a     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r1 = r1.hasPermission(r2, r3)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L4c
            android.content.Context r1 = r4.f24380a     // Catch: java.lang.Throwable -> L1a
            java.util.List r1 = io.appmetrica.analytics.impl.C0368nl.a(r1)     // Catch: java.lang.Throwable -> L1a
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L1a
        L4c:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L61
            io.appmetrica.analytics.impl.hl r1 = r4.b()     // Catch: java.lang.Throwable -> L1a
            r0.add(r1)     // Catch: java.lang.Throwable -> L1a
            goto L61
        L5a:
            io.appmetrica.analytics.impl.hl r1 = r4.b()     // Catch: java.lang.Throwable -> L1a
            r0.add(r1)     // Catch: java.lang.Throwable -> L1a
        L61:
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r1 = r4.f24382c     // Catch: java.lang.Throwable -> L1a
            r1.setData(r0)     // Catch: java.lang.Throwable -> L1a
        L66:
            monitor-exit(r4)
            return r0
        L68:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0343ml.a():java.util.List");
    }
}
