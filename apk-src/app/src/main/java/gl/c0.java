package gl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f20174b = new int[10];

    public final int a() {
        if ((this.f20173a & 128) != 0) {
            return this.f20174b[7];
        }
        return 65535;
    }

    public final void b(c0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & other.f20173a) != 0) {
                c(i, other.f20174b[i]);
            }
        }
    }

    public final void c(int i, int i10) {
        if (i >= 0) {
            int[] iArr = this.f20174b;
            if (i >= iArr.length) {
                return;
            }
            this.f20173a = (1 << i) | this.f20173a;
            iArr[i] = i10;
        }
    }
}
