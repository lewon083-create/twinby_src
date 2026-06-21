package uk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n1 implements qk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f34555b = new n1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f34556a = new v(Unit.f27471a);

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f34556a.deserialize(decoder);
        return Unit.f27471a;
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return this.f34556a.getDescriptor();
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        Unit value = (Unit) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f34556a.serialize(encoder, value);
    }
}
