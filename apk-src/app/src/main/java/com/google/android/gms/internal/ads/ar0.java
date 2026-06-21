package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ar0 implements zq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f3360a;

    public ar0(q9.d3 d3Var, String str, int i, String str2, q9.j3 j3Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(StringUtils.COMMA)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(d3Var.f31802c));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(d3Var.f31803d));
        } else if (hashSet.contains("npa")) {
            arrayList.add(d3Var.f31803d.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(d3Var.f31804e));
        }
        if (hashSet.contains("keywords")) {
            List list = d3Var.f31805f;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(d3Var.f31806g));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(d3Var.f31807h));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(d3Var.i));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(d3Var.f31808j);
        }
        if (hashSet.contains("location")) {
            Location location = d3Var.f31810l;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(d3Var.f31811m);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(d3Var.f31812n));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(d3Var.f31813o));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = d3Var.f31814p;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(d3Var.f31815q);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(d3Var.f31816r);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(d3Var.f31817s));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(d3Var.f31819u));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(d3Var.f31820v);
        }
        if (hashSet.contains(Device.JsonKeys.ORIENTATION)) {
            if (j3Var != null) {
                arrayList.add(Integer.valueOf(j3Var.f31916b));
            } else {
                arrayList.add(null);
            }
        }
        this.f3360a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb2.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ar0) {
            return Arrays.equals(this.f3360a, ((ar0) obj).f3360a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3360a);
    }

    public final String toString() {
        Object[] objArr = this.f3360a;
        int iHashCode = Arrays.hashCode(objArr);
        String string = Arrays.toString(objArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iHashCode).length() + 10 + String.valueOf(string).length() + 1);
        sb2.append("[PoolKey#");
        sb2.append(iHashCode);
        sb2.append(" ");
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
