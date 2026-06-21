package gl;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends cl.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20210e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f20211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f20213h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i, List list) {
        super(str, true);
        this.f20211f = qVar;
        this.f20212g = i;
        this.f20213h = list;
    }

    @Override // cl.a
    public final long a() {
        switch (this.f20210e) {
            case 0:
                b0 b0Var = this.f20211f.f20230l;
                List responseHeaders = this.f20213h;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                try {
                    this.f20211f.f20242x.k(this.f20212g, b.CANCEL);
                    synchronized (this.f20211f) {
                        this.f20211f.f20244z.remove(Integer.valueOf(this.f20212g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                b0 b0Var2 = this.f20211f.f20230l;
                List requestHeaders = this.f20213h;
                b0Var2.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                try {
                    this.f20211f.f20242x.k(this.f20212g, b.CANCEL);
                    synchronized (this.f20211f) {
                        this.f20211f.f20244z.remove(Integer.valueOf(this.f20212g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i, List list, boolean z5) {
        super(str, true);
        this.f20211f = qVar;
        this.f20212g = i;
        this.f20213h = list;
    }
}
