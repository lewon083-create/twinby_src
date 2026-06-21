package uk;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sk.f[] f34559a = new sk.f[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qk.a[] f34560b = new qk.a[0];

    public static final a0 a(String name, qk.a primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new a0(name, new b0(primitiveSerializer));
    }

    public static final Set b(sk.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof j) {
            return ((j) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.f());
        int iF = fVar.f();
        for (int i = 0; i < iF; i++) {
            hashSet.add(fVar.g(i));
        }
        return hashSet;
    }

    public static final sk.f[] c(List list) {
        sk.f[] fVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (sk.f[]) list.toArray(new sk.f[0])) == null) ? f34559a : fVarArr;
    }

    public static final int d(sk.f fVar, sk.f[] typeParams) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (fVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int iF = fVar.f();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i10 = iF - 1;
            int i11 = i * 31;
            String strA = fVar.i(fVar.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i11 + iHashCode2;
            iF = i10;
        }
        int iF2 = fVar.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i12 = iF2 - 1;
            int i13 = iHashCode3 * 31;
            h5 h5VarE = fVar.i(fVar.f() - iF2).e();
            iHashCode3 = i13 + (h5VarE != null ? h5VarE.hashCode() : 0);
            iF2 = i12;
        }
    }

    public static final void e(int i, int i10, sk.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList missingFields = new ArrayList();
        int i11 = (~i) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                missingFields.add(descriptor.g(i12));
            }
            i11 >>>= 1;
        }
        String serialName = descriptor.a();
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        throw new qk.b(missingFields, missingFields.size() == 1 ? om1.n(new StringBuilder("Field '"), (String) missingFields.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }

    public static final void f(String str, dk.c baseClass) {
        String string;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        StringBuilder sb2 = new StringBuilder("in the polymorphic scope of '");
        kotlin.jvm.internal.i iVar = (kotlin.jvm.internal.i) baseClass;
        sb2.append(iVar.d());
        sb2.append('\'');
        String string2 = sb2.toString();
        if (str == null) {
            string = pe.a.c('.', "Class discriminator was missing and no default serializers were registered ", string2);
        } else {
            StringBuilder sbJ = t.z.j("Serializer for subclass '", str, "' is not found ", string2, ".\nCheck if class with serial name '");
            l7.o.t(sbJ, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbJ.append(iVar.d());
            sbJ.append("' has to be sealed and '@Serializable'.");
            string = sbJ.toString();
        }
        throw new qk.d(string);
    }
}
