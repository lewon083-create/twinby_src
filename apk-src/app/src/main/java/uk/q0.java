package uk;

import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class q0 implements sk.f, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f34569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f34572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f34573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f34574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f34575h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f34576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f34577k;

    public q0(String serialName, z zVar, int i) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f34568a = serialName;
        this.f34569b = zVar;
        this.f34570c = i;
        this.f34571d = -1;
        String[] strArr = new String[i];
        for (int i10 = 0; i10 < i; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f34572e = strArr;
        int i11 = this.f34570c;
        this.f34573f = new List[i11];
        this.f34574g = new boolean[i11];
        this.f34575h = kotlin.collections.j0.d();
        ij.i iVar = ij.i.f21337b;
        final int i12 = 0;
        this.i = ij.h.a(iVar, new Function0(this) { // from class: uk.p0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q0 f34565c;

            {
                this.f34565c = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [ij.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qk.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                qk.a[] aVarArrTypeParametersSerializers;
                switch (i12) {
                    case 0:
                        z zVar2 = this.f34565c.f34569b;
                        return (zVar2 == null || (aVarArrChildSerializers = zVar2.childSerializers()) == null) ? o0.f34560b : aVarArrChildSerializers;
                    case 1:
                        z zVar3 = this.f34565c.f34569b;
                        if (zVar3 == null || (aVarArrTypeParametersSerializers = zVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (qk.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return o0.c(arrayList);
                    default:
                        q0 q0Var = this.f34565c;
                        return Integer.valueOf(o0.d(q0Var, (sk.f[]) q0Var.f34576j.getValue()));
                }
            }
        });
        final int i13 = 1;
        this.f34576j = ij.h.a(iVar, new Function0(this) { // from class: uk.p0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q0 f34565c;

            {
                this.f34565c = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [ij.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qk.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                qk.a[] aVarArrTypeParametersSerializers;
                switch (i13) {
                    case 0:
                        z zVar2 = this.f34565c.f34569b;
                        return (zVar2 == null || (aVarArrChildSerializers = zVar2.childSerializers()) == null) ? o0.f34560b : aVarArrChildSerializers;
                    case 1:
                        z zVar3 = this.f34565c.f34569b;
                        if (zVar3 == null || (aVarArrTypeParametersSerializers = zVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (qk.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return o0.c(arrayList);
                    default:
                        q0 q0Var = this.f34565c;
                        return Integer.valueOf(o0.d(q0Var, (sk.f[]) q0Var.f34576j.getValue()));
                }
            }
        });
        final int i14 = 2;
        this.f34577k = ij.h.a(iVar, new Function0(this) { // from class: uk.p0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q0 f34565c;

            {
                this.f34565c = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [ij.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qk.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                qk.a[] aVarArrTypeParametersSerializers;
                switch (i14) {
                    case 0:
                        z zVar2 = this.f34565c.f34569b;
                        return (zVar2 == null || (aVarArrChildSerializers = zVar2.childSerializers()) == null) ? o0.f34560b : aVarArrChildSerializers;
                    case 1:
                        z zVar3 = this.f34565c.f34569b;
                        if (zVar3 == null || (aVarArrTypeParametersSerializers = zVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (qk.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return o0.c(arrayList);
                    default:
                        q0 q0Var = this.f34565c;
                        return Integer.valueOf(o0.d(q0Var, (sk.f[]) q0Var.f34576j.getValue()));
                }
            }
        });
    }

    @Override // sk.f
    public final String a() {
        return this.f34568a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // uk.j
    public final Set b() {
        return this.f34575h.keySet();
    }

    @Override // sk.f
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // sk.f
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f34575h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // sk.f
    public h5 e() {
        return sk.i.f32937b;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ij.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ij.g, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            sk.f fVar = (sk.f) obj;
            if (Intrinsics.a(this.f34568a, fVar.a()) && Arrays.equals((sk.f[]) this.f34576j.getValue(), (sk.f[]) ((q0) obj).f34576j.getValue())) {
                int iF = fVar.f();
                int i = this.f34570c;
                if (i == iF) {
                    for (int i10 = 0; i10 < i; i10++) {
                        if (Intrinsics.a(i(i10).a(), fVar.i(i10).a()) && Intrinsics.a(i(i10).e(), fVar.i(i10).e())) {
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
        return this.f34570c;
    }

    @Override // sk.f
    public final String g(int i) {
        return this.f34572e[i];
    }

    @Override // sk.f
    public final List getAnnotations() {
        return kotlin.collections.b0.f27475b;
    }

    @Override // sk.f
    public final List h(int i) {
        List list = this.f34573f[i];
        return list == null ? kotlin.collections.b0.f27475b : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ij.g, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f34577k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ij.g, java.lang.Object] */
    @Override // sk.f
    public sk.f i(int i) {
        return ((qk.a[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // sk.f
    public boolean isInline() {
        return false;
    }

    @Override // sk.f
    public final boolean j(int i) {
        return this.f34574g[i];
    }

    public final void k(String name, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i = this.f34571d + 1;
        this.f34571d = i;
        String[] strArr = this.f34572e;
        strArr[i] = name;
        this.f34574g[i] = z5;
        this.f34573f[i] = null;
        if (i == this.f34570c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                map.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f34575h = map;
        }
    }

    public String toString() {
        return CollectionsKt.I(ck.o.e(0, this.f34570c), ", ", a0.u.n(new StringBuilder(), this.f34568a, '('), ")", new ek.o(7, this), 24);
    }
}
