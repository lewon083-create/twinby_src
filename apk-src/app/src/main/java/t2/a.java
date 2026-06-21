package t2;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r implements Function1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f33395f = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Intrinsics.checkNotNullParameter(", ", "separator");
            Intrinsics.checkNotNullParameter("[", "prefix");
            Intrinsics.checkNotNullParameter("]", "postfix");
            Intrinsics.checkNotNullParameter("...", "truncated");
            StringBuilder buffer = new StringBuilder();
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(", ", "separator");
            Intrinsics.checkNotNullParameter("[", "prefix");
            Intrinsics.checkNotNullParameter("]", "postfix");
            Intrinsics.checkNotNullParameter("...", "truncated");
            buffer.append((CharSequence) "[");
            int i = 0;
            for (byte b2 : bArr) {
                i++;
                if (i > 1) {
                    buffer.append((CharSequence) ", ");
                }
                buffer.append((CharSequence) String.valueOf((int) b2));
            }
            buffer.append((CharSequence) "]");
            strValueOf = buffer.toString();
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return z.g(new StringBuilder("  "), ((e) entry.getKey()).f33403a, " = ", strValueOf);
    }
}
