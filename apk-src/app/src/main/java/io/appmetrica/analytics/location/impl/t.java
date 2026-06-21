package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocationFilter f25186a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Location f25189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f25190e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f25188c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimePassedChecker f25187b = new TimePassedChecker();

    public t(LocationFilter locationFilter) {
        this.f25186a = locationFilter;
    }
}
