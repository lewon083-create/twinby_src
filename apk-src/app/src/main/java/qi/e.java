package qi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import m3.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements ge.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f32121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ii.g f32122b;

    public e(f fVar, ii.g gVar) {
        this.f32121a = fVar;
        this.f32122b = gVar;
    }

    @Override // ge.b
    public final void a(ge.a configUpdate) {
        Intrinsics.checkNotNullParameter(configUpdate, "configUpdate");
        this.f32121a.f32125d.post(new c0(19, this.f32122b, new ArrayList(configUpdate.f20118a)));
    }

    @Override // ge.b
    public final void b(ge.g error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f32122b.a("firebase_remote_config", error.getMessage());
    }
}
