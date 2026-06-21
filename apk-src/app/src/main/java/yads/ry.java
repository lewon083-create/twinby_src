package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import yads.mo;
import yads.v63;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ry extends mo {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f42763h = new HashMap();
    public Handler i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u83 f42764j;

    public an1 a(Object obj, an1 an1Var) {
        return an1Var;
    }

    @Override // yads.mo
    public final void b() {
        for (qy qyVar : this.f42763h.values()) {
            qyVar.f42421a.b(qyVar.f42422b);
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(Object obj, mo moVar, v63 v63Var);

    @Override // yads.mo
    public void d() {
        Iterator it = this.f42763h.values().iterator();
        while (it.hasNext()) {
            ((qy) it.next()).f42421a.d();
        }
    }

    @Override // yads.mo
    public void e() {
        for (qy qyVar : this.f42763h.values()) {
            qyVar.f42421a.c(qyVar.f42422b);
            qyVar.f42421a.a((en1) qyVar.f42423c);
            qyVar.f42421a.a((qk0) qyVar.f42423c);
        }
        this.f42763h.clear();
    }

    @Override // yads.mo
    public final void a() {
        for (qy qyVar : this.f42763h.values()) {
            qyVar.f42421a.a(qyVar.f42422b);
        }
    }

    public final void a(final Object obj, mo moVar) {
        if (!this.f42763h.containsKey(obj)) {
            bn1 bn1Var = new bn1() { // from class: zl.x0
                @Override // yads.bn1
                public final void a(mo moVar2, v63 v63Var) {
                    this.f46655a.a(obj, moVar2, v63Var);
                }
            };
            py pyVar = new py(this, obj);
            this.f42763h.put(obj, new qy(moVar, bn1Var, pyVar));
            Handler handler = this.i;
            handler.getClass();
            moVar.getClass();
            dn1 dn1Var = moVar.f40975c;
            dn1Var.getClass();
            dn1Var.f37847c.add(new cn1(handler, pyVar));
            Handler handler2 = this.i;
            handler2.getClass();
            pk0 pk0Var = moVar.f40976d;
            pk0Var.getClass();
            pk0Var.f41946c.add(new ok0(handler2, pyVar));
            u83 u83Var = this.f42764j;
            af2 af2Var = this.f40979g;
            if (af2Var != null) {
                Looper looperMyLooper = Looper.myLooper();
                Looper looper = moVar.f40977e;
                if (looper != null && looper != looperMyLooper) {
                    throw new IllegalArgumentException();
                }
                moVar.f40979g = af2Var;
                v63 v63Var = moVar.f40978f;
                moVar.f40973a.add(bn1Var);
                if (moVar.f40977e == null) {
                    moVar.f40977e = looperMyLooper;
                    moVar.f40974b.add(bn1Var);
                    moVar.a(u83Var);
                } else if (v63Var != null) {
                    moVar.b(bn1Var);
                    bn1Var.a(moVar, v63Var);
                }
                if (this.f40974b.isEmpty()) {
                    moVar.a(bn1Var);
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException();
    }
}
