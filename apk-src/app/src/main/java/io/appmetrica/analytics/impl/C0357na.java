package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0357na implements InterfaceC0292kk {
    @Override // io.appmetrica.analytics.impl.InterfaceC0292kk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0292kk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
