package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq1 f36967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f36968b;

    public /* synthetic */ b92(zo1 zo1Var) {
        this(new xq1(zo1Var));
    }

    public final Object a(Context context, d03 d03Var, List list, mj.a aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        ep epVar = new ep();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ep epVar2 = epVar;
            this.f36967a.a(context, d03Var, (sq1) it.next(), epVar2, new com.google.firebase.messaging.o(this, countDownLatch, arrayList, 18));
            epVar = epVar2;
        }
        ok.e eVar = hk.k0.f20682a;
        return hk.c0.t(ok.d.f30722d, new a92(this, countDownLatch, arrayList, epVar, null), aVar);
    }

    public b92(xq1 xq1Var) {
        this.f36967a = xq1Var;
        this.f36968b = new Object();
    }

    public static final void a(b92 b92Var, CountDownLatch countDownLatch, ArrayList arrayList, JSONObject jSONObject) {
        if (jSONObject != null) {
            synchronized (b92Var.f36968b) {
                arrayList.add(jSONObject);
            }
        }
        countDownLatch.countDown();
    }
}
