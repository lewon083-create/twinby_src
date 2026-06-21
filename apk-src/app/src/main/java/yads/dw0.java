package yads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f37901a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37902b;

    public final dw0 a(int i) {
        if (this.f37902b) {
            throw new IllegalStateException();
        }
        this.f37901a.append(i, true);
        return this;
    }

    public final ew0 a() {
        if (!this.f37902b) {
            this.f37902b = true;
            return new ew0(this.f37901a);
        }
        throw new IllegalStateException();
    }
}
