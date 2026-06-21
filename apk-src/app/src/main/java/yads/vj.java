package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vj extends xj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f44062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f44063d;

    public vj(int i, long j10) {
        super(i);
        this.f44061b = j10;
        this.f44062c = new ArrayList();
        this.f44063d = new ArrayList();
    }

    public final vj b(int i) {
        int size = this.f44063d.size();
        for (int i10 = 0; i10 < size; i10++) {
            vj vjVar = (vj) this.f44063d.get(i10);
            if (vjVar.f44730a == i) {
                return vjVar;
            }
        }
        return null;
    }

    public final wj c(int i) {
        int size = this.f44062c.size();
        for (int i10 = 0; i10 < size; i10++) {
            wj wjVar = (wj) this.f44062c.get(i10);
            if (wjVar.f44730a == i) {
                return wjVar;
            }
        }
        return null;
    }

    @Override // yads.xj
    public final String toString() {
        return xj.a(this.f44730a) + " leaves: " + Arrays.toString(this.f44062c.toArray()) + " containers: " + Arrays.toString(this.f44063d.toArray());
    }
}
