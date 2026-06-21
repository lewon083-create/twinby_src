package ek;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Iterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f16409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Sequence f16410e;

    public i(v vVar) {
        this.f16407b = 1;
        this.f16410e = vVar;
        this.f16409d = vVar.f16424a.iterator();
    }

    public void a() {
        Object objInvoke;
        j jVar = (j) this.f16410e;
        if (this.f16408c == -2) {
            objInvoke = jVar.f16411a.invoke();
        } else {
            Function1 function1 = jVar.f16412b;
            Object obj = this.f16409d;
            Intrinsics.b(obj);
            objInvoke = function1.invoke(obj);
        }
        this.f16409d = objInvoke;
        this.f16408c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f16407b) {
            case 0:
                if (this.f16408c < 0) {
                    a();
                }
                if (this.f16408c == 1) {
                }
                break;
            default:
                v vVar = (v) this.f16410e;
                Iterator it = (Iterator) this.f16409d;
                while (this.f16408c < vVar.f16425b && it.hasNext()) {
                    it.next();
                    this.f16408c++;
                }
                if (this.f16408c >= vVar.f16426c || !it.hasNext()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f16407b) {
            case 0:
                if (this.f16408c < 0) {
                    a();
                }
                if (this.f16408c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f16409d;
                Intrinsics.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f16408c = -1;
                return obj;
            default:
                v vVar = (v) this.f16410e;
                Iterator it = (Iterator) this.f16409d;
                while (this.f16408c < vVar.f16425b && it.hasNext()) {
                    it.next();
                    this.f16408c++;
                }
                int i = this.f16408c;
                if (i >= vVar.f16426c) {
                    throw new NoSuchElementException();
                }
                this.f16408c = i + 1;
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f16407b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(j jVar) {
        this.f16407b = 0;
        this.f16410e = jVar;
        this.f16408c = -2;
    }
}
