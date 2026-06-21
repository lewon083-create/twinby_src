package gl;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends cl.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f20201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20203g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, q qVar, int i, int i10) {
        super(str, true);
        this.f20201e = qVar;
        this.f20202f = i;
        this.f20203g = i10;
    }

    @Override // cl.a
    public final long a() {
        q qVar = this.f20201e;
        try {
            qVar.f20242x.j(this.f20202f, this.f20203g, true);
            return -1L;
        } catch (IOException e3) {
            qVar.b(e3);
            return -1L;
        }
    }
}
