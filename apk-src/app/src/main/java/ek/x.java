package ek;

import android.view.View;
import android.view.ViewGroup;
import g2.r0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements Iterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f16429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16430d;

    public x(r0 r0Var) {
        this.f16428b = 1;
        this.f16430d = new ArrayList();
        this.f16429c = r0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f16428b) {
        }
        return this.f16429c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f16428b) {
            case 0:
                return ((y) this.f16430d).f16432b.invoke(this.f16429c.next());
            default:
                Object next = this.f16429c.next();
                ArrayList arrayList = (ArrayList) this.f16430d;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                r0 r0Var = viewGroup != null ? new r0(viewGroup) : null;
                if (r0Var == null || !r0Var.hasNext()) {
                    while (!this.f16429c.hasNext() && !arrayList.isEmpty()) {
                        this.f16429c = (Iterator) CollectionsKt.J(arrayList);
                        kotlin.collections.x.q(arrayList);
                    }
                } else {
                    arrayList.add(this.f16429c);
                    this.f16429c = r0Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f16428b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x(y yVar) {
        this.f16428b = 0;
        this.f16430d = yVar;
        this.f16429c = yVar.f16431a.iterator();
    }
}
