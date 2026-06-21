package ek;

import androidx.lifecycle.q0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements Iterable, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16422c;

    public /* synthetic */ s(int i, Object obj) {
        this.f16421b = i;
        this.f16422c = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f16421b) {
            case 0:
                return new kotlin.text.b((kotlin.text.c) this.f16422c);
            case 1:
                return new b(kotlin.jvm.internal.j.a((Object[]) ((q0) this.f16422c).f1584c));
            default:
                return new ij.t((uk.u) this.f16422c);
        }
    }

    public s(q0 iteratorFactory) {
        this.f16421b = 1;
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f16422c = iteratorFactory;
    }
}
