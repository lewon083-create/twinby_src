package yads;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qx1 implements b53, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42418b;

    public qx1(int i) {
        this.f42418b = kx.a(i, "expectedValuesPerKey");
    }

    @Override // yads.b53
    public final Object get() {
        return new ArrayList(this.f42418b);
    }
}
