package md;

import com.google.android.gms.internal.measurement.j4;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f28832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f28833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f28836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f28837g;

    public b(String str, Set set, Set set2, int i, int i10, e eVar, Set set3) {
        this.f28831a = str;
        this.f28832b = Collections.unmodifiableSet(set);
        this.f28833c = Collections.unmodifiableSet(set2);
        this.f28834d = i;
        this.f28835e = i10;
        this.f28836f = eVar;
        this.f28837g = Collections.unmodifiableSet(set3);
    }

    public static bf.i a(Class cls) {
        return new bf.i(cls, new Class[0]);
    }

    public static bf.i b(q qVar) {
        return new bf.i(qVar, new q[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            j4.e(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f28832b.toArray()) + ">{" + this.f28834d + ", type=" + this.f28835e + ", deps=" + Arrays.toString(this.f28833c.toArray()) + "}";
    }
}
