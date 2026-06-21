package ad;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z {
    public static z f(int i) {
        return i < 0 ? z.f897b : i > 0 ? z.f898c : z.f896a;
    }

    @Override // ad.z
    public final z a(int i, int i10) {
        return f(Integer.compare(i, i10));
    }

    @Override // ad.z
    public final z b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // ad.z
    public final z c(boolean z5, boolean z10) {
        return f(Boolean.compare(z5, z10));
    }

    @Override // ad.z
    public final z d(boolean z5, boolean z10) {
        return f(Boolean.compare(z10, z5));
    }

    @Override // ad.z
    public final int e() {
        return 0;
    }
}
