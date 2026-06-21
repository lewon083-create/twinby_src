package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f11547a;

    public vz1(b7 b7Var, b bVar) {
        this.f11547a = bVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z5) {
        this.f11547a.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z5) {
        this.f11547a.f();
    }
}
