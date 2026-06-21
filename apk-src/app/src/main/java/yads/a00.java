package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a00 implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f36595b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f36596c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f36597d = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f36598e = Collections.EMPTY_LIST;

    public final int a(Object obj) {
        int iIntValue;
        synchronized (this.f36595b) {
            try {
                iIntValue = this.f36596c.containsKey(obj) ? ((Integer) this.f36596c.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public final void b(Object obj) {
        synchronized (this.f36595b) {
            try {
                Integer num = (Integer) this.f36596c.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f36598e);
                arrayList.remove(obj);
                this.f36598e = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f36596c.remove(obj);
                    HashSet hashSet = new HashSet(this.f36597d);
                    hashSet.remove(obj);
                    this.f36597d = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f36596c.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f36595b) {
            it = this.f36598e.iterator();
        }
        return it;
    }
}
