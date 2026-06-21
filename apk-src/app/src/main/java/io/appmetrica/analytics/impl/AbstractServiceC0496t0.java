package io.appmetrica.analytics.impl;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractServiceC0496t0 extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M1 f24748a;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        M1 m12 = this.f24748a;
        if (m12 != null) {
            return m12.a(intent);
        }
        Intrinsics.g("serviceDelegate");
        throw null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        M1 m12 = this.f24748a;
        if (m12 != null) {
            m12.a(configuration);
        } else {
            Intrinsics.g("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.f24748a == null) {
            this.f24748a = new M1(this, new C0521u0(this));
        }
        M1 m12 = this.f24748a;
        if (m12 != null) {
            m12.b();
        } else {
            Intrinsics.g("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        M1 m12 = this.f24748a;
        if (m12 != null) {
            m12.c();
        } else {
            Intrinsics.g("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public void onRebind(@NotNull Intent intent) {
        super.onRebind(intent);
        M1 m12 = this.f24748a;
        if (m12 != null) {
            m12.b(intent);
        } else {
            Intrinsics.g("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@NotNull Intent intent, int i, int i10) {
        M1 m12 = this.f24748a;
        if (m12 != null) {
            return m12.a(intent, i, i10);
        }
        Intrinsics.g("serviceDelegate");
        throw null;
    }

    @Override // android.app.Service
    public boolean onUnbind(@NotNull Intent intent) {
        M1 m12 = this.f24748a;
        if (m12 != null) {
            return m12.c(intent);
        }
        Intrinsics.g("serviceDelegate");
        throw null;
    }
}
