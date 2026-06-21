package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ad.o0 f13664d = ad.o0.q(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f13667c;

    public b(String str, long j10, HashMap map) {
        this.f13665a = str;
        this.f13666b = j10;
        HashMap map2 = new HashMap();
        this.f13667c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object b(Object obj, String str, Object obj2) {
        if (f13664d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f13665a, this.f13666b, new HashMap(this.f13667c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f13666b == bVar.f13666b && this.f13665a.equals(bVar.f13665a)) {
            return this.f13667c.equals(bVar.f13667c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f13665a.hashCode() * 31;
        long j10 = this.f13666b;
        return this.f13667c.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f13665a;
        String string = this.f13667c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.f13666b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j10).length() + 9 + string.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
