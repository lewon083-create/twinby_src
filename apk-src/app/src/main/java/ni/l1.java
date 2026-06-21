package ni;

import com.google.android.gms.internal.measurement.h5;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f29435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29436d;

    public l1(Object obj) {
        this.f29433a = obj;
        ij.k kVar = ij.m.f21341c;
        this.f29434b = obj instanceof ij.l ? null : obj;
        this.f29435c = ij.m.a(obj);
        this.f29436d = obj instanceof ij.l;
    }

    public static final fj.l0 a(Function1 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new fj.l0(result, 1);
    }

    public static final void b(Object callback, Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.k0.b(1, callback);
        ij.k kVar = ij.m.f21341c;
        ((Function1) callback).invoke(new ij.m(h5.s(exception)));
    }

    public static final void c(Object obj, Object callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.k0.b(1, callback);
        ((Function1) callback).invoke(new ij.m(obj));
    }
}
