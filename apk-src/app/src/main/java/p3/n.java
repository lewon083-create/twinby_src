package p3;

import java.util.Map;
import yads.qd0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements zc.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31190b;

    public /* synthetic */ n(int i) {
        this.f31190b = i;
    }

    @Override // zc.g
    public final boolean apply(Object obj) {
        switch (this.f31190b) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            case 1:
                return ((String) obj) != null;
            case 2:
                return qd0.a((Map.Entry) obj);
            default:
                return qd0.a((String) obj);
        }
    }
}
