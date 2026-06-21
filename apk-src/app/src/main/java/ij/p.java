package ij;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements g, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f21347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f21348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21349d;

    public p(Function0 initializer, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i & 2) != 0 ? null : obj;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f21347b = initializer;
        this.f21348c = b0.f21327a;
        this.f21349d = obj == null ? this : obj;
    }

    @Override // ij.g
    public final boolean a() {
        return this.f21348c != b0.f21327a;
    }

    @Override // ij.g
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f21348c;
        b0 b0Var = b0.f21327a;
        if (obj != b0Var) {
            return obj;
        }
        synchronized (this.f21349d) {
            objInvoke = this.f21348c;
            if (objInvoke == b0Var) {
                Function0 function0 = this.f21347b;
                Intrinsics.b(function0);
                objInvoke = function0.invoke();
                this.f21348c = objInvoke;
                this.f21347b = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
