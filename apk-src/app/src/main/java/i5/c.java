package i5;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;
import q4.g;
import q4.s;
import q4.t;
import q4.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f21086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f21087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21089d;

    public c(SparseArray sparseArray, long j10, int i, long j11, long j12) {
        g gVar;
        int i10;
        this.f21087b = sparseArray;
        this.f21088c = j10;
        this.f21089d = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            gVar = null;
        } else {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                b bVar = (b) list.get(i12);
                jArrCopyOf3[i12] = bVar.f21083b;
                jArrCopyOf[i12] = bVar.f21084c;
            }
            while (true) {
                i10 = size - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
                jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
                i11 = i13;
            }
            int i14 = i10;
            while (i14 > 0 && jArrCopyOf3[i14] >= j10) {
                i14--;
            }
            iArrCopyOf[i14] = (int) ((j11 + j12) - jArrCopyOf[i14]);
            jArrCopyOf2[i14] = j10 - jArrCopyOf3[i14];
            if (i14 < i10) {
                m3.b.s("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i15 = i14 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
            }
            gVar = new g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.f21086a = gVar;
    }

    @Override // q4.t
    public final boolean a() {
        List list = (List) this.f21087b.get(this.f21089d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // q4.t
    public final s e(long j10) {
        g gVar = this.f21086a;
        if (gVar != null) {
            return gVar.e(j10);
        }
        u uVar = u.f31763c;
        return new s(uVar, uVar);
    }

    @Override // q4.t
    public final long g() {
        return this.f21088c;
    }
}
