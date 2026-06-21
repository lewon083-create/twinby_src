package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class no {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final no f8387b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x41 f8388a;

    static {
        v41 v41Var = x41.f12018c;
        f8387b = new no(r51.f9713f);
        String str = cq0.f4293a;
        Integer.toString(0, 36);
    }

    public no(r51 r51Var) {
        this.f8388a = x41.v(r51Var);
    }

    public final boolean a(int i) {
        int i10 = 0;
        while (true) {
            x41 x41Var = this.f8388a;
            if (i10 >= x41Var.size()) {
                return false;
            }
            xn xnVar = (xn) x41Var.get(i10);
            boolean[] zArr = xnVar.f12208e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (!zArr[i11]) {
                    i11++;
                } else if (xnVar.f12205b.f9072c == i) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || no.class != obj.getClass()) {
            return false;
        }
        return this.f8388a.equals(((no) obj).f8388a);
    }

    public final int hashCode() {
        return this.f8388a.hashCode();
    }
}
