package d2;

import android.util.Base64;
import com.google.android.gms.internal.ads.om1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f15534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15537g;

    public d(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f15531a = str;
        str2.getClass();
        this.f15532b = str2;
        this.f15533c = str3;
        list.getClass();
        this.f15534d = list;
        this.f15535e = str4;
        this.f15536f = str5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str3);
        this.f15537g = om1.n(sb2, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f15531a + ", mProviderPackage: " + this.f15532b + ", mQuery: " + this.f15533c + ", mSystemFont: " + this.f15535e + ", mVariationSettings: " + this.f15536f + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f15534d;
            if (i >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i++;
        }
    }
}
