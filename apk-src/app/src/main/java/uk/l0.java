package uk;

import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements sk.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f34544a = new l0();

    @Override // sk.f
    public final String a() {
        return "kotlin.Nothing";
    }

    @Override // sk.f
    public final boolean c() {
        return false;
    }

    @Override // sk.f
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // sk.f
    public final h5 e() {
        return sk.i.f32940e;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // sk.f
    public final int f() {
        return 0;
    }

    @Override // sk.f
    public final String g(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // sk.f
    public final List getAnnotations() {
        return kotlin.collections.b0.f27475b;
    }

    @Override // sk.f
    public final List h(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (sk.i.f32940e.hashCode() * 31) - 1818355776;
    }

    @Override // sk.f
    public final sk.f i(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // sk.f
    public final boolean isInline() {
        return false;
    }

    @Override // sk.f
    public final boolean j(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
