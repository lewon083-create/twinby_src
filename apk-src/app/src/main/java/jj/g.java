package jj;

import g2.c0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends c0 implements Iterator, xj.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26651f;

    public g(i map, int i) {
        this.f26651f = i;
        Intrinsics.checkNotNullParameter(map, "map");
        this.f19839e = map;
        this.f19837c = -1;
        this.f19838d = map.i;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f26651f) {
            case 0:
                b();
                int i = this.f19836b;
                i iVar = (i) this.f19839e;
                if (i >= iVar.f26662g) {
                    throw new NoSuchElementException();
                }
                this.f19836b = i + 1;
                this.f19837c = i;
                h hVar = new h(iVar, i);
                e();
                return hVar;
            case 1:
                b();
                int i10 = this.f19836b;
                i iVar2 = (i) this.f19839e;
                if (i10 >= iVar2.f26662g) {
                    throw new NoSuchElementException();
                }
                this.f19836b = i10 + 1;
                this.f19837c = i10;
                Object obj = iVar2.f26657b[i10];
                e();
                return obj;
            default:
                b();
                int i11 = this.f19836b;
                i iVar3 = (i) this.f19839e;
                if (i11 >= iVar3.f26662g) {
                    throw new NoSuchElementException();
                }
                this.f19836b = i11 + 1;
                this.f19837c = i11;
                Object[] objArr = iVar3.f26658c;
                Intrinsics.b(objArr);
                Object obj2 = objArr[this.f19837c];
                e();
                return obj2;
        }
    }
}
