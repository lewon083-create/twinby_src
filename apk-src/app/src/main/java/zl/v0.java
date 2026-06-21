package zl;

import java.util.Map;
import yads.qg2;
import yads.rd0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v0 implements qg2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46645b;

    public /* synthetic */ v0(int i) {
        this.f46645b = i;
    }

    @Override // yads.qg2
    public final boolean apply(Object obj) {
        switch (this.f46645b) {
            case 0:
                return rd0.a((Map.Entry) obj);
            default:
                return rd0.a((String) obj);
        }
    }
}
