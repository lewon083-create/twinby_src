package yads;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ed0 implements tc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f38071a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zc0 f38072b;

    public final void a(Exception exc, boolean z5) {
        this.f38072b = null;
        r51 r51VarA = r51.a((Collection) this.f38071a);
        this.f38071a.clear();
        o51 o51VarListIterator = r51VarA.listIterator(0);
        while (o51VarListIterator.hasNext()) {
            zc0 zc0Var = (zc0) o51VarListIterator.next();
            zc0Var.getClass();
            zc0Var.a(z5 ? 1 : 3, exc);
        }
    }
}
