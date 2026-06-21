package l0;

import a0.q2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f27709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f27710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f27711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f27712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f27713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u0.d f27714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q2 f27715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f27716h;
    public final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f27717j;

    public b(LinkedHashSet appUseCases, ArrayList cameraUseCases, ArrayList cameraUseCasesToAttach, ArrayList cameraUseCasesToKeep, ArrayList cameraUseCasesToDetach, u0.d dVar, q2 q2Var, HashMap useCaseConfigs, j primaryStreamSpecResult, j jVar) {
        Intrinsics.checkNotNullParameter(appUseCases, "appUseCases");
        Intrinsics.checkNotNullParameter(cameraUseCases, "cameraUseCases");
        Intrinsics.checkNotNullParameter(cameraUseCasesToAttach, "cameraUseCasesToAttach");
        Intrinsics.checkNotNullParameter(cameraUseCasesToKeep, "cameraUseCasesToKeep");
        Intrinsics.checkNotNullParameter(cameraUseCasesToDetach, "cameraUseCasesToDetach");
        Intrinsics.checkNotNullParameter(useCaseConfigs, "useCaseConfigs");
        Intrinsics.checkNotNullParameter(primaryStreamSpecResult, "primaryStreamSpecResult");
        this.f27709a = appUseCases;
        this.f27710b = cameraUseCases;
        this.f27711c = cameraUseCasesToAttach;
        this.f27712d = cameraUseCasesToKeep;
        this.f27713e = cameraUseCasesToDetach;
        this.f27714f = dVar;
        this.f27715g = q2Var;
        this.f27716h = useCaseConfigs;
        this.i = primaryStreamSpecResult;
        this.f27717j = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f27709a.equals(bVar.f27709a) && this.f27710b.equals(bVar.f27710b) && this.f27711c.equals(bVar.f27711c) && this.f27712d.equals(bVar.f27712d) && this.f27713e.equals(bVar.f27713e) && Intrinsics.a(this.f27714f, bVar.f27714f) && Intrinsics.a(this.f27715g, bVar.f27715g) && this.f27716h.equals(bVar.f27716h) && Intrinsics.a(this.i, bVar.i) && Intrinsics.a(this.f27717j, bVar.f27717j);
    }

    public final int hashCode() {
        int iHashCode = (this.f27713e.hashCode() + ((this.f27712d.hashCode() + ((this.f27711c.hashCode() + ((this.f27710b.hashCode() + (this.f27709a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        u0.d dVar = this.f27714f;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        q2 q2Var = this.f27715g;
        int iHashCode3 = (this.i.hashCode() + ((this.f27716h.hashCode() + ((iHashCode2 + (q2Var == null ? 0 : q2Var.hashCode())) * 31)) * 31)) * 31;
        j jVar = this.f27717j;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.f27709a + ", cameraUseCases=" + this.f27710b + ", cameraUseCasesToAttach=" + this.f27711c + ", cameraUseCasesToKeep=" + this.f27712d + ", cameraUseCasesToDetach=" + this.f27713e + ", streamSharing=" + this.f27714f + ", placeholderForExtensions=" + this.f27715g + ", useCaseConfigs=" + this.f27716h + ", primaryStreamSpecResult=" + this.i + ", secondaryStreamSpecResult=" + this.f27717j + ')';
    }
}
