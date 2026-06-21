package tj;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends kotlin.collections.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f33930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f33931c;

    public g(i iVar) {
        this.f33931c = iVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f33930b = arrayDeque;
        File rootFile = iVar.f33933a;
        if (rootFile.isDirectory()) {
            arrayDeque.push(b(rootFile));
        } else if (!rootFile.isFile()) {
            done();
        } else {
            Intrinsics.checkNotNullParameter(rootFile, "rootFile");
            arrayDeque.push(new e(rootFile));
        }
    }

    @Override // kotlin.collections.b
    public final void a() {
        Object obj;
        File fileA;
        while (true) {
            ArrayDeque arrayDeque = this.f33930b;
            h hVar = (h) arrayDeque.peek();
            if (hVar == null) {
                obj = null;
                break;
            }
            fileA = hVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else if (fileA.equals(hVar.f33932a) || !fileA.isDirectory() || arrayDeque.size() >= this.f33931c.f33938f) {
                break;
            } else {
                arrayDeque.push(b(fileA));
            }
        }
        obj = fileA;
        if (obj != null) {
            setNext(obj);
        } else {
            done();
        }
    }

    public final c b(File file) {
        int iOrdinal = this.f33931c.f33934b.ordinal();
        if (iOrdinal == 0) {
            return new f(this, file);
        }
        if (iOrdinal == 1) {
            return new d(this, file);
        }
        throw new ij.j();
    }
}
