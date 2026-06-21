package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends f implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f27479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27481d;

    public e(f list, int i, int i10) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f27479b = list;
        this.f27480c = i;
        c cVar = f.Companion;
        int size = list.size();
        cVar.getClass();
        c.d(i, i10, size);
        this.f27481d = i10 - i;
    }

    @Override // kotlin.collections.a
    public final int a() {
        return this.f27481d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        f.Companion.getClass();
        c.b(i, this.f27481d);
        return this.f27479b.get(this.f27480c + i);
    }

    @Override // kotlin.collections.f, java.util.List
    public final List subList(int i, int i10) {
        f.Companion.getClass();
        c.d(i, i10, this.f27481d);
        int i11 = this.f27480c;
        return new e(this.f27479b, i + i11, i11 + i10);
    }
}
