package g2;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Iterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewGroup f19913c;

    public r0(ViewGroup viewGroup) {
        this.f19913c = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19912b < this.f19913c.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup = this.f19913c;
        int i = this.f19912b;
        this.f19912b = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.f19913c;
        int i = this.f19912b - 1;
        this.f19912b = i;
        viewGroup.removeViewAt(i);
    }
}
