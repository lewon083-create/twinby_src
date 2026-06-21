package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Bk implements ServiceWakeLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ak f22160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f22161c = new HashMap();

    public Bk(@NotNull Context context, @NotNull Ak ak2) {
        this.f22159a = context;
        this.f22160b = ak2;
    }

    @NotNull
    public final String a(@NotNull String str) {
        return om1.k("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(@NotNull String str) {
        try {
            if (this.f22161c.get(str) == null) {
                HashMap map = this.f22161c;
                Ak ak2 = this.f22160b;
                Context context = this.f22159a;
                String strA = a(str);
                ak2.f22081a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(strA);
                ServiceConnectionC0666zk serviceConnectionC0666zk = new ServiceConnectionC0666zk();
                try {
                    context.bindService(intent, serviceConnectionC0666zk, 1);
                } catch (Throwable unused) {
                    serviceConnectionC0666zk = null;
                }
                map.put(str, serviceConnectionC0666zk);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f22161c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(@NotNull String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f22161c.get(str);
        if (serviceConnection != null) {
            Ak ak2 = this.f22160b;
            a(str);
            Context context = this.f22159a;
            ak2.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
