package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f37309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f37310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f37311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d51 f37312d;

    public /* synthetic */ c82(d4 d4Var, v9 v9Var, List list) {
        this(d4Var, v9Var, list, new d51());
    }

    public final boolean a() {
        if (!this.f37309a.f37624m) {
            return false;
        }
        if (!this.f37310b.B) {
            return true;
        }
        Set setA = this.f37312d.a(this.f37311c);
        if (setA.isEmpty()) {
            return false;
        }
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            if (!((w41) it.next()).f44278f) {
                return true;
            }
        }
        return false;
    }

    public c82(d4 d4Var, v9 v9Var, List list, d51 d51Var) {
        this.f37309a = d4Var;
        this.f37310b = v9Var;
        this.f37311c = list;
        this.f37312d = d51Var;
    }
}
