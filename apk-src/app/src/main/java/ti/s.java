package ti;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.om1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import q9.e2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f33887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f33888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f33889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f33890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f33891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f33892h;
    public final List i;

    public s(List list, String str, Boolean bool, List list2, Integer num, String str2, Map map, String str3, List list3) {
        this.f33885a = list;
        this.f33886b = str;
        this.f33887c = bool;
        this.f33888d = list2;
        this.f33889e = num;
        this.f33890f = str2;
        this.f33891g = map;
        this.f33892h = str3;
        this.i = list3;
    }

    public final k9.g a() {
        k9.f fVar = new k9.f(2);
        b(fVar);
        return new k9.g(fVar);
    }

    public final void b(e1.d0 d0Var) {
        e2 e2Var = (e2) d0Var.f15951b;
        List list = this.f33885a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e2Var.f31827a.add((String) it.next());
            }
        }
        String str = this.f33886b;
        if (str != null) {
            d0Var.y(str);
        }
        HashMap map = new HashMap();
        List list2 = this.i;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            if (it2.hasNext()) {
                throw om1.i(it2);
            }
        }
        Map map2 = this.f33891g;
        if (map2 != null && !map2.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map2.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            map.put(AdMobAdapter.class, bundle);
        }
        Boolean bool = this.f33887c;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) map.get(AdMobAdapter.class);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", "1");
            map.put(AdMobAdapter.class, bundle2);
        }
        for (Map.Entry entry2 : map.entrySet()) {
            d0Var.r((Bundle) entry2.getValue(), (Class) entry2.getKey());
        }
        List list3 = this.f33888d;
        if (list3 != null) {
            d0Var.z(list3);
        }
        Integer num = this.f33889e;
        if (num != null) {
            e2Var.f31838m = num.intValue();
        }
        e2Var.f31835j = this.f33892h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Objects.equals(this.f33885a, sVar.f33885a) && Objects.equals(this.f33886b, sVar.f33886b) && Objects.equals(this.f33887c, sVar.f33887c) && Objects.equals(this.f33888d, sVar.f33888d) && Objects.equals(this.f33889e, sVar.f33889e) && Objects.equals(this.f33890f, sVar.f33890f) && Objects.equals(this.f33891g, sVar.f33891g) && Objects.equals(this.i, sVar.i);
    }

    public int hashCode() {
        return Objects.hash(this.f33885a, this.f33886b, this.f33887c, this.f33888d, this.f33889e, this.f33890f, null, this.i);
    }
}
