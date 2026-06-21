package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t43 implements u43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o20[] f43180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f43181c;

    public t43(o20[] o20VarArr, long[] jArr) {
        this.f43180b = o20VarArr;
        this.f43181c = jArr;
    }

    @Override // yads.u43
    public final long a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f43181c;
        if (i < jArr.length) {
            return jArr[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.u43
    public final List b(long j10) {
        o20 o20Var;
        int iB = lb3.b(this.f43181c, j10, false);
        return (iB == -1 || (o20Var = this.f43180b[iB]) == o20.f41435s) ? Collections.EMPTY_LIST : Collections.singletonList(o20Var);
    }

    @Override // yads.u43
    public final int a() {
        return this.f43181c.length;
    }

    @Override // yads.u43
    public final int a(long j10) {
        int iA = lb3.a(this.f43181c, j10, false);
        if (iA < this.f43181c.length) {
            return iA;
        }
        return -1;
    }
}
