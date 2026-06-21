package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0198h2 implements InterfaceC0292kk, ApplicationStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f23956a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f23957b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f23958c = ApplicationState.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f23959d = new CopyOnWriteArraySet();

    public final void a(int i) {
        this.f23956a.remove(Integer.valueOf(i));
        a();
    }

    public final void b(int i) {
        this.f23957b.add(Integer.valueOf(i));
        this.f23956a.remove(Integer.valueOf(i));
        a();
    }

    public final void c(int i) {
        this.f23956a.add(Integer.valueOf(i));
        this.f23957b.remove(Integer.valueOf(i));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState getCurrentState() {
        return this.f23958c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0292kk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0292kk
    public final void onDestroy() {
        if (this.f23958c == ApplicationState.VISIBLE) {
            this.f23958c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f23959d.add(applicationStateObserver);
        }
        return this.f23958c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f23956a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f23957b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f23958c != applicationState) {
            this.f23958c = applicationState;
            Iterator it = this.f23959d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f23958c);
            }
        }
    }
}
