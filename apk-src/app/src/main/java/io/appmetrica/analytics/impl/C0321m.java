package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0321m implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f24324a = new HashSet();

    public C0321m(@NonNull C0371o c0371o) {
        c0371o.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(@NonNull InterfaceC0296l interfaceC0296l) {
        this.f24324a.add(interfaceC0296l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        C0071c4.l().f23537c.a().execute(new RunnableC0271k(this, activity));
    }

    public final void a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f24324a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0034aj) ((InterfaceC0296l) it.next())).a(activity);
        }
    }
}
