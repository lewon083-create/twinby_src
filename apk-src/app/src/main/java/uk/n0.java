package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qk.a f34553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f34554b;

    public n0(qk.a serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f34553a = serializer;
        this.f34554b = new w0(serializer.getDescriptor());
    }

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder.p()) {
            return decoder.w(this.f34553a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && n0.class == obj.getClass() && Intrinsics.a(this.f34553a, ((n0) obj).f34553a);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return this.f34554b;
    }

    public final int hashCode() {
        return this.f34553a.hashCode();
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj != null) {
            encoder.m(this.f34553a, obj);
        } else {
            encoder.c();
        }
    }
}
