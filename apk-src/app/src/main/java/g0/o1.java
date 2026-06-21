package g0;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19704b;

    public /* synthetic */ o1(int i, Object obj) {
        this.f19703a = i;
        this.f19704b = obj;
    }

    @Override // androidx.lifecycle.e0
    public final void a(Object obj) {
        HashMap map;
        switch (this.f19703a) {
            case 0:
                bb.e eVar = (bb.e) this.f19704b;
                p1 p1Var = (p1) obj;
                synchronized (((HashMap) eVar.f2020d)) {
                    map = new HashMap((HashMap) eVar.f2020d);
                    break;
                }
                for (Map.Entry entry : map.entrySet()) {
                    ((Executor) entry.getValue()).execute(new e1.y(22, entry, p1Var));
                }
                return;
            default:
                ((ek.o) this.f19704b).invoke(obj);
                return;
        }
    }
}
