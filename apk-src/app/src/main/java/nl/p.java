package nl;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends kotlin.collections.f implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f29556d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j[] f29557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f29558c;

    public p(j[] jVarArr, int[] iArr) {
        this.f29557b = jVarArr;
        this.f29558c = iArr;
    }

    @Override // kotlin.collections.a
    public final int a() {
        return this.f29557b.length;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f29557b[i];
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}
