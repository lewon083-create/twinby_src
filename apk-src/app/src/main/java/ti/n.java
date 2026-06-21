package ti;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import q9.e2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f33855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f33856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f33857l;

    public n(List list, String str, Map map, Map map2, Boolean bool, List list2, Integer num, String str2, String str3, Map map3, String str4, List list3) {
        super(list, str, bool, list2, num, str3, map3, str4, list3);
        this.f33855j = map;
        this.f33856k = map2;
        this.f33857l = str2;
    }

    public final l9.b c() {
        l9.a aVar = new l9.a(2);
        e2 e2Var = (e2) aVar.f15951b;
        b(aVar);
        Map map = this.f33855j;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                aVar.q((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map map2 = this.f33856k;
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                String str = (String) entry2.getKey();
                List<String> list = (List) entry2.getValue();
                if (list != null) {
                    for (String str2 : list) {
                        if (!TextUtils.isEmpty(str2) && str2.contains(StringUtils.COMMA)) {
                            StringBuilder sb2 = new StringBuilder(str2.length() + 108);
                            sb2.append("Value ");
                            sb2.append(str2);
                            sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                            u9.i.h(sb2.toString());
                        }
                    }
                    e2Var.f31831e.putString(str, TextUtils.join(StringUtils.COMMA, list));
                }
            }
        }
        String str3 = this.f33857l;
        if (str3 != null) {
            e2Var.i = str3;
        }
        return new l9.b(aVar);
    }

    @Override // ti.s
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return super.equals(obj) && Objects.equals(this.f33855j, nVar.f33855j) && Objects.equals(this.f33856k, nVar.f33856k);
    }

    @Override // ti.s
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f33855j, this.f33856k);
    }
}
