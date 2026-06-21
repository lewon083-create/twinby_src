package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u90 extends ba0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90() {
        super(0);
        t90 t90Var = t90.f43245b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u90)) {
            return false;
        }
        t90 t90Var = t90.f43245b;
        return true;
    }

    public final int hashCode() {
        return t90.f43245b.hashCode() - 120198036;
    }

    public final String toString() {
        return "Button(text=Enable Test mode, actionType=" + t90.f43245b + ")";
    }
}
