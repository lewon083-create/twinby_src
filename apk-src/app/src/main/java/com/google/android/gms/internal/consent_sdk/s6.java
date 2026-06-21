package com.google.android.gms.internal.consent_sdk;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s6 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f13549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r6 f13551d;

    public s6(r6 r6Var, Comparable comparable, Object obj) {
        this.f13551d = r6Var;
        this.f13549b = comparable;
        this.f13550c = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f13549b.compareTo(((s6) obj).f13549b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f13549b;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f13550c;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f13549b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13550c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f13549b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f13550c;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f13551d.g();
        Object obj2 = this.f13550c;
        this.f13550c = obj;
        return obj2;
    }

    public final String toString() {
        return gf.a.k(String.valueOf(this.f13549b), "=", String.valueOf(this.f13550c));
    }
}
