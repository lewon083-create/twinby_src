package c7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f2240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f2241d;

    public g(Object value, h verificationMode, a logger) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("g", "tag");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f2239b = value;
        this.f2240c = verificationMode;
        this.f2241d = logger;
    }

    @Override // k3.f
    public final Object e() {
        return this.f2239b;
    }

    @Override // k3.f
    public final k3.f y(String message, Function1 condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Object obj = this.f2239b;
        return ((Boolean) condition.invoke(obj)).booleanValue() ? this : new f(obj, message, this.f2241d, this.f2240c);
    }
}
