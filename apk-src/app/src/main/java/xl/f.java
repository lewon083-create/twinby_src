package xl;

import com.google.android.gms.internal.measurement.d4;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36272c;

    public f(String str, String str2, int i) {
        this.f36272c = i;
        k3.f.t(str);
        k3.f.t(str2);
        this.f36270a = d4.r(str);
        if ((str2.startsWith("\"") && str2.endsWith("\"")) || (str2.startsWith("'") && str2.endsWith("'"))) {
            str2 = str2.substring(1, str2.length() - 1);
        }
        this.f36271b = d4.r(str2);
    }

    @Override // xl.m
    public final boolean a(vl.k kVar, vl.k kVar2) {
        switch (this.f36272c) {
            case 0:
                String str = this.f36270a;
                if (kVar2.k(str)) {
                    if (this.f36271b.equalsIgnoreCase(kVar2.b(str).trim())) {
                        return true;
                    }
                }
                return false;
            case 1:
                String str2 = this.f36270a;
                return kVar2.k(str2) && d4.p(kVar2.b(str2)).contains(this.f36271b);
            case 2:
                String str3 = this.f36270a;
                return kVar2.k(str3) && d4.p(kVar2.b(str3)).endsWith(this.f36271b);
            case 3:
                return !this.f36271b.equalsIgnoreCase(kVar2.b(this.f36270a));
            default:
                String str4 = this.f36270a;
                return kVar2.k(str4) && d4.p(kVar2.b(str4)).startsWith(this.f36271b);
        }
    }

    public final String toString() {
        switch (this.f36272c) {
            case 0:
                return z.f("[", this.f36270a, "=", this.f36271b, "]");
            case 1:
                return z.f("[", this.f36270a, "*=", this.f36271b, "]");
            case 2:
                return z.f("[", this.f36270a, "$=", this.f36271b, "]");
            case 3:
                return z.f("[", this.f36270a, "!=", this.f36271b, "]");
            default:
                return z.f("[", this.f36270a, "^=", this.f36271b, "]");
        }
    }
}
