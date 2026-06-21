package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h31 implements Serializable, g31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6015b;

    @Override // com.google.android.gms.internal.ads.g31
    public final boolean a(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f6015b;
            if (i >= list.size()) {
                return true;
            }
            if (!((g31) list.get(i)).a(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h31) {
            return this.f6015b.equals(((h31) obj).f6015b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6015b.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z5 = true;
        for (Object obj : this.f6015b) {
            if (!z5) {
                sb2.append(',');
            }
            sb2.append(obj);
            z5 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
