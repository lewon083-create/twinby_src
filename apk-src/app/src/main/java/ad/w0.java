package ad;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements zc.p, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f891b;

    public w0() {
        q.d(2, "expectedValuesPerKey");
        this.f891b = 2;
    }

    @Override // zc.p
    public final Object get() {
        return new ArrayList(this.f891b);
    }
}
