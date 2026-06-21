package yads;

import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class oy2 {
    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ly2 a(Set set, qg2 qg2Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof ly2) {
                ly2 ly2Var = (ly2) sortedSet;
                qg2 qg2Var2 = ly2Var.f40711c;
                qg2Var2.getClass();
                qg2Var.getClass();
                return new my2((SortedSet) ly2Var.f40710b, new rg2(Arrays.asList(qg2Var2, qg2Var)));
            }
            qg2Var.getClass();
            return new my2(sortedSet, qg2Var);
        }
        if (set instanceof ly2) {
            ly2 ly2Var2 = (ly2) set;
            qg2 qg2Var3 = ly2Var2.f40711c;
            qg2Var3.getClass();
            qg2Var.getClass();
            return new ly2((Set) ly2Var2.f40710b, new rg2(Arrays.asList(qg2Var3, qg2Var)));
        }
        set.getClass();
        qg2Var.getClass();
        return new ly2(set, qg2Var);
    }

    public static int a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static Set a() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }
}
