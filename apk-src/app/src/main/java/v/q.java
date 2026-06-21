package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import t.z0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f34633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0.i f34634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f34636e = null;

    public q(int i, ArrayList arrayList, j0.i iVar, z0 z0Var) {
        this.f34635d = i;
        this.f34632a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f34633b = z0Var;
        this.f34634c = iVar;
    }

    @Override // v.r
    public final void a(g gVar) {
        if (this.f34635d == 1) {
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }
        this.f34636e = gVar;
    }

    @Override // v.r
    public final Object b() {
        return null;
    }

    @Override // v.r
    public final g c() {
        return this.f34636e;
    }

    @Override // v.r
    public final int d() {
        return this.f34635d;
    }

    @Override // v.r
    public final CameraCaptureSession.StateCallback e() {
        return this.f34633b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            List list = qVar.f34632a;
            if (Objects.equals(this.f34636e, qVar.f34636e) && this.f34635d == qVar.f34635d) {
                List list2 = this.f34632a;
                if (list2.size() == list.size()) {
                    for (int i = 0; i < list2.size(); i++) {
                        if (!((h) list2.get(i)).equals(list.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // v.r
    public final List f() {
        return this.f34632a;
    }

    @Override // v.r
    public final Executor getExecutor() {
        return this.f34634c;
    }

    public final int hashCode() {
        int iHashCode = this.f34632a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        g gVar = this.f34636e;
        int iHashCode2 = (gVar == null ? 0 : gVar.f34618a.hashCode()) ^ i;
        return this.f34635d ^ ((iHashCode2 << 5) - iHashCode2);
    }

    @Override // v.r
    public final void g(CaptureRequest captureRequest) {
    }
}
