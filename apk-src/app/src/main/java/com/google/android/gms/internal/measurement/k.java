package com.google.android.gms.internal.measurement;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class k implements n, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f13847b = new HashMap();

    @Override // com.google.android.gms.internal.measurement.n
    public final n B() {
        k kVar = new k();
        for (Map.Entry entry : this.f13847b.entrySet()) {
            boolean z5 = entry.getValue() instanceof j;
            HashMap map = kVar.f13847b;
            if (z5) {
                map.put((String) entry.getKey(), (n) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((n) entry.getValue()).B());
            }
        }
        return kVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void a(String str, n nVar) {
        HashMap map = this.f13847b;
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator c() {
        return new i(this.f13847b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n e(String str, com.google.firebase.messaging.y yVar, ArrayList arrayList) {
        return "toString".equals(str) ? new q(toString()) : j.n(this, new q(str), yVar, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f13847b.equals(((k) obj).f13847b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n f(String str) {
        HashMap map = this.f13847b;
        return map.containsKey(str) ? (n) map.get(str) : n.B1;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double g() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f13847b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean i() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean o(String str) {
        return this.f13847b.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap map = this.f13847b;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(StringUtils.COMMA));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
