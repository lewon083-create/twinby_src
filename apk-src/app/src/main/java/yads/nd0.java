package yads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md0 f41229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f41230b = new AtomicBoolean(false);

    public nd0(md0 md0Var) {
        this.f41229a = md0Var;
    }

    public final nq0 a(Object... objArr) {
        Constructor constructorA;
        synchronized (this.f41230b) {
            if (!this.f41230b.get()) {
                try {
                    constructorA = this.f41229a.a();
                } catch (ClassNotFoundException unused) {
                    this.f41230b.set(true);
                    constructorA = null;
                } catch (Exception e3) {
                    throw new RuntimeException("Error instantiating extension", e3);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (nq0) constructorA.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }
}
