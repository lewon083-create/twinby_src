package ek;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16420b;

    public /* synthetic */ p(int i, Object obj) {
        this.f16419a = i;
        this.f16420b = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f16419a) {
            case 0:
                return (Iterator) this.f16420b;
            case 1:
                return kotlin.jvm.internal.j.a((Object[]) this.f16420b);
            case 2:
                return ((Iterable) this.f16420b).iterator();
            case 3:
                return new kotlin.text.k((CharSequence) this.f16420b);
            default:
                return new tj.n(this);
        }
    }

    public p(BufferedReader reader) {
        this.f16419a = 4;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f16420b = reader;
    }
}
