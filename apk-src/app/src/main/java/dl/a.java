package dl;

import com.google.android.gms.internal.ads.gn0;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zk.d0;
import zk.n;
import zk.o;
import zk.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15811a = new a();

    @Override // zk.o
    public final d0 intercept(n chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        el.f chain2 = (el.f) chain;
        g gVar = chain2.f16436a;
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (gVar) {
            if (!gVar.f15845n) {
                throw new IllegalStateException("released");
            }
            if (gVar.f15844m) {
                throw new IllegalStateException("Check failed.");
            }
            if (gVar.f15843l) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f27471a;
        }
        d dVar = gVar.f15840h;
        Intrinsics.b(dVar);
        u client = gVar.f15834b;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        try {
            gn0 gn0Var = new gn0(gVar, dVar, dVar.c(chain2.f16441f, chain2.f16442g, chain2.f16443h, client.f46480g, !Intrinsics.a(chain2.f16440e.f46512b, "GET")).j(client, chain2));
            gVar.f15842k = gn0Var;
            gVar.f15847p = gn0Var;
            synchronized (gVar) {
                gVar.f15843l = true;
                gVar.f15844m = true;
            }
            if (gVar.f15846o) {
                throw new IOException("Canceled");
            }
            return el.f.a(chain2, 0, gn0Var, null, 61).b(chain2.f16440e);
        } catch (l e3) {
            dVar.e(e3.f15876c);
            throw e3;
        } catch (IOException e7) {
            dVar.e(e7);
            throw new l(e7);
        }
    }
}
