package ti;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import q9.y1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f33829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f33830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f33831e;

    public i(k9.r rVar) {
        String strC;
        String strI;
        rVar.getClass();
        y1 y1Var = rVar.f27281a;
        if (y1Var != null) {
            try {
                strC = y1Var.c();
            } catch (RemoteException e3) {
                u9.i.f("Could not forward getResponseId to ResponseInfo.", e3);
                strC = null;
            }
        } else {
            strC = null;
        }
        this.f33827a = strC;
        if (y1Var != null) {
            try {
                strI = y1Var.i();
            } catch (RemoteException e7) {
                u9.i.f("Could not forward getMediationAdapterClassName to ResponseInfo.", e7);
                strI = null;
            }
        } else {
            strI = null;
        }
        this.f33828b = strI;
        ArrayList arrayList = new ArrayList();
        Iterator it = rVar.f27282b.iterator();
        while (it.hasNext()) {
            arrayList.add(new f((k9.k) it.next()));
        }
        this.f33829c = arrayList;
        k9.k kVar = rVar.f27283c;
        if (kVar != null) {
            this.f33830d = new f(kVar);
        } else {
            this.f33830d = null;
        }
        HashMap map = new HashMap();
        if (rVar.a() != null) {
            for (String str : rVar.a().keySet()) {
                map.put(str, rVar.a().getString(str));
            }
        }
        this.f33831e = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f33827a, iVar.f33827a) && Objects.equals(this.f33828b, iVar.f33828b) && Objects.equals(this.f33829c, iVar.f33829c) && Objects.equals(this.f33830d, iVar.f33830d);
    }

    public final int hashCode() {
        return Objects.hash(this.f33827a, this.f33828b, this.f33829c, this.f33830d);
    }

    public i(String str, String str2, List list, f fVar, Map map) {
        this.f33827a = str;
        this.f33828b = str2;
        this.f33829c = list;
        this.f33830d = fVar;
        this.f33831e = map;
    }
}
