package ij;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements g, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f21335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f21336c;

    @Override // ij.g
    public final boolean a() {
        return this.f21336c != b0.f21327a;
    }

    @Override // ij.g
    public final Object getValue() {
        if (this.f21336c == b0.f21327a) {
            Function0 function0 = this.f21335b;
            Intrinsics.b(function0);
            this.f21336c = function0.invoke();
            this.f21335b = null;
        }
        return this.f21336c;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
