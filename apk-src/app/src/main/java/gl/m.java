package gl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends cl.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f20206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nl.g f20208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20209h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, q qVar, int i, nl.g gVar, int i10, boolean z5) {
        super(str, true);
        this.f20206e = qVar;
        this.f20207f = i;
        this.f20208g = gVar;
        this.f20209h = i10;
    }

    @Override // cl.a
    public final long a() {
        try {
            b0 b0Var = this.f20206e.f20230l;
            nl.g source = this.f20208g;
            int i = this.f20209h;
            b0Var.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            source.skip(i);
            this.f20206e.f20242x.k(this.f20207f, b.CANCEL);
            synchronized (this.f20206e) {
                this.f20206e.f20244z.remove(Integer.valueOf(this.f20207f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
