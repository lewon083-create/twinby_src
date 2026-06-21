package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bp1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f3848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1 f3850d;

    public bp1(ap1 ap1Var, Comparable comparable, Object obj) {
        this.f3850d = ap1Var;
        this.f3848b = comparable;
        this.f3849c = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f3848b.compareTo(((bp1) obj).f3848b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f3848b;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f3849c;
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
        return this.f3848b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3849c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f3848b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f3849c;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f3850d.f();
        Object obj2 = this.f3849c;
        this.f3849c = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3848b);
        String strValueOf2 = String.valueOf(this.f3849c);
        return t.z.g(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
