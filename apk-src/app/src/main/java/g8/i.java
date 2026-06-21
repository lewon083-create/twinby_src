package g8;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.b4;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h, LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f20034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f20035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f20036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f20037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20038e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Location f20039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f20040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f20041h;
    public f8.a i;

    public i(Context context, k kVar) {
        this.f20034a = (LocationManager) context.getSystemService("location");
        this.f20036c = kVar;
        this.f20037d = context;
        this.f20035b = new o(context, kVar);
    }

    public static boolean g(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z5 = time > 120000;
        boolean z10 = time < -120000;
        boolean z11 = time > 0;
        if (z5) {
            return true;
        }
        if (z10) {
            return false;
        }
        float accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z12 = accuracy > 0.0f;
        boolean z13 = accuracy < 0.0f;
        boolean z14 = accuracy > 200.0f;
        boolean zEquals = location.getProvider() != null ? location.getProvider().equals(location2.getProvider()) : false;
        if (z13) {
            return true;
        }
        if (!z11 || z12) {
            return z11 && !z14 && zEquals;
        }
        return true;
    }

    @Override // g8.h
    public final void a(e8.e eVar, e8.e eVar2) {
        LocationManager locationManager = this.f20034a;
        Iterator<String> it = locationManager.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && g(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        eVar.a(location);
    }

    @Override // g8.h
    public final void c(Activity activity, p pVar, f8.a aVar) {
        long j10;
        float f10;
        long j11;
        int i;
        String str;
        int i10;
        if (!h.b(this.f20037d)) {
            aVar.onError(3);
            return;
        }
        this.f20041h = pVar;
        this.i = aVar;
        int i11 = 5;
        k kVar = this.f20036c;
        if (kVar != null) {
            float f11 = kVar.f20043b;
            int i12 = kVar.f20042a;
            long j12 = i12 == 1 ? Long.MAX_VALUE : kVar.f20044c;
            int iM = z.m(i12);
            if (iM == 0 || iM == 1) {
                j10 = Long.MAX_VALUE;
                i10 = 104;
            } else {
                j10 = Long.MAX_VALUE;
                i10 = (iM == 3 || iM == 4 || iM == 5) ? 100 : 102;
            }
            f10 = f11;
            long j13 = j12;
            i = i10;
            i11 = i12;
            j11 = j13;
        } else {
            j10 = Long.MAX_VALUE;
            f10 = 0.0f;
            j11 = 0;
            i = 102;
        }
        List<String> providers = this.f20034a.getProviders(true);
        if (i11 == 1) {
            str = "passive";
        } else {
            str = GplLibraryWrapper.FUSED_PROVIDER;
            if (!providers.contains(GplLibraryWrapper.FUSED_PROVIDER) || Build.VERSION.SDK_INT < 31) {
                str = "gps";
                if (!providers.contains("gps")) {
                    str = "network";
                    if (!providers.contains("network")) {
                        str = !providers.isEmpty() ? providers.get(0) : null;
                    }
                }
            }
        }
        this.f20040g = str;
        if (str == null) {
            aVar.onError(3);
            return;
        }
        f2.g.d(j11, "intervalMillis");
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(Float.MAX_VALUE);
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", "minUpdateDistanceMeters", fValueOf, fValueOf2));
        }
        if (f10 > Float.MAX_VALUE) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", "minUpdateDistanceMeters", fValueOf, fValueOf2));
        }
        f2.g.d(j11, "minUpdateIntervalMillis");
        boolean z5 = i == 104 || i == 102 || i == 100;
        Object[] objArr = {Integer.valueOf(i)};
        if (!z5) {
            throw new IllegalArgumentException(String.format("quality must be a defined QUALITY constant, not %d", objArr));
        }
        f2.g.h("passive location requests must have an explicit minimum update interval", (j11 == j10 && j11 == -1) ? false : true);
        a2.e eVar = new a2.e(j11, i, Math.min(j11, j11), f10);
        this.f20038e = true;
        this.f20035b.b();
        String str2 = this.f20040g;
        Looper mainLooper = Looper.getMainLooper();
        int i13 = a2.c.f401a;
        int i14 = Build.VERSION.SDK_INT;
        LocationManager locationManager = this.f20034a;
        if (i14 >= 31) {
            a2.b.d(locationManager, str2, a2.b.f(eVar), new c2.e(new Handler(mainLooper), 0), this);
            return;
        }
        try {
            if (b4.f13670d == null) {
                b4.f13670d = Class.forName("android.location.LocationRequest");
            }
            if (b4.f13671e == null) {
                Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", b4.f13670d, LocationListener.class, Looper.class);
                b4.f13671e = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            LocationRequest locationRequestA = eVar.a(str2);
            if (locationRequestA != null) {
                b4.f13671e.invoke(locationManager, locationRequestA, this, mainLooper);
                return;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
        }
        locationManager.requestLocationUpdates(str2, eVar.f403b, eVar.f405d, this, mainLooper);
    }

    @Override // g8.h
    public final boolean d(int i, int i10) {
        return false;
    }

    @Override // g8.h
    public final void e() {
        this.f20038e = false;
        o oVar = this.f20035b;
        LocationManager locationManager = oVar.f20051b;
        if (oVar.f20052c != null && locationManager != null) {
            locationManager.removeNmeaListener(oVar.f20053d);
            locationManager.unregisterGnssStatusCallback(oVar.f20054e);
            oVar.f20058j = false;
        }
        this.f20034a.removeUpdates(this);
    }

    @Override // g8.h
    public final void f(b bVar) {
        hi.g gVar = bVar.f20008b;
        if (this.f20034a == null) {
            gVar.success(Boolean.FALSE);
        } else {
            gVar.success(Boolean.valueOf(h.b(this.f20037d)));
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            onLocationChanged((Location) list.get(i));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        if (str.equals(this.f20040g)) {
            if (this.f20038e) {
                this.f20034a.removeUpdates(this);
            }
            f8.a aVar = this.i;
            if (aVar != null) {
                aVar.onError(3);
            }
            this.f20040g = null;
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
        if (i != 2 && i == 0) {
            onProviderDisabled(str);
        }
    }

    @Override // android.location.LocationListener
    public final synchronized void onLocationChanged(Location location) {
        if (g(location, this.f20039f)) {
            this.f20039f = location;
            if (this.f20041h != null) {
                this.f20035b.a(location);
                this.f20041h.a(this.f20039f);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onFlushComplete(int i) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }
}
