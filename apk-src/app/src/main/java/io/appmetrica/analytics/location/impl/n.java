package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f25175a;

    public n(p pVar) {
        this.f25175a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f25175a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f25181e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f25177a.f25155a);
                tVar2.f25188c.add(pVar.f25179c);
                Iterator it = pVar.f25180d.iterator();
                while (it.hasNext()) {
                    tVar2.f25188c.add((Consumer) it.next());
                }
                pVar.f25181e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f25186a = pVar.f25177a.f25155a;
            }
            if (tVar.f25189d != null) {
                boolean zDidTimePassMillis = tVar.f25187b.didTimePassMillis(tVar.f25190e, tVar.f25186a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z5 = location.distanceTo(tVar.f25189d) > tVar.f25186a.getUpdateDistanceInterval();
                boolean z10 = tVar.f25189d == null || location.getTime() - tVar.f25189d.getTime() >= 0;
                if ((!zDidTimePassMillis && !z5) || !z10) {
                    return;
                }
            }
            tVar.f25189d = location;
            tVar.f25190e = System.currentTimeMillis();
            Iterator it2 = tVar.f25188c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
