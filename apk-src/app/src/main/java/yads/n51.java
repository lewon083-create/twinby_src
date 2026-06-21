package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n51 extends j51 {
    public final n51 a(Object obj) {
        obj.getClass();
        a(this.f39729b + 1);
        Object[] objArr = this.f39728a;
        int i = this.f39729b;
        this.f39729b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n51 a(List list) {
        if (list instanceof Collection) {
            a(list.size() + this.f39729b);
            if (list instanceof l51) {
                this.f39729b = ((l51) list).a(this.f39729b, this.f39728a);
                return this;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public final um2 a() {
        this.f39730c = true;
        return r51.b(this.f39729b, this.f39728a);
    }
}
