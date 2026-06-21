package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vx1 implements hz1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r51 f11524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11525c;

    public vx1(List list, List list2) {
        v41 v41Var = x41.f12018c;
        fs1.y(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        ix.o(list.size() == list2.size());
        int i10 = 0;
        while (i < list.size()) {
            ux1 ux1Var = new ux1((hz1) list.get(i), (List) list2.get(i));
            int length = objArrCopyOf.length;
            int i11 = i10 + 1;
            int iD = s41.d(length, i11);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i10] = ux1Var;
            i++;
            i10 = i11;
        }
        this.f11524b = x41.x(i10, objArrCopyOf);
        this.f11525c = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long e() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            r51 r51Var = this.f11524b;
            if (i >= r51Var.f9715e) {
                break;
            }
            long jE = ((ux1) r51Var.get(i)).f11125b.e();
            if (jE != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jE);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long f() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            r51 r51Var = this.f11524b;
            if (i >= r51Var.f9715e) {
                break;
            }
            ux1 ux1Var = (ux1) r51Var.get(i);
            long jF = ux1Var.f11125b.f();
            x41 x41Var = ux1Var.f11126c;
            if ((x41Var.contains(1) || x41Var.contains(2) || x41Var.contains(4)) && jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
            if (jF != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jF);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f11525c = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f11525c;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean j(yt1 yt1Var) {
        boolean zJ;
        boolean z5 = false;
        do {
            long jE = e();
            if (jE == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zJ = false;
            while (true) {
                r51 r51Var = this.f11524b;
                if (i >= r51Var.f9715e) {
                    break;
                }
                long jE2 = ((ux1) r51Var.get(i)).f11125b.e();
                boolean z10 = jE2 != Long.MIN_VALUE && jE2 <= yt1Var.f12742a;
                if (jE2 == jE || z10) {
                    zJ |= ((ux1) r51Var.get(i)).f11125b.j(yt1Var);
                }
                i++;
            }
            z5 |= zJ;
        } while (zJ);
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final void n(long j10) {
        int i = 0;
        while (true) {
            r51 r51Var = this.f11524b;
            if (i >= r51Var.f9715e) {
                return;
            }
            ((ux1) r51Var.get(i)).n(j10);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean q() {
        int i = 0;
        while (true) {
            r51 r51Var = this.f11524b;
            if (i >= r51Var.f9715e) {
                return false;
            }
            if (((ux1) r51Var.get(i)).f11125b.q()) {
                return true;
            }
            i++;
        }
    }
}
