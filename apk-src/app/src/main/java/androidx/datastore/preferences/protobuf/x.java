package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f1502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f1503c;

    public x(z zVar) {
        this.f1502b = zVar;
        if (zVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f1503c = zVar.i();
    }

    public final z a() {
        z zVarB = b();
        zVarB.getClass();
        if (z.f(zVarB, true)) {
            return zVarB;
        }
        throw new i1();
    }

    public final z b() {
        if (!this.f1503c.g()) {
            return this.f1503c;
        }
        z zVar = this.f1503c;
        zVar.getClass();
        z0 z0Var = z0.f1519c;
        z0Var.getClass();
        z0Var.a(zVar.getClass()).c(zVar);
        zVar.h();
        return this.f1503c;
    }

    public final void c() {
        if (this.f1503c.g()) {
            return;
        }
        z zVarI = this.f1502b.i();
        z zVar = this.f1503c;
        z0 z0Var = z0.f1519c;
        z0Var.getClass();
        z0Var.a(zVarI.getClass()).a(zVarI, zVar);
        this.f1503c = zVarI;
    }

    public final Object clone() {
        x xVar = (x) this.f1502b.c(5);
        xVar.f1503c = b();
        return xVar;
    }
}
