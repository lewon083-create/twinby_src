package yads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fy extends hy {
    @Override // yads.hy
    public final int a() {
        return 0;
    }

    @Override // yads.hy
    public final hy b(boolean z5, boolean z10) {
        return a(lq.a(z10, z5));
    }

    public static hy a(int i) {
        return i < 0 ? hy.f39361b : i > 0 ? hy.f39362c : hy.f39360a;
    }

    @Override // yads.hy
    public final hy a(int i, int i10) {
        return a(i < i10 ? -1 : i > i10 ? 1 : 0);
    }

    @Override // yads.hy
    public final hy a(Object obj, Object obj2, Comparator comparator) {
        return a(comparator.compare(obj, obj2));
    }

    @Override // yads.hy
    public final hy a(boolean z5, boolean z10) {
        return a(lq.a(z5, z10));
    }
}
