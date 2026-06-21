package vk;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.text.StringsKt;
import kotlin.text.f0;
import uk.j1;
import uk.u0;
import uk.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f34893a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f34894b;

    static {
        sk.d kind = sk.d.f32923j;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.D("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        jj.i iVar = v0.f34598a;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Object it = ((jj.l) v0.f34598a.values()).iterator();
        while (((g2.c0) it).hasNext()) {
            qk.a aVar = (qk.a) ((jj.g) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.getDescriptor().a())) {
                throw new IllegalArgumentException(kotlin.text.u.b("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + g0.a(aVar.getClass()).d() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f34894b = new u0("kotlinx.serialization.json.JsonLiteral", kind);
    }

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        l lVarP0 = hl.l.b(decoder).p0();
        if (lVarP0 instanceof q) {
            return (q) lVarP0;
        }
        throw wk.j.b(-1, "Unexpected JSON element, expected JsonLiteral, had " + g0.a(lVarP0.getClass()), lVarP0.toString());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34894b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        q value = (q) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        hl.l.a(encoder);
        boolean z5 = value.f34891b;
        String str = value.f34892c;
        if (z5) {
            encoder.n(str);
            return;
        }
        Long lO = StringsKt.O(str);
        if (lO != null) {
            encoder.l(lO.longValue());
            return;
        }
        ij.z zVarF = f0.f(str);
        if (zVarF != null) {
            long j10 = zVarF.f21363b;
            Intrinsics.checkNotNullParameter(ij.z.f21362c, "<this>");
            encoder.j(j1.f34536b).l(j10);
            return;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Boolean bool = null;
        Double dValueOf = kotlin.text.z.d(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        if (dValueOf != null) {
            encoder.d(dValueOf.doubleValue());
            return;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.a(str, "true")) {
            bool = Boolean.TRUE;
        } else if (Intrinsics.a(str, "false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            encoder.g(bool.booleanValue());
        } else {
            encoder.n(str);
        }
    }
}
