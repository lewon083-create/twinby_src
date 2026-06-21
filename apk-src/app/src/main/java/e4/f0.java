package e4;

import ad.b1;
import ad.g1;
import android.net.Uri;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f16098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f16099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f16104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16105h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f16106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f16107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f16108l;

    public f0(e0 e0Var) {
        this.f16098a = g1.a(e0Var.f16075a);
        this.f16099b = e0Var.f16076b.g();
        String str = e0Var.f16078d;
        String str2 = m3.z.f28608a;
        this.f16100c = str;
        this.f16101d = e0Var.f16079e;
        this.f16102e = e0Var.f16080f;
        this.f16104g = e0Var.f16081g;
        this.f16105h = e0Var.f16082h;
        this.f16103f = e0Var.f16077c;
        this.i = e0Var.i;
        this.f16106j = e0Var.f16084k;
        this.f16107k = e0Var.f16085l;
        this.f16108l = e0Var.f16083j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f16103f != f0Var.f16103f) {
            return false;
        }
        g1 g1Var = f0Var.f16098a;
        g1 g1Var2 = this.f16098a;
        g1Var2.getClass();
        return ad.q.f(g1Var, g1Var2) && this.f16099b.equals(f0Var.f16099b) && Objects.equals(this.f16101d, f0Var.f16101d) && Objects.equals(this.f16100c, f0Var.f16100c) && Objects.equals(this.f16102e, f0Var.f16102e) && Objects.equals(this.f16108l, f0Var.f16108l) && Objects.equals(this.f16104g, f0Var.f16104g) && Objects.equals(this.f16106j, f0Var.f16106j) && Objects.equals(this.f16107k, f0Var.f16107k) && Objects.equals(this.f16105h, f0Var.f16105h) && Objects.equals(this.i, f0Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f16099b.hashCode() + ((this.f16098a.hashCode() + 217) * 31)) * 31;
        String str = this.f16101d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16100c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16102e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f16103f) * 31;
        String str4 = this.f16108l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f16104g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f16106j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f16107k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f16105h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
