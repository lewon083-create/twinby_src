package yads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ew0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f38269a;

    public ew0(SparseBooleanArray sparseBooleanArray) {
        this.f38269a = sparseBooleanArray;
    }

    public final int a(int i) {
        ni.a(i, this.f38269a.size());
        return this.f38269a.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew0)) {
            return false;
        }
        ew0 ew0Var = (ew0) obj;
        if (lb3.f40466a >= 24) {
            return this.f38269a.equals(ew0Var.f38269a);
        }
        if (this.f38269a.size() != ew0Var.f38269a.size()) {
            return false;
        }
        for (int i = 0; i < this.f38269a.size(); i++) {
            if (a(i) != ew0Var.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (lb3.f40466a >= 24) {
            return this.f38269a.hashCode();
        }
        int size = this.f38269a.size();
        for (int i = 0; i < this.f38269a.size(); i++) {
            size = (size * 31) + a(i);
        }
        return size;
    }

    public final int a() {
        return this.f38269a.size();
    }
}
