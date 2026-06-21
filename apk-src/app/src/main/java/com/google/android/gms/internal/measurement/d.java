package com.google.android.gms.internal.measurement;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.SentryEnvelopeItemHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterable, n, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f13690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeMap f13691c;

    public d() {
        this.f13690b = new TreeMap();
        this.f13691c = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n B() {
        d dVar = new d();
        for (Map.Entry entry : this.f13690b.entrySet()) {
            boolean z5 = entry.getValue() instanceof j;
            TreeMap treeMap = dVar.f13690b;
            if (z5) {
                treeMap.put((Integer) entry.getKey(), (n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((n) entry.getValue()).B());
            }
        }
        return dVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void a(String str, n nVar) {
        TreeMap treeMap = this.f13691c;
        if (nVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator c() {
        return new c(this, this.f13690b.keySet().iterator(), this.f13691c.keySet().iterator());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e5, code lost:
    
        if (j0.g.l0(r7, r2, (com.google.android.gms.internal.measurement.m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).r() == r7.r()) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203  */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n e(java.lang.String r38, com.google.firebase.messaging.y r39, java.util.ArrayList r40) {
        /*
            Method dump skipped, instruction units count: 2200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d.e(java.lang.String, com.google.firebase.messaging.y, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (r() != dVar.r()) {
            return false;
        }
        TreeMap treeMap = this.f13690b;
        if (treeMap.isEmpty()) {
            return dVar.f13690b.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!t(iIntValue).equals(dVar.t(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n f(String str) {
        n nVar;
        return SentryEnvelopeItemHeader.JsonKeys.LENGTH.equals(str) ? new g(Double.valueOf(r())) : (!o(str) || (nVar = (n) this.f13691c.get(str)) == null) ? n.B1 : nVar;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double g() {
        TreeMap treeMap = this.f13690b;
        return treeMap.size() == 1 ? t(0).g() : treeMap.size() <= 0 ? Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE) : Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f13690b.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean i() {
        return Boolean.TRUE;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(2, this);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        return x(StringUtils.COMMA);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean o(String str) {
        return SentryEnvelopeItemHeader.JsonKeys.LENGTH.equals(str) || this.f13691c.containsKey(str);
    }

    public final List p() {
        ArrayList arrayList = new ArrayList(r());
        for (int i = 0; i < r(); i++) {
            arrayList.add(t(i));
        }
        return arrayList;
    }

    public final Iterator q() {
        return this.f13690b.keySet().iterator();
    }

    public final int r() {
        TreeMap treeMap = this.f13690b;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final n t(int i) {
        n nVar;
        if (i < r()) {
            return (!v(i) || (nVar = (n) this.f13690b.get(Integer.valueOf(i))) == null) ? n.B1 : nVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String toString() {
        return x(StringUtils.COMMA);
    }

    public final void u(int i, n nVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(l7.o.j(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        }
        TreeMap treeMap = this.f13690b;
        if (nVar == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), nVar);
        }
    }

    public final boolean v(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f13690b;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        throw new IndexOutOfBoundsException(l7.o.j(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
    }

    public final void w(int i) {
        TreeMap treeMap = this.f13690b;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i10 = i - 1;
            Integer numValueOf = Integer.valueOf(i10);
            if (treeMap.containsKey(numValueOf) || i10 < 0) {
                return;
            }
            treeMap.put(numValueOf, n.B1);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            n nVar = (n) treeMap.get(numValueOf2);
            if (nVar != null) {
                treeMap.put(Integer.valueOf(i - 1), nVar);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String x(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f13690b.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= r()) {
                    break;
                }
                n nVarT = t(i);
                sb2.append(str2);
                if (!(nVarT instanceof r) && !(nVarT instanceof l)) {
                    sb2.append(nVarT.l());
                }
                i++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public d(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                u(i, (n) list.get(i));
            }
        }
    }
}
