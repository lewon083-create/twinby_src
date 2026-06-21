package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o extends e implements n, dk.e {
    private final int arity;
    private final int flags;

    public o(int i, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.e
    public dk.b computeReflected() {
        g0.f27511a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return getName().equals(oVar.getName()) && getSignature().equals(oVar.getSignature()) && this.flags == oVar.flags && this.arity == oVar.arity && Intrinsics.a(getBoundReceiver(), oVar.getBoundReceiver()) && Intrinsics.a(getOwner(), oVar.getOwner());
        }
        if (obj instanceof dk.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // dk.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // dk.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // dk.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // dk.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // dk.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        dk.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.e
    public dk.e getReflected() {
        return (dk.e) super.getReflected();
    }
}
