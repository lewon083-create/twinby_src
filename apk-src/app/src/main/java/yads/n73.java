package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n73 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e92 f41184a;

    public n73(e92 e92Var, Looper looper) {
        super(looper);
        this.f41184a = e92Var;
    }

    public final boolean a() {
        return hasMessages(2);
    }

    public final void b() {
        removeMessages(2);
        removeMessages(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Object obj = message.obj;
            Intrinsics.c(obj, "null cannot be cast to non-null type com.monetization.ads.base.impression.tracking.handler.TrackHandler.TrackNoticeObject");
            m73 m73Var = (m73) obj;
            vw1 vw1Var = (vw1) m73Var.f40837a.get();
            if (vw1Var != null) {
                f83 f83Var = m73Var.f40838b;
                za.a(vw1Var.f44203f, f83Var.f38399a, n83.f41196h);
                vw1Var.f44209m.remove(f83Var);
                if (!vw1Var.f44208l && vw1Var.f44209m.isEmpty()) {
                    vw1Var.f44208l = true;
                    f61 f61Var = vw1Var.f44206j;
                    if (f61Var != null) {
                        f61Var.g();
                    }
                }
                e92 e92Var = this.f41184a;
                ty2 ty2Var = m73Var.f40838b.f38402d;
                List listR = CollectionsKt.R(vw1Var.f44209m);
                ArrayList arrayList = new ArrayList(kotlin.collections.t.j(listR, 10));
                Iterator it = listR.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f83) it.next()).f38402d);
                }
                e92Var.a(ty2Var, arrayList, m73Var.f40839c);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        Object obj2 = message.obj;
        Intrinsics.c(obj2, "null cannot be cast to non-null type java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager?>");
        vw1 vw1Var2 = (vw1) ((WeakReference) obj2).get();
        if (vw1Var2 != null) {
            List<f83> listR2 = CollectionsKt.R(vw1Var2.f44209m);
            listR2.size();
            int i10 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            for (f83 f83Var2 : listR2) {
                if (f83Var2.f38401c > i10) {
                    wb3 wb3VarB = vw1Var2.b(f83Var2);
                    if (wb3VarB instanceof ub3) {
                        i10 = f83Var2.f38401c;
                        a(f83Var2, vw1Var2, (ub3) wb3VarB);
                    } else if (wb3VarB instanceof tb3) {
                        f83Var2.f38403e = null;
                        this.f41184a.a(f83Var2.f38402d, (tb3) wb3VarB);
                    }
                } else {
                    a(f83Var2, vw1Var2, new ub3(kotlin.collections.b0.f27475b));
                }
            }
            if (listR2.isEmpty()) {
                return;
            }
            sendMessageDelayed(Message.obtain(this, 2, new WeakReference(vw1Var2)), 200L);
        }
    }

    public final void a(f83 f83Var, vw1 vw1Var, ub3 ub3Var) {
        long jElapsedRealtime;
        Long l10 = f83Var.f38403e;
        if (l10 != null) {
            jElapsedRealtime = l10.longValue();
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            f83Var.f38403e = Long.valueOf(jElapsedRealtime);
        }
        if (SystemClock.elapsedRealtime() - jElapsedRealtime >= f83Var.f38400b) {
            sendMessage(Message.obtain(this, 1, new m73(new WeakReference(vw1Var), f83Var, ub3Var)));
        }
        if (!vw1Var.f44207k) {
            vw1Var.f44207k = true;
            f61 f61Var = vw1Var.f44206j;
            if (f61Var != null) {
                f61Var.c();
            }
        }
        this.f41184a.a(f83Var.f38402d, ub3Var);
    }

    public final void a(h92 h92Var) {
        sendMessage(Message.obtain(this, 2, new WeakReference(h92Var)));
    }
}
