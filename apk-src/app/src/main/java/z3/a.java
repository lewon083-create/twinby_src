package z3;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.nl0;
import d8.e0;
import java.util.HashMap;
import java.util.List;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f46013b;

    public a(c cVar) {
        this.f46013b = cVar;
    }

    @Override // z3.t
    public final void a() {
        this.f46013b.f46030f.remove(this);
    }

    @Override // z3.t
    public final boolean c(Uri uri, e0 e0Var, boolean z5) {
        b bVar;
        c cVar = this.f46013b;
        HashMap map = cVar.f46029e;
        if (cVar.f46036m == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f46034k;
            String str = z.f28608a;
            List list = oVar.f46133e;
            int i = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                b bVar2 = (b) map.get(((n) list.get(i10)).f46125a);
                if (bVar2 != null && jElapsedRealtime < bVar2.i) {
                    i++;
                }
            }
            nl0 nl0Var = new nl0(1, 0, cVar.f46034k.f46133e.size(), i);
            cVar.f46028d.getClass();
            com.google.android.gms.internal.ads.o oVarD = le.a.d(nl0Var, e0Var);
            if (oVarD != null && oVarD.f8527a == 2 && (bVar = (b) map.get(uri)) != null) {
                return b.a(bVar, oVarD.f8528b);
            }
        }
        return false;
    }
}
