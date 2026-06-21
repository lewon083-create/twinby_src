package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import t.z0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionConfiguration f34630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f34631b;

    public p(int i, ArrayList arrayList, j0.i iVar, z0 z0Var) {
        h hVar;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i, s.a(arrayList), iVar, z0Var);
        this.f34630a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            if (outputConfiguration == null) {
                hVar = null;
            } else {
                int i10 = Build.VERSION.SDK_INT;
                hVar = new h(i10 >= 33 ? new o(outputConfiguration) : i10 >= 28 ? new n(new m(outputConfiguration)) : i10 >= 26 ? new l(new k(outputConfiguration)) : new j(new i(outputConfiguration)));
            }
            arrayList2.add(hVar);
        }
        this.f34631b = Collections.unmodifiableList(arrayList2);
    }

    @Override // v.r
    public final void a(g gVar) {
        this.f34630a.setInputConfiguration(gVar.f34618a.f34617a);
    }

    @Override // v.r
    public final Object b() {
        return this.f34630a;
    }

    @Override // v.r
    public final g c() {
        return g.a(this.f34630a.getInputConfiguration());
    }

    @Override // v.r
    public final int d() {
        return this.f34630a.getSessionType();
    }

    @Override // v.r
    public final CameraCaptureSession.StateCallback e() {
        return this.f34630a.getStateCallback();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return Objects.equals(this.f34630a, ((p) obj).f34630a);
        }
        return false;
    }

    @Override // v.r
    public final List f() {
        return this.f34631b;
    }

    @Override // v.r
    public final void g(CaptureRequest captureRequest) {
        this.f34630a.setSessionParameters(captureRequest);
    }

    @Override // v.r
    public final Executor getExecutor() {
        return this.f34630a.getExecutor();
    }

    public final int hashCode() {
        return this.f34630a.hashCode();
    }
}
