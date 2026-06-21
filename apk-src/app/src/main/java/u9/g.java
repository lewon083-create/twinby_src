package u9;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34387c;

    public g(int i, int i10, boolean z5) {
        this.f34385a = i;
        this.f34386b = i10;
        this.f34387c = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f34385a == gVar.f34385a && this.f34386b == gVar.f34386b && this.f34387c == gVar.f34387c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f34387c ? 1237 : 1231) ^ ((((this.f34385a ^ 1000003) * 1000003) ^ this.f34386b) * 1000003);
    }

    public final String toString() {
        int i = this.f34385a;
        int length = String.valueOf(i).length();
        int i10 = this.f34386b;
        int length2 = String.valueOf(i10).length();
        boolean z5 = this.f34387c;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z5).length() + 1);
        om1.u(sb2, "OfflineAdConfig{impressionPrerequisite=", i, ", clickPrerequisite=", i10);
        sb2.append(", notificationFlowEnabled=");
        sb2.append(z5);
        sb2.append("}");
        return sb2.toString();
    }
}
