package n3;

import com.google.android.gms.internal.ads.kv0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f29040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f29041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f29042f;

    public c(int i, long j10) {
        super(i, 2);
        this.f29040d = j10;
        this.f29041e = new ArrayList();
        this.f29042f = new ArrayList();
    }

    public final c r(int i) {
        ArrayList arrayList = this.f29042f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            if (cVar.f7316c == i) {
                return cVar;
            }
        }
        return null;
    }

    public final d s(int i) {
        ArrayList arrayList = this.f29041e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar.f7316c == i) {
                return dVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final String toString() {
        return kv0.b(this.f7316c) + " leaves: " + Arrays.toString(this.f29041e.toArray()) + " containers: " + Arrays.toString(this.f29042f.toArray());
    }
}
