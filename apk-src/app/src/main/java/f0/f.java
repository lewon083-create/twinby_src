package f0;

import a0.g0;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import com.google.firebase.messaging.y;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f16496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f16497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f16498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f16499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f16500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f16501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16502h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f16504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f16505l;

    public f(Executor executor, y yVar, g0 g0Var, Rect rect, Matrix matrix, int i, int i10, int i11, boolean z5, List list) {
        this.f16495a = ((CaptureFailedRetryQuirk) n0.a.f28964a.i(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        this.f16496b = new HashMap();
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f16497c = executor;
        this.f16498d = yVar;
        this.f16499e = g0Var;
        this.f16500f = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f16501g = matrix;
        this.f16502h = i;
        this.i = i10;
        this.f16503j = i11;
        this.f16504k = z5;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f16505l = list;
    }

    public final boolean a() {
        Iterator it = this.f16496b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final void b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f16496b;
        if (map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), Boolean.TRUE);
        } else {
            com.google.android.gms.internal.auth.g.k("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        g0 g0Var = fVar.f16499e;
        y yVar = fVar.f16498d;
        if (!this.f16497c.equals(fVar.f16497c)) {
            return false;
        }
        y yVar2 = this.f16498d;
        if (yVar2 == null) {
            if (yVar != null) {
                return false;
            }
        } else if (!yVar2.equals(yVar)) {
            return false;
        }
        g0 g0Var2 = this.f16499e;
        if (g0Var2 == null) {
            if (g0Var != null) {
                return false;
            }
        } else if (!g0Var2.equals(g0Var)) {
            return false;
        }
        return this.f16500f.equals(fVar.f16500f) && this.f16501g.equals(fVar.f16501g) && this.f16502h == fVar.f16502h && this.i == fVar.i && this.f16503j == fVar.f16503j && this.f16504k == fVar.f16504k && this.f16505l.equals(fVar.f16505l);
    }

    public final int hashCode() {
        int iHashCode = (this.f16497c.hashCode() ^ 1000003) * (-721379959);
        y yVar = this.f16498d;
        int iHashCode2 = (iHashCode ^ (yVar == null ? 0 : yVar.hashCode())) * 1000003;
        g0 g0Var = this.f16499e;
        return ((((((((((((((iHashCode2 ^ (g0Var != null ? g0Var.hashCode() : 0)) * (-721379959)) ^ this.f16500f.hashCode()) * 1000003) ^ this.f16501g.hashCode()) * 1000003) ^ this.f16502h) * 1000003) ^ this.i) * 1000003) ^ this.f16503j) * 1000003) ^ (this.f16504k ? 1231 : 1237)) * 1000003) ^ this.f16505l.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TakePictureRequest{appExecutor=");
        sb2.append(this.f16497c);
        sb2.append(", inMemoryCallback=null, onDiskCallback=");
        sb2.append(this.f16498d);
        sb2.append(", outputFileOptions=");
        sb2.append(this.f16499e);
        sb2.append(", secondaryOutputFileOptions=null, cropRect=");
        sb2.append(this.f16500f);
        sb2.append(", sensorToBufferTransform=");
        sb2.append(this.f16501g);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f16502h);
        sb2.append(", jpegQuality=");
        sb2.append(this.i);
        sb2.append(", captureMode=");
        sb2.append(this.f16503j);
        sb2.append(", simultaneousCapture=");
        sb2.append(this.f16504k);
        sb2.append(", sessionConfigCameraCaptureCallbacks=");
        return z.h(sb2, this.f16505l, "}");
    }
}
