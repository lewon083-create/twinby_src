package yads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i23 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iz f39415c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f39414b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39413a = -1;

    public i23(iz izVar) {
        this.f39415c = izVar;
    }

    public final void a(int i) {
        for (int size = this.f39414b.size() - 1; size >= 0 && i < this.f39414b.keyAt(size); size--) {
            this.f39415c.accept(this.f39414b.valueAt(size));
            this.f39414b.removeAt(size);
        }
        this.f39413a = this.f39414b.size() > 0 ? Math.min(this.f39413a, this.f39414b.size() - 1) : -1;
    }

    public final void b(int i) {
        int i10 = 0;
        while (i10 < this.f39414b.size() - 1) {
            int i11 = i10 + 1;
            if (i < this.f39414b.keyAt(i11)) {
                return;
            }
            this.f39415c.accept(this.f39414b.valueAt(i10));
            this.f39414b.removeAt(i10);
            int i12 = this.f39413a;
            if (i12 > 0) {
                this.f39413a = i12 - 1;
            }
            i10 = i11;
        }
    }

    public final Object c(int i) {
        if (this.f39413a == -1) {
            this.f39413a = 0;
        }
        while (true) {
            int i10 = this.f39413a;
            if (i10 <= 0 || i >= this.f39414b.keyAt(i10)) {
                break;
            }
            this.f39413a--;
        }
        while (this.f39413a < this.f39414b.size() - 1 && i >= this.f39414b.keyAt(this.f39413a + 1)) {
            this.f39413a++;
        }
        return this.f39414b.valueAt(this.f39413a);
    }
}
