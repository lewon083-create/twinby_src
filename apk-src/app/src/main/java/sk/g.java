package sk;

import a0.u;
import androidx.lifecycle.q0;
import ck.o;
import com.google.android.gms.internal.measurement.h5;
import ek.s;
import ij.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.j0;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import uk.o0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements f, uk.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h5 f32925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f32927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f32928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f32929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f[] f32930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List[] f32931h;
    public final boolean[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f32932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f[] f32933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f32934l;

    public g(String serialName, h5 kind, int i, List typeParameters, a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f32924a = serialName;
        this.f32925b = kind;
        this.f32926c = i;
        this.f32927d = builder.f32909b;
        ArrayList arrayList = builder.f32910c;
        this.f32928e = CollectionsKt.P(arrayList);
        int i10 = 0;
        this.f32929f = (String[]) arrayList.toArray(new String[0]);
        this.f32930g = o0.c(builder.f32912e);
        this.f32931h = (List[]) builder.f32913f.toArray(new List[0]);
        ArrayList arrayList2 = builder.f32914g;
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        this.i = zArr;
        String[] strArr = this.f32929f;
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        s sVar = new s(new q0(5, strArr));
        ArrayList arrayList3 = new ArrayList(t.j(sVar, 10));
        Iterator it2 = sVar.iterator();
        while (true) {
            ek.b bVar = (ek.b) it2;
            if (!bVar.f16392d.hasNext()) {
                this.f32932j = j0.k(arrayList3);
                this.f32933k = o0.c(typeParameters);
                this.f32934l = ij.h.b(new q0(8, this));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) bVar.next();
            arrayList3.add(new Pair(indexedValue.f27473b, Integer.valueOf(indexedValue.f27472a)));
        }
    }

    @Override // sk.f
    public final String a() {
        return this.f32924a;
    }

    @Override // uk.j
    public final Set b() {
        return this.f32928e;
    }

    @Override // sk.f
    public final boolean c() {
        return false;
    }

    @Override // sk.f
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f32932j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // sk.f
    public final h5 e() {
        return this.f32925b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (Intrinsics.a(this.f32924a, fVar.a()) && Arrays.equals(this.f32933k, ((g) obj).f32933k)) {
                int iF = fVar.f();
                int i = this.f32926c;
                if (i == iF) {
                    for (int i10 = 0; i10 < i; i10++) {
                        f[] fVarArr = this.f32930g;
                        if (Intrinsics.a(fVarArr[i10].a(), fVar.i(i10).a()) && Intrinsics.a(fVarArr[i10].e(), fVar.i(i10).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // sk.f
    public final int f() {
        return this.f32926c;
    }

    @Override // sk.f
    public final String g(int i) {
        return this.f32929f[i];
    }

    @Override // sk.f
    public final List getAnnotations() {
        return this.f32927d;
    }

    @Override // sk.f
    public final List h(int i) {
        return this.f32931h[i];
    }

    public final int hashCode() {
        return ((Number) this.f32934l.getValue()).intValue();
    }

    @Override // sk.f
    public final f i(int i) {
        return this.f32930g[i];
    }

    @Override // sk.f
    public final boolean isInline() {
        return false;
    }

    @Override // sk.f
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return CollectionsKt.I(o.e(0, this.f32926c), ", ", u.n(new StringBuilder(), this.f32924a, '('), ")", new ek.o(4, this), 24);
    }
}
