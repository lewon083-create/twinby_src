package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mc f9815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gk0 f9816b = new gk0(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fc f9817c;

    public rc(mc mcVar, fc fcVar) {
        this.f9815a = mcVar;
        this.f9817c = fcVar;
    }

    public final Optional a() {
        qb qbVar;
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f9816b.f5837c;
            if (arrayDeque.isEmpty()) {
                throw new jc();
            }
            hc hcVar = (hc) arrayDeque.pop();
            long j10 = hcVar.f6092a;
            long j11 = hcVar.f6093b;
            long j12 = hcVar.f6094c;
            mc mcVar = this.f9815a;
            if (mcVar.f7847b < j11) {
                return Optional.of(qb.I);
            }
            this.f9817c.c(j10);
            if (j12 == 0) {
                while (mcVar.f7847b > j11) {
                    mcVar.d();
                }
            }
            return Optional.empty();
        } catch (dc e3) {
            e = e3;
            throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
        } catch (ec e7) {
            e = e7;
            throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
        } catch (jc unused) {
            qbVar = qb.f9412y;
            return Optional.of(qbVar);
        } catch (kc unused2) {
            qbVar = qb.I;
            return Optional.of(qbVar);
        }
    }
}
