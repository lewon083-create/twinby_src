package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements n, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f13769c = new HashMap();

    public h(String str) {
        this.f13768b = str;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void a(String str, n nVar) {
        HashMap map = this.f13769c;
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    public abstract n b(com.google.firebase.messaging.y yVar, List list);

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator c() {
        return new i(this.f13769c.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n e(String str, com.google.firebase.messaging.y yVar, ArrayList arrayList) {
        return "toString".equals(str) ? new q(this.f13768b) : j.n(this, new q(str), yVar, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f13768b;
        if (str != null) {
            return str.equals(hVar.f13768b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n f(String str) {
        HashMap map = this.f13769c;
        return map.containsKey(str) ? (n) map.get(str) : n.B1;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double g() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        String str = this.f13768b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean i() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        return this.f13768b;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean o(String str) {
        return this.f13769c.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n B() {
        return this;
    }
}
