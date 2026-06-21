package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import kb.c;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
class GplLocationCallback extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationListener f21908a;

    public GplLocationCallback(LocationListener locationListener) {
        this.f21908a = locationListener;
    }

    @Override // kb.c
    public void onLocationResult(LocationResult locationResult) {
        LocationListener locationListener = this.f21908a;
        List list = locationResult.f14414b;
        int size = list.size();
        locationListener.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
    }
}
