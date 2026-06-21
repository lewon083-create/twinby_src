package gl;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends cl.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f20215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f20217h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, q qVar, int i, b bVar, int i10) {
        super(str, true);
        this.f20214e = i10;
        this.f20215f = qVar;
        this.f20216g = i;
        this.f20217h = bVar;
    }

    @Override // cl.a
    public final long a() {
        switch (this.f20214e) {
            case 0:
                b0 b0Var = this.f20215f.f20230l;
                b errorCode = this.f20217h;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                synchronized (this.f20215f) {
                    this.f20215f.f20244z.remove(Integer.valueOf(this.f20216g));
                    Unit unit = Unit.f27471a;
                }
                return -1L;
            default:
                q qVar = this.f20215f;
                try {
                    int i = this.f20216g;
                    b statusCode = this.f20217h;
                    Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                    qVar.f20242x.k(i, statusCode);
                    break;
                } catch (IOException e3) {
                    qVar.b(e3);
                }
                return -1L;
        }
    }
}
