package yads;

import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hn {
    public static String a(String str) {
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            return new String(Base64.decode(bytes, 0), charset);
        } catch (Exception unused) {
            return new String(bytes, Charsets.UTF_8);
        }
    }

    public static String b(String str) {
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            return new String(Base64.decode(bytes, 0), charset);
        } catch (Exception unused) {
            return null;
        }
    }
}
