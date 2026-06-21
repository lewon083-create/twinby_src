package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.ads.ap1;
import com.google.android.gms.internal.consent_sdk.r6;
import com.google.android.gms.internal.measurement.o6;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class h1 extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f1410c;

    public /* synthetic */ h1(Map map, int i) {
        this.f1409b = i;
        this.f1410c = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f1409b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((e1) this.f1410c).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((ap1) this.f1410c).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((r6) this.f1410c).b((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((o6) this.f1410c).c((Comparable) entry4.getKey(), entry4.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f1409b) {
            case 0:
                ((e1) this.f1410c).clear();
                break;
            case 1:
                ((ap1) this.f1410c).clear();
                break;
            case 2:
                ((r6) this.f1410c).clear();
                break;
            case 3:
                ((o6) this.f1410c).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f1409b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((e1) this.f1410c).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((ap1) this.f1410c).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((r6) this.f1410c).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj4 != value3) {
                    return obj4 != null && obj4.equals(value3);
                }
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj5 = ((o6) this.f1410c).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj5 != value4) {
                    return obj5 != null && obj5.equals(value4);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f1409b) {
            case 0:
                return new g1((e1) this.f1410c);
            case 1:
                return new g1((ap1) this.f1410c);
            case 2:
                return new g1((r6) this.f1410c);
            case 3:
                return new g1((o6) this.f1410c);
            default:
                return new h1.c((h1.e) this.f1410c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f1409b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((e1) this.f1410c).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((ap1) this.f1410c).remove(entry2.getKey());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((r6) this.f1410c).remove(entry3.getKey());
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((o6) this.f1410c).remove(entry4.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f1409b) {
            case 0:
                return ((e1) this.f1410c).size();
            case 1:
                return ((ap1) this.f1410c).size();
            case 2:
                return ((r6) this.f1410c).size();
            case 3:
                return ((o6) this.f1410c).size();
            default:
                return ((h1.e) this.f1410c).f20340d;
        }
    }
}
