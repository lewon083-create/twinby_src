package m3;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.om0;
import com.google.android.gms.internal.ads.rm0;
import com.google.android.gms.internal.ads.uv1;
import com.google.android.gms.internal.ads.yf0;
import com.google.android.gms.internal.ads.ym0;
import java.util.concurrent.CopyOnWriteArraySet;
import yads.nj0;
import yads.rf1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28571c;

    public /* synthetic */ j(int i, Object obj) {
        this.f28570b = i;
        this.f28571c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f28570b) {
            case 0:
                yf0 yf0Var = (yf0) this.f28571c;
                l lVar = (l) yf0Var.f12612e;
                lVar.getClass();
                for (m mVar : (CopyOnWriteArraySet) yf0Var.f12613f) {
                    if (!mVar.f28575d && mVar.f28574c) {
                        j3.m mVarB = mVar.f28573b.b();
                        mVar.f28573b = new uv1(1);
                        mVar.f28574c = false;
                        lVar.b(mVar.f28572a, mVarB);
                    }
                    v vVar = (v) yf0Var.f12611d;
                    vVar.getClass();
                    if (vVar.f28601a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 1:
                e1.c cVar = (e1.c) this.f28571c;
                cVar.getClass();
                int i = message.what;
                if (i == 1) {
                    ((em0) cVar.f15914g).a();
                    return true;
                }
                if (i == 2) {
                    ((om0) cVar.f15915h).a();
                    return true;
                }
                if (i == 3) {
                    ((rm0) cVar.i).a();
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                ((ym0) cVar.f15916j).a();
                return true;
            case 2:
                return ((nj0) this.f28571c).a(message);
            default:
                return ((rf1) this.f28571c).a(message);
        }
    }
}
