package kotlin.text;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f27552a = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f27553b;

    static {
        Intrinsics.checkNotNullParameter("  ", "groupSeparator");
        Intrinsics.checkNotNullParameter("", "byteSeparator");
        Intrinsics.checkNotNullParameter("", "bytePrefix");
        Intrinsics.checkNotNullParameter("", "byteSuffix");
        f fVar = new f();
        if (!f0.a("  ") && !f0.a("") && !f0.a("")) {
            f0.a("");
        }
        f27553b = fVar;
    }

    public final void a(StringBuilder sb2, String indent) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb2.append(indent);
        sb2.append("bytesPerLine = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(StringUtils.COMMA);
        sb2.append('\n');
        l7.o.p(Integer.MAX_VALUE, indent, "bytesPerGroup = ", StringUtils.COMMA, sb2);
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("groupSeparator = \"");
        sb2.append("  ");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("byteSeparator = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("bytePrefix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        l7.o.t(sb2, indent, "byteSuffix = \"", "", "\"");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BytesHexFormat(\n");
        a(sb2, "    ");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
