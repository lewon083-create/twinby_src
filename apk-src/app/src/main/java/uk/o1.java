package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o1 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f34561a = new o1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f34562b = new u0("kotlin.uuid.Uuid", sk.d.f32923j);

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        String string;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String hexString = decoder.j();
        Intrinsics.checkNotNullParameter(hexString, "uuidString");
        int length = hexString.length();
        if (length == 32) {
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            long jB = kotlin.text.d.b(0, 16, hexString);
            long jB2 = kotlin.text.d.b(16, 32, hexString);
            if (jB != 0 || jB2 != 0) {
                return new gk.a(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (hexString.length() <= 64) {
                    string = hexString;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    String strSubstring = hexString.substring(0, 64);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    sb3.append(strSubstring);
                    sb3.append("...");
                    string = sb3.toString();
                }
                sb2.append(string);
                sb2.append("\" of length ");
                sb2.append(hexString.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            Intrinsics.checkNotNullParameter(hexString, "hexDashString");
            Intrinsics.checkNotNullParameter(hexString, "hexDashString");
            long jB3 = kotlin.text.d.b(0, 8, hexString);
            k3.f.c(8, hexString);
            long jB4 = kotlin.text.d.b(9, 13, hexString);
            k3.f.c(13, hexString);
            long jB5 = kotlin.text.d.b(14, 18, hexString);
            k3.f.c(18, hexString);
            long jB6 = kotlin.text.d.b(19, 23, hexString);
            k3.f.c(23, hexString);
            long j10 = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = kotlin.text.d.b(24, 36, hexString) | (jB6 << 48);
            if (j10 != 0 || jB7 != 0) {
                return new gk.a(j10, jB7);
            }
        }
        return gk.a.f20151e;
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34562b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        gk.a value = (gk.a) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.n(value.toString());
    }
}
