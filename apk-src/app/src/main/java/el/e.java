package el;

import kotlin.jvm.internal.Intrinsics;
import l7.i;
import nl.j;
import zk.d0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    static {
        j jVar = j.f29541e;
        i.f("\"\\");
        i.f("\t ,=");
    }

    public static final boolean a(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        if (Intrinsics.a(d0Var.f46346b.f46512b, "HEAD")) {
            return false;
        }
        int i = d0Var.f46349e;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && al.b.i(d0Var) == -1 && !"chunked".equalsIgnoreCase(d0.a("Transfer-Encoding", d0Var))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fd, code lost:
    
        if (al.b.f1046f.b(r0) == false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(zk.i r36, zk.m r37, zk.k r38) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: el.e.b(zk.i, zk.m, zk.k):void");
    }
}
