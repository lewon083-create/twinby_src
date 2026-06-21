package dl;

import com.google.android.gms.internal.ads.gn0;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends nl.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f15833m;

    public f(g gVar) {
        this.f15833m = gVar;
    }

    @Override // nl.e
    public final void j() {
        Socket socket;
        g call = this.f15833m;
        if (call.f15846o) {
            return;
        }
        call.f15846o = true;
        gn0 gn0Var = call.f15847p;
        if (gn0Var != null) {
            ((el.d) gn0Var.f5877f).cancel();
        }
        j jVar = call.f15848q;
        if (jVar != null && (socket = jVar.f15854c) != null) {
            al.b.d(socket);
        }
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
