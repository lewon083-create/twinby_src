package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import sb.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
class GplOnSuccessListener implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationListener f21909a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f21909a = locationListener;
    }

    @Override // sb.d
    public void onSuccess(Location location) {
        this.f21909a.onLocationChanged(location);
    }
}
