package yads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40973a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f40974b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dn1 f40975c = new dn1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pk0 f40976d = new pk0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f40977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v63 f40978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public af2 f40979g;

    public abstract rm1 a(an1 an1Var, qe qeVar, long j10);

    public void a() {
    }

    public abstract void a(rm1 rm1Var);

    public abstract void a(u83 u83Var);

    public void b() {
    }

    public abstract hm1 c();

    public final void c(bn1 bn1Var) {
        this.f40973a.remove(bn1Var);
        if (!this.f40973a.isEmpty()) {
            a(bn1Var);
            return;
        }
        this.f40977e = null;
        this.f40978f = null;
        this.f40979g = null;
        this.f40974b.clear();
        e();
    }

    public abstract void d();

    public abstract void e();

    public final pk0 a(an1 an1Var) {
        return new pk0(this.f40976d.f41946c, 0, an1Var);
    }

    public final dn1 b(an1 an1Var) {
        return new dn1(this.f40975c.f37847c, 0, an1Var, 0L);
    }

    public final void a(bn1 bn1Var) {
        boolean zIsEmpty = this.f40974b.isEmpty();
        this.f40974b.remove(bn1Var);
        if (zIsEmpty || !this.f40974b.isEmpty()) {
            return;
        }
        a();
    }

    public final void b(bn1 bn1Var) {
        this.f40977e.getClass();
        boolean zIsEmpty = this.f40974b.isEmpty();
        this.f40974b.add(bn1Var);
        if (zIsEmpty) {
            b();
        }
    }

    public final void a(v63 v63Var) {
        this.f40978f = v63Var;
        Iterator it = this.f40973a.iterator();
        while (it.hasNext()) {
            ((bn1) it.next()).a(this, v63Var);
        }
    }

    public final void a(qk0 qk0Var) {
        pk0 pk0Var = this.f40976d;
        for (ok0 ok0Var : pk0Var.f41946c) {
            if (ok0Var.f41553b == qk0Var) {
                pk0Var.f41946c.remove(ok0Var);
            }
        }
    }

    public final void a(en1 en1Var) {
        dn1 dn1Var = this.f40975c;
        for (cn1 cn1Var : dn1Var.f37847c) {
            if (cn1Var.f37444b == en1Var) {
                dn1Var.f37847c.remove(cn1Var);
            }
        }
    }
}
