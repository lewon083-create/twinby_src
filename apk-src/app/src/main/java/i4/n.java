package i4;

import com.google.android.gms.internal.measurement.h5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ad.b1 f20960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20961c;

    public n(List list, List list2) {
        ad.g0 g0VarQ = ad.j0.q();
        h5.h(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            g0VarQ.b(new m((d1) list.get(i), (List) list2.get(i)));
        }
        this.f20960b = g0VarQ.g();
        this.f20961c = -9223372036854775807L;
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ad.b1 b1Var = this.f20960b;
            if (i >= b1Var.f770e) {
                break;
            }
            m mVar = (m) b1Var.get(i);
            long bufferedPositionUs = mVar.f20956b.getBufferedPositionUs();
            ad.j0 j0Var = mVar.f20957c;
            if ((j0Var.contains(1) || j0Var.contains(2) || j0Var.contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f20961c = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f20961c;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ad.b1 b1Var = this.f20960b;
            if (i >= b1Var.f770e) {
                break;
            }
            long nextLoadPositionUs = ((m) b1Var.get(i)).f20956b.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // i4.d1
    public final boolean isLoading() {
        int i = 0;
        while (true) {
            ad.b1 b1Var = this.f20960b;
            if (i >= b1Var.f770e) {
                return false;
            }
            if (((m) b1Var.get(i)).f20956b.isLoading()) {
                return true;
            }
            i++;
        }
    }

    @Override // i4.d1
    public final boolean l(s3.h0 h0Var) {
        boolean zL;
        boolean z5 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z5;
            }
            int i = 0;
            zL = false;
            while (true) {
                ad.b1 b1Var = this.f20960b;
                if (i >= b1Var.f770e) {
                    break;
                }
                long nextLoadPositionUs2 = ((m) b1Var.get(i)).f20956b.getNextLoadPositionUs();
                boolean z10 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= h0Var.f32550a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z10) {
                    zL |= ((m) b1Var.get(i)).f20956b.l(h0Var);
                }
                i++;
            }
            z5 |= zL;
        } while (zL);
        return z5;
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
        int i = 0;
        while (true) {
            ad.b1 b1Var = this.f20960b;
            if (i >= b1Var.f770e) {
                return;
            }
            ((m) b1Var.get(i)).reevaluateBuffer(j10);
            i++;
        }
    }
}
