package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c0 extends e implements dk.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27505b;

    public c0() {
        this.f27505b = false;
    }

    @Override // kotlin.jvm.internal.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dk.i getReflected() {
        if (this.f27505b) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (dk.i) super.getReflected();
    }

    @Override // kotlin.jvm.internal.e
    public final dk.b compute() {
        return this.f27505b ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return getOwner().equals(c0Var.getOwner()) && getName().equals(c0Var.getName()) && getSignature().equals(c0Var.getSignature()) && Intrinsics.a(getBoundReceiver(), c0Var.getBoundReceiver());
        }
        if (obj instanceof dk.i) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        dk.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public c0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f27505b = (i & 2) == 2;
    }
}
