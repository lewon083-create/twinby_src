package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends SynchronizedDataCache {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f25171d = 200;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f25172e = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f25174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f25169b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f25170c = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<String> f25173f = Arrays.asList("gps", "network");

    public m() {
        l lVar = new l(f25170c);
        long j10 = f25169b;
        this(lVar, j10, 2 * j10);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(@NonNull Location location) {
        if (f25173f.contains(location.getProvider())) {
            return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || a(location, (Location) this.mCachedData.getData(), this.f25174a.f25168a, 200L);
        }
        return false;
    }

    public m(l lVar, long j10, long j11) {
        super(j10, j11, "location");
        this.f25174a = lVar;
    }

    public static boolean a(Location location, Location location2, long j10, long j11) {
        boolean zEquals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z5 = time > j10;
        boolean z10 = time < (-j10);
        boolean z11 = time > 0;
        if (z5) {
            return true;
        }
        if (z10) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z12 = accuracy > 0;
        boolean z13 = accuracy < 0;
        boolean z14 = ((long) accuracy) > j11;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            zEquals = provider2 == null;
        } else {
            zEquals = provider.equals(provider2);
        }
        if (z13) {
            return true;
        }
        if (!z11 || z12) {
            return z11 && !z14 && zEquals;
        }
        return true;
    }
}
