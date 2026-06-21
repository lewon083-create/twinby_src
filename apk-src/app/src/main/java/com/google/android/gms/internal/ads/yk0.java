package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yk0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yk0 f12649c = new yk0(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12651b;

    static {
        new yk0(0, 0);
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public yk0(int i, int i10) {
        boolean z5 = false;
        if ((i == -1 || i >= 0) && (i10 == -1 || i10 >= 0)) {
            z5 = true;
        }
        ix.o(z5);
        this.f12650a = i;
        this.f12651b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof yk0) {
            yk0 yk0Var = (yk0) obj;
            if (this.f12650a == yk0Var.f12650a && this.f12651b == yk0Var.f12651b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f12650a;
        return ((i >>> 16) | (i << 16)) ^ this.f12651b;
    }

    public final String toString() {
        int i = this.f12650a;
        int length = String.valueOf(i).length();
        int i10 = this.f12651b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(i10).length());
        sb2.append(i);
        sb2.append("x");
        sb2.append(i10);
        return sb2.toString();
    }
}
