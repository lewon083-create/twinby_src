package t2;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.n;
import ij.j;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import p2.s0;
import s2.i;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f33405a = new h();

    @Override // p2.s0
    public final Object a() {
        return new b(true);
    }

    @Override // p2.s0
    public final Object b(InputStream input, mj.a aVar) throws p2.b {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            s2.e eVarO = s2.e.o((FileInputStream) input);
            Intrinsics.checkNotNullExpressionValue(eVarO, "{\n                Prefer…From(input)\n            }");
            f[] pairs = new f[0];
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            b bVar = new b(false);
            f[] pairs2 = (f[]) Arrays.copyOf(pairs, 0);
            Intrinsics.checkNotNullParameter(pairs2, "pairs");
            bVar.b();
            if (pairs2.length > 0) {
                f fVar = pairs2[0];
                throw null;
            }
            Map mapM = eVarO.m();
            Intrinsics.checkNotNullExpressionValue(mapM, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM.entrySet()) {
                String name = (String) entry.getKey();
                i value = (i) entry.getValue();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                int iC = value.C();
                switch (iC == 0 ? -1 : g.f33404a[z.m(iC)]) {
                    case -1:
                        throw new p2.b("Value case is null.", 0);
                    case 0:
                    default:
                        throw new j();
                    case 1:
                        e key = ya.e.b(name);
                        Boolean boolValueOf = Boolean.valueOf(value.t());
                        Intrinsics.checkNotNullParameter(key, "key");
                        bVar.f(key, boolValueOf);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(name, "name");
                        e key2 = new e(name);
                        Float fValueOf = Float.valueOf(value.x());
                        Intrinsics.checkNotNullParameter(key2, "key");
                        bVar.f(key2, fValueOf);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(name, "name");
                        e key3 = new e(name);
                        Double dValueOf = Double.valueOf(value.w());
                        Intrinsics.checkNotNullParameter(key3, "key");
                        bVar.f(key3, dValueOf);
                        break;
                    case 4:
                        Intrinsics.checkNotNullParameter(name, "name");
                        e key4 = new e(name);
                        Integer numValueOf = Integer.valueOf(value.y());
                        Intrinsics.checkNotNullParameter(key4, "key");
                        bVar.f(key4, numValueOf);
                        break;
                    case 5:
                        e key5 = ya.e.r(name);
                        Long lValueOf = Long.valueOf(value.z());
                        Intrinsics.checkNotNullParameter(key5, "key");
                        bVar.f(key5, lValueOf);
                        break;
                    case 6:
                        e key6 = ya.e.A(name);
                        String strA = value.A();
                        Intrinsics.checkNotNullExpressionValue(strA, "value.string");
                        Intrinsics.checkNotNullParameter(key6, "key");
                        bVar.f(key6, strA);
                        break;
                    case 7:
                        e key7 = ya.e.B(name);
                        b0 b0VarN = value.B().n();
                        Intrinsics.checkNotNullExpressionValue(b0VarN, "value.stringSet.stringsList");
                        Set setV = CollectionsKt.V(b0VarN);
                        Intrinsics.checkNotNullParameter(key7, "key");
                        bVar.f(key7, setV);
                        break;
                    case 8:
                        Intrinsics.checkNotNullParameter(name, "name");
                        e key8 = new e(name);
                        androidx.datastore.preferences.protobuf.h hVarU = value.u();
                        int size = hVarU.size();
                        if (size == 0) {
                            bArr = c0.f1369b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            hVarU.f(size, bArr2);
                            bArr = bArr2;
                        }
                        Intrinsics.checkNotNullExpressionValue(bArr, "value.bytes.toByteArray()");
                        Intrinsics.checkNotNullParameter(key8, "key");
                        bVar.f(key8, bArr);
                        break;
                    case 9:
                        throw new p2.b("Value not set.", 0);
                }
            }
            return new b(j0.m(bVar.a()), true);
        } catch (e0 e3) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", "message");
            throw new p2.b("Unable to parse preferences proto.", e3);
        }
    }

    @Override // p2.s0
    public final Object c(Object obj, OutputStream outputStream, mj.a aVar) throws IOException {
        androidx.datastore.preferences.protobuf.z zVarA;
        Map mapA = ((b) obj).a();
        s2.c cVarN = s2.e.n();
        for (Map.Entry entry : mapA.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f33403a;
            if (value instanceof Boolean) {
                s2.h hVarD = i.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                hVarD.c();
                i.q((i) hVarD.f1503c, zBooleanValue);
                zVarA = hVarD.a();
                Intrinsics.checkNotNullExpressionValue(zVarA, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                s2.h hVarD2 = i.D();
                float fFloatValue = ((Number) value).floatValue();
                hVarD2.c();
                i.r((i) hVarD2.f1503c, fFloatValue);
                zVarA = hVarD2.a();
                Intrinsics.checkNotNullExpressionValue(zVarA, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                s2.h hVarD3 = i.D();
                double dDoubleValue = ((Number) value).doubleValue();
                hVarD3.c();
                i.o((i) hVarD3.f1503c, dDoubleValue);
                zVarA = hVarD3.a();
                Intrinsics.checkNotNullExpressionValue(zVarA, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                s2.h hVarD4 = i.D();
                int iIntValue = ((Number) value).intValue();
                hVarD4.c();
                i.s((i) hVarD4.f1503c, iIntValue);
                zVarA = hVarD4.a();
                Intrinsics.checkNotNullExpressionValue(zVarA, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                s2.h hVarD5 = i.D();
                long jLongValue = ((Number) value).longValue();
                hVarD5.c();
                i.l((i) hVarD5.f1503c, jLongValue);
                zVarA = hVarD5.a();
                Intrinsics.checkNotNullExpressionValue(zVarA, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                s2.h hVarD6 = i.D();
                hVarD6.c();
                i.m((i) hVarD6.f1503c, (String) value);
                zVarA = hVarD6.a();
                Intrinsics.checkNotNullExpressionValue(zVarA, "newBuilder().setString(value).build()");
            } else if (value instanceof Set) {
                s2.h hVarD7 = i.D();
                s2.f fVarO = s2.g.o();
                fVarO.c();
                s2.g.l((s2.g) fVarO.f1503c, (Set) value);
                hVarD7.c();
                i.n((i) hVarD7.f1503c, (s2.g) fVarO.a());
                zVarA = hVarD7.a();
                Intrinsics.checkNotNullExpressionValue(zVarA, "newBuilder()\n           …                 .build()");
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                s2.h hVarD8 = i.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.h hVarE = androidx.datastore.preferences.protobuf.h.e(bArr, 0, bArr.length);
                hVarD8.c();
                i.p((i) hVarD8.f1503c, hVarE);
                zVarA = hVarD8.a();
                Intrinsics.checkNotNullExpressionValue(zVarA, "newBuilder().setBytes(By….copyFrom(value)).build()");
            }
            cVarN.getClass();
            str.getClass();
            cVarN.c();
            s2.e.l((s2.e) cVarN.f1503c).put(str, (i) zVarA);
        }
        s2.e eVar2 = (s2.e) cVarN.a();
        int iA = eVar2.a(null);
        Logger logger = n.f1445f;
        if (iA > 4096) {
            iA = 4096;
        }
        n nVar = new n((nl.f) outputStream, iA);
        eVar2.b(nVar);
        if (nVar.f1450d > 0) {
            nVar.U();
        }
        return Unit.f27471a;
    }
}
