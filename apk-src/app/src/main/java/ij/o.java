package ij;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements g, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final n f21343d = new n(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21344e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "c");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Function0 f21345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f21346c;

    @Override // ij.g
    public final boolean a() {
        return this.f21346c != b0.f21327a;
    }

    @Override // ij.g
    public final Object getValue() {
        Object obj = this.f21346c;
        b0 b0Var = b0.f21327a;
        if (obj != b0Var) {
            return obj;
        }
        Function0 function0 = this.f21345b;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21344e;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b0Var, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != b0Var) {
                }
            }
            this.f21345b = null;
            return objInvoke;
        }
        return this.f21346c;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
