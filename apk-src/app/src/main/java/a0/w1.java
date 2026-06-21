package a0;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements g0.k1, n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1 f251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i4 f255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g0.j1 f256h;
    public Executor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LongSparseArray f257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LongSparseArray f258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f261n;

    public w1(int i, int i10, int i11, int i12) {
        i4 i4Var = new i4(ImageReader.newInstance(i, i10, i11, i12));
        this.f250b = new Object();
        this.f251c = new v1(0, this);
        this.f252d = 0;
        this.f253e = new a0(1, this);
        this.f254f = false;
        this.f257j = new LongSparseArray();
        this.f258k = new LongSparseArray();
        this.f261n = new ArrayList();
        this.f255g = i4Var;
        this.f259l = 0;
        this.f260m = new ArrayList(q());
    }

    @Override // a0.n0
    public final void a(o0 o0Var) {
        synchronized (this.f250b) {
            b(o0Var);
        }
    }

    @Override // g0.k1
    public final r1 acquireLatestImage() {
        synchronized (this.f250b) {
            try {
                if (this.f260m.isEmpty()) {
                    return null;
                }
                if (this.f259l >= this.f260m.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f260m.size() - 1; i++) {
                    if (!this.f261n.contains(this.f260m.get(i))) {
                        arrayList.add((r1) this.f260m.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((r1) it.next()).close();
                }
                int size = this.f260m.size();
                ArrayList arrayList2 = this.f260m;
                this.f259l = size;
                r1 r1Var = (r1) arrayList2.get(size - 1);
                this.f261n.add(r1Var);
                return r1Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(o0 o0Var) {
        synchronized (this.f250b) {
            try {
                int iIndexOf = this.f260m.indexOf(o0Var);
                if (iIndexOf >= 0) {
                    this.f260m.remove(iIndexOf);
                    int i = this.f259l;
                    if (iIndexOf <= i) {
                        this.f259l = i - 1;
                    }
                }
                this.f261n.remove(o0Var);
                if (this.f252d > 0) {
                    f(this.f255g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.k1
    public final void c(g0.j1 j1Var, Executor executor) {
        synchronized (this.f250b) {
            j1Var.getClass();
            this.f256h = j1Var;
            executor.getClass();
            this.i = executor;
            this.f255g.c(this.f253e, executor);
        }
    }

    @Override // g0.k1
    public final void close() {
        synchronized (this.f250b) {
            try {
                if (this.f254f) {
                    return;
                }
                Iterator it = new ArrayList(this.f260m).iterator();
                while (it.hasNext()) {
                    ((r1) it.next()).close();
                }
                this.f260m.clear();
                this.f255g.close();
                this.f254f = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(g2 g2Var) {
        g0.j1 j1Var;
        Executor executor;
        synchronized (this.f250b) {
            try {
                if (this.f260m.size() < q()) {
                    g2Var.a(this);
                    this.f260m.add(g2Var);
                    j1Var = this.f256h;
                    executor = this.i;
                } else {
                    com.google.android.gms.internal.auth.g.e("TAG", "Maximum image number reached.");
                    g2Var.close();
                    j1Var = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (j1Var != null) {
            if (executor != null) {
                executor.execute(new d(3, this, j1Var));
            } else {
                j1Var.a(this);
            }
        }
    }

    @Override // g0.k1
    public final int e() {
        int iE;
        synchronized (this.f250b) {
            iE = this.f255g.e();
        }
        return iE;
    }

    public final void f(g0.k1 k1Var) {
        r1 r1VarR;
        synchronized (this.f250b) {
            try {
                if (this.f254f) {
                    return;
                }
                int size = this.f258k.size() + this.f260m.size();
                if (size >= k1Var.q()) {
                    com.google.android.gms.internal.auth.g.e("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        r1VarR = k1Var.r();
                        if (r1VarR != null) {
                            this.f252d--;
                            size++;
                            this.f258k.put(r1VarR.x().getTimestamp(), r1VarR);
                            g();
                        }
                    } catch (IllegalStateException e3) {
                        com.google.android.gms.internal.auth.g.f("MetadataImageReader", "Failed to acquire next image.", e3);
                        r1VarR = null;
                    }
                    if (r1VarR == null || this.f252d <= 0) {
                        break;
                    }
                } while (size < k1Var.q());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        synchronized (this.f250b) {
            try {
                for (int size = this.f257j.size() - 1; size >= 0; size--) {
                    m1 m1Var = (m1) this.f257j.valueAt(size);
                    long timestamp = m1Var.getTimestamp();
                    r1 r1Var = (r1) this.f258k.get(timestamp);
                    if (r1Var != null) {
                        this.f258k.remove(timestamp);
                        this.f257j.removeAt(size);
                        d(new g2(r1Var, null, m1Var));
                    }
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.k1
    public final int getHeight() {
        int height;
        synchronized (this.f250b) {
            height = this.f255g.getHeight();
        }
        return height;
    }

    @Override // g0.k1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f250b) {
            surface = this.f255g.getSurface();
        }
        return surface;
    }

    @Override // g0.k1
    public final int getWidth() {
        int width;
        synchronized (this.f250b) {
            width = this.f255g.getWidth();
        }
        return width;
    }

    @Override // g0.k1
    public final void h() {
        synchronized (this.f250b) {
            this.f255g.h();
            this.f256h = null;
            this.i = null;
            this.f252d = 0;
        }
    }

    public final void i() {
        synchronized (this.f250b) {
            try {
                if (this.f258k.size() != 0 && this.f257j.size() != 0) {
                    long jKeyAt = this.f258k.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f257j.keyAt(0);
                    f2.g.b(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f258k.size() - 1; size >= 0; size--) {
                            if (this.f258k.keyAt(size) < jKeyAt2) {
                                ((r1) this.f258k.valueAt(size)).close();
                                this.f258k.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f257j.size() - 1; size2 >= 0; size2--) {
                            if (this.f257j.keyAt(size2) < jKeyAt) {
                                this.f257j.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // g0.k1
    public final int q() {
        int iQ;
        synchronized (this.f250b) {
            iQ = this.f255g.q();
        }
        return iQ;
    }

    @Override // g0.k1
    public final r1 r() {
        synchronized (this.f250b) {
            try {
                if (this.f260m.isEmpty()) {
                    return null;
                }
                if (this.f259l >= this.f260m.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.f260m;
                int i = this.f259l;
                this.f259l = i + 1;
                r1 r1Var = (r1) arrayList.get(i);
                this.f261n.add(r1Var);
                return r1Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
