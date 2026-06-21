package t;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f33037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f33040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f33041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f33042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f33043h;
    public final Range i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f33044j;

    public e(int i, boolean z5, int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Range range, boolean z15) {
        this.f33036a = i;
        this.f33037b = z5;
        this.f33038c = i10;
        this.f33039d = z10;
        this.f33040e = z11;
        this.f33041f = z12;
        this.f33042g = z13;
        this.f33043h = z14;
        if (range == null) {
            throw new NullPointerException("Null getTargetFpsRange");
        }
        this.i = range;
        this.f33044j = z15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f33036a == eVar.f33036a && this.f33037b == eVar.f33037b && this.f33038c == eVar.f33038c && this.f33039d == eVar.f33039d && this.f33040e == eVar.f33040e && this.f33041f == eVar.f33041f && this.f33042g == eVar.f33042g && this.f33043h == eVar.f33043h && this.i.equals(eVar.i) && this.f33044j == eVar.f33044j;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f33036a ^ 1000003) * 1000003) ^ (this.f33037b ? 1231 : 1237)) * 1000003) ^ this.f33038c) * 1000003) ^ (this.f33039d ? 1231 : 1237)) * 1000003) ^ (this.f33040e ? 1231 : 1237)) * 1000003) ^ (this.f33041f ? 1231 : 1237)) * 1000003) ^ (this.f33042g ? 1231 : 1237)) * 1000003) ^ (this.f33043h ? 1231 : 1237)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (this.f33044j ? 1231 : 1237);
    }

    public final String toString() {
        return "FeatureSettings{getCameraMode=" + this.f33036a + ", hasVideoCapture=" + this.f33037b + ", getRequiredMaxBitDepth=" + this.f33038c + ", isPreviewStabilizationOn=" + this.f33039d + ", isUltraHdrOn=" + this.f33040e + ", isHighSpeedOn=" + this.f33041f + ", isFeatureComboInvocation=" + this.f33042g + ", requiresFeatureComboQuery=" + this.f33043h + ", getTargetFpsRange=" + this.i + ", isStrictFpsRequired=" + this.f33044j + "}";
    }
}
