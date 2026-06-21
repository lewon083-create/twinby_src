package k4;

import ad.a0;
import ad.b1;
import ad.g0;
import ad.h0;
import ad.j0;
import ad.p;
import ad.z0;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f26888b = new a0(new p(new jf.a(21), z0.f899c), new p(new jf.a(22), z0.f900d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26889a = new ArrayList();

    @Override // k4.a
    public final long a(long j10) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f26889a;
            if (i >= arrayList.size()) {
                break;
            }
            long j11 = ((n5.a) arrayList.get(i)).f29102b;
            long j12 = ((n5.a) arrayList.get(i)).f29104d;
            if (j10 < j11) {
                jMin = jMin == -9223372036854775807L ? j11 : Math.min(jMin, j11);
            } else {
                if (j10 < j12) {
                    jMin = jMin == -9223372036854775807L ? j12 : Math.min(jMin, j12);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // k4.a
    public final j0 b(long j10) {
        ArrayList arrayList = this.f26889a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((n5.a) arrayList.get(0)).f29102b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    n5.a aVar = (n5.a) arrayList.get(i);
                    if (j10 >= aVar.f29102b && j10 < aVar.f29104d) {
                        arrayList2.add(aVar);
                    }
                    if (j10 < aVar.f29102b) {
                        break;
                    }
                }
                b1 b1VarZ = j0.z(f26888b, arrayList2);
                g0 g0VarQ = j0.q();
                for (int i10 = 0; i10 < b1VarZ.f770e; i10++) {
                    g0VarQ.d(((n5.a) b1VarZ.get(i10)).f29101a);
                }
                return g0VarQ.g();
            }
        }
        h0 h0Var = j0.f818c;
        return b1.f768f;
    }

    @Override // k4.a
    public final long c(long j10) {
        ArrayList arrayList = this.f26889a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((n5.a) arrayList.get(0)).f29102b) {
            return -9223372036854775807L;
        }
        long jMax = ((n5.a) arrayList.get(0)).f29102b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j11 = ((n5.a) arrayList.get(i)).f29102b;
            long j12 = ((n5.a) arrayList.get(i)).f29104d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // k4.a
    public final void clear() {
        this.f26889a.clear();
    }

    @Override // k4.a
    public final boolean d(n5.a aVar, long j10) {
        long j11 = aVar.f29102b;
        h5.h(j11 != -9223372036854775807L);
        h5.h(aVar.f29103c != -9223372036854775807L);
        boolean z5 = j11 <= j10 && j10 < aVar.f29104d;
        ArrayList arrayList = this.f26889a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((n5.a) arrayList.get(size)).f29102b) {
                arrayList.add(size + 1, aVar);
                return z5;
            }
        }
        arrayList.add(0, aVar);
        return z5;
    }

    @Override // k4.a
    public final void e(long j10) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f26889a;
            if (i >= arrayList.size()) {
                return;
            }
            long j11 = ((n5.a) arrayList.get(i)).f29102b;
            if (j10 > j11 && j10 > ((n5.a) arrayList.get(i)).f29104d) {
                arrayList.remove(i);
                i--;
            } else if (j10 < j11) {
                return;
            }
            i++;
        }
    }
}
