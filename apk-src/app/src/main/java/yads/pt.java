package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class pt implements v43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f42011a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f42012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue f42013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nt f42014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f42016f;

    public pt() {
        for (int i = 0; i < 10; i++) {
            this.f42011a.add(new nt());
        }
        this.f42012b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            this.f42012b.add(new ot(new yi.f0(9, this)));
        }
        this.f42013c = new PriorityQueue();
    }

    public abstract void a(nt ntVar);

    @Override // yads.oa0
    public final Object b() {
        if (this.f42014d != null) {
            throw new IllegalStateException();
        }
        if (this.f42011a.isEmpty()) {
            return null;
        }
        nt ntVar = (nt) this.f42011a.pollFirst();
        this.f42014d = ntVar;
        return ntVar;
    }

    public abstract qt c();

    @Override // yads.oa0
    /* JADX INFO: renamed from: d */
    public a53 a() {
        if (this.f42012b.isEmpty()) {
            return null;
        }
        while (!this.f42013c.isEmpty()) {
            nt ntVar = (nt) this.f42013c.peek();
            int i = lb3.f40466a;
            if (ntVar.f42866f > this.f42015e) {
                break;
            }
            nt ntVar2 = (nt) this.f42013c.poll();
            if (ntVar2.b(4)) {
                a53 a53Var = (a53) this.f42012b.pollFirst();
                a53Var.f43049b = 4 | a53Var.f43049b;
                ntVar2.b();
                this.f42011a.add(ntVar2);
                return a53Var;
            }
            a(ntVar2);
            if (f()) {
                qt qtVarC = c();
                a53 a53Var2 = (a53) this.f42012b.pollFirst();
                long j10 = ntVar2.f42866f;
                a53Var2.f43616c = j10;
                a53Var2.f36636d = qtVarC;
                a53Var2.f36637e = j10;
                ntVar2.b();
                this.f42011a.add(ntVar2);
                return a53Var2;
            }
            ntVar2.b();
            this.f42011a.add(ntVar2);
        }
        return null;
    }

    public final a53 e() {
        return (a53) this.f42012b.pollFirst();
    }

    public abstract boolean f();

    @Override // yads.oa0
    public void flush() {
        this.f42016f = 0L;
        this.f42015e = 0L;
        while (!this.f42013c.isEmpty()) {
            nt ntVar = (nt) this.f42013c.poll();
            int i = lb3.f40466a;
            ntVar.b();
            this.f42011a.add(ntVar);
        }
        nt ntVar2 = this.f42014d;
        if (ntVar2 != null) {
            ntVar2.b();
            this.f42011a.add(ntVar2);
            this.f42014d = null;
        }
    }

    @Override // yads.oa0
    public final void a(z43 z43Var) {
        if (z43Var != this.f42014d) {
            throw new IllegalArgumentException();
        }
        nt ntVar = (nt) z43Var;
        if (ntVar.b(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR)) {
            ntVar.b();
            this.f42011a.add(ntVar);
        } else {
            long j10 = this.f42016f;
            this.f42016f = 1 + j10;
            ntVar.f41348k = j10;
            this.f42013c.add(ntVar);
        }
        this.f42014d = null;
    }

    public final void a(a53 a53Var) {
        a53Var.f43049b = 0;
        a53Var.f36636d = null;
        this.f42012b.add(a53Var);
    }

    @Override // yads.v43
    public final void a(long j10) {
        this.f42015e = j10;
    }

    @Override // yads.oa0
    public void release() {
    }
}
