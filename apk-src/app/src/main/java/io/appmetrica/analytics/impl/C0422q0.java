package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0422q0 implements Ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f24599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0148f4 f24600c = new C0148f4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f24601d = f().getHandler();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T1 f24602e = new T1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0308lb f24603f = new C0308lb();

    public C0422q0(@NotNull Context context, @NotNull S3 s32) {
        this.f24598a = context;
        this.f24599b = s32.a();
        BaseReleaseLogger.init(context);
        f().execute(new com.appsflyer.internal.m(3));
        a().a();
        G3.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info("AppMetrica", "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 7.14.2, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 03.03.2026.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NotNull
    public final C0148f4 a() {
        return this.f24600c;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NotNull
    public final Handler b() {
        return this.f24601d;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NotNull
    public final T1 c() {
        return this.f24602e;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NotNull
    public final C0308lb d() {
        return this.f24603f;
    }

    @NotNull
    public final IHandlerExecutor f() {
        return this.f24599b;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final ICommonExecutor getDefaultExecutor() {
        return this.f24599b;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.Ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(@org.jetbrains.annotations.Nullable io.appmetrica.analytics.AppMetricaConfig r3, @org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.Ua r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = io.appmetrica.analytics.impl.C0621y0.f25057g     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L4f
            if (r3 == 0) goto L1d
            java.lang.Boolean r0 = r3.crashReporting     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L51
        L10:
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L17
            goto L1d
        L17:
            io.appmetrica.analytics.impl.lb r4 = r2.f24603f     // Catch: java.lang.Throwable -> Le
            r4.a()     // Catch: java.lang.Throwable -> Le
            goto L30
        L1d:
            io.appmetrica.analytics.impl.lb r0 = r2.f24603f     // Catch: java.lang.Throwable -> Le
            r0.c()     // Catch: java.lang.Throwable -> Le
            io.appmetrica.analytics.impl.lb r0 = r2.f24603f     // Catch: java.lang.Throwable -> Le
            r0.b()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L30
            io.appmetrica.analytics.impl.lb r0 = r2.f24603f     // Catch: java.lang.Throwable -> Le
            android.content.Context r1 = r2.f24598a     // Catch: java.lang.Throwable -> Le
            r0.a(r1, r3, r4)     // Catch: java.lang.Throwable -> Le
        L30:
            if (r3 == 0) goto L45
            java.lang.Boolean r4 = r3.appOpenTrackingEnabled     // Catch: java.lang.Throwable -> Le
            if (r4 != 0) goto L38
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le
        L38:
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto L3f
            goto L45
        L3f:
            io.appmetrica.analytics.impl.T1 r4 = r2.f24602e     // Catch: java.lang.Throwable -> Le
            r4.c()     // Catch: java.lang.Throwable -> Le
            goto L4a
        L45:
            io.appmetrica.analytics.impl.T1 r4 = r2.f24602e     // Catch: java.lang.Throwable -> Le
            r4.b()     // Catch: java.lang.Throwable -> Le
        L4a:
            if (r3 == 0) goto L4f
            r3 = 1
            io.appmetrica.analytics.impl.C0621y0.f25057g = r3     // Catch: java.lang.Throwable -> Le
        L4f:
            monitor-exit(r2)
            return
        L51:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0422q0.a(io.appmetrica.analytics.AppMetricaConfig, io.appmetrica.analytics.impl.Ua):void");
    }
}
