package com.google.android.gms.location;

import a2.b;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import gb.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j0.g;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kb.j;
import pa.c0;
import qa.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f14413c = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new com.google.android.material.datepicker.a(29);

    public LocationResult(List list) {
        this.f14414b = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List list = ((LocationResult) obj).f14414b;
        int i = Build.VERSION.SDK_INT;
        List<Location> list2 = this.f14414b;
        if (i >= 31) {
            return list2.equals(list);
        }
        if (list2.size() != list.size()) {
            return false;
        }
        Iterator it = list.iterator();
        for (Location location : list2) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !c0.m(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14414b});
    }

    public final String toString() {
        String string;
        boolean zG;
        boolean zH;
        float fE;
        boolean zI;
        float f10;
        StringBuilder sb2 = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = j.f27346a;
        List<Location> list = this.f14414b;
        int i = 100;
        sb2.ensureCapacity(list.size() * 100);
        sb2.append("[");
        boolean z5 = false;
        for (Location location : list) {
            DecimalFormat decimalFormat2 = j.f27347b;
            sb2.ensureCapacity(i);
            if (location == null) {
                sb2.append((String) null);
            } else {
                sb2.append("{");
                sb2.append(location.getProvider());
                sb2.append(", ");
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31 ? b.c(location) : location.isFromMockProvider()) {
                    sb2.append("mock, ");
                }
                DecimalFormat decimalFormat3 = j.f27346a;
                sb2.append(decimalFormat3.format(location.getLatitude()));
                sb2.append(StringUtils.COMMA);
                sb2.append(decimalFormat3.format(location.getLongitude()));
                if (location.hasAccuracy()) {
                    sb2.append("±");
                    sb2.append(decimalFormat2.format(location.getAccuracy()));
                    sb2.append("m");
                }
                float fB = 0.0f;
                if (location.hasAltitude()) {
                    sb2.append(", alt=");
                    sb2.append(decimalFormat2.format(location.getAltitude()));
                    if (i10 >= 26) {
                        zI = a2.a.i(location);
                    } else {
                        Bundle extras = location.getExtras();
                        zI = extras != null && extras.containsKey("verticalAccuracy");
                    }
                    if (zI) {
                        sb2.append("±");
                        if (i10 >= 26) {
                            f10 = a2.a.f(location);
                        } else {
                            Bundle extras2 = location.getExtras();
                            f10 = extras2 == null ? 0.0f : extras2.getFloat("verticalAccuracy", 0.0f);
                        }
                        sb2.append(decimalFormat2.format(f10));
                    }
                    sb2.append("m");
                }
                if (location.hasSpeed()) {
                    sb2.append(", spd=");
                    sb2.append(decimalFormat2.format(location.getSpeed()));
                    if (i10 >= 26) {
                        zH = a2.a.h(location);
                    } else {
                        Bundle extras3 = location.getExtras();
                        zH = extras3 != null && extras3.containsKey("speedAccuracy");
                    }
                    if (zH) {
                        sb2.append("±");
                        if (i10 >= 26) {
                            fE = a2.a.e(location);
                        } else {
                            Bundle extras4 = location.getExtras();
                            fE = extras4 == null ? 0.0f : extras4.getFloat("speedAccuracy", 0.0f);
                        }
                        sb2.append(decimalFormat2.format(fE));
                    }
                    sb2.append("m/s");
                }
                if (location.hasBearing()) {
                    sb2.append(", brg=");
                    sb2.append(decimalFormat2.format(location.getBearing()));
                    if (i10 >= 26) {
                        zG = a2.a.g(location);
                    } else {
                        Bundle extras5 = location.getExtras();
                        zG = extras5 != null && extras5.containsKey("bearingAccuracy");
                    }
                    if (zG) {
                        sb2.append("±");
                        if (i10 >= 26) {
                            fB = a2.a.b(location);
                        } else {
                            Bundle extras6 = location.getExtras();
                            if (extras6 != null) {
                                fB = extras6.getFloat("bearingAccuracy", 0.0f);
                            }
                        }
                        sb2.append(decimalFormat2.format(fB));
                    }
                    sb2.append("°");
                }
                Bundle extras7 = location.getExtras();
                String string2 = extras7 != null ? extras7.getString("floorLabel") : null;
                if (string2 != null) {
                    sb2.append(", fl=");
                    sb2.append(string2);
                }
                Bundle extras8 = location.getExtras();
                String string3 = extras8 != null ? extras8.getString("levelId") : null;
                if (string3 != null) {
                    sb2.append(", lv=");
                    sb2.append(string3);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb2.append(", ert=");
                long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + jCurrentTimeMillis;
                if (millis >= 0) {
                    string = m.f20094a.format(new Date(millis));
                } else {
                    SimpleDateFormat simpleDateFormat = m.f20094a;
                    string = Long.toString(millis);
                }
                sb2.append(string);
                sb2.append('}');
            }
            sb2.append(", ");
            z5 = true;
            i = 100;
        }
        if (z5) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.f0(parcel, 1, this.f14414b);
        g.m0(parcel, iI0);
    }
}
