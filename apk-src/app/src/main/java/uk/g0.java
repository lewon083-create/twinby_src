package uk;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qk.a f34520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qk.a f34521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f34522c;

    public g0(qk.a kSerializer, qk.a vSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f34520a = kSerializer;
        this.f34521b = vSerializer;
        sk.f keyDesc = kSerializer.getDescriptor();
        sk.f valueDesc = vSerializer.getDescriptor();
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.f34522c = new f0("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
    }

    @Override // uk.a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // uk.a
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // uk.a
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // uk.a
    public final int d(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        Map builder = (Map) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object objI = decoder.i(getDescriptor(), i, this.f34520a, null);
        int iV = decoder.v(getDescriptor());
        if (iV != i + 1) {
            throw new IllegalArgumentException(a0.u.j(i, iV, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objI);
        qk.a aVar = this.f34521b;
        builder.put(objI, (!zContainsKey || (aVar.getDescriptor().e() instanceof sk.e)) ? decoder.i(getDescriptor(), iV, aVar, null) : decoder.i(getDescriptor(), iV, aVar, kotlin.collections.j0.e(objI, builder)));
    }

    @Override // uk.a
    public final Object g(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return this.f34522c;
    }

    @Override // uk.a
    public final Object h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        d(obj);
        sk.f descriptor = getDescriptor();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        wk.o oVarA = ((wk.o) encoder).a(descriptor);
        Iterator itC = c(obj);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i + 1;
            oVarA.u(getDescriptor(), i, this.f34520a, key);
            i += 2;
            oVarA.u(getDescriptor(), i10, this.f34521b, value);
        }
        oVarA.w(descriptor);
    }
}
