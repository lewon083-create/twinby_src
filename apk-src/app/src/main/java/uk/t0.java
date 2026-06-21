package uk;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t0 extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f34589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(qk.a primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f34589b = new s0(primitiveSerializer.getDescriptor());
    }

    @Override // uk.a
    public final Object a() {
        return (r0) g(j());
    }

    @Override // uk.a
    public final int b(Object obj) {
        r0 r0Var = (r0) obj;
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var.d();
    }

    @Override // uk.a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // uk.a, qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return e(decoder);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return this.f34589b;
    }

    @Override // uk.a
    public final Object h(Object obj) {
        r0 r0Var = (r0) obj;
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var.a();
    }

    @Override // uk.n
    public final void i(int i, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter((r0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(wk.o oVar, Object obj, int i);

    @Override // uk.n, qk.a
    public final void serialize(tk.c encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iD = d(obj);
        s0 descriptor = this.f34589b;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        wk.o oVarA = ((wk.o) encoder).a(descriptor);
        k(oVarA, obj, iD);
        oVarA.w(descriptor);
    }
}
