package k9;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.jo;
import com.google.android.gms.internal.ads.wm;
import pa.c0;
import q9.a3;
import q9.b3;
import q9.h0;
import q9.p2;
import q9.q2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f27256b;

    public d(Context context, String str) {
        c0.j(context, "context cannot be null");
        q9.o oVar = q9.r.f31959g.f31961b;
        fr frVar = new fr();
        oVar.getClass();
        h0 h0Var = (h0) new q9.k(oVar, context, str, frVar).d(context, false);
        this.f27255a = context;
        this.f27256b = h0Var;
    }

    public final e a() {
        Context context = this.f27255a;
        try {
            return new e(context, this.f27256b.i());
        } catch (RemoteException e3) {
            u9.i.f("Failed to build AdLoader.", e3);
            return new e(context, new p2(new q2()));
        }
    }

    public final void b(z9.a aVar) {
        try {
            this.f27256b.P0(new jo(1, aVar));
        } catch (RemoteException e3) {
            u9.i.i("Failed to add google native ad listener", e3);
        }
    }

    public final void c(c cVar) {
        try {
            this.f27256b.x3(new a3(cVar));
        } catch (RemoteException e3) {
            u9.i.i("Failed to set AdListener.", e3);
        }
    }

    public final void d(z9.b bVar) {
        try {
            h0 h0Var = this.f27256b;
            boolean z5 = bVar.f46211a;
            boolean z10 = bVar.f46213c;
            int i = bVar.f46214d;
            u uVar = bVar.f46215e;
            h0Var.H2(new wm(4, z5, -1, z10, i, uVar != null ? new b3(uVar) : null, bVar.f46216f, bVar.f46212b, bVar.f46218h, bVar.f46217g, bVar.i - 1));
        } catch (RemoteException e3) {
            u9.i.i("Failed to specify native ad options", e3);
        }
    }
}
