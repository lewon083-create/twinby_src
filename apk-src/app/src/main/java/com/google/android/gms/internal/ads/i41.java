package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i41 extends p51 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        i41 i41Var = l50.f7396a;
        Integer numValueOf = Integer.valueOf(((z40) obj).f12888p);
        i41 i41Var2 = l50.f7396a;
        return numValueOf.compareTo(Integer.valueOf(((z40) obj2).f12888p));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i41)) {
            return false;
        }
        Object obj2 = u5.f10822h;
        if (!obj2.equals(obj2)) {
            return false;
        }
        Object obj3 = o51.f8612c;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return Objects.hash(u5.f10822h, o51.f8612c);
    }

    public final String toString() {
        String string = u5.f10822h.toString();
        return t.z.g(new StringBuilder(string.length() + 31), "Ordering.natural().onResultOf(", string, ")");
    }
}
