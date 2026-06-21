package o5;

import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayDeque;
import k6.t0;
import m3.z;
import ni.x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements n5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f29771a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f29772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f29773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f29774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f29775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f29776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f29777g;

    public h() {
        for (int i = 0; i < 10; i++) {
            this.f29771a.add(new g(1));
        }
        this.f29772b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f29772b;
            x0 x0Var = new x0(21, this);
            n5.d dVar = new n5.d();
            dVar.i = x0Var;
            arrayDeque.add(dVar);
        }
        this.f29773c = new ArrayDeque();
        this.f29777g = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // r3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n5.j r7) {
        /*
            r6 = this;
            o5.g r0 = r6.f29774d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.gms.internal.measurement.h5.h(r0)
            o5.g r7 = (o5.g) r7
            r0 = 4
            boolean r0 = r7.c(r0)
            if (r0 != 0) goto L33
            long r0 = r7.f32194h
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L33
            long r2 = r6.f29777g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L33
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L33
            r7.r()
            java.util.ArrayDeque r0 = r6.f29771a
            r0.add(r7)
            goto L41
        L33:
            long r0 = r6.f29776f
            r2 = 1
            long r2 = r2 + r0
            r6.f29776f = r2
            r7.f29770l = r0
            java.util.ArrayDeque r0 = r6.f29773c
            r0.add(r7)
        L41:
            r7 = 0
            r6.f29774d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.h.a(n5.j):void");
    }

    @Override // r3.c
    public final void b(long j10) {
        this.f29777g = j10;
    }

    @Override // n5.f
    public final void c(long j10) {
        this.f29775e = j10;
    }

    @Override // r3.c
    public final Object e() {
        h5.r(this.f29774d == null);
        ArrayDeque arrayDeque = this.f29771a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f29774d = gVar;
        return gVar;
    }

    public abstract t0 f();

    @Override // r3.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f29776f = 0L;
        this.f29775e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f29773c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f29771a;
            if (zIsEmpty) {
                break;
            }
            g gVar = (g) arrayDeque2.poll();
            String str = z.f28608a;
            gVar.r();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f29774d;
        if (gVar2 != null) {
            gVar2.r();
            arrayDeque.add(gVar2);
            this.f29774d = null;
        }
    }

    public abstract void g(g gVar);

    @Override // r3.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public n5.d d() {
        ArrayDeque arrayDeque = this.f29772b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f29773c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            g gVar = (g) arrayDeque2.peek();
            String str = z.f28608a;
            if (gVar.f32194h > this.f29775e) {
                return null;
            }
            g gVar2 = (g) arrayDeque2.poll();
            boolean zC = gVar2.c(4);
            ArrayDeque arrayDeque3 = this.f29771a;
            if (zC) {
                n5.d dVar = (n5.d) arrayDeque.pollFirst();
                dVar.a(4);
                gVar2.r();
                arrayDeque3.add(gVar2);
                return dVar;
            }
            g(gVar2);
            if (i()) {
                t0 t0VarF = f();
                n5.d dVar2 = (n5.d) arrayDeque.pollFirst();
                long j10 = gVar2.f32194h;
                dVar2.f32196d = j10;
                dVar2.f29109f = t0VarF;
                dVar2.f29110g = j10;
                gVar2.r();
                arrayDeque3.add(gVar2);
                return dVar2;
            }
            gVar2.r();
            arrayDeque3.add(gVar2);
        }
    }

    public abstract boolean i();

    @Override // r3.c
    public void release() {
    }
}
