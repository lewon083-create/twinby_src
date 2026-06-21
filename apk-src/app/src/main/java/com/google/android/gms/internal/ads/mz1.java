package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mz1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mz1 f8054d = new mz1(new pi[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r51 f8056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8057c;

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
    }

    public mz1(pi... piVarArr) {
        this.f8056b = x41.w(piVarArr);
        this.f8055a = piVarArr.length;
        int i = 0;
        while (i < this.f8056b.f9715e) {
            int i10 = i + 1;
            int i11 = i10;
            while (true) {
                r51 r51Var = this.f8056b;
                if (i11 < r51Var.f9715e) {
                    if (((pi) r51Var.get(i)).equals(this.f8056b.get(i11))) {
                        rs.H("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i11++;
                }
            }
            i = i10;
        }
    }

    public final pi a(int i) {
        return (pi) this.f8056b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mz1.class != obj.getClass()) {
            return false;
        }
        mz1 mz1Var = (mz1) obj;
        return this.f8055a == mz1Var.f8055a && this.f8056b.equals(mz1Var.f8056b);
    }

    public final int hashCode() {
        int i = this.f8057c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f8056b.hashCode();
        this.f8057c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.f8056b.toString();
    }
}
