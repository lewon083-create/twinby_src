package zk;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {
    public static z a(String str, p pVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Charset charset = Charsets.UTF_8;
        if (pVar != null) {
            Pattern pattern = p.f46432d;
            Charset charsetA = pVar.a(null);
            if (charsetA == null) {
                pVar = a.a.l(pVar + "; charset=utf-8");
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return b(pVar, bytes, 0, bytes.length);
    }

    public static z b(p pVar, byte[] bArr, int i, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        long length = bArr.length;
        long j10 = i;
        long j11 = i10;
        byte[] bArr2 = al.b.f1041a;
        if ((j10 | j11) < 0 || j10 > length || length - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new z(pVar, bArr, i10, i);
    }

    public static /* synthetic */ z c(a0 a0Var, byte[] bArr, p pVar, int i, int i10) {
        if ((i10 & 1) != 0) {
            pVar = null;
        }
        if ((i10 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        a0Var.getClass();
        return b(pVar, bArr, i, length);
    }
}
