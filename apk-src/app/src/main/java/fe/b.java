package fe;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f16782b;

    public b(Set set, c cVar) {
        this.f16781a = b(set);
        this.f16782b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f16779a);
            sb2.append('/');
            sb2.append(aVar.f16780b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f16781a;
        c cVar = this.f16782b;
        synchronized (((HashSet) cVar.f16785c)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f16785c);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((HashSet) cVar.f16785c)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f16785c);
        }
        sb2.append(b(setUnmodifiableSet2));
        return sb2.toString();
    }
}
