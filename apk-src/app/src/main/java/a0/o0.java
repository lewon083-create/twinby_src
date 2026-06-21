package a0;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 implements r1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f172c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f171b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f173d = new HashSet();

    public o0(r1 r1Var) {
        this.f172c = r1Var;
    }

    @Override // a0.r1
    public final Image C() {
        return this.f172c.C();
    }

    public final void a(n0 n0Var) {
        synchronized (this.f171b) {
            this.f173d.add(n0Var);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.f172c.close();
        synchronized (this.f171b) {
            hashSet = new HashSet(this.f173d);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).a(this);
        }
    }

    @Override // a0.r1
    public q1[] f() {
        return this.f172c.f();
    }

    @Override // a0.r1
    public final int getFormat() {
        return this.f172c.getFormat();
    }

    @Override // a0.r1
    public int getHeight() {
        return this.f172c.getHeight();
    }

    @Override // a0.r1
    public int getWidth() {
        return this.f172c.getWidth();
    }

    @Override // a0.r1
    public m1 x() {
        return this.f172c.x();
    }
}
