package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qk.a f34495a;

    public b0(qk.a aVar) {
        this.f34495a = aVar;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{this.f34495a};
    }

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return o0.f34560b;
    }
}
