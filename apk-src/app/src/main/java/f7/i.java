package f7;

import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.internal.ads.y50;
import com.google.android.gms.internal.measurement.b4;
import e1.c0;
import java.util.Map;
import jk.p;
import jk.q;
import ni.o1;
import x0.b0;
import x0.s0;
import xh.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements f2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16686b;

    public /* synthetic */ i(int i, Object obj) {
        this.f16685a = i;
        this.f16686b = obj;
    }

    @Override // f2.a
    public final void accept(Object obj) {
        switch (this.f16685a) {
            case 0:
                ((p) ((q) this.f16686b)).i((k) obj);
                break;
            case 1:
                o1 o1Var = (o1) this.f16686b;
                o1Var.f29467a.f29359a.l(new ni.a(3, o1Var, (s0) obj));
                break;
            case 2:
                a0.m mVar = (a0.m) obj;
                for (Map.Entry entry : ((Map) this.f16686b).entrySet()) {
                    int i = mVar.f163b - ((s0.b) entry.getKey()).f32389f;
                    if (((s0.b) entry.getKey()).f32390g) {
                        i = -i;
                    }
                    int iK = i0.q.k(i);
                    q0.m mVar2 = (q0.m) entry.getValue();
                    mVar2.getClass();
                    b4.G(new q0.j(mVar2, iK, -1));
                }
                break;
            case 3:
                ((b0) this.f16686b).K = (Uri) obj;
                break;
            case 4:
                y50 y50Var = (y50) this.f16686b;
                a0.l lVar = (a0.l) obj;
                com.google.android.gms.internal.auth.g.e("VideoEncoderSession", "Surface can be closed: " + lVar.f154b.hashCode());
                Surface surface = lVar.f154b;
                if (surface == ((Surface) y50Var.f12506g)) {
                    y50Var.f12506g = null;
                    ((j1.h) y50Var.f12512n).b((c0) y50Var.f12505f);
                    y50Var.a();
                } else {
                    surface.release();
                }
                break;
            default:
                ((s) this.f16686b).setWindowInfoListenerDisplayFeatures((k) obj);
                break;
        }
    }
}
