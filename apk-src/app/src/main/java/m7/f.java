package m7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l7.n;
import l7.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j0.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f28709g = n.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f28710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f28711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f28712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f28713e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28714f;

    public f(l lVar, List list) {
        this.f28710b = lVar;
        this.f28711c = list;
        this.f28712d = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = ((p) list.get(i)).f28053a.toString();
            this.f28712d.add(string);
            this.f28713e.add(string);
        }
    }

    public static HashSet p0(f fVar) {
        HashSet hashSet = new HashSet();
        fVar.getClass();
        return hashSet;
    }
}
