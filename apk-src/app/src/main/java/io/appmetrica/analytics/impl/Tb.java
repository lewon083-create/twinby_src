package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Tb implements Qb, ToggleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23010a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f23011b = C0382oa.k().w().b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Jn f23012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23013d;

    public final void a(@Nullable Toggle toggle) {
        Jn jn = new Jn(toggle);
        this.f23012c = jn;
        jn.f22543c.registerObserver(this, true);
    }

    public final void b(@NotNull Object obj) {
        Jn jn = this.f23012c;
        if (jn != null) {
            jn.f22542b.b(obj);
        } else {
            Intrinsics.g("togglesHolder");
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(boolean z5) {
        this.f23011b.execute(new a1.b(3, this, z5));
    }

    public final void a(@NotNull LocationControllerObserver locationControllerObserver, boolean z5) {
        this.f23011b.execute(new com.google.firebase.messaging.u(this, locationControllerObserver, z5));
    }

    public static final void a(Tb tb2, LocationControllerObserver locationControllerObserver, boolean z5) {
        tb2.f23010a.add(locationControllerObserver);
        if (z5) {
            if (tb2.f23013d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Tb tb2, boolean z5) {
        if (tb2.f23013d != z5) {
            tb2.f23013d = z5;
            Function1 function1 = z5 ? Rb.f22911a : Sb.f22955a;
            Iterator it = tb2.f23010a.iterator();
            while (it.hasNext()) {
                function1.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(@NotNull Object obj) {
        Jn jn = this.f23012c;
        if (jn != null) {
            jn.f22542b.a(obj);
        } else {
            Intrinsics.g("togglesHolder");
            throw null;
        }
    }

    public final void a(boolean z5) {
        Jn jn = this.f23012c;
        if (jn != null) {
            jn.f22541a.a(z5);
        } else {
            Intrinsics.g("togglesHolder");
            throw null;
        }
    }
}
