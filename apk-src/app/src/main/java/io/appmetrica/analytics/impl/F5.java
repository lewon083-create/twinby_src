package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class F5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0371o f22317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IReporter f22318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f22319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E5 f22320d;

    public F5(C0371o c0371o) {
        this(c0371o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f22319c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f22317a.a(applicationContext);
            this.f22317a.registerListener(this.f22320d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f22319c = applicationContext;
        }
    }

    public F5(C0371o c0371o, IReporter iReporter) {
        this.f22317a = c0371o;
        this.f22318b = iReporter;
        this.f22320d = new E5(this);
    }

    public /* synthetic */ F5(C0371o c0371o, int i) {
        this(c0371o, AbstractC0622y1.a());
    }

    public final synchronized Context a() {
        return this.f22319c;
    }
}
