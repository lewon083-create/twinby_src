package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0237ig implements InterfaceC0134eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0564vi f24077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ue f24078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M7 f24079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0438qg f24080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f24081f;

    public C0237ig(C0564vi c0564vi, Ue ue, @NonNull Handler handler) {
        this(c0564vi, ue, handler, ue.s());
    }

    public final void a() {
        if (this.f24076a) {
            return;
        }
        C0564vi c0564vi = this.f24077b;
        ResultReceiverC0487sg resultReceiverC0487sg = new ResultReceiverC0487sg(this.f24081f, this);
        c0564vi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC0487sg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3("", "", 4098, 0, anonymousInstance);
        n32.f22871m = bundle;
        G4 g42 = c0564vi.f24911a;
        c0564vi.a(C0564vi.a(n32, g42), g42, 1, (Map) null);
    }

    public C0237ig(C0564vi c0564vi, Ue ue, Handler handler, boolean z5) {
        this(c0564vi, ue, handler, z5, new M7(z5), new C0438qg());
    }

    public C0237ig(C0564vi c0564vi, Ue ue, Handler handler, boolean z5, M7 m72, C0438qg c0438qg) {
        this.f24077b = c0564vi;
        this.f24078c = ue;
        this.f24076a = z5;
        this.f24079d = m72;
        this.f24080e = c0438qg;
        this.f24081f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0134eg
    public final void a(C0338mg c0338mg) {
        String str = c0338mg == null ? null : c0338mg.f24372a;
        if (this.f24076a) {
            return;
        }
        synchronized (this) {
            M7 m72 = this.f24079d;
            this.f24080e.getClass();
            m72.f22667d = C0438qg.a(str);
            m72.a();
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            M7 m72 = this.f24079d;
            m72.f22666c = deferredDeeplinkParametersListener;
            if (m72.f22664a) {
                m72.a(1);
            } else {
                m72.a();
            }
            this.f24078c.u();
        } catch (Throwable th2) {
            this.f24078c.u();
            throw th2;
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            M7 m72 = this.f24079d;
            m72.f22665b = deferredDeeplinkListener;
            if (m72.f22664a) {
                m72.a(1);
            } else {
                m72.a();
            }
            this.f24078c.u();
        } catch (Throwable th2) {
            this.f24078c.u();
            throw th2;
        }
    }
}
