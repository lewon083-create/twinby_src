package wl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends ArrayList {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35381b;

    public boolean a() {
        return size() < 0;
    }

    @Override // java.util.ArrayList
    public Object clone() {
        switch (this.f35381b) {
            case 1:
                b0 b0Var = new b0(size(), 1);
                Iterator<E> it = iterator();
                while (it.hasNext()) {
                    b0Var.add(((vl.k) it.next()).clone());
                }
                return b0Var;
            default:
                return super.clone();
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.f35381b) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                Iterator<E> it = iterator();
                while (it.hasNext()) {
                    vl.k kVar = (vl.k) it.next();
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(kVar.p());
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, int i10) {
        super(i);
        this.f35381b = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Collection collection) {
        super(collection);
        this.f35381b = 1;
    }
}
