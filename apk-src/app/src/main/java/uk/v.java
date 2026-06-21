package uk;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34594a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f34596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34597d;

    public v(Unit objectInstance) {
        Intrinsics.checkNotNullParameter("kotlin.Unit", "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f34595b = objectInstance;
        this.f34596c = kotlin.collections.b0.f27475b;
        this.f34597d = ij.h.a(ij.i.f21337b, new androidx.lifecycle.q0(9, this));
    }

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        int i = this.f34594a;
        Object obj = this.f34595b;
        switch (i) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                int iN = decoder.n(getDescriptor());
                if (iN >= 0 && iN < enumArr.length) {
                    return enumArr[iN];
                }
                throw new qk.d(iN + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
            default:
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                sk.f descriptor = getDescriptor();
                tk.a aVarA = decoder.a(descriptor);
                int iV = aVarA.v(getDescriptor());
                if (iV != -1) {
                    throw new qk.d(l7.o.i(iV, "Unexpected index "));
                }
                Unit unit = Unit.f27471a;
                aVarA.m(descriptor);
                return obj;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ij.g, java.lang.Object] */
    @Override // qk.a
    public final sk.f getDescriptor() {
        switch (this.f34594a) {
            case 0:
                return (sk.f) ((ij.p) this.f34597d).getValue();
            default:
                return (sk.f) this.f34597d.getValue();
        }
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object value) {
        switch (this.f34594a) {
            case 0:
                Enum value2 = (Enum) value;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value2, "value");
                Enum[] enumArr = (Enum[]) this.f34595b;
                int iP = kotlin.collections.p.p(enumArr, value2);
                if (iP != -1) {
                    encoder.o(getDescriptor(), iP);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(value2);
                sb2.append(" is not a valid enum ");
                sb2.append(getDescriptor().a());
                sb2.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                throw new qk.d(sb2.toString());
            default:
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.a(getDescriptor()).w(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.f34594a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
            default:
                return super.toString();
        }
    }

    public v(String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f34595b = values;
        this.f34597d = ij.h.b(new kotlin.text.p(2, this, serialName));
    }
}
