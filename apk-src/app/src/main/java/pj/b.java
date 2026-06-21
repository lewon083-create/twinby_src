package pj;

import java.io.Serializable;
import kotlin.collections.c;
import kotlin.collections.f;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends f implements a, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Enum[] f31504b;

    public b(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f31504b = entries;
    }

    @Override // kotlin.collections.a
    public final int a() {
        return this.f31504b.length;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) p.o(element.ordinal(), this.f31504b)) == element;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c cVar = f.Companion;
        Enum[] enumArr = this.f31504b;
        int length = enumArr.length;
        cVar.getClass();
        c.b(i, length);
        return enumArr[i];
    }

    @Override // kotlin.collections.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) p.o(iOrdinal, this.f31504b)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) p.o(iOrdinal, this.f31504b)) == element) {
            return iOrdinal;
        }
        return -1;
    }
}
