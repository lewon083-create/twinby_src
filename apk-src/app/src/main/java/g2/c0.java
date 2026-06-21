package g2;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f19839e;

    public c0() {
        if (ti.t.f33896c == null) {
            ti.t.f33896c = new ti.t(2);
        }
    }

    public int a(int i) {
        if (i < this.f19838d) {
            return ((ByteBuffer) this.f19839e).getShort(this.f19837c + i);
        }
        return 0;
    }

    public void b() {
        if (((jj.i) this.f19839e).i != this.f19838d) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f19836b;
            jj.i iVar = (jj.i) this.f19839e;
            if (i >= iVar.f26662g || iVar.f26659d[i] >= 0) {
                return;
            } else {
                this.f19836b = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f19837c) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f19837c) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f19836b);
            if (!((Class) this.f19839e).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateB = n0.b(view);
            b bVar = accessibilityDelegateB == null ? null : accessibilityDelegateB instanceof a ? ((a) accessibilityDelegateB).f19827a : new b(accessibilityDelegateB);
            if (bVar == null) {
                bVar = new b();
            }
            n0.k(view, bVar);
            view.setTag(this.f19836b, obj);
            n0.f(view, this.f19838d);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f19836b < ((jj.i) this.f19839e).f26662g;
    }

    public void remove() {
        jj.i iVar = (jj.i) this.f19839e;
        b();
        if (this.f19837c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        iVar.c();
        iVar.l(this.f19837c);
        this.f19837c = -1;
        this.f19838d = iVar.i;
    }
}
