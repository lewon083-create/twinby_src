package d2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15539b;

    @Override // f2.a
    public final void accept(Object obj) {
        switch (this.f15538a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((a1.e) this.f15539b).S(fVar);
                return;
            case 1:
                f fVar2 = (f) obj;
                synchronized (g.f15544c) {
                    try {
                        h1.i iVar = g.f15545d;
                        ArrayList arrayList = (ArrayList) iVar.get((String) this.f15539b);
                        if (arrayList == null) {
                            return;
                        }
                        iVar.remove((String) this.f15539b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((f2.a) arrayList.get(i)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
            default:
                Intrinsics.c((f2.a) this.f15539b, "Listener is not set.");
                ((f2.a) this.f15539b).accept(obj);
                return;
        }
    }

    public /* synthetic */ e(int i, Object obj) {
        this.f15538a = i;
        this.f15539b = obj;
    }
}
