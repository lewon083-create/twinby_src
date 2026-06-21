package vk;

import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements sk.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij.p f34890a;

    public o(Function0 function0) {
        this.f34890a = ij.h.b(function0);
    }

    @Override // sk.f
    public final String a() {
        return b().a();
    }

    public final sk.f b() {
        return (sk.f) this.f34890a.getValue();
    }

    @Override // sk.f
    public final boolean c() {
        return false;
    }

    @Override // sk.f
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return b().d(name);
    }

    @Override // sk.f
    public final h5 e() {
        return b().e();
    }

    @Override // sk.f
    public final int f() {
        return b().f();
    }

    @Override // sk.f
    public final String g(int i) {
        return b().g(i);
    }

    @Override // sk.f
    public final List getAnnotations() {
        return kotlin.collections.b0.f27475b;
    }

    @Override // sk.f
    public final List h(int i) {
        return b().h(i);
    }

    @Override // sk.f
    public final sk.f i(int i) {
        return b().i(i);
    }

    @Override // sk.f
    public final boolean isInline() {
        return false;
    }

    @Override // sk.f
    public final boolean j(int i) {
        return b().j(i);
    }
}
