package yads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wx extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cy f44511b;

    public wx(cy cyVar) {
        this.f44511b = cyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f44511b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapA = this.f44511b.a();
        if (mapA != null) {
            return mapA.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iA = this.f44511b.a(entry.getKey());
            if (iA != -1 && n92.a(this.f44511b.c(iA), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        cy cyVar = this.f44511b;
        Map mapA = cyVar.a();
        return mapA != null ? mapA.entrySet().iterator() : new ux(cyVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int iA;
        Map mapA = this.f44511b.a();
        if (mapA != null) {
            return mapA.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f44511b.c() || (iA = dy.a(entry.getKey(), entry.getValue(), (1 << (this.f44511b.f37552f & 31)) - 1, this.f44511b.f(), this.f44511b.d(), this.f44511b.e(), this.f44511b.g())) == -1) {
            return false;
        }
        this.f44511b.a(iA, i);
        cy cyVar = this.f44511b;
        cyVar.f37553g--;
        cyVar.f37552f += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f44511b.size();
    }
}
