package bf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2149b;

    public n(String str, List list) {
        this.f2148a = str;
        this.f2149b = list == null ? new ArrayList() : list;
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bArr[i] = (byte) ((Integer) list.get(i)).intValue();
        }
        return bArr;
    }

    public final Object[] a() {
        ArrayList arrayList = new ArrayList();
        List list = this.f2149b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        String str = nVar.f2148a;
        List list = nVar.f2149b;
        String str2 = this.f2148a;
        if (str2 != null) {
            if (!str2.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        List list2 = this.f2149b;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            if ((list2.get(i) instanceof byte[]) && (list.get(i) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list2.get(i), (byte[]) list.get(i))) {
                    return false;
                }
            } else if (!list2.get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f2148a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2148a);
        List list = this.f2149b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
