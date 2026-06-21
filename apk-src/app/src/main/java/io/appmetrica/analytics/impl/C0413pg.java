package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0413pg implements InterfaceC0263jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f24586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0338mg f24588c;

    public C0413pg() {
        this(C0382oa.k().u());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0263jg
    public final synchronized void a(C0338mg c0338mg) {
        if (c0338mg != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c0338mg.f24375d.f24305a, c0338mg.f24372a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f24588c = c0338mg;
        this.f24587b = true;
        Iterator it = this.f24586a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0134eg) it.next()).a(this.f24588c);
        }
        this.f24586a.clear();
    }

    public C0413pg(C0288kg c0288kg) {
        this.f24586a = new HashSet();
        c0288kg.a(new C0592wl(this));
        c0288kg.a();
    }

    public final synchronized void a(@NonNull InterfaceC0134eg interfaceC0134eg) {
        this.f24586a.add(interfaceC0134eg);
        if (this.f24587b) {
            interfaceC0134eg.a(this.f24588c);
            this.f24586a.remove(interfaceC0134eg);
        }
    }
}
